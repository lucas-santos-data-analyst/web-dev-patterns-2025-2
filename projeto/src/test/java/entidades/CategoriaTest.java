package entidades;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import jakarta.transaction.Transactional;

@QuarkusTest
public class CategoriaTest {


    @Test
    @Transactional
    
    public void testeSalvaUmFabricanteEBuscaFabricanteSalvo() {

        Categoria categoria = new Categoria();

        categoria.nome = "Doces";

        categoria.persist();
        
        Assertions.assertEquals(categoria.codigo, 11);
    }
}