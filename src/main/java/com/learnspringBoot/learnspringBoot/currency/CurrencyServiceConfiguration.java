package com.learnspringBoot.learnspringBoot.currency;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
	private String url;
	private String username;
	private String keys;

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getKeys() {
		return keys;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

}
