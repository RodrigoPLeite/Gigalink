package projetogigalink;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Fornecedor {
    int id, numero;
    String nome, descricao, cidade, endereco, bairro;

    public Fornecedor() {
       
      
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public void consultaFornecedor() throws ClassNotFoundException{
        
        try{
            ConectaBanco banco = new ConectaBanco();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            con = DriverManager.getConnection(banco.url, banco.usuario, banco.senha);
            Statement st = con.createStatement();
            Scanner tes = new Scanner(System.in);
            System.out.println("ID:");
            while(tes.hasNext()){
            ResultSet rs = st.executeQuery("SELECT * FROM gigalink.fornecedor where id = " + tes.nextLine());
            rs.next();
            if(rs.getRow() > 0){
                System.out.println("cod: " + rs.getString("id"));
                System.out.println("nome: " + rs.getString("nome"));
                
            }else
                    {
                        System.out.println("Não encontrado");
        }
            }
        st.close();
        }
        
        catch(SQLException e){
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }
}
