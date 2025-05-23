package dev.Java10x.CadastroDeNinjas.Ninjas;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.stereotype.Service;

import java.sql.Savepoint;
import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }


    //Listar meu ninja por ID
    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel>ninjaporID = ninjaRepository.findById(id);
        return ninjaporID.orElse (null);
    }

    //Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

}

