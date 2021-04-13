import java.util.Scanner;
import java.util.Random;

class s{
  public static void main(String[] args){
    Scanner dell = new Scanner (System.in);

    System.out.print("Tenta acertar aí");
    int n = dell.nextInt();
    
    Random gerador = new Random();
    int aleatorio = gerador.nextInt(100);
    while(aleatorio!=n){ 
      if (n>aleatorio){
        System.out.println("Muito alto");
        System.out.print("Tenta acertar aí");
        n = dell.nextInt();
      }
      if(aleatorio>n){
        System.out.println("Muito baixo");
        System.out.print("Tenta acertar aí");
        n = dell.nextInt();
      }
      else{
        System.out.println("Acertou");
        return;
      }
    }

  }
}