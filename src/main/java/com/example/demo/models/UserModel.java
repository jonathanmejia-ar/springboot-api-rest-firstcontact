package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "priority")
    private Integer priority;

    public void setPriority(Integer priority) {
        this.priority = priority;
    };

    public Integer getPriority() {
        return this.priority;
    };

    public Long getId() {
        return this.id;
    };

    public void setId(Long id) {
        this.id = id;
    };

    public String getName() {
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    };

    public String getEmail() {
        return this.email;
    };

    public void setEmail(String email) {
        this.email = email;
    };

};