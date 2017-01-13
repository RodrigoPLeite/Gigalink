package projetogigalink;

/**
 *
 * @author Rodrigo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConectaBanco {
		
                String url = "jdbc:mysql://localhost/gigalink";
		String usuario = "root";
		String senha = "123456";
		
		Connection con;
		
		public void conectar(){
			try{
			
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, usuario, senha);
				
				//JOptionPane.showMessageDialog(null,  "Sucesso");
				
			}catch(Exception e){
				//JOptionPane.showMessageDialog(null, "ERRO");
			}
		}

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	}