package osti.kariel.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import osti.kariel.demo.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long> {
   
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
