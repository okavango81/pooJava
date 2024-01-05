package banco.com.okavango81.entities;

public class Pessoa {
    public Pessoa() {
    }

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    private String nome;
    private String documento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }




}
