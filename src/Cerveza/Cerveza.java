
package Cerveza;


public class Cerveza {
    private int idcerveza;
    private int idmarca;
    private String nombre;
    private String presentacion;
    private String graduacion;
    private String tipo;
    private String aspecto;
    private String procedimientos;
    
    public void setCerveza (String _idcerveza, String _idmarca, String _nombre, 
            String _presentacion, String _graduacion, String _tipo, String _aspecto,
            String _procedimientos){
        setIdcerveza(Integer.parseInt(_idcerveza));
        setIdmarca(Integer.parseInt(_idmarca));
        setNombre (_nombre);
        setPresentacion (_presentacion);
        setGraduacion (_graduacion);
        setTipo (_tipo);
        setAspecto (_aspecto);
        setProcedimientos (_procedimientos);         
        
    }

    public int getIdcerveza() {
        return idcerveza;
    }

    public void setIdcerveza(int idcerveza) {
        this.idcerveza = idcerveza;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(String graduacion) {
        this.graduacion = graduacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public String getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(String procedimientos) {
        this.procedimientos = procedimientos;
    }
    
}
