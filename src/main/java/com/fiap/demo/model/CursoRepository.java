package com.fiap.demo.model;

import com.fiap.demo.model.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<CursoEntity, Long> {
}
