//Una empresa solicita un sistema que determine los días de vacaciones a
//los que tiene derecho un trabajador, tomando en cuenta las siguientes características:


//Existen tres departamentos dentro de la empresa con sus respectivas claves:
//1- Departamento de Atención al cliente. (Clave 1)
//2- Departamento de Logística. (Clave 2)
//3- Gerencia. (Clave 3)


//Trabajadores con clave 1(Atención al cliente):
//- Con 1 año de servicio, reciben 6 días de vacaciones.
//- Con 2 a 6 años de servicio, reciben 14 días de vacaciones.
//- A partir de 7 años de servicio, reciben 20 días de vacaciones.


//Trabajadores con clave 2(Logística):
//- Con 1 año de servicio, reciben 7 días de vacaciones.
//- Con 2 a 6 años de servicio, reciben 15 días de vacaciones.
//- A partir de 7 años de servicio, reciben 22 días de vacaciones.


//Trabajadores con clave 3(Gerencia):
//- Con 1 año de servicio, reciben 10 días de vacaciones.
//- Con 2 a 6 años de servicio, reciben 20 días de vacaciones.
//- A partir de 7 años de servicio, reciben 30 días de vacaciones.


//Nota: El sistema debe de solicitar el “Nombre”, “Clave del departamento” y
//“Antigüedad” del trabajador, posteriormente mostrar un mensaje que
//contenga el nombre del trabajador y los días de vacaciones a los que tiene derecho.
package sistemavacacional;
import java.util.Scanner;
public class SistemaVacacional 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int clave = 0, antiguedad = 0;
        
        System.out.println("**********************************");
        System.out.println("*Bienvenido al sistema vacacional*");
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("");
        
        System.out.print("¿Cuál es el nombre completo del trabajador? ");
        nombre = sc.nextLine();
        System.out.println();
        
        System.out.print("¿Cuántos años de servicio tiene el trabajador?");
        antiguedad = sc.nextInt();
        System.out.println("");
        
        System.out.print("¿Cuál es la clave del trabajador?");
        clave = sc.nextInt();
        System.out.println("");
        
        if (clave == 1)
        {
            if (antiguedad == 1)
            {
                System.out.println ("El trabajador "+ nombre + " tiene derecho a 6 días de vacaciones");
            }
            else if (antiguedad >= 2 && antiguedad <= 6)
            {
                System.out.println ("El trabajador "+ nombre + " tiene derecho a 14 días de vacaciones");
            }
            else if (antiguedad >= 7) 
            {
                System.out.println ("El trabajador "+ nombre + " tiene derecho a 20 días de vacaciones");
            }
        }
        else if (clave == 2)
        {
            if (antiguedad == 1)
            {
                System.out.println ("El trabajador "+ nombre + " tiene derecho a 6 días de vacaciones");
            }
            else if (antiguedad >= 2 && antiguedad < 6)
            {
                System.out.println ("El trabajador "+ nombre + " tiene derecho a 15 días de vacaciones");
            }
            else if (antiguedad >= 7) 
            {
                System.out.println ("El trabajador "+ nombre + " tiene derecho a 22 días de vacaciones");
            }
        }
        else if (clave == 3)
        {
            if (antiguedad == 1)
            {
                System.out.println ("El trabajador "+ nombre + " tiene derecho a 10 días de vacaciones");
            }
            else if (antiguedad >= 2 && antiguedad < 6)
            {
                System.out.println ("El trabajador "+ nombre + " tiene derecho a 20 días de vacaciones");
            }
            else if (antiguedad >= 7) 
            {
                System.out.println ("El trabajador "+ nombre + " tiene derecho a 30 días de vacaciones");
            }
        }
        else
        {
            System.out.println("¡Error!. La clave de departamento es incorrecta. Por favor, verifique la clave.");
        }
    }
}