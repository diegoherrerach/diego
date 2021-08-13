package com.crud.rest.diego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.rest.diego.model.Usuario;
import com.crud.rest.diego.service.api.UsuarioServiceAPI;

public class UsuarioController {
	@Autowired
	private UsuarioServiceAPI usuarioServiceAPI;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", usuarioServiceAPI.getAll());
		return "index";
	}

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id , Model model) {
		if(id != null && id != 0) {
			model.addAttribute("usuario", usuarioServiceAPI.get(id));
		}else {
			model.addAttribute("usuario", new Usuario());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Usuario usuario, Model model) {
		usuarioServiceAPI.save(usuario);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		usuarioServiceAPI.delete(id);
		
		return "redirect:/";
	}
	
}
