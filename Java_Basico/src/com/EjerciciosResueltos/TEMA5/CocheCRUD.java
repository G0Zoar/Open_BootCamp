package com.EjerciciosResueltos.TEMA5;

import java.util.List;

public interface CocheCRUD {
    void save(CocheCRUDImpl cocheCrudImpl);
    List<CocheCRUDImpl> findAll();
    void Delete(CocheCRUDImpl cocheCrudImpl);
}
