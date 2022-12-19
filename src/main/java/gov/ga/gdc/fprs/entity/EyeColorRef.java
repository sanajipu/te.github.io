package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "eye_color_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EyeColorRef {

	@Id
	@Column(name = "eye_code")
	private Integer eyeCode;

	@Column(name = "eye_desc")
	private String eyeDesc;


	@Column(name = "gcic_mapping_cd")
	private String gcicMappingCd;


	public Integer getEyeCode() {
		return eyeCode;
	}


	public void setEyeCode(Integer eyeCode) {
		this.eyeCode = eyeCode;
	}


	public String getEyeDesc() {
		return eyeDesc;
	}


	public void setEyeDesc(String eyeDesc) {
		this.eyeDesc = eyeDesc;
	}


	public String getGcicMappingCd() {
		return gcicMappingCd;
	}


	public void setGcicMappingCd(String gcicMappingCd) {
		this.gcicMappingCd = gcicMappingCd;
	}
	
	
	
}
