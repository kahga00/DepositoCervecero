/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerveza;


public class Marca {

    private int idmarca;
    private int idfab;
    private String nomMarc;
    
    public void SetMarca(String cid,String cnom, String cidF){
        setIdmarca(Integer.parseInt(cid));
        setNomMarc(cnom);
        setIdfab(Integer.parseInt(cidF));
        
    }
    
    public void DespMarca(){
        System.out.println("Objeto Marca ");
        System.out.println("Id Marca: " + getIdmarca());
        System.out.println("Nombre de la marca: " + getNomMarc());
        System.out.println("Id Fabricante: " + getIdfab());
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public int getIdfab() {
        return idfab;
    }

    public void setIdfab(int idfab) {
        this.idfab = idfab;
    }

    public String getNomMarc() {
        return nomMarc;
    }

    public void setNomMarc(String nomMarc) {
        this.nomMarc = nomMarc;
    }    
}
