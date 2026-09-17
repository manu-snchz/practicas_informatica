package Practica1;

//4. Una máquina de café dispone, para efectuar las devoluciones, de monedas 1€ y de 50, 20, 10 y 5 céntimos de euro, de manera que siempre devuelve el mínimo número posible de monedas. Construye un algoritmo que dada una cierta cantidad en céntimos (menor de 2€) de dinero a devolver, averigüe cuántas monedas devuelve de cada tipo (suponiendo que hay suficientes monedas de todos los tipos)


public class Ejercicio4 {

	public static void main(String[] args) {
		
		int centimos = 83;
		
		
		
		int monedasDeEuro = centimos / 100;
		
		centimos = centimos - monedasDeEuro*100;
		
		int monedasDe50 = centimos / 50;
		
		centimos = centimos - monedasDe50*50;
		
		int monedasDe20 = centimos / 20;
		
		centimos = centimos - monedasDe20*20;
		
		int monedasDe10 = centimos / 10;
		
		centimos = centimos - monedasDe10*10;
		
		int monedasDe5 = centimos / 5;
		
		centimos = centimos - monedasDe5*5;
		
		int centimosRestantes = centimos;
		
		
		
		System.out.println("Monedas de Euro: " + monedasDeEuro);
		System.out.println("Monedas de 50 Cts.: " + monedasDe50);
		System.out.println("Monedas de 20 Cts.: " + monedasDe20);
		System.out.println("Monedas de 10 Cts.: " + monedasDe10);
		System.out.println("Monedas de 5 Cts.: " + monedasDe5);
		System.out.println("Monedas de 1 Ct. (céntimos restantes): " + centimosRestantes);
		

	}

}
