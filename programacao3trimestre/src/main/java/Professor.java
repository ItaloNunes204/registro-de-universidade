
import java.util.Scanner;

public class Professor extends Funcionario{
    private String Titulacao;
    private String areaDePesquisa;
    public Professor() {
    }

    public Professor(String nome, String endereco, String telefone, String cpf, String ctps, double salario, String titulacao, String areaDePesquisa) {
        this.Titulacao = Titulacao;
        this.areaDePesquisa = areaDePesquisa;
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setCpf(cpf);
        super.setEndereco(endereco);
        super.setSalario(salario);
        super.setCtps(ctps);
    }
    
    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String Titulacao) {
        this.Titulacao = Titulacao;
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public void setAreaDePesquisa(String areaDePesquisa) {
        this.areaDePesquisa = areaDePesquisa;
    }    
    
}
