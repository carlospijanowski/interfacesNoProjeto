package br.com.seteideias.interfacesnoprojeto.service;

import br.com.seteideias.interfacesnoprojeto.repository.UsuarioRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {

    @Autowired
    private UsuarioRepositoryInterface repository;

    public void chmandoRepository(){
        repository.get();
    }

}
