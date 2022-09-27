package Exercicio_1;

public class PraticaExcecoes {
    static int a = 0;
    static int b = 300;

    public static void main(String args[]){
        try{
            int result = PraticaExcecoes.b / PraticaExcecoes.a;

            System.out.println("Resultado da operacao eh "+ result);
        }
        catch(ArithmeticException arithmeticException){
            throw new IllegalArgumentException("Ocorreu um erro.");
        }
        catch(IllegalArgumentException illegalArgumentException){
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        }
        finally {
            System.out.println("Programa finalizado.");
        }

    }
}
