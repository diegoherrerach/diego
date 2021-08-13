package com.crud.rest.diego.service.impl;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.crud.rest.diego.commons.GenericServieImpl;
import com.crud.rest.diego.dao.api.UsuarioDaoAPI;
import com.crud.rest.diego.model.Usuario;
import com.crud.rest.diego.service.api.UsuarioServiceAPI;





@Service
public class UsuarioServiceImpl extends GenericServieImpl<Usuario, Long> implements UsuarioServiceAPI {

	private UsuarioDaoAPI usuarioDaoAPI;
	@Override
	public CrudRepository<Usuario, Long> getDao() {
		// TODO Auto-generated method stub
		return usuarioDaoAPI;
	}
	


}
