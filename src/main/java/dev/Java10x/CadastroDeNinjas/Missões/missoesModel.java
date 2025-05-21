package dev.Java10x.CadastroDeNinjas.Missões;

import dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;
import jdk.jfr.Name;

import java.util.List;

@Entity
@Table (name = "tb_missoes")

public class missoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String missão;

    private String dificuldade;

    private Boolean status;

    //OneToMany (Uma missão pode ter vários ninjas)
    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel> ninjas;




}
