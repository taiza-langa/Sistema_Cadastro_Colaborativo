package com.example.cadastro_colab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cadastro_colab.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}