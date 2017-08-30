package br.teste.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.teste.jdbc.ConectionFact;

public class Selecoes {
	
	public static void selecaoMedia() {
		
	try(Connection con = ConectionFact.abrir()){
		String sql = "select AVG(vl_total) from tb_customer_account where vl_total > 560.00 and id_customer between 1500 and 2700";	
		PreparedStatement stm2 = con.prepareStatement(sql);
		
		ResultSet rs = stm2.executeQuery();

			while(rs.next()){
				System.out.println("Média final é de: "+ rs.getDouble(1));

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void selecaoDeUsuariosMedia() {
		
		try(Connection con = ConectionFact.abrir()){
			String sql = "select NM_CUSTOMER from tb_customer_account where id_customer between 1500 and 2700 and vl_total > 560 order by vl_total desc";	
			PreparedStatement stm3 = con.prepareStatement(sql);
			ResultSet rs2 = stm3.executeQuery();

			System.out.println("Listagem de usuários utilizados para tirar a média: ");

				while(rs2.next()){
					System.out.println(rs2.getString(1));

				}	
				}catch(SQLException e){

					System.out.println(e.getMessage());
				}

}


}

