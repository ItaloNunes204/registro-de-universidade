
import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private int codigo; 
    private String nome;
    private int duracao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return " nome: " + nome +" codigo: " + codigo + " duracao: " + duracao;
    }
    
}
