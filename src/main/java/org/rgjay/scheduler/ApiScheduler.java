package org.rgjay.scheduler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONObject;
import org.rgjay.model.DwhAdnlDtlsApiFlagDtls;
import org.rgjay.persistanceConfig.GenericDAO;
import org.rgjay.util.ApiGatewayUtil;
import org.rgjay.vo.ApiTmsAdnalDtlsVO;
import org.rgjay.vo.ApiTmsAdnlClinicalNotesVO;
import org.rgjay.vo.LabelBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.google.gson.Gson;


@Configuration
@EnableScheduling
public class ApiScheduler
{
	@Autowired
	GenericDAO genericDao;
	@Autowired
	ApiGatewayUtil apiGatewayUtil;

	@Scheduled(fixedDelay=3600000)
	public void sendTmsApiAdnalDtls()
	{
		StringBuffer query = new StringBuffer();

		try {
			
			query.append( " select '27'                  as  \"stateLgdCode\",                    "); 
	        query.append( " STATE_TRN_ID                  as \"stateTrnId\",                          ");
	        query.append( " PATIENT_NAME                  as \"patientName\",                          ");
	        query.append( " PATIENT_GENDER                as \"patientGender\",                        ");
	        query.append( " to_char(PATIENT_AGE )                   as \"patientAge\",                           ");
	        query.append( " to_char(PATIENT_BIRTH_YEAR )            as \"patientBirthYear\",                     ");
	        query.append( " to_char(PATIENT_CONTACT   )            as \"patientContact\",                       ");
	        query.append( " to_char(DISTRICT_LGD_CODE )             as \"districtLgdCode\",                      ");
	        query.append( " PATIENT_ADDRESS               as \"patientAddress\",                       ");
	        query.append( " PATIENT_BLOCK                 as \"patientBlock\",                         ");
	        query.append( " PATIENT_VILLAGE               as \"patientVillage\",                       ");
	        query.append( " PATIENT_BLOCKORULB            as \"patientBlockorULB\",                    ");
	        query.append( " PATIENT_CITYORTOWN            as \"patientCityortown\",                    ");
	        query.append( " MEMBER_TYPE                   as \"memberType\",                           ");
	        query.append( " to_char(PINCODE)                     as \"pincode\",                              ");
	        query.append( " to_char(DATE_OF_REGISTRATION,'yyyy-MM-dd HH24:MI:SS' )          as \"dateOfRegistration\",                   ");
	        query.append( " to_char(ADMISSION_DATE,'yyyy-MM-dd HH24:MI:SS' )               as \"admissionDate\",                        ");
	        query.append( " to_char(TREATMENTORSURGERY_DATE,'yyyy-MM-dd HH24:MI:SS')       as \"treatmentOrSurgeryDate\",               ");
	        query.append( " to_char(SURGERY_START_TIME,'yyyy-MM-dd HH24:MI:SS' )           as \"surgeryStartTime\",                     ");
	        query.append( " to_char(SURGERY_END_TIME,'yyyy-MM-dd HH24:MI:SS' )              as \"surgeryEndTime\",                       ");
	        query.append( " to_char(DEATH_DATE,'yyyy-MM-dd HH24:MI:SS'  )                   as \"deathDate\",                            ");
	        query.append( " to_char(BILL_AMOUNT )                  as \"billAmount\",                           ");
	        query.append( " to_char(BILL_DATE,'yyyy-MM-dd HH24:MI:SS'  )                 as \"billDate\",                             ");
	        query.append( " to_char(TOTAL_CLAIM_AMOUNT )           as \"totalClaimAmount\",                     ");
	        query.append( " to_char(INSURANCE_APPROVED_AMOUNT )     as \"insuranceApprovedAmount\",              ");
	        query.append( " to_char(TRUST_APPROVED_AMOUNT  )       as \"trustApprovedAmount\",                  ");
	        query.append( " to_char(PENALTY_AMOUNT )                as \"penaltyAmount\",                        ");
	        query.append( " SPECIAL_CASE                  as \"specialCase\",                          ");
	        query.append( " DIAGNOSIS_SUPPORTEDEVIDENCE   as \"diagnosisSupportedEvidence\",           ");
	        query.append( " CASE_MGMT_AT_STND_TRMNT_PTCLS as \"casemanagement\",                       ");
	        query.append( "  EVIDENCE_OF_THERAPY as          \"evidenceOfTherapy\",                             ");
	        query.append( " MANDATORY_REPORTS_ATTACHED    as \"mandatoryReportsAttached\",             ");
	        query.append( " DOCTOR_TYPE                   as \"doctorType\",                           ");
	        query.append( " DOC_REGN_NO                   as \"docRegnNo\",                            ");
	        query.append( " DOC_QUALIFICATION             as \"docQualification\",                     ");
	        query.append( " DOC_CONTACT                   as \"docContact\",                           ");
	        query.append( " ANESTHETIST_NAME              as \"anesthetistName\",                     ");
	        query.append( " to_char (ANESTHETIST_REG_NO )            as \"anesthetistRegNo\",                     ");
	        query.append( " ANESTHETIST_CONTACT           as \"anesthetistContact\",                   ");
	        query.append( " ANESTHESIA_TYPE               as \"anesthesiaType\",                       ");
	        query.append( " PARAMEDIC_NAME                as \"paramedicName\",                        ");
	        query.append( " NURSE_NAME                    as \"nurseName\",                            ");
	        query.append( " EXPECTED_HOSP_STAY            as \"expectedHospStay\",                     ");
	        query.append( " INCISION_TYPE                 as \"incisionType\",                         ");
	        query.append( " OP_PHOTOS_WEBEX_TAKEN         as \"opPhotosWebExTaken\",                   ");
	        query.append( " VIDEO_RECORDING_DONE          as \"videoRecordingDone\",                   ");
	        query.append( " SWAB_INSTRUMENTS_COUNT        as \"swabInstrumentsCount\",                 ");
	        query.append( " SUTURES_LIGATURES             as \"suturesLigatures\",                     ");
	        query.append( " SPECIMEN_REMOVED              as \"specimenRemoved\",                      ");
	        query.append( " DRAINAGE_COUNT                as \"drainageCount\",                        ");
	        query.append( " BLOOD_LOSS                    as \"bloodLoss\",                            ");
	        query.append( " POST_OPERATIVE_INSTRUCTIONS   as \"postOperativeInstructions\",            ");
	        query.append( " PATIENT_CONDITION             as \"patientCondition\",                     ");
	        query.append( " COMPLICATIONS_REMARKS         as \"complicationsRemarks\",                 ");
	        query.append( " TREATMENT_GIVEN               as \"treatmentGiven\",                       ");
	        query.append( " OPERATIVE_FINDINGS            as \"operativeFindings\",                    ");
	        query.append( " POST_OPERATIVE_PERIOD         as \"postOperativePeriod\",                  ");
	       // query.append( " ----POST_SURGERY_THERAPY_SPL_INVS as \"postSurgeryTherapy\",               ");
	        query.append( " DISCHARGE_STATUS as \"dischargeStatus\",                                   ");
	        query.append( " DISCHARGE_REVIEW              as \"dischargeReview\",                      ");
	        query.append( " DISCHARGE_ADVICE              as \"dischargeAdvice\",                      ");
	        query.append( " CAUSE_OF_DEATH                as \"causeOfDeath\",                         ");
	        query.append( " ADMISSION_TYPE                as \"admissionType\",                        ");
	        query.append( " PROPOSED_SGYORTMNT_DT_REMARKS as \"proposedSurgeryOrTreatmentDate\",       ");
	        query.append( " PATIENT_DIAGNOSEDBY           as \"patientDiagnosedBy\",                   ");
	        query.append( " DOCTOR_NAME                   as \"doctorName\",                           ");
	        query.append( " PROCEDURE_CONSENT             as \"procedureConsent\",                     ");
	        query.append( " MEDCO_LEGAL_CASE              as \"medcoLegalCase\",                    ");

			  query.append(
			  " CLINICAL_DATE                 as \"clinicalDate\",                         ");
			  query.append(
			  " HEIGHT                        as \"height\",                               ");
			  query.append(
			  " WEIGHT                        as \"weight\",                               ");
			  query.append(
			  " BMI                           as \"bmi\",                                  ");
			  query.append(
			  " PALLOR                        as \"pallor\",                               ");
			  query.append(
			  " CYANOSIS                      as \"cyanosis\",                             ");
			  query.append(
			  " CLUBBING_OF_FINGERSANDTOES    as \"clubbingOfFingersAndToes\",             ");
			  query.append(
			  " LYMPHADENOPATHY               as \"lymphadenopathy\",                      ");
			  query.append(
			  " OEDEMA_IN_FEET                as \"oedemaInFeet\",                         ");
			  query.append(
			  " MALNUTRITION                  as \"malnutrition\",                         ");
			  query.append(
			  " DEHYDRATION                   as \"dehydration\",                          ");
			  query.append(
			  " BP77                          as \"bp77\",                                 ");
			  query.append(
			  " PULSE_RATE                    as \"pulseRate\",                            ");
			  query.append(
			  " TEMPERATURE                   as \"temperature\",                          ");
			  query.append(
			  " WARD_TYPE                     as \"wardType\",                             ");
			  query.append(
			  " RESPIRATORY_RATE              as \"respiratoryRate\",                      ");
			  query.append(
			  " HEART_SOUNDS                  as \"heartSounds\",                          ");
			  query.append(
			  " LUNGS                         as \"lungs\",                                ");
			  query.append(
			  " FLUID_INPUT                   as \"fluidInput\",                           ");
			  query.append(
			  " FLUID_OUTPUT                  as \"fluidOutput\",                          ");
			  query.append(
			  " OP_NO                         as \"opNo\",                                 ");
			  query.append(
			  " IP_NO                         as \"ipNo\",                                 ");
			  query.append(
			  " REMARKS                       as \"clinicalRemarks\",                      ");
			  query.append(
			  " PULSE_RATE_PER_MINUTE         as \"pulseRatePerMinute\",                   ");
			  query.append(
			  " RESPIRATION_RATE              as \"respirationRate\",                      ");
			  query.append(
			  " BPLTARM                       as \"bpltArm\",                              ");
			  query.append(
			  " BPRTARM                       as \"bprtArm\",                              ");
			  query.append(
			  " APPETITE                      as \"appetite\",                             ");
			  query.append(
			  " DIET                          as \"diet\",                                 ");
			  query.append(
			  " BOWELS                        as \"bowels\",                               ");
			  query.append(
			  " KNOWN_ALLERGIES               as \"knownAllergies\",                       ");
			  query.append(
			  " HABITS_OR_ADDICTIONS          as \"habitsOrAddictions\",                   ");
			  query.append(
			  " HISTORY_OF_PASTILLNESS        as \"historyOfPastIllness\",                 ");
			  query.append(
			  " FAMILY_HISTORY                as \"familyHistory\",                        ");
			  query.append(
			  " MAIN_SYMPTOM_NAME             as \"mainSymptomName\",                      ");
			  query.append(
			  " SUB_SYMPTOM_NAME              as \"subSymptomName\",                       ");
			  query.append(
			  " SYMPTOM_NAME                  as \"symptomName\",                          ");
			  query.append(
			  " INVESTIGATION_BLOCK_NAME      as \"investigationBlockName\",               ");
			  query.append(
			  " INVESTIGATION_NAME            as \"investigationName\",                    ");
			  query.append(
			  " PRIMARY_DIAGNOSIS             as \"primaryDiagnosis\",                     ");
			  query.append(
			  " CATEGORY                      as \"category\",                             ");
			  query.append(
			  " PROCEDURE                     as \"procedure\",                            ");
			  query.append(
			  " TREATING_DOCTOR               as \"treatingDoctor\",                       ");
			  query.append(
			  " INVESTIGATIONS                as \"investigations\",                       ");
			  query.append(
			  " INVESTIGATION_DOCTOR_NAME     as \"inestigationDoctorName\",               ");
			  query.append(
			  " DOCTOR_DAILY_NOTES            as \"doctorDailyNotes\",                     ");
			  query.append(
			  " BL                            as \"bl\",                                   ");
			  query.append(
			  " BBF                           as \"bbf\",                                  ");
			  query.append(
			  " BD                            as \"bd\",                                   ");
			  query.append(
			  " MN                            as \"mn\",                                   ");
			  query.append(
			  " INSULIN_DOSAGE                as \"insulinDosage\",                        ");
			  query.append(
			  " MAIN_GROUP_NAME               as \"mainGroupName\",                        ");
			  query.append(
			  " THERAPEUTIC_MAIN_GROUP_NAME   as \"therapeuticMainGroupName\",             ");
			  query.append(
			  " PHARMACOLOGICAL_SUBGRP_NAME   as \"pharmacologicalSubGrpName\",            ");
			  query.append(
			  " CHEMICAL_SUBGROUP_NAME        as \"chemicalSubGroupName\",                 ");
			  query.append(
			  " CHEMICAL_SUBSTANCE_NAME       as \"chemicalSubstanceName\",                ");
			  query.append(
			  " ROUTE_TYPE                    as \"routeType\",                            ");
			  query.append(
			  " ROUTE_NAME                    as \"routeName\",                            ");
			  query.append(
			  " STRENGTH_TYPE                 as \"strengthType\",                         ");
			  query.append(
			  " STRENGTH_NAME                 as \"strengthName\",                         ");
			  query.append(
			  " DOSAGE_PERDAY                 as \"dosagePerday\"                        ");
	          query.append( " from NHPM_UPDATED_DWH_DATA_DTLS  where state_trn_id not in                                     ");
	          query.append( "  (select state_trn_id from dwh_adnal_api_flag_dtls where flag not in ('Y'))                                     ");

	          
	          
	          List<LabelBean> adnlDtls = genericDao.executeSQLQueryList(LabelBean.class,
	        		  	query.toString());
			
			 query.delete(0, query.length());

			String authUrl="https://apis-prd.pmjay.gov.in/auth/realms/3scale-sso/protocol/openid-connect/token";
			String url="https://apis-prd.pmjay.gov.in/nhpmapi/v0.2/apis/test/updatetransactionadditionaldtls";
			String clientId="7a4baef2";
			String clientSecret="0392175864d520559c99193e9fa3956c";
			String nonGateway="https://testapis.abnhpm.gov.in/nhpmapi/v0.2/apis/test/updatetransactionadditionaldtls";
			String flag="Y";
			int statusCode=0;
			String resp=null;
			String token=null;
		     String msg=null;
		for(LabelBean adnlVo:adnlDtls)
		 {

	    	 ApiTmsAdnalDtlsVO nhpmApiTrnAdditionalFields = new ApiTmsAdnalDtlsVO();
	    	 nhpmApiTrnAdditionalFields.setStateLgdCode("27");
	    	 nhpmApiTrnAdditionalFields.setStateTrnId(adnlVo.getStateTrnId());
	    	 nhpmApiTrnAdditionalFields.setDistrictLgdCode(adnlVo.getDistrictLgdCode());
	    	// nhpmApiTrnAdditionalFields.setDistrictLgdCode("500");

	    	 nhpmApiTrnAdditionalFields.setPatientName(adnlVo.getPatientName());
	    	 nhpmApiTrnAdditionalFields.setPatientAge(adnlVo.getPatientAge());
	    	 nhpmApiTrnAdditionalFields.setPatientContact(adnlVo.getPatientContact());
				nhpmApiTrnAdditionalFields.setPatientAddress(adnlVo.getPatientAddress());
				nhpmApiTrnAdditionalFields.setPatientBlock(adnlVo.getPatientBlock());
				nhpmApiTrnAdditionalFields.setPatientBlockorULB(adnlVo.getPatientBlockorULB());
				nhpmApiTrnAdditionalFields.setPatientCityortown(adnlVo.getPatientCityortown());
				nhpmApiTrnAdditionalFields.setMemberType(adnlVo.getMemberType());
				if(adnlVo!=null && adnlVo.getPatientGender().equalsIgnoreCase("Male"))
				nhpmApiTrnAdditionalFields.setPatientGender("M");
				if(adnlVo!=null && adnlVo.getPatientGender().equalsIgnoreCase("Female"))
					nhpmApiTrnAdditionalFields.setPatientGender("F");
				if(adnlVo!=null && adnlVo.getPatientGender().equalsIgnoreCase("Others"))
					nhpmApiTrnAdditionalFields.setPatientGender("O");
				nhpmApiTrnAdditionalFields.setPincode(adnlVo.getPincode());
				nhpmApiTrnAdditionalFields.setDateOfRegistration(adnlVo.getDateOfRegistration());
				nhpmApiTrnAdditionalFields.setAdmissionDate(adnlVo.getAdmissionDate());
				nhpmApiTrnAdditionalFields.setTreatmentOrSurgeryDate(adnlVo.getTreatmentOrSurgeryDate());
				nhpmApiTrnAdditionalFields.setSurgeryStartTime(adnlVo.getSurgeryStartTime());
				nhpmApiTrnAdditionalFields.setSurgeryEndTime(adnlVo.getSurgeryEndTime());
				nhpmApiTrnAdditionalFields.setDeathDate(adnlVo.getDeathDate());
				nhpmApiTrnAdditionalFields.setBillAmount(adnlVo.getBillAmount());
				nhpmApiTrnAdditionalFields.setBillDate(adnlVo.getBillDate());
				nhpmApiTrnAdditionalFields.setTotalClaimAmount(adnlVo.getTotalClaimAmount());
				nhpmApiTrnAdditionalFields.setInsuranceApprovedAmount(adnlVo.getInsuranceApprovedAmount());
				nhpmApiTrnAdditionalFields.setTrustApprovedAmount(adnlVo.getTrustApprovedAmount());
				nhpmApiTrnAdditionalFields.setPenaltyAmount(adnlVo.getPenaltyAmount());
				nhpmApiTrnAdditionalFields.setSpecialCase(adnlVo.getSpecialCase());
				nhpmApiTrnAdditionalFields.setDiagnosisSupportedEvidence(adnlVo.getDiagnosisSupportedEvidence());
				nhpmApiTrnAdditionalFields.setCasemanagementAtStandardtreatmentprotocols(adnlVo.getCasemanagementAtStandardtreatmentprotocols());
				nhpmApiTrnAdditionalFields.setEvidenceOfTherapy(adnlVo.getEvidenceOfTherapy());
				nhpmApiTrnAdditionalFields.setMandatoryReportsAttached(adnlVo.getMandatoryReportsAttached());
				nhpmApiTrnAdditionalFields.setDoctorType(adnlVo.getDoctorType());
				nhpmApiTrnAdditionalFields.setDocRegnNo(adnlVo.getDocRegnNo());
				nhpmApiTrnAdditionalFields.setDocContact(adnlVo.getDocContact());
				nhpmApiTrnAdditionalFields.setDocQualification(adnlVo.getDocQualification());
				nhpmApiTrnAdditionalFields.setAnesthetistName(adnlVo.getAnesthetistName());
				nhpmApiTrnAdditionalFields.setAnesthetistContact(adnlVo.getAnesthetistContact());
				nhpmApiTrnAdditionalFields.setAnesthesiaType(adnlVo.getAnesthesiaType());
				nhpmApiTrnAdditionalFields.setParamedicName(adnlVo.getParamedicName());
				nhpmApiTrnAdditionalFields.setNurseName(adnlVo.getNurseName());
				nhpmApiTrnAdditionalFields.setExpectedHospStay(adnlVo.getExpectedHospStay());
				nhpmApiTrnAdditionalFields.setIncisionType(adnlVo.getIncisionType());
				nhpmApiTrnAdditionalFields.setOpPhotosWebExTaken(adnlVo.getOpPhotosWebExTaken());
				nhpmApiTrnAdditionalFields.setVideoRecordingDone(adnlVo.getVideoRecordingDone());
				nhpmApiTrnAdditionalFields.setSwabInstrumentsCount(adnlVo.getSwabInstrumentsCount());
				nhpmApiTrnAdditionalFields.setSuturesLigatures(adnlVo.getSuturesLigatures());
				nhpmApiTrnAdditionalFields.setSpecimenRemoved(adnlVo.getSpecimenRemoved());
				nhpmApiTrnAdditionalFields.setDrainageCount(adnlVo.getDrainageCount());
				nhpmApiTrnAdditionalFields.setBloodLoss(adnlVo.getBloodLoss());
				nhpmApiTrnAdditionalFields.setPostOperativeInstructions(adnlVo.getPostOperativeInstructions());
				nhpmApiTrnAdditionalFields.setPatientCondition(adnlVo.getPatientCondition());
				nhpmApiTrnAdditionalFields.setComplicationsRemarks(adnlVo.getComplicationsRemarks());
				nhpmApiTrnAdditionalFields.setTreatmentGiven(adnlVo.getTreatmentGiven());
				nhpmApiTrnAdditionalFields.setOperativeFindings(adnlVo.getOperativeFindings());
				nhpmApiTrnAdditionalFields.setPostOperativePeriod(adnlVo.getPostOperativePeriod());;
				nhpmApiTrnAdditionalFields.setPostSurgeryTherapySpecialInvestigationsGiven(adnlVo.getPostSurgeryTherapySpecialInvestigationsGiven());
				nhpmApiTrnAdditionalFields.setDischargeStatus(adnlVo.getDischargeStatus());
				nhpmApiTrnAdditionalFields.setDischargeReview(adnlVo.getDischargeReview());
				nhpmApiTrnAdditionalFields.setDischargeAdvice(adnlVo.getDischargeAdvice());
				nhpmApiTrnAdditionalFields.setCauseOfDeath(adnlVo.getCauseOfDeath());
				nhpmApiTrnAdditionalFields.setAdmissionType(adnlVo.getAdmissionType());
				nhpmApiTrnAdditionalFields.setAdmissionDate(adnlVo.getAdmissionDate());
				nhpmApiTrnAdditionalFields.setProcedureConsent(adnlVo.getProcedureConsent());
				nhpmApiTrnAdditionalFields.setMedcoLegalCase(adnlVo.getMedcoLegalCase());
				nhpmApiTrnAdditionalFields.setPatientVillage(adnlVo.getPatientVillage());
				nhpmApiTrnAdditionalFields.setProposedSurgeryOrTreatmentDate(adnlVo.getProposedSurgeryOrTreatmentDate());
				nhpmApiTrnAdditionalFields.setTreatingDoctorRemarks(adnlVo.getTreatingDoctorRemarks());
				nhpmApiTrnAdditionalFields.setPatientDiagnosedBy(adnlVo.getPatientDiagnosedBy());
				nhpmApiTrnAdditionalFields.setDoctorName(adnlVo.getDoctorName());
				nhpmApiTrnAdditionalFields.setAnesthetistRegNo(adnlVo.getAnesthetistRegNo());
				
				List<ApiTmsAdnlClinicalNotesVO> apiClinicalDtls= new ArrayList<ApiTmsAdnlClinicalNotesVO>();
				
				ApiTmsAdnlClinicalNotesVO apiClinicalData = new ApiTmsAdnlClinicalNotesVO();
				apiClinicalData.setClinicalDate(adnlVo.getClinicalDate());
						apiClinicalData.setHeight(adnlVo.getHeight());
						apiClinicalData.setWeight(adnlVo.getWeight());
						apiClinicalData.setBmi(adnlVo.getBmi());
						apiClinicalData.setPallor(adnlVo.getPallor());
						apiClinicalData.setCyanosis(adnlVo.getCyanosis());
						apiClinicalData.setClubbingOfFingersAndToes(adnlVo.getClubbingOfFingersAndToes());
						apiClinicalData.setLymphadenopathy(adnlVo.getLymphadenopathy());
						apiClinicalData.setOedemaInFeet(adnlVo.getOedemaInFeet());
						apiClinicalData.setMalnutrition(adnlVo.getMalnutrition());
						apiClinicalData.setDehydration(adnlVo.getDehydration());
						apiClinicalData.setBp77(adnlVo.getBp77());
						apiClinicalData.setPulseRate(adnlVo.getPulseRate());
						apiClinicalData.setTemperature(adnlVo.getTemperature());
						apiClinicalData.setWardType(adnlVo.getWardType());
						apiClinicalData.setRespirationRate(adnlVo.getRespirationRate());
						apiClinicalData.setHeartSounds(adnlVo.getHeartSounds());
						apiClinicalData.setLungs(adnlVo.getLungs());
						apiClinicalData.setFluidInput(adnlVo.getFluidInput());
						
						apiClinicalData.setFluidOutput(adnlVo.getFluidOutput());
						apiClinicalData.setOpNo(adnlVo.getOpNo());
						apiClinicalData.setIpNo(adnlVo.getIpNo());
						
						apiClinicalData.setClinicalRemarks(adnlVo.getClinicalRemarks());
						apiClinicalData.setPulseRatePerMinute(adnlVo.getPulseRatePerMinute());
						apiClinicalData.setRespirationRate(adnlVo.getRespirationRate());
						apiClinicalData.setBpltArm(adnlVo.getBpltArm());
						apiClinicalData.setBprtArm(adnlVo.getBprtArm());
						apiClinicalData.setAppetite(adnlVo.getAppetite());
						
						apiClinicalData.setDiet(adnlVo.getDiet());
						apiClinicalData.setBowels(adnlVo.getBowels());
						
						apiClinicalData.setNutrition(adnlVo.getNutrition());
						apiClinicalData.setKnownAllergies(adnlVo.getKnownAllergies());
						apiClinicalData.setHabitsOrAddictions(adnlVo.getHabitsOrAddictions());
						apiClinicalData.setHistoryOfPastIllness(adnlVo.getHistoryOfPastIllness());
						apiClinicalData.setFamilyHistory(adnlVo.getFamilyHistory());
						apiClinicalData.setMainSymptomName(adnlVo.getMainSymptomName());
						
						apiClinicalData.setSubSymptomName(adnlVo.getSubSymptomName());
						apiClinicalData.setSymptomName(adnlVo.getSymptomName());
						apiClinicalData.setInvestigationBlockName(adnlVo.getInvestigationBlockName());
						
						apiClinicalData.setInvestigationName(adnlVo.getInvestigationName());
						apiClinicalData.setPrimaryDiagnosis(adnlVo.getPrimaryDiagnosis());
						apiClinicalData.setCategory(adnlVo.getCategory());
						
						apiClinicalData.setProcedure(adnlVo.getProcedure());
						apiClinicalData.setTreatingDoctor(adnlVo.getTreatingDoctor());
						apiClinicalData.setInvestigations(adnlVo.getInvestigations());
						//investigation doctor name is missing
						apiClinicalData.setInestigationDoctorName(adnlVo.getInestigationDoctorName());
						apiClinicalData.setDoctorDailyNotes(adnlVo.getDoctorDailyNotes());
						apiClinicalData.setBbf(adnlVo.getBbf());
						apiClinicalData.setBl(adnlVo.getBl());
						apiClinicalData.setBd(adnlVo.getBd());
						apiClinicalData.setMn(adnlVo.getMn());
						apiClinicalData.setInsulinDosage(adnlVo.getInsulinDosage());
						apiClinicalData.setMainGroupName(adnlVo.getMainGroupName());
						apiClinicalData.setTherapeuticMainGroupName(adnlVo.getTherapeuticMainGroupName());
						apiClinicalData.setPharmacologicalSubGrpName(adnlVo.getPharmacologicalSubGrpName());
						apiClinicalData.setChemicalSubGroupName(adnlVo.getChemicalSubGroupName());
						apiClinicalData.setChemicalSubstanceName(adnlVo.getChemicalSubstanceName());
						apiClinicalData.setRouteType(adnlVo.getRouteType());
						apiClinicalData.setRouteName(adnlVo.getRouteName());
						apiClinicalData.setStrengthType(adnlVo.getStrengthType());
						apiClinicalData.setStrengthName(adnlVo.getStrengthType());
						apiClinicalData.setDosagePerday(adnlVo.getDosagePerday());
						apiClinicalData.setMedicationPeriod(adnlVo.getMedicationPeriod());
						nhpmApiTrnAdditionalFields.setClinicalNotes(apiClinicalDtls);
			
				  String gsonReq=new Gson().toJson(nhpmApiTrnAdditionalFields);
				  token=apiGatewayUtil.generateGatewayToken(clientId, clientSecret, authUrl);
				  if(flag!=null && flag.equalsIgnoreCase("Y"))
				  resp=apiGatewayUtil.getDtlsByApi(token, url, gsonReq,flag); 
				  else
				  resp=apiGatewayUtil.getDtlsByApi(token, nonGateway, gsonReq,flag); JSONObject
				  respObject= new JSONObject(resp);
									
					 
				  if(respObject!=null)
				  {
					   statusCode=respObject.getInt("statusCode");
					   msg=respObject.getString("message");
						 System.out.println("statusCode and msg"+statusCode +""+msg);
						  DwhAdnlDtlsApiFlagDtls dwhApiFlagDtls = new DwhAdnlDtlsApiFlagDtls();
						  if(statusCode==1)
							  dwhApiFlagDtls.setFlag("Y");
						  else
							  dwhApiFlagDtls.setFlag("N");
						  dwhApiFlagDtls.setErrorMsg(msg);
						  dwhApiFlagDtls.setCrtUsr("Api");
						  dwhApiFlagDtls.setCrtdt(new Date());
						  dwhApiFlagDtls.setStateTrnId(adnlVo.getStateTrnId());
						  genericDao.save(dwhApiFlagDtls);

				}	
				
		              
		}			System.out.println("length"+adnlDtls.size());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
