package gov.ga.gdc.fprs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gov.ga.gdc.fprs.dto.OffenderAliasesHistory;
import gov.ga.gdc.fprs.dto.OffenderDemographics;
import gov.ga.gdc.fprs.dto.OffenderParoleData;
import gov.ga.gdc.fprs.dto.OffenderUpdateRefData;
import gov.ga.gdc.fprs.service.FprsService;

@RestController
@RequestMapping("/fp/api/v1/")
//@AllArgsConstructor
public class FprsApiController {
	
	@Autowired
	private FprsService fprsservice;
	
	@RequestMapping(method = RequestMethod.GET, value = "/sayHello")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	
	@RequestMapping(value = "/offenderaliashistory", method = RequestMethod.GET)
	public ResponseEntity<OffenderAliasesHistory> getOffenderAliasesHistory(@RequestParam String uno) {
		 
		 //System.out.println("############### getCategories 111111111111111");
		 return new ResponseEntity<>(fprsservice.getOffenderAliasesHistory(uno), HttpStatus.OK);
	 }
	
	
	@RequestMapping(value = "/offenderparoledata", method = RequestMethod.GET)
	public ResponseEntity<List<OffenderParoleData>> getOffenderParoleData(@RequestParam String uno) {
		 
		 //System.out.println("############### getCategories 111111111111111");
		 return new ResponseEntity<>(fprsservice.getOffenderParoleData(uno), HttpStatus.OK);
	 }
	
	
	@RequestMapping(value = "/offenderinfo", method = RequestMethod.GET)
	public ResponseEntity<OffenderDemographics> getOffenderInfo(@RequestParam String uno) {
		 
		 //System.out.println("############### getCategories 111111111111111");
		 return new ResponseEntity<>(fprsservice.getOffenderInfo(uno), HttpStatus.OK);
	 }
	
	@RequestMapping(value = "/offenderupdaterefdata", method = RequestMethod.GET)
	public ResponseEntity<OffenderUpdateRefData> getOffenderUpdateRefData() {
		 
		 //System.out.println("############### getCategories 111111111111111");
		 return new ResponseEntity<>(fprsservice.getOffenderUpdateRefData(), HttpStatus.OK);
	 }

	
}
