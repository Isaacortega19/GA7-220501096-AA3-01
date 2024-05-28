package com.GA7220501096AA3EV01.CrudDrgstr.entity;

import jakarta.persistence.*;
import lombok.Data;
// La anotación @Data de Lombok genera automáticamente los getters, setters, equals, hash, y toString

@Data
// La anotación @Entity indica que esta clase es una entidad JPA

@Entity
// La anotación @Table especifica la tabla en la base de datos con la que esta entidad estará mapeada

@Table (name = "tbl_usuario")
public class Usuario {

    @Id
    // La anotación @Id indica que este campo es la clave primaria de la entidad
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    // La anotación @GeneratedValue especifica que el valor de este campo será generado automáticamente
    private Long userId;

    private String userName;

    private String password;

    // La anotación @Column especifica detalles adicionales sobre la columna en la base de datos
    @Column (name = "email_addres", unique = true, nullable = false)
    private String email;

    // La clase Usuario representa una entidad de usuario en la base de datos, mapeada a la tabla "tbl_usuario".
    // Incluye campos para el ID de usuario, nombre de usuario, contraseña y dirección de correo electrónico.
    // El campo "email" es único y no puede ser nulo.

}
