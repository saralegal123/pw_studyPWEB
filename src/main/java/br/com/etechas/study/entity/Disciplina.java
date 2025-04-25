package br.com.etechas.study.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "tb_disciplina")

public class Disciplina {
    @Column(name = "id_disciplina") //configurando nome do campo no  banco de dados
    @Id //Define a chave primária (pk)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tx_nome")
    private String nome;
}
