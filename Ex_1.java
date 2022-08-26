//Victor Eduardo3-52
//Página 33 n1 da apostila de Java
//Somar os números ímpares entre 0 e 30
//Multiplicar os pares entre 0 e 30
//Questao 1 - Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 30 e a multiplicação dos números pares entre 0 e 30.
public class Ex_1 {
    public static void main(String[] args) {
        int totalImpar = 0;
        long totalPar = 1;
        int num;

        for (num = 0; num <= 30; num++) {
            if ((num % 2 == 1)) {
                totalImpar += num;
            } else {
                totalPar *= num;
            }
        }
        System.out.println("Multiplicação dos pares: " + totalPar);
        System.out.println("Soma dos ímpares: " + totalImpar);
    }
}