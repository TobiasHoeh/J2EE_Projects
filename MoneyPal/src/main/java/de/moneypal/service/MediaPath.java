package de.moneypal.service;

import de.moneypal.model.MediaType;

public class MediaPath {

	private final String url;
	private final boolean cached;
	private final MediaType mediaType;

	public MediaPath(String url, boolean cached, MediaType mediaType) {
		this.url = url;
		this.cached = cached;
		this.mediaType = mediaType;
	}

	public String getUrl() {
		return url;
	}

	public boolean isCached() {
		return cached;
	}

	public MediaType getMediaType() {
		return mediaType;
	}

}