package dev.Java10x.CadastroDeNinjas.missoes;

import dev.Java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
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
