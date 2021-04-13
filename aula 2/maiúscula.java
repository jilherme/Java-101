import java.util.Scanner;

class Mun{
  public static void main(String[] args){
    Scanner tecladogamer = new Scanner (System.in);
    
    System.out.print("Digite o nome");
    String nome = tecladogamer.nextLine().toLowerCase();
    String s = nome;
    nome = nome.substring(0,1).toUpperCase() + nome.substring(1);
    
    System.out.print("Digite o sobrenome");
    String sobrenome = tecladogamer.nextLine().toUpperCase();

    System.out.println(sobrenome + ","+ " " + nome );

    
    
  }
}
