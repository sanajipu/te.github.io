package gov.ga.gdc.fprs.service;

import java.util.List;

import gov.ga.gdc.fprs.dto.OffenderAliasesHistory;
import gov.ga.gdc.fprs.dto.OffenderDemographics;
import gov.ga.gdc.fprs.dto.OffenderParoleData;
import gov.ga.gdc.fprs.dto.OffenderUpdateRefData;

public interface FprsService {
	
	public OffenderAliasesHistory getOffenderAliasesHistory(String unoNo);
	
	public List<OffenderParoleData> getOffenderParoleData(String unoNo);
	
	public OffenderDemographics getOffenderInfo(String unoNo);
	
	public OffenderUpdateRefData getOffenderUpdateRefData();
	
}
