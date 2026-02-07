package dev.Joaquim.CadastroDePessoas.Pessoas;

import dev.Joaquim.CadastroDePessoas.Missoes.MissoesModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

// Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String cpf;

    private String corFavorita;

    //@ManyToOne uma pessoa tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing key ou chave estrangeira
    private MissoesModel missoes;

        public PessoaModel() {
    }

        public PessoaModel(String nome, String email, String cpf, String corFavorita) {
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
            this.corFavorita = corFavorita;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCorFavorita() {
        return corFavorita;
    }

    public void setCorFavorita(String corFavorita) {
        this.corFavorita = corFavorita;
    }

   
    
}
