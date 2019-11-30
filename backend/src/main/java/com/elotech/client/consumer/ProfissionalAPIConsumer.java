package com.elotech.client.consumer;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.elotech.model.Profissional;
import com.elotech.service.ProfissionalService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Classe utilizada para consumir os recursos da API de profissionais e grava os
 * registros em um banco de dados local
 * 
 * @author ander
 *
 */
public class ProfissionalAPIConsumer {

	private final String RESOURCEURL = "https://homologacao.saude.dev.elotech.com.br/saude-api/api/profissional";
	private OkHttpClient client;
	private ObjectMapper objectMapper;

	@Autowired
	private ProfissionalService profissionalService;

	public ProfissionalAPIConsumer() {
		client = new OkHttpClient().newBuilder().build();
		objectMapper = new ObjectMapper();
	}

	public void consumir() {
		Request request = new Request.Builder().url(RESOURCEURL).method("GET", null).build();
		try (Response response = client.newCall(request).execute()) {

			JsonNode rootNode = objectMapper.readTree(response.body().bytes());
			JsonNode contentNode = rootNode.path("content");

			contentNode.forEach(p -> {
				try {
					Profissional profissional = objectMapper.treeToValue(p, Profissional.class);
					salvarProfissionalNoBanco(profissional);
				} catch (JsonProcessingException e) {
					System.err.println("Erro na conversão de Profissional: " + e.getMessage());
				}
			});

		} catch (IOException e) {
			System.err.println("Erro na busca pela API de profissionais: " + e.getMessage());
		}
	}

	private void salvarProfissionalNoBanco(Profissional profissional) {
		profissionalService.salvar(profissional);
	}

}
