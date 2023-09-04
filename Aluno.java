package faeterj;

public class Aluno {
	private String nome;
	private String matricula;
	private String email;
	private int idade;
	
	public Aluno (String nome, String matricula, String email, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
