import java.util.Scanner;

/**
 * Classe com a função main, lê entrada de dados e realiza as operações, chamando seus respectivos métodos.
 * 
 * @author:
 *      - Cinthia Alves Barreto, 
 *      - Isabella Rubio Venancio
 *      - Steven She Cheng Wang
 * 
 * @version 09/03/2023
 */
public class Aplicação
{
    public static void main(String args[]){

        String opnd1 = "";
        String opnd2 = "";
        String operador = "";
        double result = 0;

        // armazena o tamanho do vetor de string (args) - qtde de parametros
        int tam = args.length; 

        System.out.println(); // pula uma linha para que quando a função main() seja executada novamente não fique com o texto na mesma linha

        // Verifica a qtde de parametros
        if (tam == 3) { 
            // entrada pela linha de comando
            opnd1 = args[0];
            operador = args[1];
            opnd2 = args[2];
            // verifica operador
            if(!ValidaEntrada.validarOperador(operador)) {
                System.out.println("Operador 1 invalido!!");
                return;
            }
            // verifica operando 1
            if(!(ValidaEntrada.validarOperando(opnd1))) {
                System.out.println("Operando 1 invalido!!");
                return;
            }

            if(!(ValidaEntrada.validarOperando(opnd2))) {
                System.out.println("Operando 2 invalido!!");
                return;
            }

            System.out.println("---------- Calculadora Basica ----------");

            // Instancia (cria) objeto da classe Calculadora
            CalculadoraBasica calc = new CalculadoraBasica();

            calc.imprimirResultadoCalcBasica(opnd1, operador, opnd2);

        } else if (tam == 0){ 

            // Entrada pelo teclado (console)
            Scanner scanner = new Scanner(System.in);
            System.out.print("Forneca operando1: ");
            opnd1 = scanner.next();

            System.out.print("Forneca operador: ");
            operador = scanner.next();
            // verifica operador
            if(!ValidaEntrada.validarOperador(operador)) {
                System.out.println("Operador invalido!!");
                return;
            }

            if(ValidaEntrada.verificarOperadorCalcCientifica(operador)) {
                System.out.println("---------- Calculadora Cientifica ----------");
                // Instancia (cria) objeto da classe CalculadoraCientifica
                CalculadoraCientifica calc = new CalculadoraCientifica();

                calc.imprimirResultadoCalcCientifica(opnd1,operador);
            } else {
                // verifica operando 1
                if(!(ValidaEntrada.validarOperando(opnd1))) {
                    System.out.println("Operando 1 invalido!!");
                    return;
                }

                System.out.print("Forneca operando2: ");
                opnd2 = scanner.next();

                // verifica operando2           
                if(!(ValidaEntrada.validarOperando(opnd2))) {
                    System.out.println("Operando 2 invalido!!");
                    return;
                }
                System.out.println("---------- Calculadora Basica ----------");

                // Instancia (cria) objeto da classe Calculadora
                CalculadoraBasica calc = new CalculadoraBasica();

                calc.imprimirResultadoCalcBasica(opnd1, operador, opnd2);
            }

        } else if(tam == 2){
            // entrada pela linha de comando
            opnd1 = args[0];
            operador = args[1];

            // verifica operando 
            if(!(ValidaEntrada.validarOperando(opnd1))) {
                System.out.println("Operando 1 invalido!!");
                return;
            }

            // verifica operador
            if(!ValidaEntrada.validarOperador(operador)) {
                System.out.println("Operador invalido!!");
                return;
            }

            System.out.println("---------- Calculadora Cientifica ----------");

            // Instancia (cria) objeto da classe CalculadoraCientifica
            CalculadoraCientifica calc = new CalculadoraCientifica();

            calc.imprimirResultadoCalcCientifica(opnd1,operador);

        } else {
            System.out.println("Parametros invalidos!!");
            return;
        }   

    }

}
