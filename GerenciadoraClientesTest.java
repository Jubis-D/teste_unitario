/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaBancarioAula;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author T-Gamer
 */
public class GerenciadoraClientesTest {
    GerenciadoraClientes gerClientes
   
    
    @Before
    public void setup(){
         
        // criando alguns clientes
        Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
        Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
        
        // Inserindo os clientes criados na lista de clientes do banco
        List<Cliente> clientesDoBanco = new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);
        
        GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
        
    }
    
    @Test
    public void testRemoveCliente(){
        gerClientes.removeCliente(1);
        //execução
        Cliente cliente = gerClientes.pesquisaCliente(1);
        //vereificação
        assertThat(cliente.getId(), is(1));
    }
    @Test
    public void testPesquisaCliente(){
       
        Cliente cliente = gerClientes.pesquisaCliente(1);
        
        assertThat(cliente.getId(), is(1));
        assertThat(cliente.getEmail(), is("gugafarias@gmail.com"));
        
    }
    
}
