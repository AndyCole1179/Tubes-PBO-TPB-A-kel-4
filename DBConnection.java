package restorant;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    static final String DB_URL ="jdbc:mysql://localhost:3307/login";
    static final String USER ="root";
    static final String PASS ="";
 
    public static Connection connectDB(){
         Connection conn =null;
        try{
            conn =DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch(Exception ex){
            System.out.println("Terdapat error saat menghubungkan ke database");
            return null;
            }
    }
}
