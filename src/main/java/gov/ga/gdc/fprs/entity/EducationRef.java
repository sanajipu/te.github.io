package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "education_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EducationRef {
	
	
	@Id
	@Column(name = "educ_code")
	private Integer educCode;
	
	@Column(name = "educ_desc")
	private String educDesc;
	
	@Column(name = "is_obsolete")
	private String isObsolete;

	public Integer getEducCode() {
		return educCode;
	}

	public void setEducCode(Integer educCode) {
		this.educCode = educCode;
	}

	public String getEducDesc() {
		return educDesc;
	}

	public void setEducDesc(String educDesc) {
		this.educDesc = educDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}
	
	
}
