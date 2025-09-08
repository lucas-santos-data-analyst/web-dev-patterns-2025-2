package entidades;

import io.quarkus.Generated;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Funcionario extends PanacheEntityBase {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int codigo;

    String nome;
    String cpf;
}
