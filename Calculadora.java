class Calculadora{
	public static void main(String args[]){
		double operando1 = Double.parseDouble(args[0]);
		double operando2 = Double.parseDouble(args[2]);
		double resultado;
		
		char operador = args[1].charAt(0);
		
		if (operador == '+'){
			resultado = operando1 + operando2;
			System.out.printf("%2f + %2f = %2f", operando1, operando2, resultado);
		} else if (operador == '+'){
			resultado = operando1 - operando2;
			System.out.printf("%2f - %2f = %2f", operando1, operando2, resultado);
		} else if (operador == '/'){
		resultado = operando1 / operando2;
			System.out.printf("%2f / %2f = %2f", operando1, operando2, resultado);
		} else if (operador == '*'){
		resultado = operando1 * operando2;
			System.out.printf("%2f * %2f = %2f", operando1, operando2, resultado);
		} else {
			System.out.println("Operador inválido!");
		}
		
	}
}