package com.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils obj = new MathUtils();
		int expected = 4;
		int actual = obj.add(2, 3);
		assertEquals(expected, actual, "O método add precisa retornar a soma de dois inteiros");
		
	}
	
	@Test
	void testArray() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(2);
		list.add(5);
		Integer [] a = {2,0,5};
		Object [] b = list.toArray();
		assertArrayEquals(a,b);
	}
}
