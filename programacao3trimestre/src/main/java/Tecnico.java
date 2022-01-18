import java.util.Scanner;

public class Tecnico extends Funcionario {
private String areaDeAtuacao;
    public Tecnico(String nome, String endereco, String telefone, String cpf, String ctps, double salario, String text) {
        this.areaDeAtuacao=areaDeAtuacao;
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setCpf(cpf);
        super.setEndereco(endereco);
        super.setSalario(salario);
        super.setCtps(ctps);
    }
    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }
    
}
