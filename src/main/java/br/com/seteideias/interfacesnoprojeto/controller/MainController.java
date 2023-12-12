package br.com.seteideias.interfacesnoprojeto.controller;

import br.com.seteideias.interfacesnoprojeto.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class MainController {

    @Autowired
    private UsuariosService service;

    @GetMapping("/")
    public void listAll(){
        System.out.println("***********");
        service.chmandoRepository();
    }

}
