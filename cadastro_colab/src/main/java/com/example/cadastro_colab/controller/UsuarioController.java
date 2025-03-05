package com.example.cadastro_colab.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Importação correta
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.cadastro_colab.Model.Usuario;
import com.example.cadastro_colab.services.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/cadastro")
    public String mostrarCadastro(Model model) {
        model.addAttribute("usuario", new Usuario()); // Corrigido o método
        return "index";
    }

    @PostMapping("/cadastro")
    public String cadastrarUsuario(Usuario usuario) throws IOException {
        usuarioService.salvarUsuario(usuario);
        return "redirect:/cadastro";
    }
}
