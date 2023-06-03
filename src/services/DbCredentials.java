
package services;

import io.github.cdimascio.dotenv.Dotenv;

public interface DbCredentials {
    
    Dotenv dotenv = Dotenv.configure().load();
    
    String PORT = "3306";
    String DBNAME = "feria";
    String USER = dotenv.get("USER");
    String PASSWD = dotenv.get("PASSWORD");
}
