
public class Grupo
{
    private String nomMateria;
    private Estudiante[]  estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
       estudiantes = new Estudiante[totalEstudiantes];
       this.nomMateria = nomMateria; //this hace referancia a la variable de instancia
    }
    
    public void inscribir(Estudiante unEstudiante)
    {
       if(estudiantes [0]==null)
       {
           estudiantes[0]=unEstudiante; 
        }
    }
    
    //Terminar este metodo 
    public void darBaja(int claveEstudiante)
    {
        /*Buscar el estudiante con la clave dada
         * asignarle null
         */
    }
}