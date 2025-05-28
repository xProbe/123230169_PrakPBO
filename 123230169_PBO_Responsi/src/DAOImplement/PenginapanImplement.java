package DAOImplement;

import java.util.List;
import model.Penginapan;

public interface PenginapanImplement {
    void tambahPenyewa(Penginapan p);
    void updatePenyewa(Penginapan p);
    void hapusPenyewa(int id);
    List<Penginapan> getAllPenyewa();
    int getHargaKamar(String namaKamar);
    String[] getAllKamar();
}
