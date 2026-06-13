package com.ismail.springboot.my_web_app.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(false, LocalDate.now().plusYears(1),
                "Learn AWS", "Ismail", 1));
        todos.add(new Todo(false, LocalDate.now().plusYears(2),
                "Learn DevOps", "Ismail", 2));
        todos.add(new Todo(false, LocalDate.now().plusYears(3),
                "Learn FullStack dev", "Ismail", 1));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }
}
