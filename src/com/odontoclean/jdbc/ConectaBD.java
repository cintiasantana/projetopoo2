package com.odontoclean.jdbc;

import java.sql.*;
import javax.swing.JOptionPane;


public class ConectaBD {
             
    private static Connection connection;          
 
public static Connection AbriConexao() {


try {   
       	Class.forName("oracle.jdbc.driver.OracleDriver");  
        
       	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
       	String user = "system";
       	String password = "system";
        connection = DriverManager.getConnection(url, user, password);
        return connection;
        
        } catch (ClassNotFoundException e) {

        	 JOptionPane.showMessageDialog(null,"O driver expecificado nao foi encontrado.");
            System.exit(0);
            return null;

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"Nao foi possivel conectar ao Banco de Dados.\n\n"+e);
            System.exit(0);
            return null;

        }
}

public static boolean FecharConexao() {

        try {
            ConectaBD.AbriConexao().close();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
}

public static void StatusConexao(){
	if (connection != null){
		JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
	}
	else{
		JOptionPane.showMessageDialog(null, "Sem conexao");
	}
	
}

}
