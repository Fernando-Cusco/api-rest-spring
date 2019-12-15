package ec.ups.sistemas.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.ups.sistemas.apirest.models.entity.Cliente;
import ec.ups.sistemas.apirest.models.services.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRest {
	
	@Autowired
	private ClienteService cs;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return cs.findAll();
	}
	
	
}
