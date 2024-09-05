import java.util.Scanner;

public class b {
    public static  void main (String[] args) {
Scanner scanner = new Scanner(System.in) ;
System.out.println ("ingresa Numero Entero " );
int numeroEntero = scanner.nextInt ( );
if (numeroEntero %2 ==0 ){
 int resultadoDeLaMultiplicacion = numeroEntero * 3 ; 
 System.out.println(resultadoDeLaMultiplicacion);  
 }else {
 int resultadoFinal = numeroEntero *2 ;  
 System.out.println(resultadoFinal);
  } 
  scanner.close();
    }   
}
