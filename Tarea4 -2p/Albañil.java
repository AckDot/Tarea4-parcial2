
public class Albañil extends Trabajador
{
    
 private String  estructura ;
// el albañil puede construir algo para ti , dile que edificacion quieres
     public Albañil(String edificio,String nombre , byte edad ,int salario)
    {
        super(nombre, edad , salario);
       this.estructura=edificio;
    }

}
