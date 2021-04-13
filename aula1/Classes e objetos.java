import java.util.Scanner;

class Maan {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    
    System.out.print("Digite a primeira nota: ");
    double n1 = teclado.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double n2 = teclado.nextDouble();

    double media = (n1+n2) / 2;
    System.out.println("A média é " + media);
  }
}