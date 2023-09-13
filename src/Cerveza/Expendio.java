/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerveza;


public class Expendio {

    private int idExp;
    private String nomExp = "";
    private String rfc = "";
    private String respExp = "";
    private String estadoExp = "";
    private String munExp = "";
    private String ubicExp = "";


    public void SetExpendio(String cid, String cnom, String crfc, String cresp, String cestado, String cmun,String cubic){
        setIdExp(Integer.parseInt(cid));
        setNomExp(cnom);
        setRfc(crfc);
        setRespExp(cresp);
        setEstadoExp(cestado);
        setMunExp(cmun);
        setUbicExp(cubic);    
        System.out.println("Objeto Expendio Iniciado");
    }
    
    public void DespExpendio(){
        System.out.println("Objeto Expendio");
        System.out.println("Id Expendio: " + getIdExp());
        System.out.println("Nombre del Expendio: " + getNomExp());
        System.out.println("RFC: " + getRfc());
        System.out.println("Responsable: " + getRespExp());
        System.out.println("Estado: " + getEstadoExp());
        System.out.println("Municipio: " + getMunExp());
        System.out.println("Direccion: " + getUbicExp());
        
    }

    public int getIdExp() {
        return idExp;
    }

    public void setIdExp(int idExp) {
        this.idExp = idExp;
    }
     
    
    
    public String getNomExp() {
        return nomExp;
    }

    public void setNomExp(String nomExp) {
        this.nomExp = nomExp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRespExp() {
        return respExp;
    }

    public void setRespExp(String respExp) {
        this.respExp = respExp;
    }

    public String getEstadoExp() {
        return estadoExp;
    }

    public void setEstadoExp(String estadoExp) {
        this.estadoExp = estadoExp;
    }

        public String getMunExp() {
        return munExp;
    }

    public void setMunExp(String munExp) {
        this.munExp = munExp;
    }
   
    
    public String getUbicExp() {
        return ubicExp;
    }

    public void setUbicExp(String ubicExp) {
        this.ubicExp = ubicExp;
    }
    
    
}
