package dev.Java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping ("/boasvindas")
    public String boasvindas() {
        return "Essa é minha primeira mensagem nessa rota.";
        }

    //Adicionar ninja (CREATE)

    @PostMapping("/criar")
    public String CriarNinja(){
        return "Ninja Criado";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public String mostrarTodosNinjas(){
        return "Mostrar ninjas";
    }

    //Mostrar Ninja por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosNinjasPorID(){
        return "Mostrar ninja por ID";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjasPorId(){
        return "Alterar ninja por ID";
    }

    //Deletar Ninjas (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "deletar ninja por Id";
    }
}
