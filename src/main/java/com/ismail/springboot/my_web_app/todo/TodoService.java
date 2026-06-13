package com.ismail.springboot.my_web_app.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {

    private static List<Todo> todos;

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
