package herança_palavra_chave_super;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String TelefoneCelular;
	private String cpf;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefoneCelular() {
		return TelefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		TelefoneCelular = telefoneCelular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
