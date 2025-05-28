package controller;

import DAOImplement.PenginapanImplement;
import DAOPenginapan.PenginapanDAO;
import java.util.List;
import model.Penginapan;

public class PenginapanController {
    private PenginapanImplement penginapanDAO;
    
    public PenginapanController() {
        this.penginapanDAO = new PenginapanDAO();
    }
    
    public int hitungTotalHarga(String namaKamar, int durasi) {
        int hargaKamar = penginapanDAO.getHargaKamar(namaKamar);
        return hargaKamar * durasi;
    }
    
    public boolean tambahPenyewa(String nama, String kontak, String ruang, int durasi, String status) {
        try {
            int totalHarga = hitungTotalHarga(ruang, durasi);
            Penginapan penyewa = new Penginapan(nama, kontak, ruang, durasi, totalHarga, status);
            penginapanDAO.tambahPenyewa(penyewa);
            return true;
        } catch (Exception e) {
            System.err.println("Error menambah penyewa: " + e.getMessage());
            return false;
        }
    }
    
    public boolean updatePenyewa(int id, String nama, String kontak, String ruang, int durasi, String status) {
        try {
            int totalHarga = hitungTotalHarga(ruang, durasi);
            Penginapan penyewa = new Penginapan(nama, kontak, ruang, durasi, totalHarga, status);
            penyewa.setId(id);
            penginapanDAO.updatePenyewa(penyewa);
            return true;
        } catch (Exception e) {
            System.err.println("Error mengupdate penyewa: " + e.getMessage());
            return false;
        }
    }
    
    public boolean hapusPenyewa(int id) {
        try {
            penginapanDAO.hapusPenyewa(id);
            return true;
        } catch (Exception e) {
            System.err.println("Error menghapus penyewa: " + e.getMessage());
            return false;
        }
    }
    
    public List<Penginapan> getAllPenyewa() {
        return penginapanDAO.getAllPenyewa();
    }
    
    public String[] getKamarTersedia() {
        return penginapanDAO.getAllKamar();
    }
}
