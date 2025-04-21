
package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
    
    Connection contectar = null;
    
    String usuario = "root";
    String contraseña = "";
    String bd = "dbpos";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            contectar = DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null, "Conexion correctamente a la base de datos");
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "No se contecto a la base de datos....."+e.toString());
            
        }
        
        return contectar;
    }
    
    public void CerrarConexion(){
        
        try{
            
            if (contectar!=null && ! contectar.isClosed()){
                
                contectar.close();
                
                JOptionPane.showMessageDialog(null, "Conexion cerrada a la base de datos........");
                
            }
            
        }catch (Exception e){
            
             JOptionPane.showMessageDialog(null, "No se cerro la conexion a la base de datos....."+e.toString());
            
        }
    }
    
     
    
    
    
}
