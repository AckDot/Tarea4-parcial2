public class Trabajador
{
   protected String nombre ;
   protected byte edad ;
   protected int salario; 
   protected Trabajador (String nombre , byte edad ,int salario){
       this.nombre = nombre;
       this.edad =edad;
       this.salario = salario;
    }  
    protected String Trabaja(){
    return "Se pone  a trabajar 8 horas al dia";
    }
    protected String Comer(){
  return "come 3 veces al dia , \"jumm.. un delicioso plato\" ";
    }
    protected String Vacacion(){
  return "Se va de vacacion por 2 meses, \"espero que tengan todo controlado en mi ausencia\" ";
    }
}
