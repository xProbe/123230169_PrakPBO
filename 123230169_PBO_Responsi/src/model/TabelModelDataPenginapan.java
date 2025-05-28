
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelModelDataPenginapan extends AbstractTableModel{
    List<elektronik>dt;
    public TabelModelDataPenginapan(List<elektronik>t){
        this.t = t;
    }
    //override
}
