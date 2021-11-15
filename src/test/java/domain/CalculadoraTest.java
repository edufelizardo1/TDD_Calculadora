package domain;

import exception.NaoPodeDividirPorZeroException;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Test
    public void deveSomarDoisNumeros () {
//        Arrange
        int a = 5;
        int b = 3;

        calculadora = new Calculadora();

//        Action
        int resultado = calculadora.somar(a, b);

//        Asserts
        Assert.assertSame(8, resultado);
    }
    @Test
    public void deveSubtrairDoisNumeros () {
//        Arrange
        int a = 8;
        int b = 5;

        calculadora = new Calculadora();

//        Action
        int resultado = calculadora.subtracao(a, b);

//        Asserts
        Assert.assertSame(3, resultado);
    }

    @Test
    public void deveObterADivisaoEntreDoisNumeros () throws NaoPodeDividirPorZeroException {
//        Arrange
        int a = 8;
        int b = 4;

        calculadora = new Calculadora();

//        Action
        int resultado = calculadora.divisao(a, b);

//        Asserts
        Assert.assertSame(2, resultado);
    }

    @Test
    public void deveObterOProdutoEntreDoisNumeros () {
//        Arrange
        int a = 4;
        int b = 4;

        calculadora = new Calculadora();

//        Action
        int resultado = calculadora.produto(a, b);

//        Asserts
        Assert.assertSame(16, resultado);
    }

    @Test(expected = NaoPodeDividirPorZeroException.class)
    public void deveLancarExcecaoAoDividirPorZero () throws NaoPodeDividirPorZeroException {
//        Arrange
        int a = 10;
        int b = 0;

        calculadora = new Calculadora();

//        Action
        int resultado = calculadora.divisao(a, b);

//        Asserts
        Assert.assertSame(2, resultado);
    }
}
