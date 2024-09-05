import java.util.Scanner;
public class d {
 public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int numero ;
    System.out.println("ingresa un numero del 1 al 9");
    numero = scanner.nextInt ();
    if (numero<=9 ){
    for (int i = 1; i <=10 ; i ++ ) {
     int resultado = numero * i;
     System.out.println(numero + "x"+ i + "= "+ resultado );   
    }   
    }else {
     System.out.println( "error de numero  ");   
    }
    scanner.close();
 }
}
 