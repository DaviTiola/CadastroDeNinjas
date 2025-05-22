package dev.Java10x.CadastroDeNinjas.missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {



    //
    @PostMapping("/missoes")
    public String criarMissao() {
        return "Missão criada com sucesso!";
    }

    // PUT - MANDAR REQUISIÇÃO PARA ALTERAR MISSÃO
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso!";
    }
    // DELETE -- MANDAR REQUISIÇÃO PARA DELETAR MISSÕES
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão deletada com sucesso!";
    }
    // GET -- MANDAR UMA REQUISIÇÃO PARA MOSTRAR MISSÕES
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Missões listadas com sucesso!";
    }



}
