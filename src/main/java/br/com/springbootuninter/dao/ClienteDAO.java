package br.com.springbootuninter.dao;

import java.util.List;

import br.com.springbootuninter.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class ClienteDAO implements CRUD<Cliente, Long> {
	
	private EntityManager entityManager;

	@Override
	public Cliente pesquisaPeloId(Long id) {
		return entityManager.find(Cliente.class, id);
	}

	@Override
	public List<Cliente> lista() {
		Query query = entityManager.createQuery("Select c from Cliente c");
		return (List<Cliente>) query.getResultList();
	}

	@Override
	public void insere(Cliente cliente) {
		entityManager.persist(cliente);
	}

	@Override
	public void atualiza(Cliente cliente) {
		entityManager.merge(cliente);
	}

	@Override
	public void remove(Cliente cliente) {
		entityManager.remove(cliente);
	}
	
}
