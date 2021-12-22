import java.util.ArrayList;
import java.util.List;

public class Users {

    private  List<User> users = new ArrayList();

    public Users(){

    }

    public List<User> getUsers() {
        return users;
    }

    public boolean register(String email, String password)
    {
        User user= new User(email,password);
        Security seguridad = new Security();

       for (User usuario: users)
       {

           if (usuario.getEmail().equals(user.getEmail())) return false;
       }


        user.setPassword(seguridad.usarArgon2(password));

        users.add(user);

        return true;
    }

   public int login(String email, String password)
    {
        User user= new User(email,password);
        Security seguridad = new Security();

        for (User usuario: users)
        {
            if (usuario.getEmail().equals(email)) {

                String hash = usuario.getPassword();
                if (seguridad.verificar(hash,password)) return 1;

                else return -2;
            }

        }
        return -1;
    }




}
