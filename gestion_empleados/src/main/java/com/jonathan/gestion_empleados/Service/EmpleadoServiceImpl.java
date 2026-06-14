package com.jonathan.gestion_empleados.Service;


import com.jonathan.gestion_empleados.Modelo.Empleado;
import com.jonathan.gestion_empleados.Repository.EmpleadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadosRepository repository;

    @Override
    public Empleado crear(Empleado e) {
        return repository.save(e);
    }

    @Override
    public Empleado buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Empleado> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Empleado actualizar(Long id, Empleado e) {
        e.setId(id);
        return repository.save(e);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);

    }
}
