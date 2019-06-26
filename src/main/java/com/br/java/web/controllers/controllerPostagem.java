package com.br.java.web.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.java.web.models.PostagemModel;
import com.br.java.web.service.PostagemService;

@Controller
public class controllerPostagem {
	@Autowired
	PostagemService PostagemService;
	
	@RequestMapping("/Adicionar")
	@ResponseBody
	public String Posts(){
		PostagemService.Posts();
		return "Adicionado";
	}
	@RequestMapping
	@ResponseBody
	public Map<Integer, PostagemModel> exibirPosts(){
		return PostagemService.exibirPosts();
	}
	@RequestMapping("/postagem/{id}")
	@ResponseBody
	public PostagemModel BuscarPosts (@PathVariable int id) {
		return PostagemService.BuscarPosts(id);
	}
}

