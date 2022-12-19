package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "hair_color_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HairColorRef {

	@Id
	@Column(name = "hair_code")
	private Integer hairCode;

	@Column(name = "hair_desc")
	private String hairDesc;


	@Column(name = "gcic_mapping_cd")
	private String gcicMappingCd;



	public Integer getHairCode() {
		return hairCode;
	}


	public void setHairCode(Integer hairCode) {
		this.hairCode = hairCode;
	}


	public String getHairDesc() {
		return hairDesc;
	}


	public void setHairDesc(String hairDesc) {
		this.hairDesc = hairDesc;
	}


	public String getGcicMappingCd() {
		return gcicMappingCd;
	}


	public void setGcicMappingCd(String gcicMappingCd) {
		this.gcicMappingCd = gcicMappingCd;
	}
	
	
	
}