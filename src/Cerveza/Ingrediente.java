/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerveza;


public class Ingrediente {

    private int idIng;
    private String nomIng;
    private String descIng;
    
    public void SetIngrediente(String cid, String cnom, String cdesc ){
        setIdIng(Integer.parseInt(cid));
        setNomIng(cnom);
        setDescIng(cdesc);
        System.out.println("Objeto Ingrediente Iniciado");
    }
    public void DespIng(){
        System.out.println("Objeto Ingrediente");
        System.out.println("Id Ingrediente: " + getIdIng());
        System.out.println("Nombre ingrediente: " + getNomIng());
        System.out.println("Descripcion: " +  getDescIng());
    }

    public int getIdIng() {
        return idIng;
    }

    public void setIdIng(int idIng) {
        this.idIng = idIng;
    }
    
    
    public String getNomIng() {
        return nomIng;
    }

    public void setNomIng(String nomIng) {
        this.nomIng = nomIng;
    }

    public String getDescIng() {
        return descIng;
    }

    public void setDescIng(String descIng) {
        this.descIng = descIng;
    }
  
    
}
