package de.retest.web;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes {

	private final List<String> attributes;
	private final List<String> identifyingAttributes;

	@JsonCreator
	public Attributes( @JsonProperty( "attributes" ) final List<String> attributes,
			@JsonProperty( "identifyingAttributes" ) final List<String> identifyingAttributes ) {
		this.attributes = attributes;
		this.identifyingAttributes = identifyingAttributes;
	}

	public List<String> getAttributes() {
		return attributes;
	}

	public List<String> getIdentifyingAttributes() {
		return identifyingAttributes;
	}

}