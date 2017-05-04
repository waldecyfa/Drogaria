package br.com.drogaria.test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.dao.ProdutoDAO;
import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.domain.Produto;

public class ProdutoDAOTeste {
	@Test
	@Ignore
   public void salvar() throws SQLException {
	  Produto p = new Produto();
	  p.setDescricao("LORATIDINA 10mg");
	  p.setPreco(12.33D);
	  p.setQuantidade(12L);
	  
	  Fabricante f = new Fabricante();
	  f.setCodigo(32L);
	  
	  p.setFabricante(f);
	  
	  ProdutoDAO dao = new ProdutoDAO();
	  dao.salvar(p);
   }
   
	@Test
	@Ignore
	public void listar() throws SQLException {
		ProdutoDAO dao = new ProdutoDAO();
		ArrayList<Produto> lista = dao.listar();
		
		for(Produto p : lista){
			System.out.println("Código do Produto: " + p.getCodigo());
			System.out.println("Descrição do Produto: " + p.getCodigo());
			System.out.println("Preço: " + p.getPreco());
			System.out.println("Quantidade: " +p.getQuantidade());
			System.out.println("Código do Fabricante: " + p.getFabricante().getCodigo());
			System.out.println("Descrição do Fabricante: " + p.getFabricante().getDescricao());
			System.out.println();
		}
	}
	@Test
	@Ignore
	public void excluir() throws SQLException {
		Produto p = new Produto();
		p.setCodigo(25L);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.excluir(p);
	}
	
	@Test
	public void editar() throws SQLException {
		Produto p = new Produto();
		p.setCodigo(19L);
		p.setDescricao("Pomada Anal 30mg");
		p.setPreco(22.33D);
		p.setQuantidade(12L);
		
		Fabricante f = new Fabricante();
		f.setCodigo(15L);
		
		p.setFabricante(f);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.editar(p);
	}
}
