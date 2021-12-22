import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

import java.time.Instant;

public class Security {

    Argon2 argon2 = Argon2Factory.create();
    public Security(){}



   public  String usarArgon2(String password)
   {


       char[] passwordChar = password.toCharArray();

       try {
           // iterations = 10
           // memory = 64m
           // parallelism = 1
           String hash = argon2.hash(22, 65536, 1, passwordChar);
           System.out.println(hash);
           return hash;



       } finally {
           // Wipe confidential data
           argon2.wipeArray(passwordChar);
       }






   }

   public boolean verificar(String hash, String password)
   {
       char[] passwordChar = password.toCharArray();
       return argon2.verify(hash, passwordChar);
   }

   }

