package Opciones;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import javax.swing.ImageIcon;

public class ImpresionTicket extends javax.swing.JPanel implements Printable{

    public ImpresionTicket() {
        initComponents();
        labelImg.setLocation(271, 10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCantidades = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMensajeDespedida = new javax.swing.JLabel();
        txtDescripciones = new javax.swing.JLabel();
        txtImportes = new javax.swing.JLabel();
        txtTotalProducto = new javax.swing.JLabel();
        labelImg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        txtCantidades.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidades.setText("Cant.");

        txtTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtTotal.setText("Total: $7.00");

        txtFecha.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFecha.setText("12/julio/2022 10:23:55");

        txtNombreEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombreEmpresa.setText("Nombre empresa");

        txtMensajeDespedida.setForeground(new java.awt.Color(0, 0, 0));
        txtMensajeDespedida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMensajeDespedida.setText("Mensaje despedida");

        txtDescripciones.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripciones.setText("Producto");

        txtImportes.setForeground(new java.awt.Color(0, 0, 0));
        txtImportes.setText("Importe");

        txtTotalProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalProducto.setText("Total");

        labelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imgL.png"))); // NOI18N
        labelImg.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTotalProducto))
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMensajeDespedida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtCantidades)
                        .addGap(59, 59, 59)
                        .addComponent(txtDescripciones)
                        .addGap(73, 73, 73)
                        .addComponent(txtImportes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripciones)
                    .addComponent(txtImportes)
                    .addComponent(txtTotalProducto)
                    .addComponent(txtCantidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensajeDespedida)
                .addGap(92, 92, 92))
        );
    }// </editor-fold>//GEN-END:initComponents

        
    public void setNombreEmpres(String nombre){
        txtNombreEmpresa.setText(nombre);
    }
    
    public void setMensajeDespedida(String mensaje){
        txtMensajeDespedida.setText(mensaje);
    }
    
    public void setTotal(String total){
        txtTotal.setText(total);
    }
    
    public void getTotal(){
        txtTotal.getText();
    }
    
    
    public void setCantidades(String cantidades){
        txtCantidades.setText(cantidades);
    }
    
    public String getCantidades(){
        return txtCantidades.getText();
    }    
    
    public void setDescripciones(String descripciones){
        txtDescripciones.setText(descripciones);
    }
    public String getDescripciones(){
        return txtDescripciones.getText();
    }    
    
    public void setImportes(String importes){
        txtImportes.setText(importes);
    }
    
    public String getImportes(){
        return txtImportes.getText();
    }
    
    public void setFecha(String fecha){
        txtFecha.setText(fecha);
    }    
    
    public String getTotalProducto(){
        return txtTotalProducto.getText();
    }
    
    public void setTotalProducto(String total){
        txtTotalProducto.setText(total);
    }
    
    public void setImg(String rutaImg){
        // Cargar y escalar la imagen
        Image img = new ImageIcon(rutaImg).getImage();
        ImageIcon icono = new ImageIcon(img.getScaledInstance(labelImg.getWidth(), labelImg.getHeight(), Image.SCALE_SMOOTH));
        labelImg.setIcon(icono);

        // Calcular las posiciones para centrar el JLabel
        int widthLabel = labelImg.getWidth();
        int widthFrame = this.getWidth();
        int x = (widthFrame - widthLabel) / 2;

        // Establecer la posición del JLabel
        labelImg.setLocation(x, labelImg.getY());
        centrarImagen();
    }
    
    private void centrarImagen(){
        // Calcular las posiciones para centrar el JLabel
        int widthLabel = labelImg.getWidth();
        int widthFrame = this.getWidth();
        int x = (widthFrame - widthLabel) / 2;

        // Establecer la posición del JLabel
        labelImg.setLocation(x, labelImg.getY());
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex==0){
            Graphics2D graphics2d=(Graphics2D) graphics;
            graphics2d.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
            printAll(graphics2d);
            return PAGE_EXISTS;
        }
        else{
            return NO_SUCH_PAGE;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel txtCantidades;
    private javax.swing.JLabel txtDescripciones;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtImportes;
    private javax.swing.JLabel txtMensajeDespedida;
    private javax.swing.JLabel txtNombreEmpresa;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTotalProducto;
    // End of variables declaration//GEN-END:variables
}
