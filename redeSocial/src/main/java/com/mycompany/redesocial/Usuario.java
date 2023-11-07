package com.mycompany.redesocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

	private String nome;

	ArrayList<Usuario> listaAmizades = new ArrayList<>();
	ArrayList<Usuario> listaUsuarios = new ArrayList<>();

	public Usuario(String nome) { // Construtor da classe
		this.nome = nome;
	}

	public Usuario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Usuario criarUsuario() {
		return null;
	}

	public void removerUsuario(ArrayList<Usuario> listaUsuarios, String nome) {
		if (!listaUsuarios.isEmpty()) {
			ArrayList<Usuario> remover = new ArrayList<>();
			for (Usuario u : listaUsuarios) {
				if (u.getNome().equalsIgnoreCase(nome)) {
					remover.add(u);
				}
			}
			listaUsuarios.removeAll(remover);
		}
	}

	public void atualizarUsuario() {
	}

	public void imprimirUsuarios(ArrayList<Usuario> listaUsuarios) {
		if (!listaUsuarios.isEmpty()) {
			for (Usuario u : listaUsuarios) {
				System.out.println(u);
			}
		}
	}

	public void criarAmizade(ArrayList<Usuario> listaUsuarios, String nomeUsuario) {
		boolean usuarioEncontrado = false;
		if (!listaUsuarios.isEmpty()) {
			Scanner sc = new Scanner(System.in);
			for (Usuario u : listaUsuarios) {
				if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
					System.out.println("\nCom quem deseja fazer amizade? ");
					String nomeAmigo = sc.nextLine();
					for (Usuario a : listaUsuarios) {
						if (a.getNome().equalsIgnoreCase(nomeAmigo)) {
							u.listaAmizades.add(a);
							System.out.println("\nAgora voce e amigo de " + nomeAmigo + "!\n");
							usuarioEncontrado = true;
							break;
						}
					}
				}
			}
		}if(usuarioEncontrado == false) {
			System.out.println("Usuario nao encontrado!\n");
		}
	}

	public void removerAmizade(ArrayList<Usuario> listaUsuarios, String nomeUsuario) {
		boolean usuarioEncontrado = false;
		if (!listaAmizades.isEmpty()) {
			if (!listaUsuarios.isEmpty()) {
				Scanner sc = new Scanner(System.in);
				for (Usuario u : listaUsuarios) {
					if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
						System.out.println("\nCom quem deseja remover amizade? ");
						String nomeAmigo = sc.nextLine();
						for (Usuario a : listaAmizades) {
							if (a.getNome().equalsIgnoreCase(nomeAmigo)) {
								u.listaAmizades.remove(a);
								System.out.println("\nA amizade com " + nomeAmigo + " foi removida!\n");
								usuarioEncontrado = true;
								break;
							}
						}
					}
				}
			}
			if(usuarioEncontrado == false){
				System.out.println("Esse usuario nao faz parte da sua lista de amigos!\n");
			}
		}else {
			System.out.println("\nVoce nao possui amigos para remover!\n");
		}
	}

	public void imprimirAmizade(ArrayList<Usuario> listaUsuarios, String nomeUsuario) {
		if (!listaAmizades.isEmpty()) {
			if (!listaUsuarios.isEmpty()) {
				for (Usuario u : listaUsuarios) {
					if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
						System.out.println("Lista de amigos de " + u.getNome() + ":");
						for (Usuario a : listaAmizades) {
							System.out.println(a.getNome());
						}
					}
				}
				System.out.println("\n");
			}
		} else {
			System.out.println("\nVoce nao tem amigos atualmente!\n");
		}
	}
}
