public class Main {

    public static void main(String[] args) {

        Users usuarios = new Users();


        System.out.println(usuarios.register("engaca2001@hotmail.com","palomino"));
        System.out.println(usuarios.register("engaca2001@hotmail.com","julo"));

        System.out.println(usuarios.getUsers());

        System.out.println(usuarios.login("engaca2001@hotmail.com","palomina"));







    }

}
