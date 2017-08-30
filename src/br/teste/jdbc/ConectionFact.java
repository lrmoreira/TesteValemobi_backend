package br.teste.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFact {

		private static final String usuario = "root";
	    private static final String senha = "Tatiane0211";
	    private static final String url = "jdbc:mysql://127.0.0.1:3306/TesteValeMobi";
	    private static final String drive = "com.mysql.jdbc.Driver";
		private final Connection con = null;
	    
		public static Connection abrir() {
			
			
			Connection con = null;
			
			try{
				Class.forName(drive);
				con = DriverManager.getConnection(url, usuario, senha);
				System.out.println("Conectado");
				
			   }catch(ClassNotFoundException e) {
				   //String Mensagem = "Falha ao conectar ao banco";
				   System.out.println("Erro de Drive"+ e.getMessage());
				   
			   }catch(SQLException e) {
				//	String Mensagem = "Falha ao conectar ao banco";
					System.out.println("Erro ao Conectar\n"+e.getStackTrace());
				}
			
			
			return con;
		}
		
		public void desconectar() {
			try {
				if(con != null) {
					con.close();
					System.out.println("Desconectado");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	/*	
	 * teste da classe
	 * 
	 * public static void main(String args[]) {
	 
			new ConectionFact().abrir();
			new ConectionFact().desconectar();
		}*/
			
	}


