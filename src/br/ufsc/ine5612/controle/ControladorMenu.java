/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5612.controle;

import br.ufsc.ine5612.entidades.Categoria;
import static br.ufsc.ine5612.entidades.Categoria.BEBIDA;
import static br.ufsc.ine5612.entidades.Categoria.COMIDA;
import static br.ufsc.ine5612.entidades.Categoria.SOBREMESA;
import br.ufsc.ine5612.entidades.Menu;
import br.ufsc.ine5612.entidades.Produto;

/**
 *
 * @author aluno
 */
public class ControladorMenu {
    private Menu menu;
    
    public ControladorMenu(){
        menu = new Menu();
        adicionarProdutos();
    }
    
//    public Produto adicionarProduto(String titulo, double preco, Categoria c){
//        Produto produto = new Produto(titulo, preco, c);
//        Integer codigo = produtoDAO.gerarCodigoProduto();
//        produto.setCodigo(codigo);
//        produtoDAO.put(produto);
//        return produto;
//    }
    
    public void adicionarProdutos(){
        Produto comida1 = new Produto("Pizza", 30, COMIDA);
        Produto comida2 = new Produto("Lasanha", 20, COMIDA);
        Produto comida3 = new Produto("Macarrão", 25, COMIDA);
        this.menu.setComida(comida1);
        this.menu.setComida(comida2);
        this.menu.setComida(comida3);
        
        Produto bebida1 = new Produto("Cerveja", 5, BEBIDA);
        Produto bebida2 = new Produto("Vinho", 20, BEBIDA);
        Produto bebida3 = new Produto("Café", 3, BEBIDA);
        Produto bebida4 = new Produto("Chocolate Quente", 3, BEBIDA);
        Produto bebida5 = new Produto("Chá", 2, BEBIDA);
        Produto bebida6 = new Produto("Marguerita", 15, BEBIDA);
        Produto bebida7 = new Produto("Gim tônica", 15, BEBIDA);
        Produto bebida8 = new Produto("Água", 2, BEBIDA);
        Produto bebida9 = new Produto("Tequila", 10, BEBIDA);
        this.menu.setBebida(bebida1);
        this.menu.setBebida(bebida2);
        this.menu.setBebida(bebida3);
        this.menu.setBebida(bebida4);
        this.menu.setBebida(bebida5);
        this.menu.setBebida(bebida6);
        this.menu.setBebida(bebida7);
        this.menu.setBebida(bebida8);
        this.menu.setBebida(bebida9);
        
        Produto sobremesa1 = new Produto("Pudim", 8, SOBREMESA);
        Produto sobremesa2 = new Produto("Bolo", 10, SOBREMESA);
        Produto sobremesa3 = new Produto("Torta", 8, SOBREMESA);
        this.menu.setSobremesa(sobremesa1);
        this.menu.setSobremesa(sobremesa2);
    }
    
  
}
