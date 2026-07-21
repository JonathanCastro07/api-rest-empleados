package com.jonathan.gestion_empleados.Exception;

public class EmpleadoNoEncontradoException extends RuntimeException {
    public EmpleadoNoEncontradoException(Long id) {
        super("No se encontró un empleado con id " + id);
    }
}
