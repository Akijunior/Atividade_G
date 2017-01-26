package Domain;

public abstract class Conta {
	
	protected double saldo;
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	public void saca(double valor){
		saldo -= valor;
	}
	
	public abstract void atualiza(double taxaSelic);
	
	public double getSaldo(){
		return this.saldo;
	}

}
