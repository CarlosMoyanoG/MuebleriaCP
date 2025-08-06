/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carlos Moyano
 */

public class BD 
{
    private static final String URL    = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER   = "CarlosFinal";
    private static final String PASS   = "Carlos01";

    public static Connection conectar() 
    {
        try {
            // carga del driver Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // obtiene la conexión
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
