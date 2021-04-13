import java.util.Scanner;

class Main{
  public static void main(String[] args){
  Scanner korn = new Scanner(System.in);

  System.out.print("Digite a palavra");
  String palavra = korn.nextLine();

  String invertida = new StringBuilder(palavra).reverse().toString();

  System.out.println(invertida);

  }

}