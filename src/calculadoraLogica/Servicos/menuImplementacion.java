package calculadoraLogica.Servicos;

import java.util.Scanner;


public class menuImplementacion implements menuInterfaz{
	
	public int mostratMenuYSeleccion(Scanner comunicacionTecladoM) {
		
		
		int seleccionUsuario;
		
		System.out.println("################################");
		System.out.println("1. Cerrar la aplicacion");
		System.out.println("2. Igualdad");
		System.out.println("3. Desigualdad");
		System.out.println("################################");
		System.out.println("Elija una opcion; ");
		
		seleccionUsuario=comunicacionTecladoM.nextInt();
		
		return seleccionUsuario;
	}



}
