package model;

public class Penginapan {
    private int id;
    private String nama;
    private String kontak;
    private String ruang;
    private int durasi;
    private int totalHarga;
    private String status;
    
    public Penginapan() {}
    
    public Penginapan(String nama, String kontak, String ruang, int durasi, int totalHarga, String status) {
        this.nama = nama;
        this.kontak = kontak;
        this.ruang = ruang;
        this.durasi = durasi;
        this.totalHarga = totalHarga;
        this.status = status;
    }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    
    public String getKontak() { return kontak; }
    public void setKontak(String kontak) { this.kontak = kontak; }
    
    public String getRuang() { return ruang; }
    public void setRuang(String ruang) { this.ruang = ruang; }
    
    public int getDurasi() { return durasi; }
    public void setDurasi(int durasi) { this.durasi = durasi; }
    
    public int getTotalHarga() { return totalHarga; }
    public void setTotalHarga(int totalHarga) { this.totalHarga = totalHarga; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
