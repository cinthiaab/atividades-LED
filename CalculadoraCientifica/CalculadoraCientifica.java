
/**
 * Calcula e imprime as seguintes operações: fatorial e seno.
 * 
 * @author:
 *      - Cinthia Alves Barreto, 
 *      - Isabella Rubio Venancio
 *      - Steven She Cheng Wang
 * 
 * @version 09/03/2023
 */
public class CalculadoraCientifica
{
    /**
     * Método calcularSeno
     *
     * @param opnd1 double operando
     * @return double valor do seno
     */
    public static double calcularSeno(String opnd)
    {
        double angulo = Double.parseDouble(opnd); 

        // convert degrees to radians
        double radiano = Math.toRadians(angulo);

        // return sin() method to get the sine value
        return Math.sin(radiano);
    }

    /**
     * Método calcularFatorial
     *
     * @param opnd1 double operando
     * @return double valor do fatorial
     */
    public static int calcularFatorial(String opnd)
    {
        int n = Integer.parseInt(opnd); 
        if(!(ValidaEntrada.validarNumeroFatorial(n))){
            return -1;
        }

        int result = 1;

        while(n>1){
            result = result * n;
            n--;
        }

        return result;
    }
    /**
     * Método imprimirResultadoCalcCientifica
     *
     * @param opnd double operando
     * @param oper String operador
     */
    public static void imprimirResultadoCalcCientifica(String opnd, String operador){

        switch(operador){
            case "!":
                imprimirFatorial(opnd);
                break;
            case "sen":
                imprimirSeno(opnd);
                break;
        }
    }
    /**
     * Método imprimirFatorial
     *
     * @param opnd double operando
     * @param oper String operador
     */
    public static void imprimirFatorial(String opnd){ // Método para imprimir fatorial
        int fatorial = calcularFatorial(opnd);
        if(fatorial==-1){
            System.out.println("O numero deve ser inteiro para que o fatorial seja calculado");
            return;
        }
        System.out.println(opnd + "! = " + fatorial);
    }
    /**
     * Método Seno
     *
     * @param opnd double operando
     * @param oper String operador
     */
    public static void imprimirSeno(String opnd){ // Método para imprimir Seno
        System.out.println("sen("+ opnd + ") = " + calcularSeno(opnd));
    }
}
