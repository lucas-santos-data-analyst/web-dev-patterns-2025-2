package entidades;

import java.time.LocalTime;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Venda extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int codigo;

    LocalTime horarioVenda;
    double valorTotal;
    double quantidadeTotal;
    
    @OneToOne
    Cliente cliente;

    @OneToOne
    Funcionario funcionario;
}
