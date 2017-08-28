
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
       for(int i=0; i<estudiantes.length;i++)
       {
           if(estudiantes[i] == null)
           {
               estudiantes[i] = unEstudiante;
           } 
       }
    }
    
    //Terminar este metodo 
    public void darBaja(int claveEstudiante)
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i].clave == claveEstudiante)
            {
                estudiantes[i] = estudiantes [i+1];
            }
        }
    }
}