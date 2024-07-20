package TouchInterfaz;

import javax.swing.Icon;

public class ModeloTema {
    String nombre;
    String descripcion;
    String codigoBarras;
    float cantidad;
    float precio;
    Icon imagen;

    public ModeloTema(String nombre, String descripcion, String codigoBarras, float cantidad, float precio, Icon imagen, ModeloTema data) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoBarras = codigoBarras;
        this.cantidad = cantidad;
        this.precio = precio;
        this.imagen = imagen;
        this.data = data;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public float getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }
    
    private ModeloTema data;
    public void setData(ModeloTema data){
        this.data=data;
    }
}
