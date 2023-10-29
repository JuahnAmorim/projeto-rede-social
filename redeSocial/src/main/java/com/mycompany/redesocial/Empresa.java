package com.mycompany.redesocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa extends Usuario {

    private String ramo;
    private String anuncio;

    public Empresa(String nome, String ramo, String anuncio) {
        super(nome);
        this.ramo = ramo;
        this.anuncio = anuncio;
    }
    public Empresa(){
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(String anuncio) {
        this.anuncio = anuncio;
    }

    public Empresa criarEmpresa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do usuario: ");
        String nome = sc.nextLine();
        System.out.println("Digite o ramo da empresa: ");
        String ramo = sc.nextLine();
        System.out.println("Digite o anuncio da empresa: ");
        String anuncio = sc.nextLine();
        return new Empresa(nome, ramo, anuncio);

    }
    
    public void atualizarUsuario(String nome, String ramo, String anuncio) {
    	this.setNome(nome);
    	this.setRamo(ramo);
    	this.setAnuncio(anuncio);
    }

    @Override
    public void removerUsuario(ArrayList<Usuario> listaUsuarios, String nome) {
        super.removerUsuario(listaUsuarios, nome);
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
		return "\nEmpresa\nNome: " + this.getNome() +
			   "\nRamo: " + this.getRamo() +
			   "\nAnuncio: " + this.getAnuncio() + "\n";
	}
}
