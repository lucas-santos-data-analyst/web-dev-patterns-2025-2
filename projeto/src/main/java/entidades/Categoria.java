// sudo su modo superusuario enquanto utiliar
// rodar projeto quarkus mvn quarkus:dev

package entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer codigo;
    
    public String nome;

}

/*
 * 
 * # Criar novo usuario no mysql
# create user lucas@localhost identified by 'Unifio@123';
#
# Dar permissão de escrita no mysql
# grant all on *.* to lucas@localhost
#
#
#
#
 */