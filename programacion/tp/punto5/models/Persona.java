package punto5.models;
import java.time.LocalDate;
import java.time.Period;
public class Persona {
private int dni ;
private String nombre ;
private LocalDate fechaDeNacimiento ;
private String provincia ;
public Persona ( ) {
this.provincia=   "jujuy "  ;
 } 
 
 public Persona (int dni,String nombre, LocalDate fechaDeNacimiento, String provincia){
    this.dni = dni;
    this.nombre = nombre;
    this.fechaDeNacimiento = fechaDeNacimiento;
    this.provincia = provincia;
 }


 //inicio de getter y setter
 public int getDni (){
 return dni ;   
 }
 public void setDni (int dni ){
 this.dni = dni ;   
 }
 public String getNombre (){
 return nombre ;

}
public void setNombre (String nombre){
 this.nombre = nombre ;   
}
public LocalDate  getFechaDeNacimiento (){
 return fechaDeNacimiento ;   
}
public void setFechaDeNacimiento (LocalDate fechaDeNacimiento){
 this.fechaDeNacimiento = fechaDeNacimiento ;   
}
public String getProvincia (){
 return provincia ;   
}
public void setProvincia (String provincia){
 this.provincia = provincia ;   
}
// Metodos 
public int calcularEdad (){
 return Period.between(this.fechaDeNacimiento, LocalDate.now())  .getYears();
}


public boolean verificarLaEdad (){
   return this.calcularEdad()>=18;
}


public void mostrarInformacion (){ 
   System.out.println(this.dni);
   System.out.println(this.nombre);
   System.out.println(this.fechaDeNacimiento);
   System.out.println(this.provincia);
   System.out.println(this.calcularEdad());
   if (this.verificarLaEdad()){
      System.out.println(  "La persona es mayor de edad ");
   }else {
      System.out.println("La persona no es mayor de edad");
   }
}

}


