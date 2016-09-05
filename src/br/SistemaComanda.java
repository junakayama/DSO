/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import br.ufsc.ine5612.controle.ControladorComanda;
import br.ufsc.ine5612.controle.ControladorFuncionario;
import br.ufsc.ine5612.entidades.Categoria;
import br.ufsc.ine5612.entidades.Funcionario;
import br.ufsc.ine5612.entidades.Produto;

/**
 *
 * @author aluno
 */
public class SistemaComanda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ControladorFuncionario controladorFuncionario = new ControladorFuncionario();
        ControladorComanda controladorComanda = new ControladorComanda();
        
        Produto produto = new Produto("Comida",10.50,Categoria.COMIDA);
        Produto produto1 = new Produto("Comida1",10.50,Categoria.COMIDA);
        Produto produto2 = new Produto("Comida2",10.50,Categoria.COMIDA);
        Produto produto3 = new Produto("Comida3",10.50,Categoria.COMIDA);
        Produto produto4 = new Produto("Comida4",10.50,Categoria.COMIDA);
        
        Funcionario funcionario = new Funcionario("Trabalhadô","login","senha",true);
        Funcionario funcionario1 = new Funcionario("Trabalhadô1","login","senha",false);

        controladorFuncionario.setUsuario(funcionario);
        
        controladorComanda.abreMesa(funcionario,1);
        System.out.println("abriu mesa");
        
        controladorComanda.adicionaPedido(produto);
        System.out.println("adiciona produto0");
        controladorComanda.adicionaPedido(produto1);
        System.out.println("adiciona produto1");
        controladorComanda.adicionaPedido(produto2);
        System.out.println("adiciona produto2");
        controladorComanda.adicionaPedido(produto3);
        System.out.println("adiciona produto3");
        controladorComanda.adicionaPedido(produto4);
        System.out.println("adiciona produto4");
        
        controladorComanda.cancelaPedido(produto);
        System.out.println("removeu produto");
        
        for (Produto p : controladorComanda.getMesa().getComanda().getProdutos()) {
            System.out.println(""+p.getTitulo());
        }
        
        
    }
    
}
