
package puntoventa;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderPintarTablaNormal extends DefaultTableCellRenderer{

    public RenderPintarTablaNormal() {
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel labelResultado=(JLabel)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Color coloV=new Color(255,255,255);
        labelResultado.setBackground(coloV);
        labelResultado.setForeground(new Color(22,35,105));
        return labelResultado;
    }   
}
