package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "STATE_REF")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StateRef {
	
	@Id
	@Column(name = "state_code")
	private String stateCode;
	
	@Column(name = "state_desc")
	private String stateDescription;
	
	
	@Column(name = "gcic_mapping_cd")
	private String gcicMappingCd;


	public String getStateCode() {
		return stateCode;
	}


	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}


	public String getStateDescription() {
		return stateDescription;
	}


	public void setStateDescription(String stateDescription) {
		this.stateDescription = stateDescription;
	}


	public String getGcicMappingCd() {
		return gcicMappingCd;
	}


	public void setGcicMappingCd(String gcicMappingCd) {
		this.gcicMappingCd = gcicMappingCd;
	}
	
	

}