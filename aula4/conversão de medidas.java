import java.util.Scanner;

class Mudwater{
  public static void main(String[] args){
    Scanner tecla = new Scanner (System.in);

    System.out.print("A temperatura em Farenheit");
    double f = tecla.nextDouble();
    
    double c = ((f-32)/1.8);

    System.out.println(c);
  }

    
  
}