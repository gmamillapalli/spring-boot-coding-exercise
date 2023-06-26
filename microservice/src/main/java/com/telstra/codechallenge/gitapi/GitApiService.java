package com.telstra.codechallenge.gitapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitApiService {
	@Value("${github.base.url}")
	private String gitBaseUrl;

	private final RestTemplate restTemplate;

	public GitApiService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public List<Repos> getGitRepos() {
		GitApiResponse gitApiResponse = restTemplate.getForObject(gitBaseUrl + "/search/repositories?q=2023-06-16&sort=stars&order=desc", GitApiResponse.class);
		List<Repos> list = null;
		if (gitApiResponse != null) {
			list = gitApiResponse.getItems();
		}

		return list;
	}
}
