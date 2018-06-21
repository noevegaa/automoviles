/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos;


import java.sql.ResultSet;


public class registros {
     Conexion cn = new Conexion();
     
//     public void insertar(String carro, String marca, String modelo,String color,String tipo,String precio,String gasolina){
//         cn.UID("INSERT INTO carros(carro,marca,modelo,color,tipo,precio,gasolina) VALUES('" +carro+ "','"+marca+ "','"+modelo+"','"+color+ "','"+tipo+ "','"+precio+ "','"+gasolina+ "')");
//     }
//     public void modificar(String id, String marca, String modelo,String color,String tipo,String precio,String gasolina) {
//        cn.UID("UPDATE carros SET carro='" + marca + "',modelo='" +modelo + "',color='" +color+ "',tipo='" +tipo+ "',precio='" +precio+ "',gasolina='" +gasolina+"' WHERE carro='" + id + "'");
//    }
//     
//      public void eliminar(String id) {
//        cn.UID("DELETE FROM carros WHERE carro='" + id + "'");
//    }
//      public ResultSet buscar(String id) {
//        return (cn.getValores("SELECT * FROM carros WHERE carro='" + id + "'"));
//    } 
     
     public ResultSet buscarTodo() {
        return (cn.getValores("select * from carros"));
    }
     public ResultSet buscartipo(String tipo) {
        return (cn.getValores("select * from tipos where tipo ='" + tipo + "'"));
    }
}
