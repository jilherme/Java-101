import java.util.Scanner;

class Mqn{
  public static void main(String[] args){
    Scanner dell = new Scanner(System.in);
    
    System.out.print("Digita aí");
    double p = dell.nextDouble();

    double desconto = (p*0.15);
    double total = (p-desconto);

    System.out.println(total);
  }
} 