package ClasesGlobales;
import java.awt.Color;
import static java.awt.Color.black;
import javaswingdev.swing.table.Table;

public class TableEdit {
    Table table;
    Color wallpaper=new Color(255,255,255);
    
    public TableEdit(Table table) {
        this.table = table;
        actualizar();
    }
    
    private void actualizar(){
        this.table.setEnabled(false);
        this.table.setBackground(wallpaper);
        this.table.setForeground(black);
        
        this.table.getTableHeader().setBackground(wallpaper);
        this.table.getTableHeader().setResizingAllowed(false);
        this.table.getTableHeader().setEnabled(false);
        this.table.getTableHeader().setForeground(black);
    }
}
