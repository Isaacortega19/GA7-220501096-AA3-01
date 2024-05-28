package com.GA7220501096AA3EV01.CrudDrgstr.controlador;

import com.GA7220501096AA3EV01.CrudDrgstr.entity.Usuario;
import com.GA7220501096AA3EV01.CrudDrgstr.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// La anotación @RestController indica que esta clase es un controlador RESTful
@RestController
// La anotación @RequestMapping especifica la ruta base para las solicitudes HTTP
@RequestMapping (path = "api/v1/usuarios")
public class UsuarioControlador {

    // La anotación @Autowired permite la inyección automática del servicio de usuarios
    @Autowired
    private  UsuarioServicio usuarioServicio;

    // Método para obtener la lista de todos los usuarios
    @GetMapping
    public List<Usuario> getAll(){
        return usuarioServicio.getUsuarios();
    }// Llama al servicio para obtener todos los usuarios

    // Método para obtener un usuario por su ID
    @GetMapping ("{usuarioId}")
    public Optional <Usuario> getById(@PathVariable("usuarioId") Long usuarioId){
        return usuarioServicio.getUsuario(usuarioId);
    } // Llama al servicio para obtener un usuario por su ID

    // Método para guardar o actualizar un usuario
    @PostMapping
    public void saveUpdate(@RequestBody Usuario usuario){
         usuarioServicio.saveOrUpdate(usuario);
    }// Llama al servicio para guardar o actualizar el usuario

    // Método para eliminar un usuario por su ID
    @DeleteMapping ("/{usuarioId}")
    public void deleteUsuario(@PathVariable ("usuarioId") Long usuarioId){
        usuarioServicio.delete(usuarioId);
    }// Llama al servicio para eliminar el usuario por su ID
    // La clase UsuarioControlador expone las operaciones CRUD básicas a través de una API REST
}
