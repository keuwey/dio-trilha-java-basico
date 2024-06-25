public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente("Kevin Halley", 3200);
		Conta cp = new ContaPoupanca("Kevin Halley", 3200);
		System.out.println(cc.titular);
		System.out.println(cc.saldo);
		System.out.println(cc.agencia);
		System.out.println(cc.numero);
		System.out.println("\n");
		System.out.println(cp.titular);
		System.out.println(cp.saldo);
		System.out.println(cp.agencia);
		System.out.println(cp.numero);
	}
}
