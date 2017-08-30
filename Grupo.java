
public class Grupo
{
    private String nomMateria;
    private Estudiante[]  estudiantes;
    
    /**
     * Constructor del Grupo
     * @param totalEstudiantes Parametro que es el numero total de estudiantes en el grupo
     * @param nomMateria Parametro que es el nombre de la materia                        
     */
    public Grupo(int totalEstudiantes, String nomMateria)
    {
       estudiantes = new Estudiante[totalEstudiantes];
       this.nomMateria = nomMateria; //this hace referancia a la variable de instancia
    }
    
    /**
     * Busca un estudiante por medio de su clave
     * @param claveEstudiante Parametro que representa la clave del estudiante a buscar
     * @return Regresa la posicion del estudiante en el arreglo o -1 si no existe
     */
    private int buscarEstudiante(int claveEstudiante)
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i]!=null)
            {
                if(estudiantes[i].dimeClave() == claveEstudiante)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
    
    /**
     * Busca un espacio disponible en el arreglo para guardar al estudiante
     * @return Regresa la posicion nula dentro del arreglo
     */
    private int buscaEspacioDisponible()
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Inscribe un alumno en el grupo
     * @param unEstudiante Es el objeto estudiante a inscribir en el grupo
     * @return Regresa verdadero si el estudiante fue inscrito o falso en
     *         caso de que no se pudiera inscibir.
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
        int existe= this.buscarEstudiante(unEstudiante.dimeClave());
        if(existe != -1)
        {
            return false; //el estudiante ya esta inscrito
        }
        int posDisponible = this.buscaEspacioDisponible();
        if(posDisponible ==-1)
        {
            return false;//el arreglo esta lleno
        }
        estudiantes[posDisponible] = unEstudiante;//inscribe al estudiante
        return true; //el estudiante fue inscrito
    }
   
    /**
     * Da de baja a un alumno del grupo
     * @param claveEstudiante Parametro que representa la clave del alumno a eliminar
     * @return Regresa verdadero si se dio de baja o falso en caso de que
     *         no se pudiera dar de baja
     */public boolean darBaja(int claveEstudiante)
    {
        int existe = this.buscarEstudiante(claveEstudiante);
        if(existe == -1)
        {
            return false; // no esta inscrito
        }
        for(int i=existe;i<(estudiantes.length-1);i++)
           {
               estudiantes[i] = estudiantes[i+1];
           }
        estudiantes[estudiantes.length-1] =null;
        
        return true;
    }
    
    
    /**
     * Cuenta el numero de estudiantes inscritos en el grupo
     * @return Regresa el numero de estudiantes inscritos en el grupo
     */public int dimeEstudiantesInscritos()
    {
        int cuenta=0;
        if(buscaEspacioDisponible() ==-1)
        {
            cuenta++;
        }
        return cuenta;
    }
    
}