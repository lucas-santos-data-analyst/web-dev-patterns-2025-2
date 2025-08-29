package entidades;

import io.quarkus.Generated;

import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Funcionario {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int codigo;

    String nome;
    String cpf;
}
