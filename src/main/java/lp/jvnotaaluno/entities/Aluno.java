package lp.jvnotaaluno.entities;


public class Aluno {
    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double somarNotas(){
        return n1 + n2 + n3;
    }

    public double imprimirNotas(){
        double somarT = somarNotas();

        if (somarT >= 90){
            System.out.println("FINAL GRADE = " + somarT + " PASS");
        }else{
            System.out.println("FINAL GRADE = " + somarT + " FAILED");
            System.out.println("MISSING " + (100 - somarT) + " POINTS");
        }
        return somarT;
    }

}

