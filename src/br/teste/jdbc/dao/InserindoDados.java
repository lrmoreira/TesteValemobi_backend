package br.teste.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import br.teste.jdbc.ConectionFact;
import br.teste.jdbc.dto.Contatos;

public class InserindoDados {{

		Random ran = new Random();
		
		try(Connection con = ConectionFact.abrir()){
			Contatos contatos = new Contatos();
			
				String sql = "insert into tb_customer_account values(?,?,?,?,?)";
				PreparedStatement stm = con.prepareStatement(sql);
					for(int i = 0; i < contatos.pessoas.length; i++){
						
								stm.setInt(1, ran.nextInt(2700) + 1500);							
								stm.setString(2, contatos.cpf_cnpj[i]);
								stm.setString(3, contatos.getPessoas(ran.nextInt(17)));
								stm.setString(4, "S");
								stm.setDouble(5, ran.nextDouble()*10000.000 + 100.00);

								stm.addBatch();		

							}

							stm.executeBatch();				

						}catch(SQLException e){
							System.out.println(e.getMessage());
						}
	}			
	}
	

