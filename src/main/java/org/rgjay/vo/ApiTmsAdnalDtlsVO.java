package org.rgjay.vo;
import java.util.List;
public class ApiTmsAdnalDtlsVO 
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
	
	private List<ApiTmsAdnlClinicalNotesVO> clinicalNotes;
	
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

	public List<ApiTmsAdnlClinicalNotesVO> getClinicalNotes() {
		return clinicalNotes;
	}

	public void setClinicalNotes(List<ApiTmsAdnlClinicalNotesVO> clinicalNotes) {
		this.clinicalNotes = clinicalNotes;
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

}
