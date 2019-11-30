package com.elotech;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.elotech.client.consumer.ProfissionalAPIConsumer;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TesteConsumoAPI {

	public static void main(String[] args) {
		ProfissionalAPIConsumer consumer = new ProfissionalAPIConsumer();
		consumer.consumir();

	}

	static void consumoOkHttp() {
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		Request request = new Request.Builder()
				.url("https://homologacao.saude.dev.elotech.com.br/saude-api/api/profissional").method("GET", null)
				.build();
		try {
			Response response = client.newCall(request).execute();
			System.out.println(response.body().string());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void consumoRestTemplate() {

		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = "https://homologacao.saude.dev.elotech.com.br/saude-api/api/profissional";

		ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl, String.class);
		System.out.println(response.getBody());

	}

}
