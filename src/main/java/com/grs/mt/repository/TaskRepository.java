package com.grs.mt.repository;

import com.grs.mt.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by dwsmithson on 11/21/16.
 */
public interface TaskRepository extends JpaRepository<Task, Long>  {

    Collection<Task> findById(long id);
}
