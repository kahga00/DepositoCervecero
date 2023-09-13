/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerveza;


public class Fabricante {
    
    private int idFab;
    private String nomFab = "";
    private String estaFab = "";    
    private String muniFab = "";
    private String ubiFab = "";
   
    public void SetFabricante(String cid, String cnom, String cesta, String cmuni, String cubi){
    setIdFab(Integer.parseInt(cid));
    setNomFab(cnom);
    setEstaFab(cesta);
    setMuniFab(cmuni);
    setUbiFab(cubi);
        System.out.println("Objeto Fabricante iniciado");
    }

    public int getIdFab() {
        return idFab;
    }

    public void setIdFab(int idFab) {
        this.idFab = idFab;
    }
    
    public void DespFabricante(){
        System.out.println("Objeto Fabricante");
        System.out.println("Nombre Farcicarnte: " + getNomFab());
        System.out.println("Estado: " +getEstaFab());
        System.out.println("Ubicacion: " + getUbiFab() );
    }
    
    public String getNomFab() {
        return nomFab;
    }

    public void setNomFab(String nomFab) {
        this.nomFab = nomFab;
    }

    public String getEstaFab() {
        return estaFab;
    }

    public void setEstaFab(String estaFab) {
        this.estaFab = estaFab;
    }

    public String getMuniFab() {
        return muniFab;
    }

    public void setMuniFab(String muniFab) {
        this.muniFab = muniFab;
    }

    public String getUbiFab() {
        return ubiFab;
    }

    public void setUbiFab(String ubiFab) {
        this.ubiFab = ubiFab;
    }
   
    
    
    
    
    
    
    
    
}
