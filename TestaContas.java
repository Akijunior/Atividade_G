package App;

import Domain.Conta;
import Domain.ContaCorrente;
import Domain.ContaPoupanca;

public class TestaContas {
	
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		Conta[] testeAbstrato = new Conta[10];
		
		/* 1 - Porque a Conta se divide em tipos diversos, e por isso é natural que ela tenha filhas
		 * mas não uma instância própria. */
		/* 2 - Referencia de quem a classe está herdando. */
		/* 3 - Como o método da mãe é abstrato, ele não possui um corpo, e ao mesmo tempo
		 * tem a necessidade de ser implementado por suas classes filhas para que se prove a herança. */
		/* 5 - Usando Interfaces. */
		/* 6 - Deixa de ser possível invocar esse método diretamente da classe Conta, 
		 * e é preciso remover o @Override das classes filhas. */
		/* 7 - É possível.*/
		/* Desafio -> Porque criando o array nele você poderá definir vários tipos de contas filhas
		 * para suas posições. */
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}
