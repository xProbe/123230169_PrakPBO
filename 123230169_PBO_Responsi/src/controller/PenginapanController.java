
package controller;

import java.util.List;
import DAOPenginapan.PenginapanDAO;
import model.*;
import view.MainFrame;
import DAOImplement.PenginapanImplement;
        
public class PenginapanController {
    MainFrame frame;
    PenginapanImplement impldatatoko;
    List<elektronik>t;
    
    public PenginapanController(MainFrame frame){
        this.frame = frame;
        impldatatoko = new PenginapanDAO();
        t = impldatatoko.getAll();
    }
    
    public PenginapanController{
        t = impldatatoko.getAll();
        TabelModelDataPenginapan tm = new TabelModelDataPenginapan(t);
        frame.getTableData().setModel(tm);
    }
    
    public void insert(){
        elektronik t = new elektronik();
        t.setNama(frame)
    }
}
