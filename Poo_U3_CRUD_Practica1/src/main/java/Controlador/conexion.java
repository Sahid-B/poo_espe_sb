/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author ESPE
 */








public class conexion {
    private  static final String drive="com.mysql.jdbc.drive";
    private static final String user="root";
    private static final String password="";
    private static final String url="jdbc:mysql:\\localhost:3306\Estudiante";
    
    connection conectar=null;
    
    public connection conexion(){
        try{
           class.forName(drive);
           conectar= (connection) DriveManager.getConnection(url,user,pass) 
            
            
        } catch (excepcion e){
            JoptionPane.ShowmessageDialoge(null, "error de conexion" + e.getmesagge )
            
            
        }
        
        
        
    }
    
}
