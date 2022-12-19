package gov.ga.gdc.fprs.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class OffenderDemographics {
	
	private String uno;
	private String lastName;
	
	private String firstName;
	
	private String middleName;
	
	private String title;
	
	private Date birthDate;
	
	private String ssn;
	
	private String fbi;
	
	private String driverLicenseNo;
	
	private Boolean heightInFeet;
	
	private Byte heightInInches;
	
	private Short weight;
	
	private Byte eyeColorCode;
	
	private Byte hairColorCode;
	
	private String residenceCountyCode;
	
	private String streetAddressI;
	
	private String streetAddressIi;
	
	private String city;
	
	private String stateCode;
	
	private Integer zip;
	
	private String directions;
	
	private Long homePhone;
	
	private Long workPhone;
	
	private Character maritalStatusCode;
	
	private Byte educationLevel;
	
	private Byte dependents;
	
	private String lastSchoolAttended;
	
	private String locationOfLastSchool;
	
	private String primaryLanguage;
	
	private String secondaryLanguage;
	
	private String militaryBranch;
	
	private String militaryServiceDates;
	
	private String scarsMarksTattoos;
	
	private Character disabilityType1;
	
	private Character disabilityType2;
	
	private Character disabilityType3;
	
	private Character disabilityType4;
	
	private String disabilityLimitations;
	
	private Date modifiedDate;
	
	private Date enteredDt;
	
	private String enteredBy;
	
	private String sid;
	
	private String offenderStatus;
	
	private Byte currSupervisionLevelCd;
	
	private String scribeCode;
	
	private String efPdNumber;
	
	private Short specificThreatGroupCd;
	
	private Byte mentalHlthlvlOld;
	
	private Byte typePopulation;
	
	private Byte employabilityStatusCd;
	
	private Short addressChangeReasonCd;
	
	private String internationalAddressLine1;
	
	private String internationalAddressLine2;
	
	private String internationalAddressLine3;
	
	private String internationalAddressLine4;
	
	private String sealedFlag;
	
	private String sealedBy;
	
	private Date sealedDt;
	
	private Date currSupvLevelDt;
	
	private Short religionCd;
	
	private String birthCity;
	
	private String birthCountryCd;
	
	private String birthStateCd;
	
	private String citizenshipCd;
	
	private String ssnCardInFile;
	
	private String cdlInFile;
	
	private String birthCertificateInFile;
	
	private String cleanAddressValidatedFlag;
	
	private String saveToHistoryFlag;
	
	private Date createdDate;
	
	private String createdUser;
	
	private Long recordVer;
	
	private String alienName;
	
	private String alienInsNumber;
	
	private Byte alienClassCd;
	
	private Byte alienStatusCd;
	
	private Date alienStatusVerificationDt;
	
	private String insNotifiedByParoleFlag;
	
	private Byte militaryBranchCd;
	
	private Long otn;
	
	private String recidivistFlag;
	
	private Date inmateStatusDt;
	
	private String inmateStatusEntered_by;
	
	private Byte deathReasonCd;
	
	private Date deathDt;
	
	private String everAnInmateFlag;
	
	private Byte skinToneCd;
	
	private BigDecimal latitude;
	
	private BigDecimal longitude;
	
	private String errorMsg;
	
	private Short offenderPin;
	
	private Short currSupervisionTypeCd;
	
	private Byte addressChangeTypeCd;
	
	private Long mobilePhone;
	
	private Long upi;
	
	private String motherMaidenName;
	
	private String fatherName;

	public String getUno() {
		return uno;
	}

	public void setUno(String uno) {
		this.uno = uno;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFbi() {
		return fbi;
	}

	public void setFbi(String fbi) {
		this.fbi = fbi;
	}

	public String getDriverLicenseNo() {
		return driverLicenseNo;
	}

	public void setDriverLicenseNo(String driverLicenseNo) {
		this.driverLicenseNo = driverLicenseNo;
	}

	public Boolean getHeightInFeet() {
		return heightInFeet;
	}

	public void setHeightInFeet(Boolean heightInFeet) {
		this.heightInFeet = heightInFeet;
	}

	public Byte getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(Byte heightInInches) {
		this.heightInInches = heightInInches;
	}

	public Short getWeight() {
		return weight;
	}

	public void setWeight(Short weight) {
		this.weight = weight;
	}

	public Byte getEyeColorCode() {
		return eyeColorCode;
	}

	public void setEyeColorCode(Byte eyeColorCode) {
		this.eyeColorCode = eyeColorCode;
	}

	public Byte getHairColorCode() {
		return hairColorCode;
	}

	public void setHairColorCode(Byte hairColorCode) {
		this.hairColorCode = hairColorCode;
	}

	public String getResidenceCountyCode() {
		return residenceCountyCode;
	}

	public void setResidenceCountyCode(String residenceCountyCode) {
		this.residenceCountyCode = residenceCountyCode;
	}

	public String getStreetAddressI() {
		return streetAddressI;
	}

	public void setStreetAddressI(String streetAddressI) {
		this.streetAddressI = streetAddressI;
	}

	public String getStreetAddressIi() {
		return streetAddressIi;
	}

	public void setStreetAddressIi(String streetAddressIi) {
		this.streetAddressIi = streetAddressIi;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public Long getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(Long homePhone) {
		this.homePhone = homePhone;
	}

	public Long getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(Long workPhone) {
		this.workPhone = workPhone;
	}

	public Character getMaritalStatusCode() {
		return maritalStatusCode;
	}

	public void setMaritalStatusCode(Character maritalStatusCode) {
		this.maritalStatusCode = maritalStatusCode;
	}

	public Byte getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(Byte educationLevel) {
		this.educationLevel = educationLevel;
	}

	public Byte getDependents() {
		return dependents;
	}

	public void setDependents(Byte dependents) {
		this.dependents = dependents;
	}

	public String getLastSchoolAttended() {
		return lastSchoolAttended;
	}

	public void setLastSchoolAttended(String lastSchoolAttended) {
		this.lastSchoolAttended = lastSchoolAttended;
	}

	public String getLocationOfLastSchool() {
		return locationOfLastSchool;
	}

	public void setLocationOfLastSchool(String locationOfLastSchool) {
		this.locationOfLastSchool = locationOfLastSchool;
	}

	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	public String getSecondaryLanguage() {
		return secondaryLanguage;
	}

	public void setSecondaryLanguage(String secondaryLanguage) {
		this.secondaryLanguage = secondaryLanguage;
	}

	public String getMilitaryBranch() {
		return militaryBranch;
	}

	public void setMilitaryBranch(String militaryBranch) {
		this.militaryBranch = militaryBranch;
	}

	public String getMilitaryServiceDates() {
		return militaryServiceDates;
	}

	public void setMilitaryServiceDates(String militaryServiceDates) {
		this.militaryServiceDates = militaryServiceDates;
	}

	public String getScarsMarksTattoos() {
		return scarsMarksTattoos;
	}

	public void setScarsMarksTattoos(String scarsMarksTattoos) {
		this.scarsMarksTattoos = scarsMarksTattoos;
	}

	public Character getDisabilityType1() {
		return disabilityType1;
	}

	public void setDisabilityType1(Character disabilityType1) {
		this.disabilityType1 = disabilityType1;
	}

	public Character getDisabilityType2() {
		return disabilityType2;
	}

	public void setDisabilityType2(Character disabilityType2) {
		this.disabilityType2 = disabilityType2;
	}

	public Character getDisabilityType3() {
		return disabilityType3;
	}

	public void setDisabilityType3(Character disabilityType3) {
		this.disabilityType3 = disabilityType3;
	}

	public Character getDisabilityType4() {
		return disabilityType4;
	}

	public void setDisabilityType4(Character disabilityType4) {
		this.disabilityType4 = disabilityType4;
	}

	public String getDisabilityLimitations() {
		return disabilityLimitations;
	}

	public void setDisabilityLimitations(String disabilityLimitations) {
		this.disabilityLimitations = disabilityLimitations;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Date getEnteredDt() {
		return enteredDt;
	}

	public void setEnteredDt(Date enteredDt) {
		this.enteredDt = enteredDt;
	}

	public String getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getOffenderStatus() {
		return offenderStatus;
	}

	public void setOffenderStatus(String offenderStatus) {
		this.offenderStatus = offenderStatus;
	}

	public Byte getCurrSupervisionLevelCd() {
		return currSupervisionLevelCd;
	}

	public void setCurrSupervisionLevelCd(Byte currSupervisionLevelCd) {
		this.currSupervisionLevelCd = currSupervisionLevelCd;
	}

	public String getScribeCode() {
		return scribeCode;
	}

	public void setScribeCode(String scribeCode) {
		this.scribeCode = scribeCode;
	}

	public String getEfPdNumber() {
		return efPdNumber;
	}

	public void setEfPdNumber(String efPdNumber) {
		this.efPdNumber = efPdNumber;
	}

	public Short getSpecificThreatGroupCd() {
		return specificThreatGroupCd;
	}

	public void setSpecificThreatGroupCd(Short specificThreatGroupCd) {
		this.specificThreatGroupCd = specificThreatGroupCd;
	}

	public Byte getMentalHlthlvlOld() {
		return mentalHlthlvlOld;
	}

	public void setMentalHlthlvlOld(Byte mentalHlthlvlOld) {
		this.mentalHlthlvlOld = mentalHlthlvlOld;
	}

	public Byte getTypePopulation() {
		return typePopulation;
	}

	public void setTypePopulation(Byte typePopulation) {
		this.typePopulation = typePopulation;
	}

	public Byte getEmployabilityStatusCd() {
		return employabilityStatusCd;
	}

	public void setEmployabilityStatusCd(Byte employabilityStatusCd) {
		this.employabilityStatusCd = employabilityStatusCd;
	}

	public Short getAddressChangeReasonCd() {
		return addressChangeReasonCd;
	}

	public void setAddressChangeReasonCd(Short addressChangeReasonCd) {
		this.addressChangeReasonCd = addressChangeReasonCd;
	}

	public String getInternationalAddressLine1() {
		return internationalAddressLine1;
	}

	public void setInternationalAddressLine1(String internationalAddressLine1) {
		this.internationalAddressLine1 = internationalAddressLine1;
	}

	public String getInternationalAddressLine2() {
		return internationalAddressLine2;
	}

	public void setInternationalAddressLine2(String internationalAddressLine2) {
		this.internationalAddressLine2 = internationalAddressLine2;
	}

	public String getInternationalAddressLine3() {
		return internationalAddressLine3;
	}

	public void setInternationalAddressLine3(String internationalAddressLine3) {
		this.internationalAddressLine3 = internationalAddressLine3;
	}

	public String getInternationalAddressLine4() {
		return internationalAddressLine4;
	}

	public void setInternationalAddressLine4(String internationalAddressLine4) {
		this.internationalAddressLine4 = internationalAddressLine4;
	}

	public String getSealedFlag() {
		return sealedFlag;
	}

	public void setSealedFlag(String sealedFlag) {
		this.sealedFlag = sealedFlag;
	}

	public String getSealedBy() {
		return sealedBy;
	}

	public void setSealedBy(String sealedBy) {
		this.sealedBy = sealedBy;
	}

	public Date getSealedDt() {
		return sealedDt;
	}

	public void setSealedDt(Date sealedDt) {
		this.sealedDt = sealedDt;
	}

	public Date getCurrSupvLevelDt() {
		return currSupvLevelDt;
	}

	public void setCurrSupvLevelDt(Date currSupvLevelDt) {
		this.currSupvLevelDt = currSupvLevelDt;
	}

	public Short getReligionCd() {
		return religionCd;
	}

	public void setReligionCd(Short religionCd) {
		this.religionCd = religionCd;
	}

	public String getBirthCity() {
		return birthCity;
	}

	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	public String getBirthCountryCd() {
		return birthCountryCd;
	}

	public void setBirthCountryCd(String birthCountryCd) {
		this.birthCountryCd = birthCountryCd;
	}

	public String getBirthStateCd() {
		return birthStateCd;
	}

	public void setBirthStateCd(String birthStateCd) {
		this.birthStateCd = birthStateCd;
	}

	public String getCitizenshipCd() {
		return citizenshipCd;
	}

	public void setCitizenshipCd(String citizenshipCd) {
		this.citizenshipCd = citizenshipCd;
	}

	public String getSsnCardInFile() {
		return ssnCardInFile;
	}

	public void setSsnCardInFile(String ssnCardInFile) {
		this.ssnCardInFile = ssnCardInFile;
	}

	public String getCdlInFile() {
		return cdlInFile;
	}

	public void setCdlInFile(String cdlInFile) {
		this.cdlInFile = cdlInFile;
	}

	public String getBirthCertificateInFile() {
		return birthCertificateInFile;
	}

	public void setBirthCertificateInFile(String birthCertificateInFile) {
		this.birthCertificateInFile = birthCertificateInFile;
	}

	public String getCleanAddressValidatedFlag() {
		return cleanAddressValidatedFlag;
	}

	public void setCleanAddressValidatedFlag(String cleanAddressValidatedFlag) {
		this.cleanAddressValidatedFlag = cleanAddressValidatedFlag;
	}

	public String getSaveToHistoryFlag() {
		return saveToHistoryFlag;
	}

	public void setSaveToHistoryFlag(String saveToHistoryFlag) {
		this.saveToHistoryFlag = saveToHistoryFlag;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Long getRecordVer() {
		return recordVer;
	}

	public void setRecordVer(Long recordVer) {
		this.recordVer = recordVer;
	}

	public String getAlienName() {
		return alienName;
	}

	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}

	public String getAlienInsNumber() {
		return alienInsNumber;
	}

	public void setAlienInsNumber(String alienInsNumber) {
		this.alienInsNumber = alienInsNumber;
	}

	public Byte getAlienClassCd() {
		return alienClassCd;
	}

	public void setAlienClassCd(Byte alienClassCd) {
		this.alienClassCd = alienClassCd;
	}

	public Byte getAlienStatusCd() {
		return alienStatusCd;
	}

	public void setAlienStatusCd(Byte alienStatusCd) {
		this.alienStatusCd = alienStatusCd;
	}

	public Date getAlienStatusVerificationDt() {
		return alienStatusVerificationDt;
	}

	public void setAlienStatusVerificationDt(Date alienStatusVerificationDt) {
		this.alienStatusVerificationDt = alienStatusVerificationDt;
	}

	public String getInsNotifiedByParoleFlag() {
		return insNotifiedByParoleFlag;
	}

	public void setInsNotifiedByParoleFlag(String insNotifiedByParoleFlag) {
		this.insNotifiedByParoleFlag = insNotifiedByParoleFlag;
	}

	public Byte getMilitaryBranchCd() {
		return militaryBranchCd;
	}

	public void setMilitaryBranchCd(Byte militaryBranchCd) {
		this.militaryBranchCd = militaryBranchCd;
	}

	public Long getOtn() {
		return otn;
	}

	public void setOtn(Long otn) {
		this.otn = otn;
	}

	public String getRecidivistFlag() {
		return recidivistFlag;
	}

	public void setRecidivistFlag(String recidivistFlag) {
		this.recidivistFlag = recidivistFlag;
	}

	public Date getInmateStatusDt() {
		return inmateStatusDt;
	}

	public void setInmateStatusDt(Date inmateStatusDt) {
		this.inmateStatusDt = inmateStatusDt;
	}

	public String getInmateStatusEntered_by() {
		return inmateStatusEntered_by;
	}

	public void setInmateStatusEntered_by(String inmateStatusEntered_by) {
		this.inmateStatusEntered_by = inmateStatusEntered_by;
	}

	public Byte getDeathReasonCd() {
		return deathReasonCd;
	}

	public void setDeathReasonCd(Byte deathReasonCd) {
		this.deathReasonCd = deathReasonCd;
	}

	public Date getDeathDt() {
		return deathDt;
	}

	public void setDeathDt(Date deathDt) {
		this.deathDt = deathDt;
	}

	public String getEverAnInmateFlag() {
		return everAnInmateFlag;
	}

	public void setEverAnInmateFlag(String everAnInmateFlag) {
		this.everAnInmateFlag = everAnInmateFlag;
	}

	public Byte getSkinToneCd() {
		return skinToneCd;
	}

	public void setSkinToneCd(Byte skinToneCd) {
		this.skinToneCd = skinToneCd;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Short getOffenderPin() {
		return offenderPin;
	}

	public void setOffenderPin(Short offenderPin) {
		this.offenderPin = offenderPin;
	}

	public Short getCurrSupervisionTypeCd() {
		return currSupervisionTypeCd;
	}

	public void setCurrSupervisionTypeCd(Short currSupervisionTypeCd) {
		this.currSupervisionTypeCd = currSupervisionTypeCd;
	}

	public Byte getAddressChangeTypeCd() {
		return addressChangeTypeCd;
	}

	public void setAddressChangeTypeCd(Byte addressChangeTypeCd) {
		this.addressChangeTypeCd = addressChangeTypeCd;
	}

	public Long getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(Long mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Long getUpi() {
		return upi;
	}

	public void setUpi(Long upi) {
		this.upi = upi;
	}

	public String getMotherMaidenName() {
		return motherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	
	
}

