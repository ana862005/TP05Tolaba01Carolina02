package punto5;
import punto5.models.Persona;
import java.time.LocalDate;
public class main {
 public static void main(String[] args) {
    punto5.models.Persona persona1 = new Persona();
   persona1.setDni(42576142);  
   persona1.setNombre ("Ailen") ;
   persona1.setFechaDeNacimiento(LocalDate.of(2010,05,23)); 
   //persona1.setProvincia("JUJUY") ;
   persona1.mostrarInformacion();


 }   
}
