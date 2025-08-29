package entidades;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Venda {
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
