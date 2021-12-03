package org.rgjay.restControllers;

import org.rgjay.service.CheckwalletService;
import org.rgjay.vo.WalletDetailsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = { "/rgjay" })
public class ApiController
{
	@Autowired
	CheckwalletService checkwalletService;
	
	
	@PostMapping(value = "checkwallet", produces = MediaType.APPLICATION_JSON_VALUE)
	public String walletDetails(@RequestBody WalletDetailsVO walletDetails)
	{
		String resp=null;
		try
		{    System.out.println("in checkwallet api controller"+walletDetails.getStateLgdCode());  
		
			 resp=checkwalletService.walletDtls(walletDetails);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return resp;
		
	}
	
}
