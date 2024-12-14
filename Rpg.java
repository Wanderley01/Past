package Atividades;
import java.util.Scanner;
import java.util.Random;


public class Rpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do personagem?");
        String nome = scanner.next();
        System.out.println("Qual a classe do personagem?");
        String classe = scanner.next();
        System.err.println("Deseja ver os status da açao?");
        String verStatus = scanner.next();
        scanner.close();
        
        Personagem personagem = new Personagem(nome, classe);

        personagem.mostrarFicha();
        personagem.actions(verStatus);
    }
    
    public static class Personagem {
        // Declares os atributos aqui (nome, classe, destreza, forca, inteligência)
        String nome = "nome";
        String classe = "classe";
        int destreza;
        int forca;
        int inteligencia;

      
        public Personagem (String nome, String classe) {
            // Inicialize os atributos aqui
            this.nome = nome;
            this.classe = classe;
            this.destreza = 0;
            this.forca = 0;
            this.inteligencia = 0;

            switch (classe) {
                case "Paladino":
                    this.destreza = Dvinte();
                    this.forca = Ddoze();
                    this.inteligencia = Doito();
                    break;
                case "Mago":
                    this.inteligencia = Dvinte();
                    this.forca = Doito();
                    this.destreza = Ddoze();
                    break;
                case "Arqueiro":
                    this.destreza = Dvinte();
                    this.forca = Ddoze();
                    this.inteligencia = Doito();
                    break;
                default:
                     System.out.println("Classe inválida. Escolha Paladino, Mago ou Arqueiro");
                    break;
            }                      
        }
        
        public void mostrarFicha() {
            // Imprima na tela as informações do personagem
            System.out.println("Nome: " + nome);
            System.out.println("Classe: " + classe);
            System.out.println("Destreza: " + destreza);
            System.out.println("Força: " + forca);
            System.out.println("Inteligência: " + inteligencia);
            
        }


        // Quero que além de retornar o que foi pedido ele informe os status de ação do personagem mas ele não está somando

        
        public void actions(String a) {
                switch (a) {
                    case "Sim":
                     if (nome == "Paladino"){
                        System.out.println( "Ataque: " + forca);
                        System.out.println( "Desviar: " + destreza);
                        System.out.println( "QI em batalha" + forca);
                     } if (nome == "Mago") {
                        System.out.println( "Ataque: " + forca + 4);
                        System.out.println( "Desviar: " + destreza + 8);
                        System.out.println( "QI em batalha" + forca + 3);
                     } else {
                        System.out.println( "Ataque: " + forca + 7);
                        System.out.println( "Desviar: " + destreza + 10);
                        System.out.println( "QI em batalha" + forca + 5);
                     }                  
                        break;
                    default:
                     System.out.println("Você não deseja ver os status da ação.");  
                        break;
                }
            }

        //Dados
        public static int Dvinte() {
            Random dvinte = new Random();
            int rolagem = dvinte.nextInt(20);
            return rolagem;
        }
        public static int Ddoze() {
            Random dvinte = new Random();
            int rolagem = dvinte.nextInt(12);
            return rolagem;
        }
        public static int Doito() {
            Random dvinte = new Random();
            int rolagem = dvinte.nextInt(8);
            return rolagem;
        }
        public static int Dmeia() {
            Random dvinte = new Random();
            int rolagem = dvinte.nextInt(6);
            return rolagem;
        }
    }
}