
public class Estudiante
{
    private String nombre;
    public int clave;
    
    public Estudiante(int claveIn, String nombreIn)
    {
        nombre= nombreIn;
        clave= claveIn;
    }
    
    public String dimeDetalles()
    {
        return "Clave:" +clave +",Nombre: " +nombre;
    }
}