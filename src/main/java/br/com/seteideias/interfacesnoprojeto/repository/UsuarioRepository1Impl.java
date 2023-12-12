package br.com.seteideias.interfacesnoprojeto.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Repository
public class UsuarioRepository1Impl implements UsuarioRepositoryInterface {
    @Override
    public void get() {
        System.out.println("UsuarioRepository1Impl");
    }
}
