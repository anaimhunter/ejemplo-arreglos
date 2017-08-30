
public class Estudiante
{
    private String nombre;
    private int clave;
    
    /**
     * Constructor de la clase Estudiante
     * @param claveIn Parametro que es la clave inicial del estudiante
     * @param nombreIn Parametro que es el nombre inicial del estudiante
     */
    public Estudiante(int claveIn, String nombreIn)
    {
        nombre= nombreIn;
        clave= claveIn;
    }
    
    /**
     * Da los detalles del estudiante
     * @return Regresa una cadena con la clave y el nombre del estudiante
     */
    public String dimeDetalles()
    {
        return "Clave:" +clave +",Nombre: " +nombre;
    }
    
    /**
     * Da la clave del estudiante
     * @return Regresa la clave del estudiante
     */
    public int dimeClave()
    {
        return clave;
    }
}