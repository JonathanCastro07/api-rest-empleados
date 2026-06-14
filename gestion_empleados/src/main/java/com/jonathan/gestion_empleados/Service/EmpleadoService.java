package com.jonathan.gestion_empleados.Service;

import com.jonathan.gestion_empleados.Modelo.Empleado;
import com.jonathan.gestion_empleados.Repository.EmpleadosRepository;

import java.util.List;

public interface EmpleadoService  {
    Empleado crear(Empleado e);
    Empleado buscarPorId(Long id);
    List<Empleado> buscarTodos();
    Empleado actualizar(Long id, Empleado e);
    void eliminar(Long id);
}
