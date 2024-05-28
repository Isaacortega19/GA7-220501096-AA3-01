package com.GA7220501096AA3EV01.CrudDrgstr.servicios;

import com.GA7220501096AA3EV01.CrudDrgstr.entity.Usuario;
import com.GA7220501096AA3EV01.CrudDrgstr.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// La anotación @Service indica que esta clase es un servicio de negocio en la capa de servicio de Spring
@Service
public class UsuarioServicio {

    // La anotación @Autowired permite la inyección automática del repositorio de usuarios
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    // Método para obtener la lista de todos los usuarios
    public List<Usuario> getUsuarios() {
        return usuarioRepositorio.findAll();
    }

    // Método para obtener un usuario por su ID
    public Optional<Usuario> getUsuario(Long id) {
        return usuarioRepositorio.findById(id);
    }
    // Método para guardar o actualizar un usuario
    public void saveOrUpdate(Usuario usuario) {
        usuarioRepositorio.save(usuario);
    }
    // Método para eliminar un usuario por su ID
    public void delete(Long id) {
        usuarioRepositorio.deleteById(id);
    }
    // La clase UsuarioServicio proporciona los métodos CRUD básicos para la entidad Usuario,
    // utilizando UsuarioRepositorio
}
