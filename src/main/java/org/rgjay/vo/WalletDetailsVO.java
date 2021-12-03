package org.rgjay.vo;


public class WalletDetailsVO
{
	private String stateLgdCode;
	
	private String nhpmBeneficiarySrcId;
	private String nhpmBeneficiaryFamilyId;
	
	private String nhpmSchemeRenewalId;

	private String actionType;// ActionType could be check,block or release.
	
	private String requestedAmount;
	
	private String transactionId;
	
	private String applicationType;

	private String enhancementFlag;

	public String getStateLgdCode() {
		return stateLgdCode;
	}

	public void setStateLgdCode(String stateLgdCode) {
		this.stateLgdCode = stateLgdCode;
	}

	public String getNhpmBeneficiarySrcId() {
		return nhpmBeneficiarySrcId;
	}

	public void setNhpmBeneficiarySrcId(String nhpmBeneficiarySrcId) {
		this.nhpmBeneficiarySrcId = nhpmBeneficiarySrcId;
	}

	public String getNhpmBeneficiaryFamilyId() {
		return nhpmBeneficiaryFamilyId;
	}

	public void setNhpmBeneficiaryFamilyId(String nhpmBeneficiaryFamilyId) {
		this.nhpmBeneficiaryFamilyId = nhpmBeneficiaryFamilyId;
	}

	public String getNhpmSchemeRenewalId() {
		return nhpmSchemeRenewalId;
	}

	public void setNhpmSchemeRenewalId(String nhpmSchemeRenewalId) {
		this.nhpmSchemeRenewalId = nhpmSchemeRenewalId;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(String requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getEnhancementFlag() {
		return enhancementFlag;
	}

	public void setEnhancementFlag(String enhancementFlag) {
		this.enhancementFlag = enhancementFlag;
	}

	public WalletDetailsVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
