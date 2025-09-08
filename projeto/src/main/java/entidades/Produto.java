package entidades;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Produto extends PanacheEntityBase {

    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    int codigo;

    String nome;
    double preco;
    double quantidade;
    LocalDate validade;

    @ManyToOne
    Categoria categoria;

    
}
