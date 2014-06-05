package tester;

import controller.Conexao;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexao c = new Conexao("PostgreSql", "localhost", "5432", "custos",
				"postgres", "root");
		c.conect(); 
		// ...
		c.disconect();

	}

}
