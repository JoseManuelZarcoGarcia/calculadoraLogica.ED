package calculadoraLogica.Servicos;

import java.util.Scanner;


public class calculosLogImplementacion implements calculosLogInterfaz{
	
	public String dameUnNum (Scanner comunicacionTecladoM)
    {
		String numEscrito;

        System.out.println("Escriba un numero: ");
        numEscrito = comunicacionTecladoM.toString();

        return numEscrito;

    }

	
	public String dameOtroNum(Scanner comunicacionTecladoM)
    {
		String numEscrito;

        System.out.println("Escriba otro numero: ");
        numEscrito = comunicacionTecladoM.toString();

        return numEscrito;

    }
	
	
	public void igualdad()
    {
        String num1, num2;
        boolean verdaderoFalso;

        num1 = dameUnNum(null);
        num2 = dameOtroNum(null);
        if (num1 == num2)
            verdaderoFalso = true;
        else
            verdaderoFalso = false;

        System.out.println(verdaderoFalso);
    }
	
	
	public void desigualdad()
    {
        String num1, num2;
        boolean verdaderoFalso;

        num1 = dameUnNum(null);
        num2 = dameOtroNum(null);

        if (num1 != num2)
            verdaderoFalso = true;
        else
            verdaderoFalso = false;

        System.out.println(verdaderoFalso);
    }
	
	
	
}
