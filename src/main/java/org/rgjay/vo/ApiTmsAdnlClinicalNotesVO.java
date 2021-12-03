package org.rgjay.vo;

public class ApiTmsAdnlClinicalNotesVO
{
	
	

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
public ApiTmsAdnlClinicalNotesVO() {
	super();
	// TODO Auto-generated constructor stub
}



public ApiTmsAdnlClinicalNotesVO(String clinicalDate, String height, String weight,
		String bmi, String pallor, String cyanosis,
		String clubbingOfFingersAndToes, String lymphadenopathy,
		String oedemaInFeet, String malnutrition, String dehydration,
		String bp77, String pulseRate, String temperature, String wardType,
		String respiratoryRate, String heartSounds, String lungs,
		String fluidInput, String fluidOutput, String opNo, String ipNo,
		String clinicalRemarks, String pulseRatePerMinute,
		String respirationRate, String bpltArm, String bprtArm,
		String appetite, String diet, String bowels, String nutrition,
		String knownAllergies, String habitsOrAddictions,
		String historyOfPastIllness, String familyHistory,
		String mainSymptomName, String subSymptomName, String symptomName,
		String investigationBlockName, String investigationName,
		String primaryDiagnosis, String category, String procedure,
		String treatingDoctor, String investigations,
		String inestigationDoctorName, String doctorDailyNotes, String bbf,
		String bl, String bd, String mn, String insulinDosage,
		String mainGroupName, String therapeuticMainGroupName,
		String pharmacologicalSubGrpName, String chemicalSubGroupName,
		String chemicalSubstanceName, String routeType, String routeName,
		String strengthType, String strengthName, String dosagePerday,
		String medicationPeriod) {
	super();
	this.clinicalDate = clinicalDate;
	this.height = height;
	this.weight = weight;
	this.bmi = bmi;
	this.pallor = pallor;
	this.cyanosis = cyanosis;
	this.clubbingOfFingersAndToes = clubbingOfFingersAndToes;
	this.lymphadenopathy = lymphadenopathy;
	this.oedemaInFeet = oedemaInFeet;
	this.malnutrition = malnutrition;
	this.dehydration = dehydration;
	this.bp77 = bp77;
	this.pulseRate = pulseRate;
	this.temperature = temperature;
	this.wardType = wardType;
	this.respiratoryRate = respiratoryRate;
	this.heartSounds = heartSounds;
	this.lungs = lungs;
	this.fluidInput = fluidInput;
	this.fluidOutput = fluidOutput;
	this.opNo = opNo;
	this.ipNo = ipNo;
	this.clinicalRemarks = clinicalRemarks;
	this.pulseRatePerMinute = pulseRatePerMinute;
	this.respirationRate = respirationRate;
	this.bpltArm = bpltArm;
	this.bprtArm = bprtArm;
	this.appetite = appetite;
	this.diet = diet;
	this.bowels = bowels;
	this.nutrition = nutrition;
	this.knownAllergies = knownAllergies;
	this.habitsOrAddictions = habitsOrAddictions;
	this.historyOfPastIllness = historyOfPastIllness;
	this.familyHistory = familyHistory;
	this.mainSymptomName = mainSymptomName;
	this.subSymptomName = subSymptomName;
	this.symptomName = symptomName;
	this.investigationBlockName = investigationBlockName;
	this.investigationName = investigationName;
	this.primaryDiagnosis = primaryDiagnosis;
	this.category = category;
	this.procedure = procedure;
	this.treatingDoctor = treatingDoctor;
	this.investigations = investigations;
	this.inestigationDoctorName = inestigationDoctorName;
	this.doctorDailyNotes = doctorDailyNotes;
	this.bbf = bbf;
	this.bl = bl;
	this.bd = bd;
	this.mn = mn;
	this.insulinDosage = insulinDosage;
	this.mainGroupName = mainGroupName;
	this.therapeuticMainGroupName = therapeuticMainGroupName;
	this.pharmacologicalSubGrpName = pharmacologicalSubGrpName;
	this.chemicalSubGroupName = chemicalSubGroupName;
	this.chemicalSubstanceName = chemicalSubstanceName;
	this.routeType = routeType;
	this.routeName = routeName;
	this.strengthType = strengthType;
	this.strengthName = strengthName;
	this.dosagePerday = dosagePerday;
	this.medicationPeriod = medicationPeriod;
}



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


}
