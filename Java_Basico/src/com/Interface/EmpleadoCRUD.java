package com.Interface;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    /**

     * Create
     * Retrieve/ read
     * Update
     * Delete
     */


    List<Empleado> empleados = new ArrayList<Empleado>();

    // CREATE - Guardar un Empleado

    public void guardar(Empleado empleado) {

        empleados.add(empleado);
    }

}
