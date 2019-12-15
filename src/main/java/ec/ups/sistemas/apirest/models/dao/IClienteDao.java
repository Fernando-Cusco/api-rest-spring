package ec.ups.sistemas.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import ec.ups.sistemas.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
}
