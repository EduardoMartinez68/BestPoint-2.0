/**
Universidad Politecnica de San Luis Potosi 
Programacion III java
Martinez Ortiz Eduardo Antonio 
176535@upslp.edu.mx
**/

package ClasesGlobales;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BuscarCajero {
    Connection con;
    ResultSet rs;
    JFrame JF;
    
    public BuscarCajero(Connection con,JFrame JF) {
        this.con = con;
        this.JF=JF;
        actualizar();
    }
    
    public void actualizar(){
        String nombreCajero=obtenerCajeroActual();
        buscarCajero(nombreCajero);
    }
    
    public String obtenerCajeroActual(){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from caja");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String cajero=rs.getString("nombreCajero");
                return cajero;
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        return ""; 
    }
    
    public void buscarCajero(String nombreCajero){
        try {
            Statement sts = con.createStatement();
            sts.execute("Select * from cajeros");
            ResultSet rs = sts.getResultSet();
            while (rs.next()){          
                String cajero=rs.getString("usuario");
                if(nombreCajero.equals(cajero)){
                    this.rs=rs;
                    break;
                }
            }
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
    }
    
    public void respuesta(int permiso){
        //comprobar si tengo el permiso
        if(permiso==0){
            JOptionPane.showMessageDialog(JF,"No tienes los permisos suficientes para ingresar a esta opcion");
        }
    }
    
    public int permiso1(){
        int permiso=0;
        try{
            permiso=rs.getInt("permiso1");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        
        //comprobar si tengo el permiso
        respuesta(permiso);     
        return permiso;
    }
    
    public int permiso2(){
        int permiso=0;
        try{
            permiso=rs.getInt("permiso2");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    
    public int permiso3(){
        int permiso=0;
        try{
            permiso=rs.getInt("permiso3");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    
    public int permiso4(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso4");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
        
    public int permiso5(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso5");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso6(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso6");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    
    public  int permiso7(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso7");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso8(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso8");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        return permiso;
    }
    public int permiso9(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso9");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso10(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso10");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso11(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso11");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso12(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso12");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso13(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso13");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso14(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso14");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public  int permiso15(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso15");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso16(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso16");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso17(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso17");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    public int permiso18(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso18");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    
    public  int permiso19(){
        int permiso=0;
        try{
             permiso=rs.getInt("permiso1");
        }catch (SQLException ex) {
            System.out.println(ex.getNextException());
        }
        respuesta(permiso);     
        return permiso;
    }
    
}
