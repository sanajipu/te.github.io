package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "country_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryRef {
	
	
	@Id
	@Column(name = "country_cd")
	private String countryCd;
	
	@Column(name = "country_desc")
	private String countryDesc;
	
	@Column(name = "is_obsolete")
	private String isObsolete;
	
	@Column(name= "gcic_mapping_cd")
	private String gcicMappingCd;

	public String getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public String getCountryDesc() {
		return countryDesc;
	}

	public void setCountryDesc(String countryDesc) {
		this.countryDesc = countryDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}

	public String getGcicMappingCd() {
		return gcicMappingCd;
	}

	public void setGcicMappingCd(String gcicMappingCd) {
		this.gcicMappingCd = gcicMappingCd;
	}
	
	
	
}


