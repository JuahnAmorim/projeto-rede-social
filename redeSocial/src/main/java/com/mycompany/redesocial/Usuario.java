package com.mycompany.redesocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {  //Atributos da classe

    private String nome;
    
      ArrayList<Usuario> listaAmizades = new ArrayList<>();
      ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public Usuario(String nome) { //Construtor da classe
        this.nome = nome;
    }
    
    public Usuario(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void criarUsuario() {
    }

    public void removerUsuario(ArrayList<Usuario> listaUsuarios, String nome) {
        if (!listaUsuarios.isEmpty()) {
            for (Usuario u : listaUsuarios) {
                if (u.getNome().equalsIgnoreCase(nome)) {
                    listaUsuarios.remove(u);
                }
            }
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
        }else {
        	System.out.println("A lista esta vazia!");
        }
    }

    public void criarAmizade(ArrayList<Usuario> listaUsuarios) {
        if (!listaUsuarios.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do usuario: ");
            String nomeUsuario = sc.nextLine();
            for (Usuario u : listaUsuarios) {
                if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
                    System.out.println("Com quem deseja fazer amizade? ");
                    String nomeAmigo = sc.nextLine();
                    for (Usuario a : listaUsuarios) {
                        if (a.getNome().equalsIgnoreCase(nomeAmigo)) {
                            u.listaAmizades.add(a);
                        } else {
                            System.out.println("Usuario nao encontrado!");
                        }
                    }
                }
            }
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public void removerAmizade(ArrayList<Usuario> listaUsuarios) {
        if (!listaUsuarios.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do usuario: ");
            String nomeUsuario = sc.nextLine();
            for (Usuario u : listaUsuarios) {
                if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
                    System.out.println("Com quem deseja remover amizade? ");
                    String nomeAmigo = sc.nextLine();
                    for (Usuario a : listaUsuarios) {
                        if (a.getNome().equalsIgnoreCase(nomeAmigo)) {
                            u.listaAmizades.remove(a);
                        } else {
                            System.out.println("Usuario nao encontrado!");
                        }
                    }
                }
            }
        } else {
            System.out.println("A lista esta vazia!");
        }
    }

    public void imprimirAmizade(ArrayList<Usuario> listaUsuarios) {
        if (!listaUsuarios.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do usuario: ");
            String nomeUsuario = sc.nextLine();
            for (Usuario u : listaUsuarios) {
                if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
                    System.out.println("Lista de amigos de " + u.getNome() + ":\n" + u.listaAmizades);
                } else {
                    System.out.println("Usuario nao encontrado!");
                }
            }
        } else {
            System.out.println("A lista esta vazia!");
        }
    }
}
