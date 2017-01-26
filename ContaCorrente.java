package Domain;

public class ContaCorrente extends Conta{
	
	public void deposita(double valor){
		saldo += (valor - 0.10);
	}

	@Override
	public void atualiza(double taxaSelic) {
		
		saldo += (saldo * taxaSelic * 3);
		// TODO Auto-generated method stub
		
	}

}
