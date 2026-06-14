package com.jonathan.gestion_empleados.Controller;

import com.jonathan.gestion_empleados.Modelo.Empleado;
import com.jonathan.gestion_empleados.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public Empleado crear(@RequestBody Empleado empleado){
        return empleadoService.crear(empleado);
    }

    @GetMapping
    public List<Empleado> buscar(){
        return empleadoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Empleado buscarPorId(@PathVariable Long id){
        return  empleadoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Empleado actualizar(@PathVariable Long id, @RequestBody Empleado empleado){
        return empleadoService.actualizar(id, empleado);
    }


    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable Long id){
        empleadoService.eliminar(id);
    }

}
