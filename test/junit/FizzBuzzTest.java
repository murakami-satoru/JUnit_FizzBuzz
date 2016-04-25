package junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junitSample.FizzBuzz;

public class FizzBuzzTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void 引数にFizzとなる3の境界値2を入れてそのまま出力されるか() {
		assertEquals("2",FizzBuzz.isFizzBuzz(2));
	}

	@Test
	public void 引数にFizzとなる3を入れてFizzと出力されるか() {
		assertEquals("Fizz",FizzBuzz.isFizzBuzz(3));
	}

	@Test
	public void 引数にFizzとなる3の境界値4を入れてそのまま出力されるか() {
		assertEquals("4",FizzBuzz.isFizzBuzz(4));
	}

	@Test
	public void 引数にBuzzとなる5を入れてBuzzと出力されるか() {
		assertEquals("Buzz",FizzBuzz.isFizzBuzz(5));
	}

	@Test
	public void 引数にFizzとなる3の倍数を入れてFizzと出力されるか() {
		assertEquals("Fizz",FizzBuzz.isFizzBuzz(6));
	}

	@Test
	public void 引数にBuzzとなる5の倍数を入れてBuzzと出力されるか() {
		assertEquals("Buzz",FizzBuzz.isFizzBuzz(10));
	}

	@Test
	public void 引数にFizzBuzzとなる15を入れてFizzBuzzと出力されるか() {
		assertEquals("FizzBuzz",FizzBuzz.isFizzBuzz(15));
	}

	@Test
	public void FizzBuzz実行結果のサイズが100であるか() {
		int expected = 100;
		int actual = FizzBuzz.doFizzBuzz().size();

		assertThat(expected,is(actual));
	}

	@Test
	public void FizzBuzz実行結果の100行目がBuzzであるか() {
		assertEquals("Buzz",FizzBuzz.doFizzBuzz().get(99));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void FizzBuzz実行結果の101行目が存在しないか() {
		FizzBuzz.doFizzBuzz().get(100);
	}

	@Test
	public void FizzBuzz実行結果の1行目が1であるか() {
		assertEquals("1",FizzBuzz.doFizzBuzz().get(0));
	}

	@Test
	public void FizzBuzz実行結果の3行目がFizzであるか() {
		assertEquals("Fizz",FizzBuzz.doFizzBuzz().get(2));
	}

	@Test
	public void FizzBuzz実行結果の5行目がBuzzであるか() {
		assertEquals("Buzz",FizzBuzz.doFizzBuzz().get(4));
	}

	@Test
	public void FizzBuzz実行結果の15行目がBuzzであるか() {
		assertEquals("FizzBuzz",FizzBuzz.doFizzBuzz().get(14));
	}

}
