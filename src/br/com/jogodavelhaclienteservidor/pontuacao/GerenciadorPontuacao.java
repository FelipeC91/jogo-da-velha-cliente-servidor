package br.com.jogodavelhaclienteservidor.pontuacao;

public interface GerenciadorPontuacao {
	
	public Integer getPontuacao(String nome); 
	
	public void gravarPontuacao(String nome) throws PontuacaoException;

}
