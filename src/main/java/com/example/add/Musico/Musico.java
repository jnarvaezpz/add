package com.example.add.Musico;

import javax.persistence.*;

@Entity
@Table(name ="musico", catalog = "test")
public class Musico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    public Musico() {
    }

    @Override
    public String toString() {
        return "Musico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
