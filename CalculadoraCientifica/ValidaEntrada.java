
/**
 * Funções que validam as entradas.
 * 
 * @author:
 *      - Cinthia Alves Barreto, 
 *      - Isabella Rubio Venancio
 *      - Steven She Cheng Wang
 * 
 * @version 09/03/2023
 */
public class ValidaEntrada
{
    /**
     * Método validarOperando - verifica se a string de entrada eh numerica
     *
     * @param str string de entrada
     * @return false se existir algum caracter diferente de numeros e 
     *         true se for somente numeros
     */
    public static boolean validarOperando(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) 
                return false;
        }
        return true;
    }

    /**
     * Método validarOperador - verifica se o operadoe e valido
     *
     * @param op String contendo o operador
     * @return false se for diferente de (+,-,x,/) e true caso contrario
     */
    public static boolean validarOperador(String op)
    {

        if (!(op.equals("+") || op.equals("-") || op.equals("x") || op.equals("/") || op.equals("!") || op.equals("sen"))) {
            return false;
        }
        return true;
    }

    public static boolean verificarOperadorCalcCientifica(String op){
        if (op.equals("!") || op.equals("sen")) {
            return true;
        }
        return false;
    }

    /**
     * Método validarvalidarNumeroFatorial - verifica se o numero tem fatorial
     *
     * @param op int contendo o operador
     * @return false se for menor que zero e true caso contrario
     */
    public static boolean validarNumeroFatorial(int num)
    {
        if(num<0){
            return false;
        }
        return true;

    }
}
