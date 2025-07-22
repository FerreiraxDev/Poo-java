package lp.jvnotaaluno.conteudo;

import lp.jvnotaaluno.entities.Aluno;

import java.util.Scanner;

//Fazer um programa para ler o nome e  as 3 notas dos 3 trimestres do ano
//(Primeiro trimestre vale 30 e o segundo e o terceiro valem 35 cada)
//Mostrar qual a nota final do aluno no ano
//Dizer se o aluno está aprovado (PASS) ou não (FALEID), em caso negativo
//dizer quantos pontos faltam para o aluno obter o mínimo para ser aprovado
//O mínimo é 60% da nota (100 (30 + 35 + 35)
//Entrada: Caio Juan 27.00 31.00 32.00 Saída: FINAL GRADE = 90.00
//Entrada2: Caio Juan 17.00 20.00 15.00 Saída: FINAL GRADE = 52.00 FAILED MISSING 8.00 POINTS


public class Main {
    public static void main(String[] args) {
        Aluno std = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de notas");
        System.out.println("Insira seu nome: ");
        std.nome = sc.nextLine();
        System.out.println("Insira sua primeira nota: ");
        std.n1 = sc.nextDouble();
        System.out.println("Insira sua segunda nota: ");
        std.n2 = sc.nextDouble();
        System.out.println("Insira sua terceira nota: ");
        std.n3 = sc.nextDouble();





    }
}
