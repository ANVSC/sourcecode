package org.rgjay.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NhpmUpdatedDwhDataDtlsId implements Serializable
{

	
	@Column(name="STATE_LGD_CODE") private Number STATE_LGD_CODE ;
	@Column(name="STATE_TRN_ID")private String STATE_TRN_ID;
	public String getSTATE_TRN_ID() {
		return STATE_TRN_ID;
	}
	public void setSTATE_TRN_ID(String sTATE_TRN_ID) {
		STATE_TRN_ID = sTATE_TRN_ID;
	}
	
	
	public Number getSTATE_LGD_CODE() {
		return STATE_LGD_CODE;
	}
	public void setSTATE_LGD_CODE(Number sTATE_LGD_CODE) {
		STATE_LGD_CODE = sTATE_LGD_CODE;
	}
	public NhpmUpdatedDwhDataDtlsId() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
