
import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
       
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plane p = new Plane();
        Passenger passenger=new Passenger();
       
        UserInterface a= new UserInterface(p,scanner);
        
       
        
        a.Ingresardatos();
        
        
        while(true)
        {
        System.out.println("Que desea hacer?");
        
       {
			
			try{
				System.out.println("Elige opción:\n1.- Ingresar pasajero: " +
						"\n2.- Consultar Aciento \n" +
						"3.- Consultar pasajero\n" 
                                                );
				
				int opcion = Integer.parseInt(scanner.nextLine()); 
	
				
				switch(opcion){
				case 1: 
                                        a.names();
					break;
				case 2: 
					a.ConsultarAsiento();
					break;
				case 3: 
					a.ConsultarPasajero();
					break;
				
				
				
				default:
					System.out.println("Número no reconocido");break;
				}
				
				System.out.println(" "); 
				
			}catch(Exception e){
				System.out.println(" Error!");
			}
		}

        }
        
        
        
        
    }

    
   
    
}
