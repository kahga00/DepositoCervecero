
package Cerveza;


public class Receta {
    
    private int idreceta;
    private int idingrediente;
    private int idcerveza;
    private int cantidad;

    public void setReceta (String _idreceta, String _idingrediente, String _idcerveza,
            String _cantidad){
        
        setIdreceta(Integer.parseInt(_idreceta));
        setIdingrediente(Integer.parseInt(_idingrediente));
        setIdcerveza(Integer.parseInt(_idcerveza));
        setCantidad(Integer.parseInt(_cantidad));
        
    }
    
    
    
    public int getIdreceta() {
        return idreceta;
    }

    public void setIdreceta(int idreceta) {
        this.idreceta = idreceta;
    }

    public int getIdingrediente() {
        return idingrediente;
    }

    public void setIdingrediente(int idingrediente) {
        this.idingrediente = idingrediente;
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
    
    
    
}
