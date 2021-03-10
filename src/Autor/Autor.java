package Autor;

public class Autor {
	private String nome, email;
	private char genero;
		
		
	public Autor() {
			nome = " ";
			email = " ";
			genero = 'a';
		}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", email=" + email + ", genero=" + genero + "]";
	}
	
	public Autor (String nomeUse, String emailUse, char generoUse) {
		
		nome = nomeUse;
		email = emailUse;
		genero = generoUse;
	}
		
}
			
