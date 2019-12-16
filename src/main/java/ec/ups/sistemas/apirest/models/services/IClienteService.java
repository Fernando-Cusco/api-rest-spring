package ec.ups.sistemas.apirest.models.services;

import java.util.List;

import ec.ups.sistemas.apirest.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Cliente findById(Long id);
	
}
