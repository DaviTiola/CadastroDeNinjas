package dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import dev.Java10x.CadastroDeNinjas.Missões.missoesModel;
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
    private Long id;

    private String nome;

    private int idade;

    private String email;

    private List<missoesModel> missoesModel;


    // @ManyToOne (Um ninja tem a mesma missão, porém nunca tem um ninja com duas missões
    @ManyToOne
    @JoinColumn (name = "missoes_id") //Foreing Key ou chave estrangeira
    private missoesModel missoes;


}
