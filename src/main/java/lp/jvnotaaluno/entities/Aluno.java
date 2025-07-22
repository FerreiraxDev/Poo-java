package lp.jvnotaaluno.entities;


public class Aluno {
    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double somaNotas(){
        return (n1 + n2 + n3) / 3;
    }

}

