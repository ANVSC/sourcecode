package org.rgjay.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="NHPM_UPDATED_DWH_DATA_DTLS")
public class NhpmUpdatedDwhDataDtls {
	
	
	@EmbeddedId
	private NhpmUpdatedDwhDataDtlsId id;

	@Column(name="PATIENT_NAME")private String PATIENT_NAME;
	@Column(name="PATIENT_GENDER")private String PATIENT_GENDER ;
	@Column(name="PATIENT_AGE ")private Number PATIENT_AGE ;
	@Column(name="PATIENT_BIRTH_YEAR")private Number PATIENT_BIRTH_YEAR;
	@Column(name="PATIENT_CONTACT")private Number PATIENT_CONTACT;
	@Column(name="DISTRICT_LGD_CODE")private Number DISTRICT_LGD_CODE;
	@Column(name="PATIENT_ADDRESS")private String PATIENT_ADDRESS;
	@Column(name="PATIENT_BLOCK ")private String PATIENT_BLOCK;
	@Column(name="PATIENT_VILLAGE")private String PATIENT_VILLAGE;
	@Column(name="PATIENT_BLOCKORULB")private String PATIENT_BLOCKORULB;
	@Column(name="PATIENT_CITYORTOWN")private String PATIENT_CITYORTOWN;
	@Column(name="MEMBER_TYPE ")private String MEMBER_TYPE ;
	@Column(name="PINCODE")private Number PINCODE;
	@Column(name="DATE_OF_REGISTRATION")private Date DATE_OF_REGISTRATION;
	@Column(name="ADMISSION_DATE")private Date ADMISSION_DATE ;
	@Column(name="TREATMENTORSURGERY_DATE")private Date TREATMENTORSURGERY_DATE;
	@Column(name="SURGERY_START_TIME")private Date SURGERY_START_TIME;
	@Column(name="SURGERY_END_TIME ")private Date SURGERY_END_TIME ;
	@Column(name="DEATH_DATE")private Date DEATH_DATE;
	@Column(name="BILL_AMOUNT ")private Number BILL_AMOUNT ;
	@Column(name="BILL_DATE")private Date BILL_DATE;
	@Column(name="TOTAL_CLAIM_AMOUNT")private Number TOTAL_CLAIM_AMOUNT;
	@Column(name="INSURANCE_APPROVED_AMOUNT ")private Number INSURANCE_APPROVED_AMOUNT ;
	@Column(name="TRUST_APPROVED_AMOUNT")private Number TRUST_APPROVED_AMOUNT;
	@Column(name="PENALTY_AMOUNT")private Number PENALTY_AMOUNT ;
	@Column(name="SPECIAL_CASE")private String SPECIAL_CASE;
	@Column(name="DIAGNOSIS_SUPPORTEDEVIDENCE")private String DIAGNOSIS_SUPPORTEDEVIDENCE;
	@Column(name="CASE_MGMT_AT_STND_TRMNT_PTCLS")private String CASE_MGMT_AT_STND_TRMNT_PTCLS;
	@Column(name="EVIDENCE_OF_THERAPY ")private String EVIDENCE_OF_THERAPY ;
	@Column(name="MANDATORY_REPORTS_ATTACHED")private String MANDATORY_REPORTS_ATTACHED;
	@Column(name="DOCTOR_TYPE ")private String DOCTOR_TYPE ;
	@Column(name="DOC_REGN_NO ")private String DOC_REGN_NO ;
	@Column(name="DOC_QUALIFICATION")private String DOC_QUALIFICATION;
	@Column(name="DOC_CONTACT ")private String DOC_CONTACT ;
	@Column(name="ANESTHETIST_NAME ")private String ANESTHETIST_NAME ;
	@Column(name="ANESTHETIST_REG_NO")private Number ANESTHETIST_REG_NO;
	@Column(name="ANESTHETIST_CONTACT ")private String ANESTHETIST_CONTACT ;
	@Column(name="ANESTHESIA_TYPE")private String ANESTHESIA_TYPE;
	@Column(name="PARAMEDIC_NAME")private String PARAMEDIC_NAME ;
	@Column(name="NURSE_NAME")private String NURSE_NAME;
	@Column(name="EXPECTED_HOSP_STAY")private String EXPECTED_HOSP_STAY;
	@Column(name="INCISION_TYPE ")private String INCISION_TYPE;
	@Column(name="OP_PHOTOS_WEBEX_TAKEN")private String OP_PHOTOS_WEBEX_TAKEN;
	@Column(name="VIDEO_RECORDING_DONE")private String VIDEO_RECORDING_DONE;
	@Column(name="SWAB_INSTRUMENTS_COUNT ")private String SWAB_INSTRUMENTS_COUNT ;
	@Column(name="SUTURES_LIGATURES")private String SUTURES_LIGATURES;
	@Column(name="SPECIMEN_REMOVED ")private String SPECIMEN_REMOVED ;
	@Column(name="DRAINAGE_COUNT")private String DRAINAGE_COUNT ;
	@Column(name="BLOOD_LOSS")private String BLOOD_LOSS;
	@Column(name="POST_OPERATIVE_INSTRUCTIONS")private String POST_OPERATIVE_INSTRUCTIONS;
	@Column(name="PATIENT_CONDITION")private String PATIENT_CONDITION;
	@Column(name="COMPLICATIONS_REMARKS")private String COMPLICATIONS_REMARKS;
	@Column(name="TREATMENT_GIVEN")private String TREATMENT_GIVEN;
	@Column(name="OPERATIVE_FINDINGS")private String OPERATIVE_FINDINGS;
	@Column(name="POST_OPERATIVE_PERIOD")private String POST_OPERATIVE_PERIOD;
	@Column(name="DISCHARGE_STATUS ")private String DISCHARGE_STATUS ;
	@Column(name="DISCHARGE_REVIEW ")private String DISCHARGE_REVIEW ;
	@Column(name="DISCHARGE_ADVICE ")private String DISCHARGE_ADVICE ;
	@Column(name="CAUSE_OF_DEATH")private String CAUSE_OF_DEATH ;
	@Column(name="ADMISSION_TYPE")private String ADMISSION_TYPE ;
	@Column(name="PROPOSED_SGYORTMNT_DT_REMARKS")private String PROPOSED_SGYORTMNT_DT_REMARKS;
	@Column(name="PATIENT_DIAGNOSEDBY ")private String PATIENT_DIAGNOSEDBY ;
	@Column(name="DOCTOR_NAME ")private String DOCTOR_NAME ;
	@Column(name="PROCEDURE_CONSENT")private String PROCEDURE_CONSENT;
	@Column(name="MEDCO_LEGAL_CASE ")private String MEDCO_LEGAL_CASE ;
	@Column(name="CLINICAL_DATE ")private String CLINICAL_DATE;
	@Column(name="HEIGHT")private String HEIGHT;
	@Column(name="WEIGHT")private String WEIGHT;
	@Column(name="BMI")private String BMI;
	@Column(name="PALLOR")private String PALLOR;
	@Column(name="CYANOSIS ")private String CYANOSIS ;
	@Column(name="CLUBBING_OF_FINGERSANDTOES")private String CLUBBING_OF_FINGERSANDTOES;
	@Column(name="LYMPHADENOPATHY")private String LYMPHADENOPATHY;
	@Column(name="OEDEMA_IN_FEET")private String OEDEMA_IN_FEET ;
	@Column(name="MALNUTRITION")private String MALNUTRITION;
	@Column(name="DEHYDRATION ")private String DEHYDRATION ;
	@Column(name="BP77")private String BP77;
	@Column(name="PULSE_RATE")private String PULSE_RATE;
	@Column(name="TEMPERATURE ")private String TEMPERATURE ;
	@Column(name="WARD_TYPE")private String WARD_TYPE;
	@Column(name="RESPIRATORY_RATE ")private String RESPIRATORY_RATE ;
	@Column(name="HEART_SOUNDS")private String HEART_SOUNDS;
	@Column(name="LUNGS ")private String LUNGS ;
	@Column(name="FLUID_INPUT ")private String FLUID_INPUT ;
	@Column(name="FLUID_OUTPUT")private String FLUID_OUTPUT;
	@Column(name="OP_NO ")private String OP_NO ;
	@Column(name="IP_NO ")private String IP_NO ;
	@Column(name="REMARKS")private String REMARKS;
	@Column(name="PULSE_RATE_PER_MINUTE")private String PULSE_RATE_PER_MINUTE;
	@Column(name="RESPIRATION_RATE ")private String RESPIRATION_RATE ;
	@Column(name="BPLTARM")private String BPLTARM;
	@Column(name="BPRTARM")private String BPRTARM;
	@Column(name="APPETITE ")private String APPETITE ;
	@Column(name="DIET")private String DIET;
	@Column(name="BOWELS")private String BOWELS;
	@Column(name="KNOWN_ALLERGIES")private String KNOWN_ALLERGIES;
	@Column(name="HABITS_OR_ADDICTIONS")private String HABITS_OR_ADDICTIONS;
	@Column(name="HISTORY_OF_PASTILLNESS ")private String HISTORY_OF_PASTILLNESS ;
	@Column(name="FAMILY_HISTORY")private String FAMILY_HISTORY ;
	@Column(name="MAIN_SYMPTOM_NAME")private String MAIN_SYMPTOM_NAME;
	@Column(name="SUB_SYMPTOM_NAME ")private String SUB_SYMPTOM_NAME ;
	@Column(name="SYMPTOM_NAME")private String SYMPTOM_NAME;
	@Column(name="INVESTIGATION_BLOCK_NAME")private String INVESTIGATION_BLOCK_NAME;
	@Column(name="INVESTIGATION_NAME")private String INVESTIGATION_NAME;
	@Column(name="PRIMARY_DIAGNOSIS")private String PRIMARY_DIAGNOSIS;
	@Column(name="CATEGORY ")private String CATEGORY ;
	@Column(name="PROCEDURE")private String PROCEDURE;
	@Column(name="TREATING_DOCTOR")private String TREATING_DOCTOR;
	@Column(name="INVESTIGATIONS")private String INVESTIGATIONS ;
	@Column(name="INVESTIGATION_DOCTOR_NAME ")private String INVESTIGATION_DOCTOR_NAME ;
	@Column(name="DOCTOR_DAILY_NOTES")private String DOCTOR_DAILY_NOTES;
	@Column(name="BL ")private String BL ;
	@Column(name="BBF")private String BBF;
	@Column(name="BD ")private String BD ;
	@Column(name="MN ")private String MN ;
	@Column(name="INSULIN_DOSAGE")private String INSULIN_DOSAGE ;
	@Column(name="MAIN_GROUP_NAME")private String MAIN_GROUP_NAME;
	@Column(name="THERAPEUTIC_MAIN_GROUP_NAME")private String THERAPEUTIC_MAIN_GROUP_NAME;
	@Column(name="PHARMACOLOGICAL_SUBGRP_NAME")private String PHARMACOLOGICAL_SUBGRP_NAME;
	@Column(name="CHEMICAL_SUBGROUP_NAME ")private String CHEMICAL_SUBGROUP_NAME ;
	@Column(name="CHEMICAL_SUBSTANCE_NAME")private String CHEMICAL_SUBSTANCE_NAME;
	@Column(name="ROUTE_TYPE")private String ROUTE_TYPE;
	@Column(name="ROUTE_NAME")private String ROUTE_NAME;
	@Column(name="STRENGTH_TYPE ")private String STRENGTH_TYPE;
	@Column(name="STRENGTH_NAME ")private String STRENGTH_NAME;
	@Column(name="DOSAGE_PERDAY ")private String DOSAGE_PERDAY;
	@Column(name="MEDICATION_PERIOD")private String MEDICATION_PERIOD;
		@Column(name="resp_flag")
		private String  respFlag;

		@Column(name="error_msg")
		private String error_msg;

		public NhpmUpdatedDwhDataDtls() {
			super();
			// TODO Auto-generated constructor stub
		}

		public NhpmUpdatedDwhDataDtlsId getId() {
			return id;
		}

		public void setId(NhpmUpdatedDwhDataDtlsId id) {
			this.id = id;
		}

		public String getPATIENT_NAME() {
			return PATIENT_NAME;
		}

		public void setPATIENT_NAME(String pATIENT_NAME) {
			PATIENT_NAME = pATIENT_NAME;
		}

		public String getPATIENT_GENDER() {
			return PATIENT_GENDER;
		}

		public void setPATIENT_GENDER(String pATIENT_GENDER) {
			PATIENT_GENDER = pATIENT_GENDER;
		}

		public Number getPATIENT_AGE() {
			return PATIENT_AGE;
		}

		public void setPATIENT_AGE(Number pATIENT_AGE) {
			PATIENT_AGE = pATIENT_AGE;
		}

		public Number getPATIENT_BIRTH_YEAR() {
			return PATIENT_BIRTH_YEAR;
		}

		public void setPATIENT_BIRTH_YEAR(Number pATIENT_BIRTH_YEAR) {
			PATIENT_BIRTH_YEAR = pATIENT_BIRTH_YEAR;
		}

		public Number getPATIENT_CONTACT() {
			return PATIENT_CONTACT;
		}

		public void setPATIENT_CONTACT(Number pATIENT_CONTACT) {
			PATIENT_CONTACT = pATIENT_CONTACT;
		}

		public Number getDISTRICT_LGD_CODE() {
			return DISTRICT_LGD_CODE;
		}

		public void setDISTRICT_LGD_CODE(Number dISTRICT_LGD_CODE) {
			DISTRICT_LGD_CODE = dISTRICT_LGD_CODE;
		}

		public String getPATIENT_ADDRESS() {
			return PATIENT_ADDRESS;
		}

		public void setPATIENT_ADDRESS(String pATIENT_ADDRESS) {
			PATIENT_ADDRESS = pATIENT_ADDRESS;
		}

		public String getPATIENT_BLOCK() {
			return PATIENT_BLOCK;
		}

		public void setPATIENT_BLOCK(String pATIENT_BLOCK) {
			PATIENT_BLOCK = pATIENT_BLOCK;
		}

		public String getPATIENT_VILLAGE() {
			return PATIENT_VILLAGE;
		}

		public void setPATIENT_VILLAGE(String pATIENT_VILLAGE) {
			PATIENT_VILLAGE = pATIENT_VILLAGE;
		}

		public String getPATIENT_BLOCKORULB() {
			return PATIENT_BLOCKORULB;
		}

		public void setPATIENT_BLOCKORULB(String pATIENT_BLOCKORULB) {
			PATIENT_BLOCKORULB = pATIENT_BLOCKORULB;
		}

		public String getPATIENT_CITYORTOWN() {
			return PATIENT_CITYORTOWN;
		}

		public void setPATIENT_CITYORTOWN(String pATIENT_CITYORTOWN) {
			PATIENT_CITYORTOWN = pATIENT_CITYORTOWN;
		}

		public String getMEMBER_TYPE() {
			return MEMBER_TYPE;
		}

		public void setMEMBER_TYPE(String mEMBER_TYPE) {
			MEMBER_TYPE = mEMBER_TYPE;
		}

		public Number getPINCODE() {
			return PINCODE;
		}

		public void setPINCODE(Number pINCODE) {
			PINCODE = pINCODE;
		}

		public Date getDATE_OF_REGISTRATION() {
			return DATE_OF_REGISTRATION;
		}

		public void setDATE_OF_REGISTRATION(Date dATE_OF_REGISTRATION) {
			DATE_OF_REGISTRATION = dATE_OF_REGISTRATION;
		}

		public Date getADMISSION_DATE() {
			return ADMISSION_DATE;
		}

		public void setADMISSION_DATE(Date aDMISSION_DATE) {
			ADMISSION_DATE = aDMISSION_DATE;
		}

		public Date getTREATMENTORSURGERY_DATE() {
			return TREATMENTORSURGERY_DATE;
		}

		public void setTREATMENTORSURGERY_DATE(Date tREATMENTORSURGERY_DATE) {
			TREATMENTORSURGERY_DATE = tREATMENTORSURGERY_DATE;
		}

		public Date getSURGERY_START_TIME() {
			return SURGERY_START_TIME;
		}

		public void setSURGERY_START_TIME(Date sURGERY_START_TIME) {
			SURGERY_START_TIME = sURGERY_START_TIME;
		}

		public Date getSURGERY_END_TIME() {
			return SURGERY_END_TIME;
		}

		public void setSURGERY_END_TIME(Date sURGERY_END_TIME) {
			SURGERY_END_TIME = sURGERY_END_TIME;
		}

		public Date getDEATH_DATE() {
			return DEATH_DATE;
		}

		public void setDEATH_DATE(Date dEATH_DATE) {
			DEATH_DATE = dEATH_DATE;
		}

		public Number getBILL_AMOUNT() {
			return BILL_AMOUNT;
		}

		public void setBILL_AMOUNT(Number bILL_AMOUNT) {
			BILL_AMOUNT = bILL_AMOUNT;
		}

		public Date getBILL_DATE() {
			return BILL_DATE;
		}

		public void setBILL_DATE(Date bILL_DATE) {
			BILL_DATE = bILL_DATE;
		}

		public Number getTOTAL_CLAIM_AMOUNT() {
			return TOTAL_CLAIM_AMOUNT;
		}

		public void setTOTAL_CLAIM_AMOUNT(Number tOTAL_CLAIM_AMOUNT) {
			TOTAL_CLAIM_AMOUNT = tOTAL_CLAIM_AMOUNT;
		}

		public Number getINSURANCE_APPROVED_AMOUNT() {
			return INSURANCE_APPROVED_AMOUNT;
		}

		public void setINSURANCE_APPROVED_AMOUNT(Number iNSURANCE_APPROVED_AMOUNT) {
			INSURANCE_APPROVED_AMOUNT = iNSURANCE_APPROVED_AMOUNT;
		}

		public Number getTRUST_APPROVED_AMOUNT() {
			return TRUST_APPROVED_AMOUNT;
		}

		public void setTRUST_APPROVED_AMOUNT(Number tRUST_APPROVED_AMOUNT) {
			TRUST_APPROVED_AMOUNT = tRUST_APPROVED_AMOUNT;
		}

		public Number getPENALTY_AMOUNT() {
			return PENALTY_AMOUNT;
		}

		public void setPENALTY_AMOUNT(Number pENALTY_AMOUNT) {
			PENALTY_AMOUNT = pENALTY_AMOUNT;
		}

		public String getSPECIAL_CASE() {
			return SPECIAL_CASE;
		}

		public void setSPECIAL_CASE(String sPECIAL_CASE) {
			SPECIAL_CASE = sPECIAL_CASE;
		}

		public String getDIAGNOSIS_SUPPORTEDEVIDENCE() {
			return DIAGNOSIS_SUPPORTEDEVIDENCE;
		}

		public void setDIAGNOSIS_SUPPORTEDEVIDENCE(String dIAGNOSIS_SUPPORTEDEVIDENCE) {
			DIAGNOSIS_SUPPORTEDEVIDENCE = dIAGNOSIS_SUPPORTEDEVIDENCE;
		}

		public String getCASE_MGMT_AT_STND_TRMNT_PTCLS() {
			return CASE_MGMT_AT_STND_TRMNT_PTCLS;
		}

		public void setCASE_MGMT_AT_STND_TRMNT_PTCLS(String cASE_MGMT_AT_STND_TRMNT_PTCLS) {
			CASE_MGMT_AT_STND_TRMNT_PTCLS = cASE_MGMT_AT_STND_TRMNT_PTCLS;
		}

		public String getEVIDENCE_OF_THERAPY() {
			return EVIDENCE_OF_THERAPY;
		}

		public void setEVIDENCE_OF_THERAPY(String eVIDENCE_OF_THERAPY) {
			EVIDENCE_OF_THERAPY = eVIDENCE_OF_THERAPY;
		}

		public String getMANDATORY_REPORTS_ATTACHED() {
			return MANDATORY_REPORTS_ATTACHED;
		}

		public void setMANDATORY_REPORTS_ATTACHED(String mANDATORY_REPORTS_ATTACHED) {
			MANDATORY_REPORTS_ATTACHED = mANDATORY_REPORTS_ATTACHED;
		}

		public String getDOCTOR_TYPE() {
			return DOCTOR_TYPE;
		}

		public void setDOCTOR_TYPE(String dOCTOR_TYPE) {
			DOCTOR_TYPE = dOCTOR_TYPE;
		}

		public String getDOC_REGN_NO() {
			return DOC_REGN_NO;
		}

		public void setDOC_REGN_NO(String dOC_REGN_NO) {
			DOC_REGN_NO = dOC_REGN_NO;
		}

		public String getDOC_QUALIFICATION() {
			return DOC_QUALIFICATION;
		}

		public void setDOC_QUALIFICATION(String dOC_QUALIFICATION) {
			DOC_QUALIFICATION = dOC_QUALIFICATION;
		}

		public String getDOC_CONTACT() {
			return DOC_CONTACT;
		}

		public void setDOC_CONTACT(String dOC_CONTACT) {
			DOC_CONTACT = dOC_CONTACT;
		}

		public String getANESTHETIST_NAME() {
			return ANESTHETIST_NAME;
		}

		public void setANESTHETIST_NAME(String aNESTHETIST_NAME) {
			ANESTHETIST_NAME = aNESTHETIST_NAME;
		}

		public Number getANESTHETIST_REG_NO() {
			return ANESTHETIST_REG_NO;
		}

		public void setANESTHETIST_REG_NO(Number aNESTHETIST_REG_NO) {
			ANESTHETIST_REG_NO = aNESTHETIST_REG_NO;
		}

		public String getANESTHETIST_CONTACT() {
			return ANESTHETIST_CONTACT;
		}

		public void setANESTHETIST_CONTACT(String aNESTHETIST_CONTACT) {
			ANESTHETIST_CONTACT = aNESTHETIST_CONTACT;
		}

		public String getANESTHESIA_TYPE() {
			return ANESTHESIA_TYPE;
		}

		public void setANESTHESIA_TYPE(String aNESTHESIA_TYPE) {
			ANESTHESIA_TYPE = aNESTHESIA_TYPE;
		}

		public String getPARAMEDIC_NAME() {
			return PARAMEDIC_NAME;
		}

		public void setPARAMEDIC_NAME(String pARAMEDIC_NAME) {
			PARAMEDIC_NAME = pARAMEDIC_NAME;
		}

		public String getNURSE_NAME() {
			return NURSE_NAME;
		}

		public void setNURSE_NAME(String nURSE_NAME) {
			NURSE_NAME = nURSE_NAME;
		}

		public String getEXPECTED_HOSP_STAY() {
			return EXPECTED_HOSP_STAY;
		}

		public void setEXPECTED_HOSP_STAY(String eXPECTED_HOSP_STAY) {
			EXPECTED_HOSP_STAY = eXPECTED_HOSP_STAY;
		}

		public String getINCISION_TYPE() {
			return INCISION_TYPE;
		}

		public void setINCISION_TYPE(String iNCISION_TYPE) {
			INCISION_TYPE = iNCISION_TYPE;
		}

		public String getOP_PHOTOS_WEBEX_TAKEN() {
			return OP_PHOTOS_WEBEX_TAKEN;
		}

		public void setOP_PHOTOS_WEBEX_TAKEN(String oP_PHOTOS_WEBEX_TAKEN) {
			OP_PHOTOS_WEBEX_TAKEN = oP_PHOTOS_WEBEX_TAKEN;
		}

		public String getVIDEO_RECORDING_DONE() {
			return VIDEO_RECORDING_DONE;
		}

		public void setVIDEO_RECORDING_DONE(String vIDEO_RECORDING_DONE) {
			VIDEO_RECORDING_DONE = vIDEO_RECORDING_DONE;
		}

		public String getSWAB_INSTRUMENTS_COUNT() {
			return SWAB_INSTRUMENTS_COUNT;
		}

		public void setSWAB_INSTRUMENTS_COUNT(String sWAB_INSTRUMENTS_COUNT) {
			SWAB_INSTRUMENTS_COUNT = sWAB_INSTRUMENTS_COUNT;
		}

		public String getSUTURES_LIGATURES() {
			return SUTURES_LIGATURES;
		}

		public void setSUTURES_LIGATURES(String sUTURES_LIGATURES) {
			SUTURES_LIGATURES = sUTURES_LIGATURES;
		}

		public String getSPECIMEN_REMOVED() {
			return SPECIMEN_REMOVED;
		}

		public void setSPECIMEN_REMOVED(String sPECIMEN_REMOVED) {
			SPECIMEN_REMOVED = sPECIMEN_REMOVED;
		}

		public String getDRAINAGE_COUNT() {
			return DRAINAGE_COUNT;
		}

		public void setDRAINAGE_COUNT(String dRAINAGE_COUNT) {
			DRAINAGE_COUNT = dRAINAGE_COUNT;
		}

		public String getBLOOD_LOSS() {
			return BLOOD_LOSS;
		}

		public void setBLOOD_LOSS(String bLOOD_LOSS) {
			BLOOD_LOSS = bLOOD_LOSS;
		}

		public String getPOST_OPERATIVE_INSTRUCTIONS() {
			return POST_OPERATIVE_INSTRUCTIONS;
		}

		public void setPOST_OPERATIVE_INSTRUCTIONS(String pOST_OPERATIVE_INSTRUCTIONS) {
			POST_OPERATIVE_INSTRUCTIONS = pOST_OPERATIVE_INSTRUCTIONS;
		}

		public String getPATIENT_CONDITION() {
			return PATIENT_CONDITION;
		}

		public void setPATIENT_CONDITION(String pATIENT_CONDITION) {
			PATIENT_CONDITION = pATIENT_CONDITION;
		}

		public String getCOMPLICATIONS_REMARKS() {
			return COMPLICATIONS_REMARKS;
		}

		public void setCOMPLICATIONS_REMARKS(String cOMPLICATIONS_REMARKS) {
			COMPLICATIONS_REMARKS = cOMPLICATIONS_REMARKS;
		}

		public String getTREATMENT_GIVEN() {
			return TREATMENT_GIVEN;
		}

		public void setTREATMENT_GIVEN(String tREATMENT_GIVEN) {
			TREATMENT_GIVEN = tREATMENT_GIVEN;
		}

		public String getOPERATIVE_FINDINGS() {
			return OPERATIVE_FINDINGS;
		}

		public void setOPERATIVE_FINDINGS(String oPERATIVE_FINDINGS) {
			OPERATIVE_FINDINGS = oPERATIVE_FINDINGS;
		}

		public String getPOST_OPERATIVE_PERIOD() {
			return POST_OPERATIVE_PERIOD;
		}

		public void setPOST_OPERATIVE_PERIOD(String pOST_OPERATIVE_PERIOD) {
			POST_OPERATIVE_PERIOD = pOST_OPERATIVE_PERIOD;
		}

		public String getDISCHARGE_STATUS() {
			return DISCHARGE_STATUS;
		}

		public void setDISCHARGE_STATUS(String dISCHARGE_STATUS) {
			DISCHARGE_STATUS = dISCHARGE_STATUS;
		}

		public String getDISCHARGE_REVIEW() {
			return DISCHARGE_REVIEW;
		}

		public void setDISCHARGE_REVIEW(String dISCHARGE_REVIEW) {
			DISCHARGE_REVIEW = dISCHARGE_REVIEW;
		}

		public String getDISCHARGE_ADVICE() {
			return DISCHARGE_ADVICE;
		}

		public void setDISCHARGE_ADVICE(String dISCHARGE_ADVICE) {
			DISCHARGE_ADVICE = dISCHARGE_ADVICE;
		}

		public String getCAUSE_OF_DEATH() {
			return CAUSE_OF_DEATH;
		}

		public void setCAUSE_OF_DEATH(String cAUSE_OF_DEATH) {
			CAUSE_OF_DEATH = cAUSE_OF_DEATH;
		}

		public String getADMISSION_TYPE() {
			return ADMISSION_TYPE;
		}

		public void setADMISSION_TYPE(String aDMISSION_TYPE) {
			ADMISSION_TYPE = aDMISSION_TYPE;
		}

		public String getPROPOSED_SGYORTMNT_DT_REMARKS() {
			return PROPOSED_SGYORTMNT_DT_REMARKS;
		}

		public void setPROPOSED_SGYORTMNT_DT_REMARKS(String pROPOSED_SGYORTMNT_DT_REMARKS) {
			PROPOSED_SGYORTMNT_DT_REMARKS = pROPOSED_SGYORTMNT_DT_REMARKS;
		}

		public String getPATIENT_DIAGNOSEDBY() {
			return PATIENT_DIAGNOSEDBY;
		}

		public void setPATIENT_DIAGNOSEDBY(String pATIENT_DIAGNOSEDBY) {
			PATIENT_DIAGNOSEDBY = pATIENT_DIAGNOSEDBY;
		}

		public String getDOCTOR_NAME() {
			return DOCTOR_NAME;
		}

		public void setDOCTOR_NAME(String dOCTOR_NAME) {
			DOCTOR_NAME = dOCTOR_NAME;
		}

		public String getPROCEDURE_CONSENT() {
			return PROCEDURE_CONSENT;
		}

		public void setPROCEDURE_CONSENT(String pROCEDURE_CONSENT) {
			PROCEDURE_CONSENT = pROCEDURE_CONSENT;
		}

		public String getMEDCO_LEGAL_CASE() {
			return MEDCO_LEGAL_CASE;
		}

		public void setMEDCO_LEGAL_CASE(String mEDCO_LEGAL_CASE) {
			MEDCO_LEGAL_CASE = mEDCO_LEGAL_CASE;
		}

		public String getCLINICAL_DATE() {
			return CLINICAL_DATE;
		}

		public void setCLINICAL_DATE(String cLINICAL_DATE) {
			CLINICAL_DATE = cLINICAL_DATE;
		}

		public String getHEIGHT() {
			return HEIGHT;
		}

		public void setHEIGHT(String hEIGHT) {
			HEIGHT = hEIGHT;
		}

		public String getWEIGHT() {
			return WEIGHT;
		}

		public void setWEIGHT(String wEIGHT) {
			WEIGHT = wEIGHT;
		}

		public String getBMI() {
			return BMI;
		}

		public void setBMI(String bMI) {
			BMI = bMI;
		}

		public String getPALLOR() {
			return PALLOR;
		}

		public void setPALLOR(String pALLOR) {
			PALLOR = pALLOR;
		}

		public String getCYANOSIS() {
			return CYANOSIS;
		}

		public void setCYANOSIS(String cYANOSIS) {
			CYANOSIS = cYANOSIS;
		}

		public String getCLUBBING_OF_FINGERSANDTOES() {
			return CLUBBING_OF_FINGERSANDTOES;
		}

		public void setCLUBBING_OF_FINGERSANDTOES(String cLUBBING_OF_FINGERSANDTOES) {
			CLUBBING_OF_FINGERSANDTOES = cLUBBING_OF_FINGERSANDTOES;
		}

		public String getLYMPHADENOPATHY() {
			return LYMPHADENOPATHY;
		}

		public void setLYMPHADENOPATHY(String lYMPHADENOPATHY) {
			LYMPHADENOPATHY = lYMPHADENOPATHY;
		}

		public String getOEDEMA_IN_FEET() {
			return OEDEMA_IN_FEET;
		}

		public void setOEDEMA_IN_FEET(String oEDEMA_IN_FEET) {
			OEDEMA_IN_FEET = oEDEMA_IN_FEET;
		}

		public String getMALNUTRITION() {
			return MALNUTRITION;
		}

		public void setMALNUTRITION(String mALNUTRITION) {
			MALNUTRITION = mALNUTRITION;
		}

		public String getDEHYDRATION() {
			return DEHYDRATION;
		}

		public void setDEHYDRATION(String dEHYDRATION) {
			DEHYDRATION = dEHYDRATION;
		}

		public String getBP77() {
			return BP77;
		}

		public void setBP77(String bP77) {
			BP77 = bP77;
		}

		public String getPULSE_RATE() {
			return PULSE_RATE;
		}

		public void setPULSE_RATE(String pULSE_RATE) {
			PULSE_RATE = pULSE_RATE;
		}

		public String getTEMPERATURE() {
			return TEMPERATURE;
		}

		public void setTEMPERATURE(String tEMPERATURE) {
			TEMPERATURE = tEMPERATURE;
		}

		public String getWARD_TYPE() {
			return WARD_TYPE;
		}

		public void setWARD_TYPE(String wARD_TYPE) {
			WARD_TYPE = wARD_TYPE;
		}

		public String getRESPIRATORY_RATE() {
			return RESPIRATORY_RATE;
		}

		public void setRESPIRATORY_RATE(String rESPIRATORY_RATE) {
			RESPIRATORY_RATE = rESPIRATORY_RATE;
		}

		public String getHEART_SOUNDS() {
			return HEART_SOUNDS;
		}

		public void setHEART_SOUNDS(String hEART_SOUNDS) {
			HEART_SOUNDS = hEART_SOUNDS;
		}

		public String getLUNGS() {
			return LUNGS;
		}

		public void setLUNGS(String lUNGS) {
			LUNGS = lUNGS;
		}

		public String getFLUID_INPUT() {
			return FLUID_INPUT;
		}

		public void setFLUID_INPUT(String fLUID_INPUT) {
			FLUID_INPUT = fLUID_INPUT;
		}

		public String getFLUID_OUTPUT() {
			return FLUID_OUTPUT;
		}

		public void setFLUID_OUTPUT(String fLUID_OUTPUT) {
			FLUID_OUTPUT = fLUID_OUTPUT;
		}

		public String getOP_NO() {
			return OP_NO;
		}

		public void setOP_NO(String oP_NO) {
			OP_NO = oP_NO;
		}

		public String getIP_NO() {
			return IP_NO;
		}

		public void setIP_NO(String iP_NO) {
			IP_NO = iP_NO;
		}

		public String getREMARKS() {
			return REMARKS;
		}

		public void setREMARKS(String rEMARKS) {
			REMARKS = rEMARKS;
		}

		public String getPULSE_RATE_PER_MINUTE() {
			return PULSE_RATE_PER_MINUTE;
		}

		public void setPULSE_RATE_PER_MINUTE(String pULSE_RATE_PER_MINUTE) {
			PULSE_RATE_PER_MINUTE = pULSE_RATE_PER_MINUTE;
		}

		public String getRESPIRATION_RATE() {
			return RESPIRATION_RATE;
		}

		public void setRESPIRATION_RATE(String rESPIRATION_RATE) {
			RESPIRATION_RATE = rESPIRATION_RATE;
		}

		public String getBPLTARM() {
			return BPLTARM;
		}

		public void setBPLTARM(String bPLTARM) {
			BPLTARM = bPLTARM;
		}

		public String getBPRTARM() {
			return BPRTARM;
		}

		public void setBPRTARM(String bPRTARM) {
			BPRTARM = bPRTARM;
		}

		public String getAPPETITE() {
			return APPETITE;
		}

		public void setAPPETITE(String aPPETITE) {
			APPETITE = aPPETITE;
		}

		public String getDIET() {
			return DIET;
		}

		public void setDIET(String dIET) {
			DIET = dIET;
		}

		public String getBOWELS() {
			return BOWELS;
		}

		public void setBOWELS(String bOWELS) {
			BOWELS = bOWELS;
		}

		public String getKNOWN_ALLERGIES() {
			return KNOWN_ALLERGIES;
		}

		public void setKNOWN_ALLERGIES(String kNOWN_ALLERGIES) {
			KNOWN_ALLERGIES = kNOWN_ALLERGIES;
		}

		public String getHABITS_OR_ADDICTIONS() {
			return HABITS_OR_ADDICTIONS;
		}

		public void setHABITS_OR_ADDICTIONS(String hABITS_OR_ADDICTIONS) {
			HABITS_OR_ADDICTIONS = hABITS_OR_ADDICTIONS;
		}

		public String getHISTORY_OF_PASTILLNESS() {
			return HISTORY_OF_PASTILLNESS;
		}

		public void setHISTORY_OF_PASTILLNESS(String hISTORY_OF_PASTILLNESS) {
			HISTORY_OF_PASTILLNESS = hISTORY_OF_PASTILLNESS;
		}

		public String getFAMILY_HISTORY() {
			return FAMILY_HISTORY;
		}

		public void setFAMILY_HISTORY(String fAMILY_HISTORY) {
			FAMILY_HISTORY = fAMILY_HISTORY;
		}

		public String getMAIN_SYMPTOM_NAME() {
			return MAIN_SYMPTOM_NAME;
		}

		public void setMAIN_SYMPTOM_NAME(String mAIN_SYMPTOM_NAME) {
			MAIN_SYMPTOM_NAME = mAIN_SYMPTOM_NAME;
		}

		public String getSUB_SYMPTOM_NAME() {
			return SUB_SYMPTOM_NAME;
		}

		public void setSUB_SYMPTOM_NAME(String sUB_SYMPTOM_NAME) {
			SUB_SYMPTOM_NAME = sUB_SYMPTOM_NAME;
		}

		public String getSYMPTOM_NAME() {
			return SYMPTOM_NAME;
		}

		public void setSYMPTOM_NAME(String sYMPTOM_NAME) {
			SYMPTOM_NAME = sYMPTOM_NAME;
		}

		public String getINVESTIGATION_BLOCK_NAME() {
			return INVESTIGATION_BLOCK_NAME;
		}

		public void setINVESTIGATION_BLOCK_NAME(String iNVESTIGATION_BLOCK_NAME) {
			INVESTIGATION_BLOCK_NAME = iNVESTIGATION_BLOCK_NAME;
		}

		public String getINVESTIGATION_NAME() {
			return INVESTIGATION_NAME;
		}

		public void setINVESTIGATION_NAME(String iNVESTIGATION_NAME) {
			INVESTIGATION_NAME = iNVESTIGATION_NAME;
		}

		public String getPRIMARY_DIAGNOSIS() {
			return PRIMARY_DIAGNOSIS;
		}

		public void setPRIMARY_DIAGNOSIS(String pRIMARY_DIAGNOSIS) {
			PRIMARY_DIAGNOSIS = pRIMARY_DIAGNOSIS;
		}

		public String getCATEGORY() {
			return CATEGORY;
		}

		public void setCATEGORY(String cATEGORY) {
			CATEGORY = cATEGORY;
		}

		public String getPROCEDURE() {
			return PROCEDURE;
		}

		public void setPROCEDURE(String pROCEDURE) {
			PROCEDURE = pROCEDURE;
		}

		public String getTREATING_DOCTOR() {
			return TREATING_DOCTOR;
		}

		public void setTREATING_DOCTOR(String tREATING_DOCTOR) {
			TREATING_DOCTOR = tREATING_DOCTOR;
		}

		public String getINVESTIGATIONS() {
			return INVESTIGATIONS;
		}

		public void setINVESTIGATIONS(String iNVESTIGATIONS) {
			INVESTIGATIONS = iNVESTIGATIONS;
		}

		public String getINVESTIGATION_DOCTOR_NAME() {
			return INVESTIGATION_DOCTOR_NAME;
		}

		public void setINVESTIGATION_DOCTOR_NAME(String iNVESTIGATION_DOCTOR_NAME) {
			INVESTIGATION_DOCTOR_NAME = iNVESTIGATION_DOCTOR_NAME;
		}

		public String getDOCTOR_DAILY_NOTES() {
			return DOCTOR_DAILY_NOTES;
		}

		public void setDOCTOR_DAILY_NOTES(String dOCTOR_DAILY_NOTES) {
			DOCTOR_DAILY_NOTES = dOCTOR_DAILY_NOTES;
		}

		public String getBL() {
			return BL;
		}

		public void setBL(String bL) {
			BL = bL;
		}

		public String getBBF() {
			return BBF;
		}

		public void setBBF(String bBF) {
			BBF = bBF;
		}

		public String getBD() {
			return BD;
		}

		public void setBD(String bD) {
			BD = bD;
		}

		public String getMN() {
			return MN;
		}

		public void setMN(String mN) {
			MN = mN;
		}

		public String getINSULIN_DOSAGE() {
			return INSULIN_DOSAGE;
		}

		public void setINSULIN_DOSAGE(String iNSULIN_DOSAGE) {
			INSULIN_DOSAGE = iNSULIN_DOSAGE;
		}

		public String getMAIN_GROUP_NAME() {
			return MAIN_GROUP_NAME;
		}

		public void setMAIN_GROUP_NAME(String mAIN_GROUP_NAME) {
			MAIN_GROUP_NAME = mAIN_GROUP_NAME;
		}

		public String getTHERAPEUTIC_MAIN_GROUP_NAME() {
			return THERAPEUTIC_MAIN_GROUP_NAME;
		}

		public void setTHERAPEUTIC_MAIN_GROUP_NAME(String tHERAPEUTIC_MAIN_GROUP_NAME) {
			THERAPEUTIC_MAIN_GROUP_NAME = tHERAPEUTIC_MAIN_GROUP_NAME;
		}

		public String getPHARMACOLOGICAL_SUBGRP_NAME() {
			return PHARMACOLOGICAL_SUBGRP_NAME;
		}

		public void setPHARMACOLOGICAL_SUBGRP_NAME(String pHARMACOLOGICAL_SUBGRP_NAME) {
			PHARMACOLOGICAL_SUBGRP_NAME = pHARMACOLOGICAL_SUBGRP_NAME;
		}

		public String getCHEMICAL_SUBGROUP_NAME() {
			return CHEMICAL_SUBGROUP_NAME;
		}

		public void setCHEMICAL_SUBGROUP_NAME(String cHEMICAL_SUBGROUP_NAME) {
			CHEMICAL_SUBGROUP_NAME = cHEMICAL_SUBGROUP_NAME;
		}

		public String getCHEMICAL_SUBSTANCE_NAME() {
			return CHEMICAL_SUBSTANCE_NAME;
		}

		public void setCHEMICAL_SUBSTANCE_NAME(String cHEMICAL_SUBSTANCE_NAME) {
			CHEMICAL_SUBSTANCE_NAME = cHEMICAL_SUBSTANCE_NAME;
		}

		public String getROUTE_TYPE() {
			return ROUTE_TYPE;
		}

		public void setROUTE_TYPE(String rOUTE_TYPE) {
			ROUTE_TYPE = rOUTE_TYPE;
		}

		public String getROUTE_NAME() {
			return ROUTE_NAME;
		}

		public void setROUTE_NAME(String rOUTE_NAME) {
			ROUTE_NAME = rOUTE_NAME;
		}

		public String getSTRENGTH_TYPE() {
			return STRENGTH_TYPE;
		}

		public void setSTRENGTH_TYPE(String sTRENGTH_TYPE) {
			STRENGTH_TYPE = sTRENGTH_TYPE;
		}

		public String getSTRENGTH_NAME() {
			return STRENGTH_NAME;
		}

		public void setSTRENGTH_NAME(String sTRENGTH_NAME) {
			STRENGTH_NAME = sTRENGTH_NAME;
		}

		public String getDOSAGE_PERDAY() {
			return DOSAGE_PERDAY;
		}

		public void setDOSAGE_PERDAY(String dOSAGE_PERDAY) {
			DOSAGE_PERDAY = dOSAGE_PERDAY;
		}

		public String getMEDICATION_PERIOD() {
			return MEDICATION_PERIOD;
		}

		public void setMEDICATION_PERIOD(String mEDICATION_PERIOD) {
			MEDICATION_PERIOD = mEDICATION_PERIOD;
		}

		public String getRespFlag() {
			return respFlag;
		}

		public void setRespFlag(String respFlag) {
			this.respFlag = respFlag;
		}

		public String getError_msg() {
			return error_msg;
		}

		public void setError_msg(String error_msg) {
			this.error_msg = error_msg;
		}




	
	
}
