

public class Zapatero extends Trabajador
{
   private String calzado ;
  //El zapatero puede fabricar un calzado especial dile que necesitas
  public Zapatero(String calzado ,String nombre , byte edad ,int salario){
    super(nombre, edad , salario);
      this.calzado = calzado ;
    }
}
