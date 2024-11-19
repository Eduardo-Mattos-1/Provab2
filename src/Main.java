import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Usuario usuario = new Usuario();
    public static ArrayList<Usuario> listausuarios = new ArrayList();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("1 - cadastro");
            System.out.println("2 - listagem");
            System.out.println("3 - excluir");
            System.out.println("4 - ordenar");
            System.out.println("5 - Parar");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                cadastro();
            }
            if (opcao == 2) {
                listagem();
            }
            if (opcao == 3) {
                excluir();
            }
            if (opcao == 4) {
                ordenar();
            }
            if (opcao == 5) {
                continuar = false;
            }
        }



    }

    public static void cadastro(){

        System.out.println("Qual o nome do usuário?");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Qual a idade do usuário?");
        int idade = sc.nextInt();
         listausuarios.add(new Usuario(nome, idade));



    }

    public static void listagem(){
        //for (int i = 0; i < listausuarios.size(); i++) {}
        for(Usuario usuario: listausuarios){
            System.out.println(usuario);
        }


    }

    public static void excluir(){
        System.out.println("Qual o nome do usuario que deseja excluir?");
        sc.nextLine();
        String nome = sc.nextLine();



                Iterator<Usuario> iterator = listausuarios.iterator();
                while(iterator.hasNext()){
                    Usuario usuario = iterator.next();
                    if(usuario.equals(usuario)){
                        iterator.remove();
                    }
                }







    }


    public static void ordenar(){

        for(Usuario usuarioi: listausuarios){

            for(Usuario usuarioj: listausuarios){

                if(usuarioi.getIdade() > (usuarioj.getIdade())){
                    Usuario aux = usuarioi;
                    usuarioi = usuarioj;
                    usuarioj = aux;

                }
            }
        }

        System.out.println("Lista de usuarios ordenada"+ listausuarios);
    }




}