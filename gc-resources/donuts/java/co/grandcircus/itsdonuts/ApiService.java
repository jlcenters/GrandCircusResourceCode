package co.grandcircus.itsdonuts;

import java.util.*;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import co.grandcircus.itsdonuts.entities.*;

@Component
public class ApiService {

	private RestTemplate rt;
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "ooeeee!");
			return execution.execute(request, body);
		};
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public DonutsResponse getDonuts() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
//		try {
//			System.out.println("Test in try loop");
//			url = URLEncoder.encode(url, "UTF-8");
//			System.out.println("Encoded");
//		} catch (UnsupportedEncodingException e) {
//			System.out.println("test in exception");
//			throw new RuntimeException(e);
//		}

		DonutsResponse response = rt.getForObject(url, DonutsResponse.class);
		//List<Donut> donuts = response.getResults();
		return response;
	}
}
