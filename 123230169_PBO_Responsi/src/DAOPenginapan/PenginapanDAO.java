
package DAOPenginapan;

import java.sql.*;
import java.util.*;
import koneksi.Connector;
import model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAOImplement.PenginapanImplement;

public class PenginapanDAO implements PenginapanImplement{
    Connection connection;
    final String select = "SELECT * FROM toko";
    final String insert = "INSERT INTO toko(nama, barang, harga, cicilan, bunga, angsuran, total)VALUES(?,?,?,?,?,?,?)";
    final String update = "UPDATE toko SET nama=?, barang=?, harga=?, cicilan=?, bunga=?, angsuran=?, total=?";
    final String delete = "DELETE FROM toko WHERE id=?";
    
    public PenginapanDAO(){
        conn = Connector.connection();
    }

    @Override
    protected void insert(Penginapan t){
        PreparedStatement ps = new Connector.prepareStatement(insert);
        ps.setInt(1, t.getAngsuran());
        ps.setInt(2, t.getBarang());
        ps.setInt(3, t.getBunga());
        ps.setInt(4, t.getCicilan());
        ps.setInt(5, t.getHarga());
        ps.setInt(6, t.getNama());
        ps.setInt(7, t.getTotal());
        ps.executeUpdate();
    }

    @Override
    public List<datatoko>getAll() {
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(select);
        while (rs.next()){
            Produksi p = new Produksi();
            t.setId(rs.getInt("id"));
            t.setId(rs.getInt("id"));
        }
    }

    @Override
    public PenginapanDAOint id) {
        
    }
}
