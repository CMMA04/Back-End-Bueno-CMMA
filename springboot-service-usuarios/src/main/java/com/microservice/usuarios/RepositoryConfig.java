package com.microservice.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.microservice.commons.users.entity.Role;
import com.microservice.commons.users.entity.Usuario;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter{
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class, Role.class);
	}
}
