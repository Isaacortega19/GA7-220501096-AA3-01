package com.GA7220501096AA3EV01.CrudDrgstr.repositorio;

import com.GA7220501096AA3EV01.CrudDrgstr.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// La anotación @Repository indica que esta interfaz es un componente de acceso a datos (DAO)
@Repository
// La interfaz UsuarioRepositorio extiende JpaRepository para proporcionar métodos CRUD y más
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    // La interfaz JpaRepository viene con métodos predefinidos como save(), findAll(), findById(), delete(), etc.
    // No se necesita agregar métodos adicionales a menos que se necesiten consultas personalizadas
}
