
import java.util.Scanner;

public class CalcBasica {
    public static void main(String args[]) {
        System.out.println("Testando...");

        double operando1 = 0;
        double operando2 = 0;
        String operador = "";
        double result = 0;
        boolean operador1Valido = true;
        boolean operador2Valido = true;

        int tam = args.length;

        // Verifica a qtde de parametros
        if (tam == 3) {
            System.out.println("Parametro1: " + args[0]);
            System.out.println("Parametro2: " + args[1]);
            System.out.println("Parametro3: " + args[2]);

            int i = 0;

            while (operador1Valido != false && i < args[0].length()) {
                char caracter = args[0].charAt(i);
                if (caracter < 48 || caracter > 57) {
                    operador1Valido = false;
                }
                i += 1;
            }

            i = 0;
            while (operador2Valido != false && i < args[2].length()) {
                char caracter = args[2].charAt(i);
                if (caracter < 48 || caracter > 57) {
                    operador2Valido = false;
                }
                i += 1;
            }

            /*
             * Declaracao de variaveis e
             * Converte os parametros
             */
            if (operador1Valido == true && operador2Valido == true) {
                operando1 = Double.parseDouble(args[0]);
                operando2 = Double.parseDouble(args[2]);
                operador = args[1];
                result = 0;
                if (operador.equals("+")) {

                    result = operando1 + operando2;

                    System.out.println("Soma: " + result);

                } else if (operador.equals("-")) {
                    result = operando1 - operando2;

                    System.out.println("Subtracao: " + result);
                } else if (operador.equals("/")) {
                    result = operando1 / operando2;

                    System.out.println("Divisao: " + result);
                } else if (operador.equals("x")) {
                    result = operando1 * operando2;

                    System.out.println("Multiplicacao: " + result);
                } else {
                    System.out.println("Operador invalido!!");
                }

            } else {
                System.out.println("Voce inseriu um caracter invalido");
            }

        } else if (tam == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Forneca operando1: ");
            String operando1String = scanner.next();
            System.out.print("Forneca operador: ");
            operador = scanner.next();
            System.out.print("Forneca operando2: ");
            String operando2String = scanner.next();

            int i = 0;

            while (operador1Valido != false && i < operando1String.length()) {
                char caracter = operando1String.charAt(i);
                if (caracter < 48 || caracter > 57) {
                    operador1Valido = false;
                }
                i += 1;
            }

            i = 0;
            while (operador2Valido != false && i < operando2String.length()) {
                char caracter = operando2String.charAt(i);
                if (caracter < 48 || caracter > 57) {
                    operador2Valido = false;
                }
                i += 1;
            }

            if (operador1Valido == true && operador2Valido == true) {

                operando1 = Double.parseDouble(operando1String);
                operando2 = Double.parseDouble(operando2String);

                if (operador.equals("+")) {
                    result = operando1 + operando2;
                    System.out.println("Soma: " + result);
                } else if (operador.equals("-")) {
                    result = operando1 - operando2;
                    System.out.println("Subtracao: " + result);
                } else if (operador.equals("/")) {
                    result = operando1 / operando2;
                    System.out.println("Divisao: " + result);
                } else if (operador.equals("x")) {
                    result = operando1 * operando2;
                    System.out.println("Multiplicacao: " + result);
                } else {
                    System.out.println("Operador invalido!!");
                }

            } else {
                System.out.println("Voce inseriu um caracter invalido");
            }

        } else {
            System.out.println("Parametros invalidos!!");
        }
    }
}