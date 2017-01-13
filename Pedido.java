package projetogigalink;

import java.util.Date;

/**
 *
 * @author Rodrigo
 */
public class Pedido {
    int id;
    Date datahora;
    String notafiscal;
    float valorfrete, desconto, valortotal;

    public Pedido(int id, Date datahora, String notafiscal, float valorfrete, float desconto, float valortotal) {
        this.id = id;
        this.datahora = datahora;
        this.notafiscal = notafiscal;
        this.valorfrete = valorfrete;
        this.desconto = desconto;
        this.valortotal = valortotal;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

    public String getNotafiscal() {
        return notafiscal;
    }

    public void setNotafiscal(String notafiscal) {
        this.notafiscal = notafiscal;
    }

    public float getValorfrete() {
        return valorfrete;
    }

    public void setValorfrete(float valorfrete) {
        this.valorfrete = valorfrete;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }
    
    
}
