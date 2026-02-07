package dev.Joaquim.CadastroDePessoas.Missoes;

import java.util.List;

import dev.Joaquim.CadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldade;

    //Uma missao para muitas pessoas
    @OneToMany(mappedBy = "missoes")
    private List<PessoaModel> pessoas;

    public MissoesModel(String nomeMissao, String dificuldade) {
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }




}
