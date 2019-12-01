package com.elotech.client.consumer;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.elotech.model.Profissional;
import com.elotech.model.ProfissionalDetalhe;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ProfissionalAPIConsumer {

	private final String RESOURCEURL = "https://homologacao.saude.dev.elotech.com.br/saude-api/api/profissional";
	private OkHttpClient client;
	private ObjectMapper objectMapper;

	public ProfissionalAPIConsumer() {
		client = new OkHttpClient().newBuilder().build();
		objectMapper = new ObjectMapper();
	}

	public List<Profissional> listarRegistros() {
		Request request = new Request.Builder().url(RESOURCEURL).method("GET", null).build();
		try (Response response = client.newCall(request).execute()) {

			JsonNode contentNode = objectMapper.readTree(response.body().bytes()).path("content");

			List<Profissional> listaProfissionais = Arrays
					.asList(objectMapper.treeToValue(contentNode, Profissional[].class));

			return listaProfissionais;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public ProfissionalDetalhe buscarRegistro(Long id) {
		Request request = new Request.Builder().url(RESOURCEURL + "/" + id).method("GET", null).build();
		try (Response response = client.newCall(request).execute()) {
			ProfissionalDetalhe profissionalDetalhe = objectMapper.readValue(response.body().string(),
					ProfissionalDetalhe.class);
			System.out.println(profissionalDetalhe);
			return profissionalDetalhe;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
