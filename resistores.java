package Atividades;
import java.util.Scanner;


public class resistores {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a qual a cor do registor: ");
    String cor1 = scanner.next();
    System.out.println("Digite a qual a cor do segundo registor: ");
    String cor2 = scanner.next();    
    scanner.close();    
     
    Resistores resistor = new Resistores(cor1, cor2);
    System.err.println("--------------------------------------------------------------------");
    System.out.println("Resistência do registor: " + resistor.sumResist());
    
    
    }

    public static class Resistores {
        String cor1 = "cor1";
        String cor2 = "cor2";
        String resist1 = "";
        String resist2 = "";

        public Resistores(String cor1 , String cor2) {
            this.cor1 = cor1;
            this.cor2 = cor2;
            this.resist1 = "";
            this.resist2 = "";


            // pensei em usar arrays para facilitar isso mas não sei como faço
            switch (cor1) {
                case "Preto":
                    this.resist1 = "0";
                break;

                case "Marrom":
                    this.resist1 = "1";
                break;

                case "Vermelho":
                    this.resist1 = "2";
                break;

                case "Laranja":
                    this.resist1 = "3";
                break;
                
                case "Amarelo":
                    this.resist1 = "4";
                break;

                case "Verde":
                    this.resist1 = "5";
                break;

                case "Azul":
                    this.resist1 = "6";
                break;

                case "Violeta":
                    this.resist1 = "7";
                break;

                case "Cinza":
                    this.resist1 = "8";
                break;

                case "branco":
                    this.resist1 = "9";
                break;

                default:
                System.out.println("Cor do primeiro registor inválida");
                    break;
            }


            switch (cor2) {
                case "Preto":
                    this.resist2 = "0";
                break;

                case "Marrom":
                    this.resist2 = "1";
                break;

                case "Vermelho":
                    this.resist2 = "2";
                break;

                case "Laranja":
                    this.resist2 = "3";
                break;
                
                case "Amarelo":
                    this.resist2 = "4";
                break;

                case "Verde":
                    this.resist2 = "5";
                break;

                case "Azul":
                    this.resist2 = "6";
                break;

                case "Violeta":
                    this.resist2 = "7";
                break;

                case "Cinza":
                    this. resist2 = "8";
                break;

                case "branco":
                    this.resist2 = "9";
                break;

                default:
                System.out.println("Cor do primeiro registor inválida");
                    break;
            }
        }
         
        //criei uma função mas na verdade o melhor era criar um método, preciso tirar dúvidads sobre obejetos e métdos
        public String sumResist (){
            String soma = this.resist1 + this.resist2;
            return soma;
        }
    }
}
