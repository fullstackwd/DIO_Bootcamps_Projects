
public class Main {

	public static void main(String[] args) {
		Cliente Alef = new Cliente();
		Alef.setNome("Alef");
		
		Conta cc = new ContaCorrente(Alef);
		Conta poupanca = new ContaPoupanca(Alef);

		cc.depositar(1000000);
		cc.transferir(1000000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
