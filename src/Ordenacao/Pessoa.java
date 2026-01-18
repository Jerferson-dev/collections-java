package Ordenacao;

import java.security.PublicKey;
import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String pessoa;
    private int idade;
    private double altura;


    public Pessoa(String pessoa, int idade, double altura) {
        this.pessoa = pessoa;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "pessoa='" + pessoa + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

}
