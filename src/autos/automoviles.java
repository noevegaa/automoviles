/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos;


import java.sql.ResultSet;


public class automoviles {
     Conexion cn = new Conexion();
     
     public void insertar(String carro, String marca, String modelo,String color,String tipo,String precio,String gasolina){
         cn.UID("INSERT INTO carros(carro,marca,modelo,color,tipo,precio,gasolina) VALUES('" +carro+ "','"+marca+ "','"+modelo+"','"+color+ "','"+tipo+ "','"+precio+ "','"+gasolina+ "')");
     }
     public void modificar(String id, String nombre, String ocupacion) {
        cn.UID("UPDATE registro SET nombre='" + nombre + "',ocupacion='" + ocupacion + "' WHERE Id='" + id + "'");
    }
     
      public void eliminar(String id) {
        cn.UID("DELETE FROM carros WHERE carro='" + id + "'");
    }
      public ResultSet buscar(String id) {
        return (cn.getValores("SELECT * FROM registro WHERE Id='" + id + "'"));
    } 
     
     
}
