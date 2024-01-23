package org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.entity.Spend;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}
