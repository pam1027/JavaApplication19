/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Alumno CG
 */
public class MyComboBoxModel extends AbstractListModel implements ComboBoxModel {
    
    private ArrayList<Alumno> list = new ArrayList<Alumno>();
    private String item;

    public MyComboBoxModel() {
        list.add(new Alumno("pamela", "gomez", 24));
        list.add(new Alumno("ivan", "alvarado", 24));
        list.add(new Alumno("wilberth", "echeverria", 18));
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index).getNombres();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).getNombres().equalsIgnoreCase((String)anItem)) {
                this.item = list.get(i).getNombres();
                break;
            }
 
    }
    }

    @Override
    public Object getSelectedItem() {
        return item;
    
}
}
