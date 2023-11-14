package calculadoraLogica.Servicos;

import java.util.Scanner;


public class menuImplementacion implements menuInterfaz{
	
	public int mostratMenuYSeleccion(Scanner comunicacionTecladoM) {
		
		
		int seleccionUsuario;
		
		System.out.println("################################");
		System.out.println("0. Cerrar la aplicacion");
		System.out.println("1. Registro de paciente");
		System.out.println("2. Ingreso de paciente");
		System.out.println("3. Alta de paciente");
		System.out.println("4. Resumen de ingresos y altas");
		System.out.println("5. Historial del paciente");
		System.out.println("################################");
		System.out.println("Elija una opcion; ");
		
		seleccionUsuario=comunicacionTecladoM.nextInt();
		
		return seleccionUsuario;
	}



}
