/**
* Objetivo: crie uma interface chamada "OperacaoMatematica". 
* Crie tambem 4 metodos das operacoes basicas: 
* soma, subtracao, multiplicacao e divisao.
*
* 
* @author Marcelo Soares
* @version 1.0
* @since 2023-03-10
*/
import java.lang.IllegalArgumentException;

public interface OperacaoMatematica {
	
    double adicao(double num1, double num2);
    double subtracao(double num1, double num2);
    double multiplicacao(double num1, double num2);
    double divisao(double num1, double num2);
}

public class Calculadora implements OperacaoMatematica {
	
    @Override
    public double adicao(double num1, double num2) {
        return num1 + num2;
    }
    
    @Override
    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }
    
    @Override
    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
    
    @Override
    public double divisao(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Nao eh possivel dividir por zero.");
        }
        return num1 / num2;
    }
}