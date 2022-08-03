package com.sic;
import java.sql.*;
public class App {
public static void main(String[] args) {
        //Try-Catch para manejo de errores
        try {
            //Llamada a la libreria mysql conector
            Class.forName("com.mysql.jdbc.Driver");
            //Nueva conexión                           conexión a localhost |   nombre de bd | ususario mysql | contraseña  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datos", "usuariotabla", "pass1234");
            //Nuevo statement para crear datos
            Statement stmt = con.createStatement();
            //Creación de Query | Insertar valores 
            //Estos valores deben coincidir con los valores que se asignaron durante la creación de la tabla
            stmt.executeUpdate("INSERT INTO alumnos VALUES(2,'Santiago','López','20524700')");
            //Se cierra la conexión 
            con.close();
        } catch (Exception e) {
            //Imprimir errores 
            System.out.println(e);
        }
    }
}