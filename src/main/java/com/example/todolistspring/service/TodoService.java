package com.example.todolistspring.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.todolistspring.entity.Todo;
import com.example.todolistspring.repository.TodoRepository;


@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    } 

    public List<Todo> list() {
        Sort sorted = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending()
        );
        return todoRepository.findAll(sorted);
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long todoId) {
        todoRepository.deleteById(todoId);
        return list();
    }
}
