import java.util.Scanner;

class Moown{
  public static void main(String[] args){
    Scanner tecladinho = new Scanner (System.in);

    System.out.print("Digite os dados");
    int dado = tecladinho.nextInt();


    double bytes  = (dado/8);
    System.out.println("Em Bytes "+ bytes+"B");
    double kbytes = (bytes*1024);
    System.out.println("Em Kbytes"+ kbytes+"KB");
    double Mbytes = (kbytes*1024);
    System.out.println("Em Mbytes"+ Mbytes+"MB");
    }

}