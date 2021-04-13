import java.util.Scanner;

class Mfon{
  public static void main(String[] args){
    Scanner tecladingo = new Scanner (System.in);
    
    int [] vetor ={0,1,1,2,3,5,8,13,21,34};

    System.out.print("Digite qual número você deseja da série de fibonacci");
    int n = tecladingo.nextInt();

    System.out.println(vetor[n-1]);
 
    
    


   
  }
}