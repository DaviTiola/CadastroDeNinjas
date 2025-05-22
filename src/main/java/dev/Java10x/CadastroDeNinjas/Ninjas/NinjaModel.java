package dev.Java10x.CadastroDeNinjas.Ninjas;

import dev.Java10x.CadastroDeNinjas.missoes.missoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true, name = "email")
    private String email;

    @Column(unique = true, name = "img_url")
    private String imgurl;

    @Column (name = "idade")
    private int idade;



    // @ManyToOne (Um ninja tem a mesma missão, porém nunca tem um ninja com duas missões
    @ManyToOne
    @JoinColumn (name = "missoes_id") //Foreing Key ou chave estrangeira
    private missoesModel missoes;


}
