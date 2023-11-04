package com.mycompany.redesocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa extends Usuario {

    private int idade;

    public Pessoa(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }
    
    public Pessoa(){}

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Usuario criarPessoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        System.out.println("O usuario " + nome + " foi criado!");
        return new Pessoa(nome, idade);
    }

    @Override
    public void atualizarUsuario() {
        Scanner sc = new Scanner(System.in);
		System.out.print("Novo nome: ");
		String novoNome = sc.nextLine();
		System.out.print("Nova idade: ");
		int novaIdade = sc.nextInt();
		sc.nextLine();
    	this.setNome(novoNome);
    	this.setIdade(novaIdade);
    	System.out.println("\nAs informacoes do usuario " + novoNome + " foram atualizadas!\n");
    }

    @Override
    public void removerUsuario(ArrayList<Usuario> listaUsuarios, String nome) {
        super.removerUsuario(listaUsuarios, nome);
    }
    
    public void imprimirUsuarios(ArrayList<Usuario> listaUsuarios) {
    	super.imprimirUsuarios(listaUsuarios);
    }
    
    @Override
    public void criarAmizade(ArrayList<Usuario> listaUsuarios, String nomeUsuario) {
        super.criarAmizade(listaUsuarios, nomeUsuario);
    }

    @Override
    public void imprimirAmizade(ArrayList<Usuario> listaUsuarios, String nomeUsuario) {
        super.imprimirAmizade(listaUsuarios, nomeUsuario);
    }

    @Override
    public void removerAmizade(ArrayList<Usuario> listaUsuarios, String nomeUsuario) {
        super.removerAmizade(listaUsuarios, nomeUsuario);
    }

	@Override
	public String toString() {
		return "\nPessoa\nNome: " + this.getNome() +
			   "\nIdade: " + this.getIdade() + "\n";
	}
    
    
}
