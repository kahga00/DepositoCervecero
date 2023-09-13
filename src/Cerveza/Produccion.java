
package Cerveza;


public class Produccion {
    
    private int idproduccion;
    private int idcerveza;
    private int cantidad;
    private String fecha;
    
    public void setProduccion (String _idproduccion, String _cantidad, 
            String _fecha, String _idcerveza){
        setIdproduccion(Integer.parseInt(_idproduccion));
        setIdcerveza(Integer.parseInt(_idcerveza));
        setCantidad(Integer.parseInt(_cantidad));
        setFecha(_fecha);
    }

    
    
    public int getIdproduccion() {
        return idproduccion;
    }

    public void setIdproduccion(int idproduccion) {
        this.idproduccion = idproduccion;
    }

    public int getIdcerveza() {
        return idcerveza;
    }

    public void setIdcerveza(int idcerveza) {
        this.idcerveza = idcerveza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
