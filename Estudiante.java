
public class Estudiante
{
    private String nombre;
    private int clave;
    
    public Estudiante(int claveIn, String nombreIn)
    {
        nombre= nombreIn;
        clave= claveIn;
    }
    
    public String dimeDetalles()
    {
        return "Clave:" +clave +",Nombre: " +nombre;
    }
    
    public int dimeClave()
    {
        return clave;
    }
}