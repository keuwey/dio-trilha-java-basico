public class Cliente {
	private final String nome;
	private final String cpf;
	private String email;
	private String telefone;

	public Cliente(String nome, String cpf, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
}
