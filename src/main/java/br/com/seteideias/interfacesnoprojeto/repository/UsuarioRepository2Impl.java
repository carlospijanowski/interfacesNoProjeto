package br.com.seteideias.interfacesnoprojeto.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class UsuarioRepository2Impl implements UsuarioRepositoryInterface {
    @Override
    public void get() {
        System.out.println("UsuarioRepository2Impl");
    }
}
