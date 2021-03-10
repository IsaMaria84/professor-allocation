package Autor;

public class Livro {
	private String nomeLivro;
	private Object autorUser;
	private double preco;
	private int qtdestoque;
	
	
	public Livro(String autorUser2) {
		nomeLivro = " ";
		this.autorUser = autorUser2;
		preco = 0;
		qtdestoque = 0;
		
	}


	public String getNome() {
		return nomeLivro;
	}


	public void setNome(String nome) {
		this.nomeLivro = nome;
	}


	public String getAutor() {
		return (String) autorUser;
	}


	public void setAutor(String autorUser2) {
		this.autorUser = autorUser2;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQtdestoque() {
		return qtdestoque;
	}


	public void setQtdestoque(int qtdestoque) {
		this.qtdestoque = qtdestoque;
	}


	@Override
	public String toString() {
		return "Livro [nome=" + nomeLivro + ", autor=" + autorUser + ", preco=" + preco + ", qtdestoque=" + qtdestoque + "]";
	}
	
	public Livro(String nomeUm, Autor autorUm, double precoUm, int qtdestoqueUm) {
		
		nomeLivro = nomeUm;
		preco = precoUm;
		autorUser = autorUm; 
		qtdestoque = qtdestoqueUm;
	}


	public Livro(String string, String string2, double d, int i) {
		
	}



		
	}

	
	

