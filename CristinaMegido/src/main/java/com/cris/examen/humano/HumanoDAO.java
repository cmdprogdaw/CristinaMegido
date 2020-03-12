package com.cris.examen.humano;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanoDAO extends CrudRepository<Humano,Integer>{


}
