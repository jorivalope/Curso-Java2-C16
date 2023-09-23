package com.ps.jac16.repository;

import com.ps.jac16.model.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransferenciaRepository extends JpaRepository<Transferencia,Long> {
}
