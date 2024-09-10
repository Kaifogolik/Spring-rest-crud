package com.example.GoGoGo.entity;
//Todo
// сделать этот класс сущностью гибернейта
// реализовать для этой сущности репозиторий, сервис, контроллер


//User может иметь много Тасков, то есть одного поле будет List<Tasks>

//Нужно правильно связать сущности User и Tasks используя аннотацию @OneToMany
//На уровне таблиц посмотреть как реализуется связь OneToMany
//*дополнительно почитать теорию что такоего oneToMany и ManyToOne

//Todo реализовать ещё одну аналогичную сущность Event состав полей минимум такой же + добавить поле string description и другие по желанию
//у этой сущности аналогично репо сервисы контроллере

//Todo проверить в постаме все методы контроллера
//Реалзиовать самостоятльное метод обновления. Подсказка - он будет такой же как save ,только метод http - put, соответственно аннотация @PutMapping  проверить его из постмана

// по аналогии с TUser и Task свзять Task и Event, на одно событие(Event) можеть быть много задач.

//*Посмотреть join в sql , попробовать написать самому join для своих сущностей

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TUser {

    @Id
    long id;
    String name;

    @OneToMany(mappedBy = "tUser")
    List<Task> tasks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
