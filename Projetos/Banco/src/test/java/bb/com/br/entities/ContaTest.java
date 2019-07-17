package bb.com.br.entities;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

    @Test
    public void testConstrutores() {

        // With Arguments
        Conta c1 = new Conta();
        Assert.assertEquals( 0, c1.getNumero() );
        Assert.assertEquals( "Sem nome.", c1.getTitular());
        Assert.assertEquals( 0.0, c1.getSaldo(), 0.0 );

        // Without Arguments
        Conta c2 = new Conta( 111, "Test", 2500.25);
        Assert.assertEquals( 111, c2.getNumero() );
        Assert.assertEquals( "Test", c2.getTitular());
        Assert.assertEquals( 2500.25, c2.getSaldo(), 0.0 );

    }

    @Test
    public void sacar() {

        Conta conta = new Conta(111, "Teste", 1500.50);

        // Testing General
        conta.sacar(1000);
        Assert.assertEquals(500.50, conta.getSaldo(), 0);

        // Testing Exceptional
        conta.sacar(1000);
        Assert.assertEquals(500.50, conta.getSaldo(), 0);

        conta.sacar(-1000);
        Assert.assertEquals(500.50, conta.getSaldo(), 0);

        conta.sacar(500.50);
        Assert.assertEquals(0.0, conta.getSaldo(), 0);
    }

    @Test
    public void depositar() {

        Conta conta = new Conta(111, "Teste", 0.0);

        // Testing General
        conta.depositar(1500);
        Assert.assertEquals(1500, conta.getSaldo(), 0);

        // Testing Exceptional
        conta.depositar(-500);
        Assert.assertEquals(1500, conta.getSaldo(), 0);

    }

    @Test
    public void setNumero() {

        Conta conta = new Conta();

        conta.setNumero( 555 );
        Assert.assertEquals( 555, conta.getNumero() );

        conta.setNumero( -555 );
        Assert.assertEquals( 555, conta.getNumero() );

    }

    @Test
    public void setTitular() {

        Conta conta = new Conta();

        // Testing General
        conta.setTitular("Teste");
        Assert.assertEquals( "Teste" , conta.getTitular() );

        // Testing Exceptional
        conta.setTitular(null);
        Assert.assertEquals( "Teste" , conta.getTitular() );

        conta.setTitular("");
        Assert.assertEquals( "Teste" , conta.getTitular() );

    }
}