package dev.Joaquim.CadastroDePessoas.Missoes;

import java.util.List;

import dev.Joaquim.CadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MissoesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldade;

    //Uma missao para muitas pessoas
    @OneToMany(mappedBy = "missoes")
    private List<PessoaModel> pessoas;


}
