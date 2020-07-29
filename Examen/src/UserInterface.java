import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    
    private Plane plane;
   
    private ArrayList<String>name;
    private ArrayList<String>Lastname;
    
    public UserInterface(Plane plane,Scanner scanner){
        this.scanner=scanner;
        this.plane=plane;
        this.name=new ArrayList<String>();
        this.Lastname=new ArrayList<String>();
    }
    public void Ingresardatos(){
        
        System.out.println("Ingrese la cantidad de filas:");
        int rowls=Integer.valueOf(scanner.nextLine());
        
        System.out.println("Ingrese la cantidad de columnas:");
        int cols=Integer.valueOf(scanner.nextLine());
    }
    public void names(){
        System.out.println("Ingresa un pasajero: ");
        System.out.print("Ingrese el nombre del pasajero: ");
        String name=scanner.nextLine();
        System.out.print("Ingrese el apellido del pasajero: ");
        String lastname=scanner.nextLine();
        System.out.print("Ingrese la fila del aciento: ");
        int rowl=Integer.valueOf(scanner.nextLine());
        System.out.print("Ingrese la columna del aciento: ");
        String col=scanner.nextLine();
        
        
    }
    public void ConsultarAsiento(){
        System.out.print("Ingrese la fila del aciento:");
        int rowl=Integer.valueOf(scanner.nextLine());
        System.out.print("Ingrese la columna del asiento: ");
        String col=scanner.nextLine();
        
    }
    
    public void ConsultarPasajero(){
        System.out.print("Ingrese el nombre del pasajero: ");
        String name=scanner.nextLine();
        System.out.print("Ingrese el apellido del pasajero: ");
        String lastname=scanner.nextLine();
    }
     
}
