package com.br.java.web.service;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.br.java.web.models.PostagemModel;

@Service
public class PostagemService {
	
	private Map<Integer, PostagemModel> postagens = new HashMap<Integer, PostagemModel> ();
	
	public void Posts () {
		postagens.put(1, new PostagemModel ("Sabrina",  "Oi, genteeee"));
		postagens.put(2, new PostagemModel ("Darth Vader", "Luke, eu sou sei pai"));
		postagens.put(3, new PostagemModel ("Rambo", "Isso é o que somos, viver por nada ou morrer por alguma coisa."));
	}
	
	public Map<Integer, PostagemModel> exibirPosts(){
		return this.postagens;
	}
	
	public PostagemModel BuscarPosts (int id ){
		return this.postagens.get(id);
	}
	
}
