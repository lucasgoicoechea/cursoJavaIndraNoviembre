package es.indra.curso.model;

import org.junit.Assert;
import org.junit.Test;

public class CarritoDeLaCompraTest {

	private final Long TOTAL_SIZE = 20000000L;
	private final Long NUMBER_ADD = 1000000L;

	@Test
	public void shouldReturnTheCountOfAllItems() throws Exception {

		CarritoBuilder builder = new CarritoBuilder(30);
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertEquals(30, carritoDeLaCompra.contarNumeroProductos());
	}

	@Test
	public void shouldCalculateTotalPrice() throws Exception {

		CarritoBuilder builder = new CarritoBuilder(60, 5);
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertEquals(300, carritoDeLaCompra.calcularPrecioTotal());

	}

	@Test
	public void shouldCalculateTotalPriceLambda() throws Exception {
		CarritoBuilder builder = new CarritoBuilder(60, 5);
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertEquals(300, carritoDeLaCompra.calcularPrecioTotalLambda());
	}

	@Test
	public void shouldCalculateTotalPriceRefMethod() throws Exception {
		CarritoBuilder builder = new CarritoBuilder(60, 5);
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertEquals(300, carritoDeLaCompra.calcularPrecioTotalRefMethod());
	}

	@Test
	public void shouldCalculateTotalDiscount() throws Exception {
		CarritoBuilder builder = new CarritoBuilder(20, 100);
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertEquals(100, carritoDeLaCompra.calcularDescuentoTotal(100));

	}

	@Test
	public void shouldCalculateTotalDiscountLambda() throws Exception {
		CarritoBuilder builder = new CarritoBuilder(20, 100);
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertEquals(100, carritoDeLaCompra.calcularDescuentoTotalLambda(100));

	}

	@Test
	public void shouldDetectErrorAnThrowRuntimeExceptionWhenAPriceIsNegative() {
		CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		builder.add(-1);
		builder.addMultiple(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertTrue(carritoDeLaCompra.detectarError());
	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeAnyMatch() {
		CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		builder.add(-1);
		builder.addMultiple(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertTrue(carritoDeLaCompra.detectarErrorAnyMatch());

	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindAny() {

		CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		builder.add(-1);
		builder.addMultiple(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertTrue(carritoDeLaCompra.detectarErrorFindAny());

	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindFirst() {
		CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		builder.add(-1);
		builder.addMultiple(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertTrue(carritoDeLaCompra.detectarErrorFindFirst());
	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeAnyMatchParallel() {
		CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		builder.add(-1);
		builder.addMultiple(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		carritoDeLaCompra.detectarErrorAnyMatchParallel();
	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindAnyParallel() {
		CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		builder.add(-1);
		builder.addMultiple(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertTrue(carritoDeLaCompra.detectarErrorFindAnyParallel());

	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindFirstParallel() {
		CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		builder.add(-1);
		builder.addMultiple(TOTAL_SIZE.intValue(), NUMBER_ADD.intValue());
		CarritoDeLaCompra carritoDeLaCompra = builder.build();
		Assert.assertTrue(carritoDeLaCompra.detectarErrorFindFirstParallel());

	}

}
