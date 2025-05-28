package DAOPenginapan;

import DAOImplement.PenginapanImplement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import koneksi.Connector;
import model.Penginapan;

public class PenginapanDAO implements PenginapanImplement {
    private Connection connection;
    
    private final String SELECT_ALL = "SELECT * FROM penyewa";
    private final String INSERT = "INSERT INTO penyewa (nama, kontak, ruang, durasi, total_harga, status) VALUES (?, ?, ?, ?, ?, ?)";
    private final String UPDATE = "UPDATE penyewa SET nama=?, kontak=?, ruang=?, durasi=?, total_harga=?, status=? WHERE id=?";
    private final String DELETE = "DELETE FROM penyewa WHERE id=?";
    private final String GET_HARGA = "SELECT harga FROM kamar WHERE nama=?";
    
    public PenginapanDAO() {
        this.connection = Connector.getConnection();
    }
    
    @Override
    public void tambahPenyewa(Penginapan p) {
        try (PreparedStatement stmt = connection.prepareStatement(INSERT)) {
            stmt.setString(1, p.getNama());
            stmt.setString(2, p.getKontak());
            stmt.setString(3, p.getRuang());
            stmt.setInt(4, p.getDurasi());
            stmt.setInt(5, p.getTotalHarga());
            stmt.setString(6, p.getStatus());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error menambah penyewa: " + e.getMessage());
        }
    }
    
    @Override
    public void updatePenyewa(Penginapan p) {
        try (PreparedStatement stmt = connection.prepareStatement(UPDATE)) {
            stmt.setString(1, p.getNama());
            stmt.setString(2, p.getKontak());
            stmt.setString(3, p.getRuang());
            stmt.setInt(4, p.getDurasi());
            stmt.setInt(5, p.getTotalHarga());
            stmt.setString(6, p.getStatus());
            stmt.setInt(7, p.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error mengupdate penyewa: " + e.getMessage());
        }
    }
    
    @Override
    public void hapusPenyewa(int id) {
        try (PreparedStatement stmt = connection.prepareStatement(DELETE)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error menghapus penyewa: " + e.getMessage());
        }
    }
    
    @Override
    public List<Penginapan> getAllPenyewa() {
        List<Penginapan> penyewaList = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_ALL)) {
            while (rs.next()) {
                Penginapan p = new Penginapan();
                p.setId(rs.getInt("id"));
                p.setNama(rs.getString("nama"));
                p.setKontak(rs.getString("kontak"));
                p.setRuang(rs.getString("ruang"));
                p.setDurasi(rs.getInt("durasi"));
                p.setTotalHarga(rs.getInt("total_harga"));
                p.setStatus(rs.getString("status"));
                penyewaList.add(p);
            }
        } catch (SQLException e) {
            System.err.println("Error mengambil data penyewa: " + e.getMessage());
        }
        return penyewaList;
    }
    

    
    @Override
    public String[] getAllKamar() {
        return new String[]{"A1", "A2", "A3"};
    }
}
