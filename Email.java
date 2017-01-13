package projetogigalink;

/**
 *
 * @author Rodrigo
 */
public class Email {
    int id;
    String email, referencia;

    public Email(int id, String email, String referencia) {
        this.id = id;
        this.email = email;
        this.referencia = referencia;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
}
