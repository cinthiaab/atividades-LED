
/**
 * Calcula e imprime as seguinte operações: adição, subtração, multiplicação e divisão.
 * 
 * @author:
 *      - Cinthia Alves Barreto, 
 *      - Isabella Rubio Venancio
 *      - Steven She Cheng Wang
 * 
 * @version 09/03/2023
 */
public class CalculadoraBasica
{
    /**
     * Método calcular
     *
     * @param opnd1 double operando1
     * @param oper String operador
     * @param opnd2 double operando2
     * @return double valor da operacao
     */
    public static double calcular(String opnd1, String oper, String opnd2) {
        double operando1 = Double.parseDouble(opnd1);
        double operando2 = Double.parseDouble(opnd2);

        double result = 0;

        switch(oper) {
            case "+": 
                result = operando1 + operando2;
                break;
            case "-": 
                result = operando1 - operando2;
                break;
            case "/": 
                result = operando1 / operando2;
                break;
            case "x": 
                result = operando1 * operando2;
                break;
        }

        return result;

    }

    /**
     * Método imprimir
     *
     * @param opnd1 double operando1
     * @param oper String operador
     * @param opnd2 double operando2
     * @param result double resultado da operação
     */

    public static void imprimirResultadoCalcBasica(String opnd1, String operador, String opnd2){
        System.out.print ("("+opnd1 + " " + operador + " " + opnd2 + ") = ");
        System.out.println (calcular(opnd1, operador, opnd2));
    }
}
