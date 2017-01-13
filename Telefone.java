package projetogigalink;

/**
 *
 * @author Rodrigo
 */
public class Telefone {
    int id;
    String ddd, numero, referencia;

    public Telefone(int id, String ddd, String numero, String referencia) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
        this.referencia = referencia;
    }

    Telefone() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
}
