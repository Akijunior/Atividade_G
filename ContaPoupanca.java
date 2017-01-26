package Domain;

public class ContaPoupanca extends Conta{
	
	@Override
	public void atualiza(double taxaSelic){
		saldo += (saldo * taxaSelic * 3);
	}
	
	

}
