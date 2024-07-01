package com.example.demo_oracle;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

	@Id
	@Column(name = "COUNTRY_ID", length = 2, nullable = false)
	private String countryId;

	@Column(name = "COUNTRY_NAME", length = 40, nullable = true)
	private String countryName;

	@Column(name = "REGION_ID", nullable = true)
	private Long regionId;

	// Getters and setters

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}
}
