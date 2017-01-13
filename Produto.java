package projetogigalink;

/**
 *
 * @author Rodrigo
 */
public class Produto {
    String nome, descricao;

    public Produto(int id, String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
