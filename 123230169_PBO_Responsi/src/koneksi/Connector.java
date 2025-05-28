
package koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Connector {
    static Connection con;
    
    public Connection connection(){
        if(con==null){
            MysqlDataSource data = new MysqlDataSource();
            
            data.setDatabaseName("penginapan_sql");
            data.setUser("root");
            data.setPassword("");
        
            try{
                con = data.getConnection();
                System.out.println("Koneksi Berhasil");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.err.println("Koneksi Gagal");
            }
        }
    return con;
    }
}
