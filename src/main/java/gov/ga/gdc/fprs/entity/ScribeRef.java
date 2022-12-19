package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "scribe_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScribeRef {
	
	@Id
	@Column(name = "scribe_code")
	private String scribeCode;
	
	@Column(name = "scribe_desc")
	private String scribeDesc;

	public String getScribeCode() {
		return scribeCode;
	}

	public void setScribeCode(String scribeCode) {
		this.scribeCode = scribeCode;
	}

	public String getScribeDesc() {
		return scribeDesc;
	}

	public void setScribeDesc(String scribeDesc) {
		this.scribeDesc = scribeDesc;
	}
	
	
	
}
