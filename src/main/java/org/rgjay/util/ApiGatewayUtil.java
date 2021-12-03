package org.rgjay.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringWriter;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.google.gson.Gson;

@Component
public class ApiGatewayUtil
{

	public String generateGatewayToken(String clientId,String clientSecret,String authTokenUrl){

			String returnValue=null;
 		    

			final Pattern pat= Pattern.compile(".*\"access_token\"\\s*:\\s*\"([^\"]+)\".*");
			final String auth = clientId + ":" + clientSecret;
			String authentication = new String(Base64.encodeBase64(auth.getBytes()));
			String content = "grant_type=client_credentials";
			BufferedReader reader = null;
			HttpsURLConnection connection = null;
		    System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
		    		System.setProperty("proxyHost", "proxy.com");
		    		System.setProperty("proxyPort", "8080");
			try {
				URL url = new URL(authTokenUrl);
				connection = (HttpsURLConnection) url.openConnection();
				connection.setRequestMethod("POST");
				connection.setDoOutput(true);
				connection.setRequestProperty("Authorization", "Basic " + authentication);
				connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
				connection.setRequestProperty("Accept", "application/json");
				PrintStream os = new PrintStream(connection.getOutputStream());
				os.print(content);
				os.close();
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String line = null;
				StringWriter out = new StringWriter(connection.getContentLength() > 0 ?
				connection.getContentLength() : 2048);
				while ((line = reader.readLine()) != null) {
				out.append(line);
			}
				System.out.println("token:"+out);
				String response = out.toString();
				Matcher matcher = pat.matcher(response);
			if (matcher.matches() && matcher.groupCount() > 0) {
			    returnValue = matcher.group(1);
			  }
			}
			catch (Exception e) {
			    System.out.println("Error : " + e.getMessage());
			}
			finally {
			  if (reader != null) {
				try {
				   reader.close();
				} catch (IOException e) {
				   e.printStackTrace();
				}
			}
			 connection.disconnect();
			}
			return returnValue;
	  }

	
	public String getDtlsByApi(String token,String gatewayUrl,String requestDtls,String flag)
	{
		String response=null;
		try{
 		    System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
    		System.setProperty("proxyHost", "proxy.com");
    		System.setProperty("proxyPort", "8080");

    		//requestDtls="{\"stateLgdCode\":\"27\",\"stateTrnId\":\"89671\",\"patientName\":\"Parmetheous Parmetheous\",\"patientGender\":\"M\",\"patientAge\":\"34\",\"patientBirthYear\":\"1985\",\"patientContact\":\"8956456456\",\"districtLgdCode\":\"501\",\"patientAddress\":\"657\",\"patientVillage\":\"501/03991/530142\",\"patientCityortown\":\"501/03991\",\"pincode\":\"567567\",\"dateOfRegistration\":\"2019-06-04 14:17:07\",\"admissionDate\":\"2019-06-04 14:17:20\",\"treatmentOrSurgeryDate\":\"2019-06-06 18:36:47\",\"surgeryStartTime\":\"2019-06-06 18:36:47\",\"billAmount\":\"500000\",\"billDate\":\"2019-06-05 00:00:00\",\"totalClaimAmount\":\"50000\",\"docRegnNo\":\"S7F24\",\"anesthetistName\":\"yujkfg\",\"anesthetistContact\":\"9999999999\",\"nurseName\":\"gyjhjh\",\"doctorName\":\"undefined\"}";
			RestTemplate restTemplate = new RestTemplate();
		   // String gsonReq=new Gson().toJson(requestDtls);
			HttpHeaders headers=new HttpHeaders();
	    	headers.setContentType(MediaType.APPLICATION_JSON);
	    	//headers.add("Accept","application/json");
	    	//if(flag!=null && flag.equalsIgnoreCase("Y"))
	        headers.add("Authorization","Bearer "+token);
	    	System.out.println("request"+requestDtls.toString());
	    	HttpEntity<String> req= new HttpEntity<String>(requestDtls.toString(),headers);
	    	System.out.println("final request"+req);

	    	ResponseEntity<String> respDtls=restTemplate.exchange(gatewayUrl,HttpMethod.POST,req,String.class);
	        response=respDtls.getBody().toString();
			
	        System.out.println("response"+response);
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;
		

	}


}


