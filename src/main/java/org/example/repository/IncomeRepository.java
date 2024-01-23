package org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.entity.Income;
@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}