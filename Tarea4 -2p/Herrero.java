
public class Herrero extends Trabajador
{
     private String objeto_crear; // objeto que creara el herrero
 
    // el herrero creara algo para ti dile que necesitas
     public Herrero(String objeto,String nombre , byte edad ,int salario){
      super(nombre , edad, salario);
        this.objeto_crear = objeto ;
    }
   
}
