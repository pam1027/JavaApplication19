/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Alumno CG
 */
public class ListModel extends AbstractListModel{
    
    private ArrayList<Alumno> list = new ArrayList<Alumno>();

    public ListModel() {
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
        Alumno alumno = list.get(index);
        return alumno.getNombres();
    }
    
    public Alumno getAlumno (int index){
        return list.get(index);
    }
    
    
    
}
