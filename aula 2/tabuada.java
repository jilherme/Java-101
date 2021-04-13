import java.util.Scanner;

      
class Mn{
  public static void main(String[] args){
    Scanner tecladoled = new Scanner (System.in);

    System.out.print("Digite um némuero de 2 a 9");
    int n = tecladoled.nextInt();
    int tabuada=0;
    int i=0;
    if (n>9){
      System.out.println("Número inválido");
    }
    else if (n<2){
      System.out.println("Número inválido");
    }
    else{
      while(i<10){
        i++;
        tabuada = (n*i);
        System.out.println(tabuada);
      }
    }
    
  }
}