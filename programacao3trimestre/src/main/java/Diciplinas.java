
import java.util.Scanner;
public class Diciplinas {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private Curso curso = new Curso();
    private Professor professor = new Professor();

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + " nome: " + nome + " cargaHoraria: " + cargaHoraria + " curso: " + curso.getNome() + " professor: " + professor.getNome();
    }
    
    
}
