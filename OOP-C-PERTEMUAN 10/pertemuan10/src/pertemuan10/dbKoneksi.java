/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan10;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Ni Made Pramesti Dewi
 * TGL : 23 MEI 2025
 */
public class dbKoneksi {
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static String DB_URL = "jdbc:mysql://localhost/mahasiswa";
    static String DB_USER = "root";
    static String DB_PASS = "";
    
    static public Connection koneksi(){
        try{
            Class.forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            
        }catch(ClassNotFoundException | SQLException err){
            System.out.println ("Gagal koneksi de DBMS MySQL");
        
        }
        
        return null;
        
    }
    
}
