package com.example.todo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.demo.entity.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Long> {

}
