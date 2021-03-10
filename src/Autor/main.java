package Autor;

import java.util.Scanner;
import java.util.ArrayList;

public class main {

	 public static void main(String[] args) {
	     
	        Scanner l = new Scanner(System.in);
	        
	        
	        
	        System.out.println("BEM VINDO AO CADASTRO DE LIVROS e AUTORES");
	        
	        System.out.println("Digite o nome do autor: "+"\nNome ");
	        
	        String nomeLivro = l.nextLine();
	        
	        System.out.println("Digite o nome do Livro ");
	        
	        String autorUser = l.nextLine();
	        
	        System.out.println("O preço do Livro ");
	        
	        int preco = l.nextInt();
	        
	        System.out.println("A quantidade no Estoque");
	        
	        int qtdestoque = l.nextInt(); 
	        
	        
	      
	       
		Livro livro1 = new Livro(autorUser);
	        
	      
	        
	        livro1.setNome(nomeLivro);
	        livro1.setAutor(autorUser);
	        livro1.setPreco(preco);
	        livro1.setQtdestoque(qtdestoque);
	        
	        
	        ArrayList<Livro> usuarios = new ArrayList<Livro>();
	        
	        usuarios.add(livro1);
	        
	        System.out.println(livro1.getNome()+"\n"+livro1.getAutor()+"\n"+livro1.getPreco()+"\n"+livro1.getQtdestoque());
	     }
	}	
	        
	        
	
		



   
    
        
        
      