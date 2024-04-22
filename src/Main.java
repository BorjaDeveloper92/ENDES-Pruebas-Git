import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Este es un proyecto para realizar ejercicios de Git y GitHub para Entornos de Desarrollo
		Scanner scanner = new Scanner(System.in);
		int opcion;
		String destinatario;
		String mensaje;
		String remitente;
        String nombre;
		
		do {

			System.out.println("\nMenú:");
            System.out.println("1. Destinatario.");
            System.out.println("2. Mensaje.");
            System.out.println("3. Remitente.");
            System.out.println("4. Enviar.");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el destinatario: ");
                    destinatario = scanner.nextLine();
                    break;
                case 2:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Ingrese el mensaje que quiere enviar: ");
                    mensaje = scanner.nextLine();
                    break;
                case 3:
                	scanner.nextLine();
                    System.out.print("Declare quién es el remitente: ");
                    remitente = scanner.nextLine();
                    break;
                case 4:
                	System.out.println("");
                    System.out.println("Has enviado el mensaje correctamente.");
                    System.out.println("Gracias por utilizar nuestros servicios.\n¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
		
		System.out.println("Fin del programa");
			
		scanner.close();
	}

}
