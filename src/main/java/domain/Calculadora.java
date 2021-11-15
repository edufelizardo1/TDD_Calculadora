package domain;

import exception.NaoPodeDividirPorZeroException;

public class Calculadora {

    public int somar(int a, int b) {
        int result =  a + b;
        return result;
    }

    public int subtracao(int a, int b) {
        int result =  a - b;
        return result;
    }

    public int divisao(int a, int b) throws NaoPodeDividirPorZeroException {
        try {
            int result =  a / b;
            return result;
        } catch (Exception e) {
            throw new NaoPodeDividirPorZeroException();
        }

    }

    public int produto(int a, int b) {
        int result =  a * b;
        return result;
    }
}
