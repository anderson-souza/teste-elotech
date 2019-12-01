package com.elotech.client.consumer;

import java.io.IOException;

import com.elotech.model.profissional.detalhe.ProfissionalDetalhe;
import com.elotech.model.profissional.page.ProfissionalPage;
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

	public ProfissionalPage listarRegistrosProfissional() {
		Request request = new Request.Builder().url(RESOURCEURL).method("GET", null).build();
		try (Response response = client.newCall(request).execute()) {
			ProfissionalPage profissionalPage = objectMapper.readValue(response.body().string(),
					ProfissionalPage.class);
			System.out.println(profissionalPage);
			return profissionalPage;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
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
