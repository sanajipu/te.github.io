package gov.ga.gdc.fprs.service;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.ga.gdc.fprs.dto.AlienClassRef;
import gov.ga.gdc.fprs.dto.OffenderAliasesHistory;
import gov.ga.gdc.fprs.dto.OffenderDemographics;
import gov.ga.gdc.fprs.dto.OffenderParoleData;
import gov.ga.gdc.fprs.dto.OffenderUpdateRefData;
import gov.ga.gdc.fprs.repository.AlienClassRefRepository;
import gov.ga.gdc.fprs.repository.AlienStatusRefRepository;
import gov.ga.gdc.fprs.repository.CountryRefRepository;
import gov.ga.gdc.fprs.repository.DeathReasonRefRepository;
import gov.ga.gdc.fprs.repository.EducationRefRepository;
import gov.ga.gdc.fprs.repository.EyeColorRefRepository;
import gov.ga.gdc.fprs.repository.GngSpecificThreatGroupRefRepository;
import gov.ga.gdc.fprs.repository.HairColorRefRepository;
import gov.ga.gdc.fprs.repository.LanguageRefRepository;
import gov.ga.gdc.fprs.repository.MaritalStatusRefRepository;
import gov.ga.gdc.fprs.repository.MilitaryBranchRefRepository;
import gov.ga.gdc.fprs.repository.OffenderAliasDobRepository;
import gov.ga.gdc.fprs.repository.OffenderAliasFbiRepository;
import gov.ga.gdc.fprs.repository.OffenderAliasNamesRepository;
import gov.ga.gdc.fprs.repository.OffenderAliasSidRepository;
import gov.ga.gdc.fprs.repository.OffenderAliasSsnRepository;
import gov.ga.gdc.fprs.repository.OffenderDemographicsRepository;
import gov.ga.gdc.fprs.repository.OffenderEmploymentStatusRefRepository;
import gov.ga.gdc.fprs.repository.RaceRefRepository;
import gov.ga.gdc.fprs.repository.ReligionRefRepository;
import gov.ga.gdc.fprs.repository.ScribeRefRepository;
import gov.ga.gdc.fprs.repository.SexRefRepository;
import gov.ga.gdc.fprs.repository.SkinToneRefRepository;
import gov.ga.gdc.fprs.repository.StateRefRepository;

@Service
public class FprsServiceImpl implements FprsService{

	@Autowired
	OffenderAliasDobRepository offenderAliasDobRepository;
	
	@Autowired
	OffenderAliasFbiRepository offenderAliasFbiRepository;
	
	@Autowired
	OffenderAliasSidRepository offenderAliasSidRepository;
	
	@Autowired
	OffenderAliasSsnRepository offenderAliasSsnRepository;
	
	@Autowired
	OffenderAliasNamesRepository offenderAliasNamesRepository;
	
	@Autowired
	OffenderDemographicsRepository offenderDemographicsRepository;
	
	@Autowired
	StateRefRepository stateRefRepository;
	
	@Autowired
	SkinToneRefRepository skinToneRefRepository;
	
	@Autowired
	SexRefRepository sexRefRepository;
	
	@Autowired
	ScribeRefRepository scribeRefRepository;
	
	@Autowired
	ReligionRefRepository religionRefRepository;
	
	@Autowired
	RaceRefRepository raceRefRepository;
	
	@Autowired
	OffenderEmploymentStatusRefRepository offenderEmploymentStatusRefRepository;
	
	@Autowired
	MilitaryBranchRefRepository militaryBranchRefRepository;
	
	@Autowired
	MaritalStatusRefRepository maritalStatusRefRepository;
	
	@Autowired
	LanguageRefRepository languageRefRepository;
	
	@Autowired
	HairColorRefRepository hairColorRefRepository;
	
	@Autowired
	GngSpecificThreatGroupRefRepository gngSpecificThreatGroupRefRepository;
	
	@Autowired
	EyeColorRefRepository eyeColorRefRepository;
	
	@Autowired
	EducationRefRepository educationRefRepository;
	
	@Autowired
	DeathReasonRefRepository deathReasonRefRepository;
	
	@Autowired
	CountryRefRepository countryRefRepository;
	
	@Autowired
	AlienStatusRefRepository alienStatusRefRepository; 
	
	@Autowired
	AlienClassRefRepository alienClassRefRepository;
	
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	public OffenderAliasesHistory getOffenderAliasesHistory(String unoNo) {
		
		OffenderAliasesHistory oaHistory = new OffenderAliasesHistory();

		oaHistory.setOffenderAliasDobList(offenderAliasDobRepository.findByUno(unoNo));
		oaHistory.setOffenderAliasFbiList(offenderAliasFbiRepository.findByUno(unoNo));
		oaHistory.setOffenderAliasSsnList(offenderAliasSsnRepository.findByUno(unoNo));
		oaHistory.setOffenderAliasSidList(offenderAliasSidRepository.findByUno(unoNo));
		oaHistory.setOffenderAliasNamesList(offenderAliasNamesRepository.findByUno(unoNo));
		

		
		return oaHistory;
		
	}
	
	public List<OffenderParoleData> getOffenderParoleData(String unoNo){
		
		List<OffenderParoleData> list =  new ArrayList<OffenderParoleData>(offenderAliasDobRepository.getOffenderParoleData(unoNo));
		
		return list;
		
	}
	
	public OffenderDemographics getOffenderInfo(String unoNo) {
		
		OffenderDemographics dtooff = new OffenderDemographics();
		
		gov.ga.gdc.fprs.entity.OffenderDemographics entityoff= offenderDemographicsRepository.findByUno(unoNo);
		
		OffenderDemographics postResponse = modelMapper.map(entityoff, OffenderDemographics.class);

		
		return postResponse;
		
		
		
	}
	
	
	public OffenderUpdateRefData getOffenderUpdateRefData() {
		
		OffenderUpdateRefData offenderUpdateRefData = new OffenderUpdateRefData();
		
		offenderUpdateRefData.setCountryRefList(countryRefRepository.findAll());
		offenderUpdateRefData.setAlienClassRefList(alienClassRefRepository.findAll());
		offenderUpdateRefData.setAlienStatusRefList(alienStatusRefRepository.findAll());
		offenderUpdateRefData.setDeathReasonRefList(deathReasonRefRepository.findAll());
		offenderUpdateRefData.setEducationRefList(educationRefRepository.findAll());
		offenderUpdateRefData.setEyeColorRefList(eyeColorRefRepository.findAll());
		offenderUpdateRefData.setGngSpecificThreatGroupRefList(gngSpecificThreatGroupRefRepository.findAll());
		offenderUpdateRefData.setHairColorRefList(hairColorRefRepository.findAll());
		offenderUpdateRefData.setMaritalStatusRefList(maritalStatusRefRepository.findAll());
		offenderUpdateRefData.setLanguageRefList(languageRefRepository.findAll());
		offenderUpdateRefData.setMilitaryBranchRefList(militaryBranchRefRepository.findAll());
		offenderUpdateRefData.setOffenderEmploymentStatusRefList(offenderEmploymentStatusRefRepository.findAll());
		offenderUpdateRefData.setRaceRefList(raceRefRepository.findAll());
		offenderUpdateRefData.setReligionRefList(religionRefRepository.findAll());
		offenderUpdateRefData.setScribeRefList(scribeRefRepository.findAll());
		offenderUpdateRefData.setSexRefList(sexRefRepository.findAll());
		offenderUpdateRefData.setSkinToneRefList(skinToneRefRepository.findAll());
		offenderUpdateRefData.setStateRefList(stateRefRepository.findAll());

		
		
		return offenderUpdateRefData;
		
	}
}
