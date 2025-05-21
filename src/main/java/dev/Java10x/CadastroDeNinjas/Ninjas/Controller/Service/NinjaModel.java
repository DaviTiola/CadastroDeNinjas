package dev.Java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import dev.Java10x.CadastroDeNinjas.Missões.missoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
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
    @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
    private missoesModel missoes;

    public NinjaModel() {}

    public NinjaModel(String nome, int idade, String email) {this.nome = nome; this.idade = idade; this.email = email;}

    public String getNome() { return nome;
    }

    public void setNome(String nome) { this.nome = nome;
    }

    public int getIdade() { return idade;
    }

    public void setIdade(int idade) { this.idade = idade;
    }

    public String getEmail() { return email;
    }

    public void setEmail(String email) { this.email = email;
    }
}
