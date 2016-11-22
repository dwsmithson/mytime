package com.grs.mt.repository;

import com.grs.mt.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by dwsmithson on 11/21/16.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findById(Long id);
}
