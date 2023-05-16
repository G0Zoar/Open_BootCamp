package com.Conceptos;

import java.util.HashMap;
import java.util.Map;
public class MApas {
    /*
    Los mapas son una estructura de datos que nos permiten trabajar
    con pares de clave calor.
     */

    public static void main(String[] args) {




        Map<String, String> personas = new HashMap<>();

        personas.put("1232367H", "Nombre Apellido 1");
        personas.put("1234267J", "Nombre Apellido 2");
        personas.put("1231167K", "Nombre Apellido 3");

        System.out.println(personas);

        for (String key : personas.keySet()){
            System.out.println(key);
        }

        for (String value : personas.values()){
            System.out.println(value);
        }

        for (Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " | " + pair.getValue());
        }

    }



}
