package com.example.cadastro_colab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.cadastro_colab.model.Usuario;

import ch.qos.logback.core.model.Model;

@Controller
public class UsuarioController {

    @GetMapping("/cadastro")
    public String mostrarCadastro(Model model) {
        // model.addAttribute("usuario", new Usuario());
        return "index";
    }

}
