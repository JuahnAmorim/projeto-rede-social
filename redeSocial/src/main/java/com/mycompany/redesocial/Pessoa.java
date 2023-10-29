package com.mycompany.redesocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa extends Usuario {

    private int idade;

    public Pessoa(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }
    
    public Pessoa(){
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa criarPessoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        return new Pessoa(nome, idade);
    }

    public void atualizarUsuario(String nome, int idade) {
    	this.setNome(nome);
    	this.setIdade(idade);
    }

    @Override
    public void removerUsuario(ArrayList<Usuario> listaUsuarios, String nome) {
        super.removerUsuario(listaUsuarios, nome);
    }
    
    public void imprimirUsuarios(ArrayList<Usuario> listaUsuarios) {
    	super.imprimirUsuarios(listaUsuarios);
    }
    
    @Override
    public void criarAmizade(ArrayList<Usuario> listaUsuarios) {
        super.criarAmizade(listaUsuarios);
    }

    @Override
    public void imprimirAmizade(ArrayList<Usuario> listaUsuarios) {
        super.imprimirAmizade(listaUsuarios);
    }

    @Override
    public void removerAmizade(ArrayList<Usuario> listaUsuarios) {
        super.removerAmizade(listaUsuarios);
    }

	@Override
	public String toString() {
		return "\nPessoa\nNome: " + this.getNome() +
			   "\nIdade: " + this.getIdade() + "\n";
	}
    
    
}
