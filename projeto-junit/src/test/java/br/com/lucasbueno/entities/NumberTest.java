package br.com.lucasbueno.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberTest {

	@Test
	void testTwoOdd() {
		int[] entrada = { 4, 8, 15, 16, 23, 42 };
		boolean[] saida = { false, false, true, false, true, false };
		assertAll("o nome do conjunto",
				() -> assertEquals(saida[0], new PositiveNumber(entrada[0]).isOdd(), "primeira linha"),
				() -> assertEquals(saida[1], new PositiveNumber(entrada[1]).isOdd(), "segunda linha"),
				() -> assertEquals(saida[2], new PositiveNumber(entrada[2]).isOdd()),
				() -> assertEquals(saida[3], new PositiveNumber(entrada[3]).isOdd()),
				() -> assertEquals(saida[4], new PositiveNumber(entrada[4]).isOdd()),
				() -> assertEquals(saida[5], new PositiveNumber(entrada[5]).isOdd()));

//		for (int indice = 0; indice < entrada.length; indice++) {
//			assertEquals(saida[indice], new PositiveNumber(entrada[indice]).isOdd(),
//					"Falhou para a entrada " + entrada[indice]);
//		}
//		PositiveNumber two = new PositiveNumber(2);
//		assertEquals(false, two.isOdd(), "O número 2 não é ímpar!");
	}

	@Test
	void testNotPositive() {
		// se o número não for positivo, o resultado do isOdd() deve ser null
		PositiveNumber number = new PositiveNumber(-2);
		assertNull(number.isOdd());
		assertEquals(null, number.isOdd()); // tem o mesmo resultado da linha de cima
	}

	@Test
	void testNullPointer() {
		PositiveNumber number = new PositiveNumber(null);
		assertThrows(NullPointerException.class, () -> {
			number.isOdd();
		});
	}

}