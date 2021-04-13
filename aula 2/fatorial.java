import java.util.Scanner;

class Mqin{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);

    System.out.print("Digite o número");
    int n = keyboard.nextInt();
    int f = 1;
    int fat = 0;
    
    while(fat<n){
      fat = fat+1;
      f=f*fat;
      
      System.out.println(f);
      
      
    } 
  }
}