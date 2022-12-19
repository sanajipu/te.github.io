package gov.ga.gdc.fprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "language_ref")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LanguageRef {
	
	
	@Id
	@Column(name = "language_cd")
	private String languageCd;
	
	@Column(name = "language_desc")
	private String languageDesc;
	
	@Column(name = "is_obsolete")
	private String isObsolete;

	public String getLanguageCd() {
		return languageCd;
	}

	public void setLanguageCd(String languageCd) {
		this.languageCd = languageCd;
	}

	public String getLanguageDesc() {
		return languageDesc;
	}

	public void setLanguageDesc(String languageDesc) {
		this.languageDesc = languageDesc;
	}

	public String getIsObsolete() {
		return isObsolete;
	}

	public void setIsObsolete(String isObsolete) {
		this.isObsolete = isObsolete;
	}
	
	

}
