package com.example.GoGoGo.entity;
//Todo
// сделать этот класс сущностью гибернейта
// реализовать для этой сущности репозиторий, сервис, контроллер
//User может иметь много Тасков, то есть одного поле будет List<Tasks>

//Нужно правильно связать сущности User и Tasks используя аннотацию @OneToMany
//На уровне таблиц посмотреть как реализуется связь OneToMany
//*дополнительно почитать теорию что такоего oneToMany и ManyToOne

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class User {

    @Id
    long id;
    String name;
    List<Task> tasks;
}
