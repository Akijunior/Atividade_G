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
		
		/* 1 - Porque a Conta se divide em tipos diversos, e por isso � natural que ela tenha filhas
		 * mas n�o uma inst�ncia pr�pria. */
		/* 2 - Referencia de quem a classe est� herdando. */
		/* 3 - Como o m�todo da m�e � abstrato, ele n�o possui um corpo, e ao mesmo tempo
		 * tem a necessidade de ser implementado por suas classes filhas para que se prove a heran�a. */
		/* 5 - Usando Interfaces. */
		/* 6 - Deixa de ser poss�vel invocar esse m�todo diretamente da classe Conta, 
		 * e � preciso remover o @Override das classes filhas. */
		/* 7 - � poss�vel.*/
		/* Desafio -> Porque criando o array nele voc� poder� definir v�rios tipos de contas filhas
		 * para suas posi��es. */
		
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
