package com.mycompany.redesocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario { // Atributos da classe

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

	public void removerUsuario(ArrayList<Usuario> listaUsuarios, String nome) {
		if (!listaUsuarios.isEmpty()) {
			ArrayList<Usuario> remover = new ArrayList<>();
			for (Usuario u : listaUsuarios) {
				if (u.getNome().equalsIgnoreCase(nome)) {
					remover.add(u);
				}
			}
			listaUsuarios.removeAll(remover);
		} else {
			System.out.println("A lista esta vazia!");
		}
	}

	public void atualizarUsuario() {}

	public void imprimirUsuarios(ArrayList<Usuario> listaUsuarios) {
		if (!listaUsuarios.isEmpty()) {
			for (Usuario u : listaUsuarios) {
				System.out.println(u);
			}
		} else {
			System.out.println("A lista esta vazia!");
		}
	}

	public void criarAmizade(ArrayList<Usuario> listaUsuarios, String nomeUsuario) {
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
						}
					}
				}
			}
		} else {
			System.out.println("A lista esta vazia!");
		}
	}

	public void removerAmizade(ArrayList<Usuario> listaUsuarios, String nomeUsuario) {
		if (!listaAmizades.isEmpty()) {
			if (!listaUsuarios.isEmpty()) {
				Scanner sc = new Scanner(System.in);
				for (Usuario u : listaUsuarios) {
					if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
						System.out.println("\nCom quem deseja remover amizade? ");
						String nomeAmigo = sc.nextLine();
						for (Usuario a : listaUsuarios) {
							if (a.getNome().equalsIgnoreCase(nomeAmigo)) {
								u.listaAmizades.remove(a);
								System.out.println("\nA amizade com " + nomeAmigo + " foi removida!\n");
							}
						}
					}
				}
			} else {
				System.out.println("A lista esta vazia!");
			}
		} else {
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
			} else {
				System.out.println("\nA lista esta vazia!");
			}
		} else {
			System.out.println("\nVoce nao tem amigos atualmente!\n");
		}
	}
}
