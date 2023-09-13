/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cerveza;


public class Inventario {
    
    private int idInv;
    private int cantInv;
    private int idCer;
    private int idEx;
    
    public void SetInventario(String cid, String ccant,  String cidEx, String cidCer){
        setIdInv(Integer.parseInt(cid));
        setCantInv(Integer.parseInt(ccant));
        setIdCer(Integer.parseInt(cidCer));
        setIdEx(Integer.parseInt(cidEx));
    
    }
    public void DespInv(){
        System.out.println("Objeto Inventario");
        System.out.println("Id Inventario: " + getIdInv());
        System.out.println("Cantidad: " + getCantInv());
        System.out.println("Id Cerveza: " + getIdCer());
        System.out.println("Id Expendio: " + getIdEx());
    
    }

    public int getIdInv() {
        return idInv;
    }

    public void setIdInv(int idInv) {
        this.idInv = idInv;
    }

    public int getCantInv() {
        return cantInv;
    }

    public void setCantInv(int cantInv) {
        this.cantInv = cantInv;
    }


    public int getIdCer() {
        return idCer;
    }

    public void setIdCer(int idCer) {
        this.idCer = idCer;
    }

    public int getIdEx() {
        return idEx;
    }

    public void setIdEx(int idEx) {
        this.idEx = idEx;
    }
    
    
    

    
}
