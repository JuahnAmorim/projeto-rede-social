package com.mycompany.redesocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Test{

    public static void main(String[] args) {
    	ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    	Usuario usuario = new Usuario();
    	//Inicializando as listas        
        Scanner sc = new Scanner(System.in);
        do{
        	//fazer metodo login para todos os metodos ficarem para um usuario
            System.out.println("1 - Login;\n" +
                               "2 - Atualizar usuario;\n" +
                               "3 - Remover usuario;\n" +
                               "4 - Imprimir usuarios;\n" +
                               "5 - Fazer amizade\n" +
                               "6 - Remover amizade\n" +
                               "7 - Imprimir amizades\n" +
                               "8 - Sair");
            int op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    System.out.println("Login\nNome: ");
                    String nomeLogin = sc.nextLine();
                    boolean usuarioEncontrado = false;
                    for(Usuario u : listaUsuarios) {
                    	if(u.getNome().equalsIgnoreCase(nomeLogin)) {
                    		System.out.println("Bem vindo " + u.getNome() + "\n");
                    		usuario = u;
                    		usuarioEncontrado = true;
                    		break;
                    	}
                    }
                    if(usuarioEncontrado == false) {
                    	System.out.println("Cadastre-se:");
                        System.out.println("1 - Pessoa\n2 - Empresa");
                        int opcao = sc.nextInt();
                        sc.nextLine();
                        if(opcao == 1){
                        	System.out.println("Digite o nome: ");
                        	String nome = sc.nextLine();
                        	System.out.println("Digite a idade: ");
                        	int idade = sc.nextInt();
                        	System.out.println("\n");
                        	Pessoa p = new Pessoa(nome, idade);
                            listaUsuarios.add(p);
                        }else if(opcao == 2){
                        	System.out.println("Digite o nome: ");
                        	String nome = sc.nextLine();
                        	System.out.println("Digite o ramo: ");
                        	String ramo = sc.nextLine();
                        	System.out.println("Digite o anuncio: ");
                        	String anuncio = sc.nextLine();
                        	System.out.println("\n");
                        	Empresa e = new Empresa(nome, ramo, anuncio);
                            listaUsuarios.add(e);
                        }else{
                            System.out.println("Opcao invalida!");
                        }
                        break;
                    }else {
                    	break;
                    }
                
                case 2:
                	System.out.println("Atualizacao do usuario");
                	if(usuario instanceof Pessoa) {
                		System.out.println("Novo nome: ");
                		String novoNome = sc.nextLine();
                		System.out.println("Nova idade: ");
                		int novaIdade = sc.nextInt();
                		sc.nextLine();
                		((Pessoa) usuario).atualizarUsuario(novoNome, novaIdade);
                	}else if(usuario instanceof Empresa) {
                		System.out.println("Novo nome: ");
                		String novoNome = sc.nextLine();
                		System.out.println("Novo ramo: ");
                		String novoRamo = sc.nextLine();
                		System.out.println("Novo anuncio: ");
                		String novoAnuncio = sc.nextLine();
                		((Empresa) usuario).atualizarUsuario(novoNome, novoRamo, novoAnuncio);
                	}else {
                		System.out.println("Nnenhum");
                	}
                    break;
                    
                case 3:
                	//remover
                	
                case 4:
                    usuario.imprimirUsuarios(listaUsuarios);
                    break;
            }
        }while(true);
    }
}
