package com.lopez.app.jpa.configurations;

import javax.crypto.SecretKey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.jsonwebtoken.Jwts;

@Configuration
public class Configuracion {
	@Bean
	SecretKey getSecretKey() {
		return Jwts.SIG.HS512.key().build();
	}
}
