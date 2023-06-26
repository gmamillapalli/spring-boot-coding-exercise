package com.telstra.codechallenge.gitapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class GitApiResponse {
	private List<Repos> items;
}
