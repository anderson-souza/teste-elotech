package com.elotech;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TesteConsumoAPI {

	public static void main(String[] args) {
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

}
