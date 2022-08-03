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
            //Nuevo statement para eliminar datos
            PreparedStatement st = con.prepareStatement("DELETE FROM alumnos WHERE id = 0;");
            //Ejecutar statement
            st.executeUpdate();
            //Se cierra la conexión 
            con.close();
        } catch (Exception e) {
            //Imprimir errores 
            System.out.println(e);
        }
    }
}