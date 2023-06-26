package com.telstra.codechallenge.gitapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Repos {
	private String html_url;
	private String watchers_count;
	private String language;
	private String description;
	private String name;
}
