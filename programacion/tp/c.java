import java.util.Scanner;

public class c {
public static void main(String[] args) {
Scanner scanner =new Scanner(System.in) ;
int numero;
int factorial = 1;   
System.out.println("ingresa un numero del 0 a 10  ");
numero = scanner.nextInt ();
if (numero <=10 ) {
int i = numero ;
while (i>1 ) {
factorial = factorial * i ;
i -- ;    
    
}    
 }else {
 System.out.println ("error de numero" );   
 }

System.out.println( "el factorial es  " + factorial);
scanner.close();
}    
}
