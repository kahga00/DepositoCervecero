
package Cerveza;


public class Venta {
    
    private int idventa;
    private int cantidad;
    private String fecha;
    private float preciouni;
    private int idexpendio;
    private int idcerveza;

    public void setVenta (String _idventa, String _cantidad, String _fecha, String _preciouni,
            String _idexpendio, String _idcerveza){
        
        setIdventa(Integer.parseInt(_idventa));
        setCantidad(Integer.parseInt(_cantidad));
        setFecha(_fecha);
        setPreciouni(Float.parseFloat(_preciouni));
        setIdexpendio(Integer.parseInt(_idexpendio));
        setIdcerveza(Integer.parseInt(_idcerveza));  
    }
    
    
    
    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
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

    public float getPreciouni() {
        return preciouni;
    }

    public void setPreciouni(float preciouni) {
        this.preciouni = preciouni;
    }

    

    public int getIdexpendio() {
        return idexpendio;
    }

    public void setIdexpendio(int idexpendio) {
        this.idexpendio = idexpendio;
    }

    public int getIdcerveza() {
        return idcerveza;
    }

    public void setIdcerveza(int idcerveza) {
        this.idcerveza = idcerveza;
    }
    
    
    
}
