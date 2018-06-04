/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodels;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import projekti.RregjistrimiPacientit;

/**
 *
 * @author drens
 */
public class PacientiTableModel extends AbstractTableModel {
    
    String[] columns = {"ID", "Emri", "Mbiemri", "Mosha", "DataLindjes", "EmriPrindit"};
    List<RregjistrimiPacientit> list;

    public PacientiTableModel() {
    }

    public PacientiTableModel(List<RregjistrimiPacientit> list) {
        this.list = list;
    }
    
    public void add(List<RregjistrimiPacientit> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    public String convertDateFormat(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(d);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RregjistrimiPacientit rp = getRregjistrimiPacientit(rowIndex);

        switch (columnIndex) {
            case 0:
                return rp.getId();
            case 1:
                return rp.getEmri();
            case 2:
                return rp.getMbiemri();
            case 3:
                return rp.getMosha();
            case 4:
                return convertDateFormat(rp.getDataLindjes());
            case 5:
                return rp.getEmriPrindit();
            default:
                return null;
        }
    }
    
}
