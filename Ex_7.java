//Victor Eduardo 3-52
//Ler um número e exibir o seu antecessor

import java.util.Scanner;

public class Ex_7 {

    public static void main(String[] args) {
        int num;
        Scanner Ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = Ler.nextInt();
        System.out.print("Antecessor: " + (num - 1));

        Ler.close();

    }
}
