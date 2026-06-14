package com.jonathan.gestion_empleados.Repository;

import com.jonathan.gestion_empleados.Modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpleadosRepository extends JpaRepository<Empleado, Long> {
}
