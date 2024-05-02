package com.example.todolistspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolistspring.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{ //<entidade, tipoIdEntidade>
    
}
