package com.jonathan.gestion_empleados.Modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Table(name = "empleado")
@Getter
@Setter
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String cargo;
    private double salario;
    private String departamento;

    public Empleado(long id, String nombre, String cargo, double salario, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Empleado() {
    }
}
