import java.util.Scanner;

class Min{
  public static void main(String[] args){
    Scanner t = new Scanner (System.in);

    System.out.print("Digite a palavra: ");
    String palavra = t.nextLine().toLowerCase();
    int tamanho = palavra.length();
    char [] letra= palavra.toCharArray();
    char [] reptiu = new char[tamanho];
    int contador = 0; 
    for (int i = 0; i< tamanho -1 ; i++){
        
      for( int g = i+1; g< tamanho; g++ ){
        
        if (letra[i]==letra[g]){
          
          reptiu[contador]=letra[g];
          contador++;
        }

     
      }   
    
    }
  System.out.println("Letra(s) repetida(s)");
  System.out.println(reptiu);  
        
      
    


  }    
}