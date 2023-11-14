package calculadoraLogica.Controladores;

import java.util.Scanner;

import calculadoraLogica.Servicos.*;

public class Inicio {

	public static void main(String[] args) {
		
		
		calculosLogInterfaz ic = new calculosLogImplementacion();
        menuInterfaz im = new menuImplementacion();

        Scanner comunicacionTecladoM = new Scanner(System.in);

        boolean cerrarMenu = false;
        int opcionSeleccionada;

        while (!cerrarMenu)
        {
            opcionSeleccionada = im.mostratMenuYSeleccion(comunicacionTecladoM);
            System.out.println(opcionSeleccionada);
            switch (opcionSeleccionada)
            {
                case 1:
                	System.out.println("[info] - se cerrara el programa");
                    cerrarMenu = true;
                    break;

                case 2:
                	System.out.println("[info] - Igualdad");
                    ic.igualdad();
                    break;

                case 3:
                	System.out.println("[info] - Desigualdad");
                    ic.desigualdad();
                    break;

                default:
                	System.out.println("[info] - la opcion deseada no existe.");
                    break;
            }

        }
		

	}

}
