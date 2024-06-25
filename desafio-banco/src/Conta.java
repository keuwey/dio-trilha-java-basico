public abstract class Conta {
	protected int agencia;
	protected int numero;
	protected String titular;
	protected double saldo;

	private static int SEQUENCIAL = 1;
	private static final int AGENCIA = 1;

	public Conta(String titular, double saldo) {
		this.agencia = Conta.AGENCIA;
		this.numero = SEQUENCIAL++;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(double valor, Conta destino) {
		destino.depositar(valor);
		this.sacar(valor);
	}
}
