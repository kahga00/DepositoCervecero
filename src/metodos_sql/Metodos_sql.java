/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ph
 */
public class Metodos_sql {
    public static ConexionBD conexion = new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
        String resultado_consulta;
    ResultSet rs = null;
    
    public int guardarExp (String nombre,String rfc,
           String responsable,String estado, String municipio, String ubicacion ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO expendio ( nombre,rfc,responsable,"
               + "estado,municipio,ubicacion) VALUES(?,?,?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,nombre);
           sentencia_preparada.setString(2,rfc);
           sentencia_preparada.setString(3,responsable);
           sentencia_preparada.setString(4,estado);
           sentencia_preparada.setString(5,municipio);
           sentencia_preparada.setString(6,ubicacion);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int guardarFab (int idFab, String nombre,
           String estado, String municipio, String ubicacion ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO fabricante ( idfabricante,nombre,"
               + "estado,municipio,ubicacion) VALUES(?,?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, idFab);
           sentencia_preparada.setString(2,nombre);
           sentencia_preparada.setString(3,estado);
           sentencia_preparada.setString(4,municipio);
           sentencia_preparada.setString(5,ubicacion);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    

    
    public int guardarIng (int cid, String nombre,
           String descripcion ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO ingrediente ( idingrediente,nombre,"
               + "descripcion) VALUES(?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, cid);
           sentencia_preparada.setString(2,nombre);
           sentencia_preparada.setString(3,descripcion);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
     public int guardarMarc (int cid,String nombre,
           int idFab ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO marca ( IdMarca,Nombre,"
               + "IdFabricante) VALUES(?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, cid);
           sentencia_preparada.setString(2,nombre);
           sentencia_preparada.setInt(3, idFab);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
     
      public int guardarInv (int cid, int cant,
           int idExp, int idCerv ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO inventario ( idinventario, cantidad,"
               + "idcerveza, idexpendio) VALUES(?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, cid);
           sentencia_preparada.setInt(2, cant);
           sentencia_preparada.setInt(3, idCerv);
           sentencia_preparada.setInt(4, idExp);
          
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
       public int guardarCer (int idexpendio,int idmarca, String nombre,
       String presentacion, String graduacion, String tipo, String aspecto,
       String procedimientos){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO cerveza "
                + "(idcerveza,nombre,presentacion,gradacion,tipo,aspecto,procedimientos, idmarca) "
                + "VALUES (?,?,?,?,?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, idexpendio);
           sentencia_preparada.setString(2,nombre);
           sentencia_preparada.setString(3,presentacion);
           sentencia_preparada.setString(4,graduacion);
           sentencia_preparada.setString(5,tipo);
           sentencia_preparada.setString(6,aspecto);
           sentencia_preparada.setString(7,procedimientos);
           sentencia_preparada.setInt(8, idmarca);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
     public ResultSet consultarAlgo(String consul) {
      int resultado =0;
      Connection conexion = null;
        try {
            conexion =ConexionBD.conectar();
            Statement sentencia = conexion.createStatement();
            rs = sentencia.executeQuery(consul);
           
        } catch (Exception e) {
            e.printStackTrace();
            resultado_consulta = e.getMessage();
        }
        
        return rs;
    }
      public int guardarPro (String idproduccion, String cantidad,
       String fecha, String idcerveza){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO produccion "
                + "(idproduccion,cantidad,fecha, idcerveza) "
                + "VALUES (?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,idproduccion);
           sentencia_preparada.setString(2,cantidad);
           sentencia_preparada.setString(3,fecha);
           sentencia_preparada.setString(4,idcerveza);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
      
    public int guardarPedido(String idpedido, String cantidad,
       String fechapedido, String fechaentrega, String preciouni,String idexpendio, String idfabricante, String idcerveza){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO pedido "
                + "(idpedido,cantidad,fechapedido, fechaentrega,preciouni,"
               + " idexpendio,idfabricante, idcerveza ) "
                + "VALUES (?,?,?,?,?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,idpedido);
           sentencia_preparada.setString(2,cantidad);
           sentencia_preparada.setString(3,fechapedido);
           sentencia_preparada.setString(4,fechaentrega);
           sentencia_preparada.setString(5,preciouni);
           sentencia_preparada.setString(6,idexpendio);
           sentencia_preparada.setString(7,idfabricante);
           sentencia_preparada.setString(8,idcerveza);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
     public int guardarReceta (String idreceta, String cantidad,
       String idcerveza, String idingrediente){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("INSERT INTO receta "
                + "(idreceta,cantidad,idcerveza, idingrediente) "
                + "VALUES (?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,idreceta);
           sentencia_preparada.setString(2,cantidad);
           sentencia_preparada.setString(3,idcerveza);
           sentencia_preparada.setString(4,idingrediente);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
     
     public int guardarVenta (String idventa, String cantidad,
       String fecha, String precioUni,String idexpendio,String idcerveza){
           
          
       int resultado =0;
       Connection conexion = null;
        
       
       String sentencia_guardar = ("INSERT INTO venta "
                + "(idventa,cantidad,fecha, precioUni,idexpendio,idcerveza  ) "
                + "VALUES (?,?,?,?,?,?)");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,idventa);
           sentencia_preparada.setString(2,cantidad);
           sentencia_preparada.setString(3,fecha);
           sentencia_preparada.setString(4,precioUni);
           sentencia_preparada.setString(5,idexpendio);
           sentencia_preparada.setString(6,idcerveza);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }    
    
      public static String buscarExpendio(String respon){
       String busquedaExp = null;
       Connection conexion = null;
      
       conexion = ConexionBD.conectar();
            String sentencia_busc = ("SELECT  nombre FROM expendio WHERE responsable = '" +respon +"'" );
        
       
        try{
         
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_busc);
           
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                busquedaExp = "Se modifico el expendio";
                

            }else{
                busquedaExp = "Se creo nuevo expendio";
            }

            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
       
       return busquedaExp;
   }
      
       public int actuExpendio( int cid, String cnom, String crfc, String cresp, String cestado, String cmun,String cubic){
       String busquedaExp = null;
       Connection conexion = null;
        int resultado =0;
      
        try{
            conexion = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("UPDATE expendio SET Nombre = ?, RFC = ?, Responsable=? , Estado =?,"
                    + " Municipio = ?, Ubicacion = ? WHERE IdExpendio = '" +cid +"';" );
           sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
           sentencia_preparada.setString(1,cnom);
           sentencia_preparada.setString(2,crfc);
           sentencia_preparada.setString(3, cresp);
           sentencia_preparada.setString(4,cestado);
           sentencia_preparada.setString(5,cmun);
           sentencia_preparada.setString(6,cubic);
           resultado = sentencia_preparada.executeUpdate();
           
           sentencia_preparada.close();
           
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
            System.out.println("No se pudo actualizar");
        }
       
       return resultado;
   }
       
       public int actuPro (String idproduccion, String cantidad,
       String fecha, String idcerveza){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("UPDATE produccion SET Cantidad = ?, Fecha = ?, IdCerveza=? "
                    + " WHERE IdProduccion = ? ;" );
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,cantidad);
           sentencia_preparada.setString(2,fecha);
           sentencia_preparada.setString(3,idcerveza);
           sentencia_preparada.setString(4,idproduccion);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
       
       public int actuFab( int cid, String cnom, String cestado, String cmun,String cubic){
       String busquedaExp = null;
       Connection conexion = null;
        int resultado =0;
      
        try{
            conexion = ConexionBD.conectar();
            String sentencia_actualizar = ("UPDATE fabricante SET Nombre = ?, Estado =?,"
                    + " Municipio = ?, Ubicacion = ? WHERE IdFabricante = '" +cid +"';" );
           sentencia_preparada = conexion.prepareStatement(sentencia_actualizar);
           sentencia_preparada.setString(1,cnom);
           sentencia_preparada.setString(2,cestado);
           sentencia_preparada.setString(3,cmun);
           sentencia_preparada.setString(4,cubic);
           resultado = sentencia_preparada.executeUpdate();
           
           sentencia_preparada.close();
           
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
       
       return resultado;
   }
       
       
    public int actuCerv( int cid, int cidMar, String cnom, String cpres, String cgrad, String ctip,String casp, String cproce){
       String busquedaExp = null;
       Connection conexion = null;
        int resultado =0;
      
        try{
            conexion = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("UPDATE cerveza SET Nombre = ?, Presentacion = ?, Gradacion=? , Tipo =?,"
                    + " Aspecto = ?, Procedimientos = ?, IdMarca =? WHERE IdCerveza = '" +cid +"';" );
           sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
           sentencia_preparada.setString(1,cnom);
           sentencia_preparada.setString(2,cpres);
           sentencia_preparada.setString(3, cgrad);
           sentencia_preparada.setString(4,ctip);
           sentencia_preparada.setString(5,casp);
           sentencia_preparada.setString(6,cproce);
           sentencia_preparada.setInt(7, cidMar);
           resultado = sentencia_preparada.executeUpdate();
           
           sentencia_preparada.close();
           
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
            System.out.println("No se pudo actualizar");
        }
       
       return resultado;
   }
    public int actuMar( int cid, String cnom, int cidFab){
       String busquedaExp = null;
       Connection conexion = null;
        int resultado =0;
      
        try{
            conexion = ConexionBD.conectar();
            String sentencia_actualizar = ("UPDATE marca SET Nombre = ?, IdFabricante =?"
                    + " WHERE IdMarca = '" +cid +"';" );
           sentencia_preparada = conexion.prepareStatement(sentencia_actualizar);
           sentencia_preparada.setString(1,cnom);
           sentencia_preparada.setInt(2, cidFab);
           resultado = sentencia_preparada.executeUpdate();
           
           sentencia_preparada.close();
           
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
       
       return resultado;
   }
      
     public int actuIng( int cid, String cnom, String cdesc){
       String busquedaExp = null;
       Connection conexion = null;
        int resultado =0;
      
        try{
            conexion = ConexionBD.conectar();
            String sentencia_actualizar = ("UPDATE ingrediente SET Nombre = ?, Descripcion =?"
                    + " WHERE IdIngrediente = '" +cid +"';" );
           sentencia_preparada = conexion.prepareStatement(sentencia_actualizar);
           sentencia_preparada.setString(1,cnom);
           sentencia_preparada.setString(2, cdesc);
           resultado = sentencia_preparada.executeUpdate();
           
           sentencia_preparada.close();
           
            conexion.close();
        }catch(Exception e){
            System.out.println(e);
        }
       
       return resultado;
   }
         
    public int actuInv (int cid, int cant,
           int idExp, int idCerv ){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("UPDATE inventario SET Cantidad = ?, idCerveza =?, IdExpendio=?"
                    + " WHERE IdInventario = '" +cid +"';");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, cant);
           sentencia_preparada.setInt(2, idCerv);
           sentencia_preparada.setInt(3, idExp);
          
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }   
    
    public int actuPedido(String idpedido, String cantidad,
       String fechapedido, String fechaentrega, String preciouni,String idexpendio, String idfabricante, String idcerveza){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("UPDATE pedido SET "
                + "Cantidad = ?,FechaPedido = ?, FechaEntrega = ?,PrecioUni =?,"
               + " IdExpendio =?,IdFabricante = ?, IdCerveza = ? WHERE IdPedido = ?;");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,cantidad);
           sentencia_preparada.setString(2,fechapedido);
           sentencia_preparada.setString(3,fechaentrega);
           sentencia_preparada.setString(4,preciouni);
           sentencia_preparada.setString(5,idexpendio);
           sentencia_preparada.setString(6,idfabricante);
           sentencia_preparada.setString(7,idcerveza);
           sentencia_preparada.setString(8,idpedido);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
      
     public int actuReceta (String idreceta, String cantidad,
       String idcerveza, String idingrediente){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("UPDATE receta SET Cantidad = ?, IdCerveza =?, IdIngrediente=?"
                    + " WHERE IdReceta = ?;");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,cantidad);
           sentencia_preparada.setString(2,idcerveza);
           sentencia_preparada.setString(3,idingrediente);
           sentencia_preparada.setString(4,idreceta);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
     
     public int actuVenta (String idventa, String cantidad,
       String fecha, String precioUni,String idexpendio,String idcerveza){
           
          
       int resultado =0;
       Connection conexion = null;
        
       
       String sentencia_guardar = ("UPDATE venta SET Cantidad = ?, Fecha =?, PrecioUni=?, IdExpendio=?, IdCerveza=?"
                    + " WHERE IdVenta = ?;");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setString(1,cantidad);
           sentencia_preparada.setString(2,fecha);
           sentencia_preparada.setString(3,precioUni);
           sentencia_preparada.setString(4,idexpendio);
           sentencia_preparada.setString(5,idcerveza);
           sentencia_preparada.setString(6,idventa);
          
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }    
     
         public int deleteExp (int cidExp){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM expendio WHERE idExpendio =" + cidExp +";");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
     
    
    public int deleteCer (int cidCer){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM cerveza WHERE idCerveza =" + cidCer +";");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int deleteFab (int cidFab){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM fabricante WHERE IdFabricante =" + cidFab +";");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int deleteIng (int cid){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM ingrediente WHERE IdIngrediente =" + cid +";");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int deleteInv (int cid){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM inventario WHERE IdInventario =" + cid +";");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int deleteMar (int cid){
    
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM marca WHERE IdMarca =" + cid +";");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int deletePed (int cid){
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM pedido WHERE IdPedido = ?;");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, cid);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int deletePro (int cid){
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM produccion WHERE IdProduccion = ?;");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, cid);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int deleteRec (int cid){
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM receta WHERE IdReceta = ?;");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, cid);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
    public int deleteVen (int cid){
       int resultado =0;
       Connection conexion = null;
       
       String sentencia_guardar = ("DELETE FROM venta WHERE IdVenta = ?;");
       
       try{
           conexion =ConexionBD.conectar();
           sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
           sentencia_preparada.setInt(1, cid);
           
           resultado = sentencia_preparada.executeUpdate();
           sentencia_preparada.close();
           
       }catch(Exception e){
       
           System.out.println(e);
       }
       return resultado;
    }
    
}
