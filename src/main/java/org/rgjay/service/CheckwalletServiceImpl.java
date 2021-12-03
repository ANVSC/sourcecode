package org.rgjay.service;

import org.rgjay.dao.CheckwalletDao;
import org.rgjay.vo.WalletDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CheckwalletServiceImpl implements CheckwalletService
{

	@Autowired
	CheckwalletDao checkwalletDao;
	
	@Override
	public String walletDtls(WalletDetailsVO walletDetails) 
	{
		String resp=checkwalletDao.walletDtls(walletDetails);
		return resp;
	}

	

}
