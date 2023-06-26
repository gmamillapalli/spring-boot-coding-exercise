package com.telstra.codechallenge.gitapi;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitApiController {
	private final GitApiService gitApiService;

	public GitApiController(GitApiService gitApiService) {
		this.gitApiService = gitApiService;
	}

	@GetMapping(path = "/gitrepos")
	public List<Repos> gitRepos() {
		return gitApiService.getGitRepos();
	}
}
