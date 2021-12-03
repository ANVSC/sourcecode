package org.rgjay.vo;

import java.util.List;

public class LabelBean
{
	private String  stateLgdCode                                              ;
	private String  stateTrnId												;		
	private String  patientName                                                ;
	private String  patientGender                                              ;
	private String  patientAge                                                 ;
	private String  patientBirthYear                                           ;
	private String  patientContact                                             ;
	private String  districtLgdCode                                           ;
	private String  patientAddress                                             ;
	private String  statusFlag                                            ;
	private String  patientBlock                                               ;
	private String  patientVillage                                             ;
	private String  patientBlockorULB                                          ;
	private String  patientCityortown                                          ;
	private String  memberType                                                 ;
	private String  pincode                                                     ;
	private String  dateOfRegistration                                        ;

	private String  admissionDate                                              ;
	
	private String  treatmentOrSurgeryDate                                     ;
	

	
	private String  surgeryStartTime                                          ;

	private String  surgeryEndTime                                            ;
	

	private String  deathDate                                                  ;
	
	
	private String  billAmount                                                 ;
	
	
	private String  billDate                                                   ;
	
	private String  totalClaimAmount                                          ;
	
	
	private String  insuranceApprovedAmount                                   ;
	
	
	private String  trustApprovedAmount                                       ;
	
	
	private String  penaltyAmount                                              ;
	private String  specialCase                                                ;
	private String  diagnosisSupportedEvidence                                 ;
	private String  casemanagementAtStandardtreatmentprotocols                ;
	private String  casemanagement               ;

	private String  evidenceOfTherapy ;
	private String  mandatoryReportsAttached                                  ;
	private String  doctorType                                                 ;
	private String  docRegnNo                                                 ;
	private String  docQualification                                           ;
	
	
	private String  docContact                                                 ;
	private String  anesthetistName                                            ;
	private String  anesthetistRegNo                                          ;
	
	private String  anesthetistContact                                         ;
	private String  anesthesiaType                                             ;
	private String  paramedicName                                              ;
	private String  nurseName                                                  ;
	private String  expectedHospStay                                          ;
	private String  incisionType                                               ;
	private String  opPhotosWebExTaken                                       ;
	private String  videoRecordingDone                                        ;
	private String  swabInstrumentsCount                                      ;
	private String  suturesLigatures                                           ;
	private String  specimenRemoved                                            ;
	private String  drainageCount                                              ;
	private String  bloodLoss                                                  ;
	private String  postOperativeInstructions                                 ;
	private String  patientCondition                                           ;
	private String  complicationsRemarks                                       ;
	private String  treatmentGiven                                             ;
	private String  operativeFindings                                          ;
	private String  postOperativePeriod                                       ;
	private String  postSurgeryTherapySpecialInvestigationsGiven           ;
	private String  postSurgeryTherapy           ;

	
	private String  dischargeStatus                                            ;
	private String  dischargeReview                                            ;
	private String  dischargeAdvice;
	private String  causeOfDeath                                              ;
	private String  admissionType                                              ;
	private String  proposedSurgeryOrTreatmentDate                            ;
	private String  treatingDoctorRemarks;//treatting doctorremarks for ap state
	private String  patientDiagnosedBy;
	private String  doctorName ;                                               
	private String  procedureConsent;                                  
	private String  medcoLegalCase;									
	

	
	

private String clinicalDate	;
private String height                      ;
private String weight                      ;
private String bmi                         ;
private String pallor                      ;
private String cyanosis                    ;
private String clubbingOfFingersAndToes  ;
private String lymphadenopathy             ;
private String oedemaInFeet              ;
private String malnutrition                ;
private String dehydration                 ;
private String bp77                        ;
private String pulseRate                  ;
private String temperature                 ;
private String wardType                   ;
private String respiratoryRate            ;
private String heartSounds                ;
private String lungs                       ;
private String fluidInput                 ;
private String fluidOutput                ;
private String opNo                       ;
private String ipNo                       ;
private String clinicalRemarks                     ;//clinicalremarks
private String pulseRatePerMinute        ;
private String respirationRate            ;
private String bpltArm                    ;
private String bprtArm                   ;
private String appetite                    ;
private String diet                        ;
private String bowels                      ;
private String nutrition                   ;
private String knownAllergies             ;
private String habitsOrAddictions        ;
private String historyOfPastIllness      ;
private String familyHistory              ;
private String mainSymptomName           ;
private String subSymptomName            ;
private String symptomName                ;
private String investigationBlockName     ;
private String investigationName          ;
private String primaryDiagnosis           ;
private String category                    ;
private String procedure                   ;
private String treatingDoctor             ;
private String investigations              ;
private String inestigationDoctorName    ;
private String doctorDailyNotes            ;
private String bbf                         ;
private String bl                          ;
private String bd                          ;
private String mn                         ;
private String insulinDosage              ;
private String mainGroupName             ;
private String therapeuticMainGroupName;
private String pharmacologicalSubGrpName ;
private String chemicalSubGroupName      ;
private String chemicalSubstanceName     ;
private String routeType                  ;
private String routeName                  ;
private String strengthType               ;
private String strengthName               ;
private String dosagePerday               ;
private String medicationPeriod       ;


public String getClinicalDate() {
	return clinicalDate;
}


public void setClinicalDate(String clinicalDate) {
	this.clinicalDate = clinicalDate;
}



public String getHeight() {
	return height;
}
public void setHeight(String height) {
	this.height = height;
}
public String getWeight() {
	return weight;
}
public void setWeight(String weight) {
	this.weight = weight;
}
public String getBmi() {
	return bmi;
}
public void setBmi(String bmi) {
	this.bmi = bmi;
}
public String getPallor() {
	return pallor;
}
public void setPallor(String pallor) {
	this.pallor = pallor;
}
public String getCyanosis() {
	return cyanosis;
}
public void setCyanosis(String cyanosis) {
	this.cyanosis = cyanosis;
}
public String getClubbingOfFingersAndToes() {
	return clubbingOfFingersAndToes;
}
public void setClubbingOfFingersAndToes(String clubbingOfFingersAndToes) {
	this.clubbingOfFingersAndToes = clubbingOfFingersAndToes;
}
public String getLymphadenopathy() {
	return lymphadenopathy;
}
public void setLymphadenopathy(String lymphadenopathy) {
	this.lymphadenopathy = lymphadenopathy;
}
public String getOedemaInFeet() {
	return oedemaInFeet;
}
public void setOedemaInFeet(String oedemaInFeet) {
	this.oedemaInFeet = oedemaInFeet;
}
public String getMalnutrition() {
	return malnutrition;
}
public void setMalnutrition(String malnutrition) {
	this.malnutrition = malnutrition;
}
public String getDehydration() {
	return dehydration;
}
public void setDehydration(String dehydration) {
	this.dehydration = dehydration;
}
public String getBp77() {
	return bp77;
}
public void setBp77(String bp77) {
	this.bp77 = bp77;
}
public String getPulseRate() {
	return pulseRate;
}
public void setPulseRate(String pulseRate) {
	this.pulseRate = pulseRate;
}
public String getTemperature() {
	return temperature;
}
public void setTemperature(String temperature) {
	this.temperature = temperature;
}
public String getWardType() {
	return wardType;
}
public void setWardType(String wardType) {
	this.wardType = wardType;
}
public String getRespiratoryRate() {
	return respiratoryRate;
}
public void setRespiratoryRate(String respiratoryRate) {
	this.respiratoryRate = respiratoryRate;
}
public String getHeartSounds() {
	return heartSounds;
}
public void setHeartSounds(String heartSounds) {
	this.heartSounds = heartSounds;
}
public String getLungs() {
	return lungs;
}
public void setLungs(String lungs) {
	this.lungs = lungs;
}
public String getFluidInput() {
	return fluidInput;
}
public void setFluidInput(String fluidInput) {
	this.fluidInput = fluidInput;
}
public String getFluidOutput() {
	return fluidOutput;
}
public void setFluidOutput(String fluidOutput) {
	this.fluidOutput = fluidOutput;
}
public String getOpNo() {
	return opNo;
}
public void setOpNo(String opNo) {
	this.opNo = opNo;
}
public String getIpNo() {
	return ipNo;
}
public void setIpNo(String ipNo) {
	this.ipNo = ipNo;
}

public String getClinicalRemarks() {
	return clinicalRemarks;
}
public void setClinicalRemarks(String clinicalRemarks) {
	this.clinicalRemarks = clinicalRemarks;
}
public String getPulseRatePerMinute() {
	return pulseRatePerMinute;
}
public void setPulseRatePerMinute(String pulseRatePerMinute) {
	this.pulseRatePerMinute = pulseRatePerMinute;
}
public String getRespirationRate() {
	return respirationRate;
}
public void setRespirationRate(String respirationRate) {
	this.respirationRate = respirationRate;
}

public String getBpltArm() {
	return bpltArm;
}
public void setBpltArm(String bpltArm) {
	this.bpltArm = bpltArm;
}
public String getBprtArm() {
	return bprtArm;
}
public void setBprtArm(String bprtArm) {
	this.bprtArm = bprtArm;
}
public String getAppetite() {
	return appetite;
}
public void setAppetite(String appetite) {
	this.appetite = appetite;
}
public String getDiet() {
	return diet;
}
public void setDiet(String diet) {
	this.diet = diet;
}
public String getBowels() {
	return bowels;
}
public void setBowels(String bowels) {
	this.bowels = bowels;
}
public String getNutrition() {
	return nutrition;
}
public void setNutrition(String nutrition) {
	this.nutrition = nutrition;
}
public String getKnownAllergies() {
	return knownAllergies;
}
public void setKnownAllergies(String knownAllergies) {
	this.knownAllergies = knownAllergies;
}
public String getHabitsOrAddictions() {
	return habitsOrAddictions;
}
public void setHabitsOrAddictions(String habitsOrAddictions) {
	this.habitsOrAddictions = habitsOrAddictions;
}
public String getHistoryOfPastIllness() {
	return historyOfPastIllness;
}
public void setHistoryOfPastIllness(String historyOfPastIllness) {
	this.historyOfPastIllness = historyOfPastIllness;
}
public String getFamilyHistory() {
	return familyHistory;
}
public void setFamilyHistory(String familyHistory) {
	this.familyHistory = familyHistory;
}
public String getMainSymptomName() {
	return mainSymptomName;
}
public void setMainSymptomName(String mainSymptomName) {
	this.mainSymptomName = mainSymptomName;
}
public String getSubSymptomName() {
	return subSymptomName;
}
public void setSubSymptomName(String subSymptomName) {
	this.subSymptomName = subSymptomName;
}
public String getSymptomName() {
	return symptomName;
}
public void setSymptomName(String symptomName) {
	this.symptomName = symptomName;
}
public String getInvestigationBlockName() {
	return investigationBlockName;
}
public void setInvestigationBlockName(String investigationBlockName) {
	this.investigationBlockName = investigationBlockName;
}
public String getInvestigationName() {
	return investigationName;
}
public void setInvestigationName(String investigationName) {
	this.investigationName = investigationName;
}
public String getPrimaryDiagnosis() {
	return primaryDiagnosis;
}
public void setPrimaryDiagnosis(String primaryDiagnosis) {
	this.primaryDiagnosis = primaryDiagnosis;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getProcedure() {
	return procedure;
}
public void setProcedure(String procedure) {
	this.procedure = procedure;
}
public String getTreatingDoctor() {
	return treatingDoctor;
}
public void setTreatingDoctor(String treatingDoctor) {
	this.treatingDoctor = treatingDoctor;
}
public String getInvestigations() {
	return investigations;
}
public void setInvestigations(String investigations) {
	this.investigations = investigations;
}
public String getInestigationDoctorName() {
	return inestigationDoctorName;
}
public void setInestigationDoctorName(String inestigationDoctorName) {
	this.inestigationDoctorName = inestigationDoctorName;
}

public String getDoctorDailyNotes() {
	return doctorDailyNotes;
}
public void setDoctorDailyNotes(String doctorDailyNotes) {
	this.doctorDailyNotes = doctorDailyNotes;
}
public String getBbf() {
	return bbf;
}
public void setBbf(String bbf) {
	this.bbf = bbf;
}
public String getBl() {
	return bl;
}
public void setBl(String bl) {
	this.bl = bl;
}
public String getBd() {
	return bd;
}
public void setBd(String bd) {
	this.bd = bd;
}
public String getMn() {
	return mn;
}
public void setMn(String mn) {
	this.mn = mn;
}
public String getInsulinDosage() {
	return insulinDosage;
}
public void setInsulinDosage(String insulinDosage) {
	this.insulinDosage = insulinDosage;
}
public String getMainGroupName() {
	return mainGroupName;
}
public void setMainGroupName(String mainGroupName) {
	this.mainGroupName = mainGroupName;
}
public String getTherapeuticMainGroupName() {
	return therapeuticMainGroupName;
}
public void setTherapeuticMainGroupName(String therapeuticMainGroupName) {
	this.therapeuticMainGroupName = therapeuticMainGroupName;
}
public String getPharmacologicalSubGrpName() {
	return pharmacologicalSubGrpName;
}
public void setPharmacologicalSubGrpName(String pharmacologicalSubGrpName) {
	this.pharmacologicalSubGrpName = pharmacologicalSubGrpName;
}
public String getChemicalSubGroupName() {
	return chemicalSubGroupName;
}
public void setChemicalSubGroupName(String chemicalSubGroupName) {
	this.chemicalSubGroupName = chemicalSubGroupName;
}
public String getChemicalSubstanceName() {
	return chemicalSubstanceName;
}
public void setChemicalSubstanceName(String chemicalSubstanceName) {
	this.chemicalSubstanceName = chemicalSubstanceName;
}
public String getRouteType() {
	return routeType;
}
public void setRouteType(String routeType) {
	this.routeType = routeType;
}
public String getRouteName() {
	return routeName;
}
public void setRouteName(String routeName) {
	this.routeName = routeName;
}
public String getStrengthType() {
	return strengthType;
}
public void setStrengthType(String strengthType) {
	this.strengthType = strengthType;
}
public String getStrengthName() {
	return strengthName;
}
public void setStrengthName(String strengthName) {
	this.strengthName = strengthName;
}
public String getDosagePerday() {
	return dosagePerday;
}
public void setDosagePerday(String dosagePerday) {
	this.dosagePerday = dosagePerday;
}
public String getMedicationPeriod() {
	return medicationPeriod;
}
public void setMedicationPeriod(String medicationPeriod) {
	this.medicationPeriod = medicationPeriod;
}


	
	public String getDiagnosisSupportedEvidence() {
		return diagnosisSupportedEvidence;
	}

	public void setDiagnosisSupportedEvidence(String diagnosisSupportedEvidence) {
		this.diagnosisSupportedEvidence = diagnosisSupportedEvidence;
	}
	public String getStateTrnId() {
		return stateTrnId;
	}
	public void setStateTrnId(String stateTrnId) {
		this.stateTrnId = stateTrnId;
	}
	public String getPatientName() {
		return patientName;
	}





	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}





	public String getCasemanagement() {
		return casemanagement;
	}

	public void setCasemanagement(String casemanagement) {
		this.casemanagement = casemanagement;
	}

	public String getPostSurgeryTherapy() {
		return postSurgeryTherapy;
	}

	public void setPostSurgeryTherapy(String postSurgeryTherapy) {
		this.postSurgeryTherapy = postSurgeryTherapy;
	}


	public String getPatientGender() {
		return patientGender;
	}





	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}





	public String getPatientAge() {
		return patientAge;
	}





	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}





	public String getPatientBirthYear() {
		return patientBirthYear;
	}





	public void setPatientBirthYear(String patientBirthYear) {
		this.patientBirthYear = patientBirthYear;
	}





	public String getPatientDiagnosedBy() {
		return patientDiagnosedBy;
	}





	public void setPatientDiagnosedBy(String patientDiagnosedBy) {
		this.patientDiagnosedBy = patientDiagnosedBy;
	}





	public String getPatientContact() {
		return patientContact;
	}





	public void setPatientContact(String patientContact) {
		this.patientContact = patientContact;
	}





	public String getStateLgdCode() {
		return stateLgdCode;
	}





	public void setStateLgdCode(String stateLgdCode) {
		this.stateLgdCode = stateLgdCode;
	}





	public String getDistrictLgdCode() {
		return districtLgdCode;
	}





	public void setDistrictLgdCode(String districtLgdCode) {
		this.districtLgdCode = districtLgdCode;
	}





	public String getPatientAddress() {
		return patientAddress;
	}





	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}





	public String getPatientBlock() {
		return patientBlock;
	}





	public void setPatientBlock(String patientBlock) {
		this.patientBlock = patientBlock;
	}





	public String getPatientVillage() {
		return patientVillage;
	}





	public void setPatientVillage(String patientVillage) {
		this.patientVillage = patientVillage;
	}





	public String getPatientBlockorULB() {
		return patientBlockorULB;
	}





	public void setPatientBlockorULB(String patientBlockorULB) {
		this.patientBlockorULB = patientBlockorULB;
	}





	public String getPatientCityortown() {
		return patientCityortown;
	}





	public void setPatientCityortown(String patientCityortown) {
		this.patientCityortown = patientCityortown;
	}





	public String getMemberType() {
		return memberType;
	}





	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}





	public String getPincode() {
		return pincode;
	}





	public void setPincode(String pincode) {
		this.pincode = pincode;
	}





	public String getDateOfRegistration() {
		return dateOfRegistration;
	}





	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}





	public String getAdmissionDate() {
		return admissionDate;
	}





	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}





	public String getTreatmentOrSurgeryDate() {
		return treatmentOrSurgeryDate;
	}





	public void setTreatmentOrSurgeryDate(String treatmentOrSurgeryDate) {
		this.treatmentOrSurgeryDate = treatmentOrSurgeryDate;
	}





	public String getSurgeryStartTime() {
		return surgeryStartTime;
	}





	public void setSurgeryStartTime(String surgeryStartTime) {
		this.surgeryStartTime = surgeryStartTime;
	}





	public String getSurgeryEndTime() {
		return surgeryEndTime;
	}





	public void setSurgeryEndTime(String surgeryEndTime) {
		this.surgeryEndTime = surgeryEndTime;
	}





	public String getDeathDate() {
		return deathDate;
	}





	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}





	public String getBillAmount() {
		return billAmount;
	}





	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}





	public String getBillDate() {
		return billDate;
	}





	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}





	public String getTotalClaimAmount() {
		return totalClaimAmount;
	}





	public void setTotalClaimAmount(String totalClaimAmount) {
		this.totalClaimAmount = totalClaimAmount;
	}





	public String getInsuranceApprovedAmount() {
		return insuranceApprovedAmount;
	}





	public void setInsuranceApprovedAmount(String insuranceApprovedAmount) {
		this.insuranceApprovedAmount = insuranceApprovedAmount;
	}





	public String getTrustApprovedAmount() {
		return trustApprovedAmount;
	}





	public void setTrustApprovedAmount(String trustApprovedAmount) {
		this.trustApprovedAmount = trustApprovedAmount;
	}





	public String getPenaltyAmount() {
		return penaltyAmount;
	}





	public void setPenaltyAmount(String penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}





	public String getSpecialCase() {
		return specialCase;
	}





	public void setSpecialCase(String specialCase) {
		this.specialCase = specialCase;
	}



	public String getCasemanagementAtStandardtreatmentprotocols() {
		return casemanagementAtStandardtreatmentprotocols;
	}





	public void setCasemanagementAtStandardtreatmentprotocols(
			String casemanagementAtStandardtreatmentprotocols) {
		this.casemanagementAtStandardtreatmentprotocols = casemanagementAtStandardtreatmentprotocols;
	}





	public String getEvidenceOfTherapy() {
		return evidenceOfTherapy;
	}





	public void setEvidenceOfTherapy(String evidenceOfTherapy) {
		this.evidenceOfTherapy = evidenceOfTherapy;
	}





	public String getMandatoryReportsAttached() {
		return mandatoryReportsAttached;
	}





	public void setMandatoryReportsAttached(String mandatoryReportsAttached) {
		this.mandatoryReportsAttached = mandatoryReportsAttached;
	}





	public String getDoctorType() {
		return doctorType;
	}





	public void setDoctorType(String doctorType) {
		this.doctorType = doctorType;
	}





	public String getDocRegnNo() {
		return docRegnNo;
	}





	public void setDocRegnNo(String docRegnNo) {
		this.docRegnNo = docRegnNo;
	}





	public String getDocQualification() {
		return docQualification;
	}





	public void setDocQualification(String docQualification) {
		this.docQualification = docQualification;
	}





	public String getDocContact() {
		return docContact;
	}





	public void setDocContact(String docContact) {
		this.docContact = docContact;
	}





	public String getAnesthetistName() {
		return anesthetistName;
	}





	public void setAnesthetistName(String anesthetistName) {
		this.anesthetistName = anesthetistName;
	}





	public String getAnesthetistRegNo() {
		return anesthetistRegNo;
	}





	public void setAnesthetistRegNo(String anesthetistRegNo) {
		this.anesthetistRegNo = anesthetistRegNo;
	}





	public String getAnesthetistContact() {
		return anesthetistContact;
	}





	public void setAnesthetistContact(String anesthetistContact) {
		this.anesthetistContact = anesthetistContact;
	}





	public String getAnesthesiaType() {
		return anesthesiaType;
	}





	public void setAnesthesiaType(String anesthesiaType) {
		this.anesthesiaType = anesthesiaType;
	}





	public String getParamedicName() {
		return paramedicName;
	}





	public void setParamedicName(String paramedicName) {
		this.paramedicName = paramedicName;
	}





	public String getNurseName() {
		return nurseName;
	}





	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}





	public String getExpectedHospStay() {
		return expectedHospStay;
	}





	public void setExpectedHospStay(String expectedHospStay) {
		this.expectedHospStay = expectedHospStay;
	}





	public String getIncisionType() {
		return incisionType;
	}





	public void setIncisionType(String incisionType) {
		this.incisionType = incisionType;
	}





	public String getOpPhotosWebExTaken() {
		return opPhotosWebExTaken;
	}





	public void setOpPhotosWebExTaken(String opPhotosWebExTaken) {
		this.opPhotosWebExTaken = opPhotosWebExTaken;
	}





	public String getVideoRecordingDone() {
		return videoRecordingDone;
	}





	public void setVideoRecordingDone(String videoRecordingDone) {
		this.videoRecordingDone = videoRecordingDone;
	}





	public String getSwabInstrumentsCount() {
		return swabInstrumentsCount;
	}





	public void setSwabInstrumentsCount(String swabInstrumentsCount) {
		this.swabInstrumentsCount = swabInstrumentsCount;
	}





	public String getSuturesLigatures() {
		return suturesLigatures;
	}





	public void setSuturesLigatures(String suturesLigatures) {
		this.suturesLigatures = suturesLigatures;
	}





	public String getSpecimenRemoved() {
		return specimenRemoved;
	}





	public void setSpecimenRemoved(String specimenRemoved) {
		this.specimenRemoved = specimenRemoved;
	}





	public String getDrainageCount() {
		return drainageCount;
	}





	public void setDrainageCount(String drainageCount) {
		this.drainageCount = drainageCount;
	}





	public String getBloodLoss() {
		return bloodLoss;
	}





	public void setBloodLoss(String bloodLoss) {
		this.bloodLoss = bloodLoss;
	}





	public String getPostOperativeInstructions() {
		return postOperativeInstructions;
	}





	public void setPostOperativeInstructions(String postOperativeInstructions) {
		this.postOperativeInstructions = postOperativeInstructions;
	}





	public String getPatientCondition() {
		return patientCondition;
	}





	public void setPatientCondition(String patientCondition) {
		this.patientCondition = patientCondition;
	}





	public String getComplicationsRemarks() {
		return complicationsRemarks;
	}





	public void setComplicationsRemarks(String complicationsRemarks) {
		this.complicationsRemarks = complicationsRemarks;
	}





	public String getTreatmentGiven() {
		return treatmentGiven;
	}





	public void setTreatmentGiven(String treatmentGiven) {
		this.treatmentGiven = treatmentGiven;
	}





	public String getOperativeFindings() {
		return operativeFindings;
	}





	public void setOperativeFindings(String operativeFindings) {
		this.operativeFindings = operativeFindings;
	}





	public String getPostOperativePeriod() {
		return postOperativePeriod;
	}





	public void setPostOperativePeriod(String postOperativePeriod) {
		this.postOperativePeriod = postOperativePeriod;
	}





	public String getPostSurgeryTherapySpecialInvestigationsGiven() {
		return postSurgeryTherapySpecialInvestigationsGiven;
	}





	public void setPostSurgeryTherapySpecialInvestigationsGiven(
			String postSurgeryTherapySpecialInvestigationsGiven) {
		this.postSurgeryTherapySpecialInvestigationsGiven = postSurgeryTherapySpecialInvestigationsGiven;
	}





	public String getDischargeStatus() {
		return dischargeStatus;
	}





	public void setDischargeStatus(String dischargeStatus) {
		this.dischargeStatus = dischargeStatus;
	}





	public String getDischargeReview() {
		return dischargeReview;
	}





	public void setDischargeReview(String dischargeReview) {
		this.dischargeReview = dischargeReview;
	}





	public String getDischargeAdvice() {
		return dischargeAdvice;
	}





	public void setDischargeAdvice(String dischargeAdvice) {
		this.dischargeAdvice = dischargeAdvice;
	}





	public String getCauseOfDeath() {
		return causeOfDeath;
	}





	public void setCauseOfDeath(String causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}





	public String getAdmissionType() {
		return admissionType;
	}





	public void setAdmissionType(String admissionType) {
		this.admissionType = admissionType;
	}






	public String getProposedSurgeryOrTreatmentDate() {
		return proposedSurgeryOrTreatmentDate;
	}





	public void setProposedSurgeryOrTreatmentDate(
			String proposedSurgeryOrTreatmentDate) {
		this.proposedSurgeryOrTreatmentDate = proposedSurgeryOrTreatmentDate;
	}



	public String getDoctorName() {
		return doctorName;
	}





	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}





	public String getProcedureConsent() {
		return procedureConsent;
	}





	public void setProcedureConsent(String procedureConsent) {
		this.procedureConsent = procedureConsent;
	}
	public String getMedcoLegalCase() {
		return medcoLegalCase;
	}
	public void setMedcoLegalCase(String medcoLegalCase) {
		this.medcoLegalCase = medcoLegalCase;
	}
	public String getTreatingDoctorRemarks() {
		return treatingDoctorRemarks;
	}
	public void setTreatingDoctorRemarks(String treatingDoctorRemarks) {
		this.treatingDoctorRemarks = treatingDoctorRemarks;
	}


	public String getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}


	public LabelBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
