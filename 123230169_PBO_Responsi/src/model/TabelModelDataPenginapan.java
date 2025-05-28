package model;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;

public class TabelModelDataPenginapan extends AbstractTableModel {
    private List<Penginapan> penyewaList;
    private final String[] columnNames = {"ID", "Nama", "Kontak", "Ruang", "Durasi", "Total Harga", "Status"};
    
    public TabelModelDataPenginapan(List<Penginapan> penyewaList) {
        this.penyewaList = penyewaList;
    }
    
    @Override
    public int getRowCount() {
        return penyewaList.size();
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Penginapan penyewa = penyewaList.get(rowIndex);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        
        switch (columnIndex) {
            case 0: return penyewa.getId();
            case 1: return penyewa.getNama();
            case 2: return penyewa.getKontak();
            case 3: return penyewa.getRuang();
            case 4: return penyewa.getDurasi();
            case 5: return formatter.format(penyewa.getTotalHarga());
            case 6: return penyewa.getStatus();
            default: return null;
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public void updateData(List<Penginapan> newData) {
        this.penyewaList = newData;
        fireTableDataChanged();
    }
}
