import java.util.Scanner;

class Mwwwwn{
  public static void main(String[] args){
  Scanner krom = new Scanner (System.in);

   System.out.print("Digite a palavra");
   String palavra = krom.nextLine();
   int n = 0;
   int vogais = 0;
   
   for( n=0 ;n < palavra.length();n++ ){
      if(palavra.charAt(n)=='a'){
        vogais++;
      }
      else if(palavra.charAt(n)=='e'){
         vogais++;
      }
       else if(palavra.charAt(n)=='i'){
         vogais++;
      }
       else if(palavra.charAt(n)=='o'){
         vogais++;
      }
       else if(palavra.charAt(n)=='u'){
         vogais++;
      }
   }   
   if (vogais==0){
      System.out.println("Nenhuma vogal encontrada");
   }
   else{
     System.out.println("Número de vogais encontradas: " + vogais);
   }    
       
   
  }
}