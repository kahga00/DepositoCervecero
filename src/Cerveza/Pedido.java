
package Cerveza;


public class Pedido {
    
    private int idpedido;
    private int idexpendio;
    private int idfabricante;
    private int idcerveza;
    private int cantidad;
    private String fachapedido;
    private String fachaentrega;
    private float preciouni;
    
    public void setPedido (String _idpedido, String _cantidad, String _fachapedido, 
            String _fachaentrega, String _preciouni, String _idexpendio, String _idfabricante,
            String _idcerveza){
        
         setIdpedido(Integer.parseInt(_idpedido));
         setIdexpendio(Integer.parseInt(_idexpendio));
         setIdfabricante(Integer.parseInt(_idfabricante));
         setIdcerveza(Integer.parseInt(_idcerveza));
         setCantidad(Integer.parseInt(_cantidad));
         setFachapedido(_fachapedido);
         setFachaentrega(_fachaentrega);         
         setPreciouni(Float.parseFloat(_preciouni));
    }
    
    

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdexpendio() {
        return idexpendio;
    }

    public void setIdexpendio(int idexpendio) {
        this.idexpendio = idexpendio;
    }

    public int getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(int idfabricante) {
        this.idfabricante = idfabricante;
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

    public String getFachapedido() {
        return fachapedido;
    }

    public void setFachapedido(String fachapedido) {
        this.fachapedido = fachapedido;
    }

    public String getFachaentrega() {
        return fachaentrega;
    }

    public void setFachaentrega(String fachaentrega) {
        this.fachaentrega = fachaentrega;
    }

    public float getPreciouni() {
        return preciouni;
    }

    public void setPreciouni(float preciouni) {
        this.preciouni = preciouni;
    }

   
    
    
    
}
