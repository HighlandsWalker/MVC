package ro.teamnet.zth.api.database;


public interface DBProperties {
    //TODO de inlocuit cu IP-ul din Docker
    String IP = "localhost";
    String PORT = "1521";
    //TODO de inlocuit 1cu utilizatorul vostru
    String USER = "sys as sysdba";
    //TODO de inlocuit cu parola voastra
    String PASS = "admin";
    String SID = "xe";
    String SCHEMA = "HR";
    String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";

}
