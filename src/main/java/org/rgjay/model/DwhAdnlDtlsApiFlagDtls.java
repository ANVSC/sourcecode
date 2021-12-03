package org.rgjay.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dwh_adnal_api_flag_dtls")
public class DwhAdnlDtlsApiFlagDtls {
	
	@Column(name="flag")
	private String flag;
	
	@Id
	@Column(name="state_trn_id")
	private String stateTrnId;
	@Column(name="crt_date")
	private Date crtdt;
	
	@Column(name="crt_usr")
	private String crtUsr;


	@Column(name="error_msg")
	private String errorMsg;

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getStateTrnId() {
		return stateTrnId;
	}

	public void setStateTrnId(String stateTrnId) {
		this.stateTrnId = stateTrnId;
	}

	public Date getCrtdt() {
		return crtdt;
	}

	public void setCrtdt(Date crtdt) {
		this.crtdt = crtdt;
	}

	public String getCrtUsr() {
		return crtUsr;
	}

	public void setCrtUsr(String crtUsr) {
		this.crtUsr = crtUsr;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}



	

}
