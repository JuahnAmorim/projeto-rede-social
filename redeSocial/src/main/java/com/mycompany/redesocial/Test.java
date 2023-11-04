package com.mycompany.redesocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Test{

	public static void main(String[] args) {
    	ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    	Usuario usuario = new Usuario();    
    	Pessoa p = new Pessoa();
    	Empresa e = new Empresa();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1 - Login/Cadastro de usuario;\n" +
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
                    System.out.print("\nLogin: ");
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
                    	System.out.println("\nSeu usuario ainda nao existe!\nCadastre-se:");
                        System.out.println("1 - Pessoa\n2 - Empresa");
                        int opcao = sc.nextInt();
                        sc.nextLine();
                        if(opcao == 1){
                        	Usuario pessoa = p.criarPessoa();
                            listaUsuarios.add(pessoa);
                            System.out.println("\n");
                        }else if(opcao == 2){
                        	Usuario empresa = e.criarEmpresa();
                            listaUsuarios.add(empresa);
                            System.out.println("\n");
                        }else{
                            System.out.println("Opcao invalida!\n");
                        }
                        break;
                    }else {
                    	break;
                    }
                
                case 2:
                	if (usuario.getNome() != null) {
	                	System.out.println("\nAtualizacao do usuario");
	                	if(usuario instanceof Pessoa) {
	                		((Pessoa) usuario).atualizarUsuario();
	                	}else if(usuario instanceof Empresa) {
	                		((Empresa) usuario).atualizarUsuario();
	                	}
	                	break;
                	}System.out.println("\nPara atualizar o usuario, primeiro faca login!\n");
                    break;
                    
                case 3:
                	if (usuario.getNome() != null) {
                		usuario.removerUsuario(listaUsuarios, usuario.getNome());
                    	System.out.println("O usuario " + usuario.getNome() + " foi removido!\n");
                    	break;
                	}
                	System.out.println("\nPara excluir, primeiro faca login!\n");
                	break;
                	
                case 4:
                	if (usuario.getNome() != null) {
                		usuario.imprimirUsuarios(listaUsuarios);
                        break;
                	}
                	System.out.println("\nPara imprimir os usuarios, primeiro faca login!\n");
                    break;
                    
                case 5:
                	if (usuario.getNome() != null) {
                		usuario.criarAmizade(listaUsuarios, usuario.getNome());
                		break;
                	}
                	System.out.println("\nPara criar amizades, primeiro faca login!\n");
                	break;
                	
                case 6:
                	if (usuario.getNome() != null) {
                		usuario.removerAmizade(listaUsuarios, usuario.getNome());
                		break;
                	}
                	System.out.println("\nPara remover amizades, primeiro faca login!\n");
                	break;
                	
                case 7: 
                	if (usuario.getNome() != null) {
                		usuario.imprimirAmizade(listaUsuarios, usuario.getNome());
                		break;
                	}
                	System.out.println("\nPara imprimir amizades, primeiro faca login!\n");
                	break;
                	
                case 8:
                	System.out.println("Saindo do sistema...");
                	return;
                
                default:
                	System.out.println("Opcao invalida!\n");
            }
        }while(true);
    }
}
