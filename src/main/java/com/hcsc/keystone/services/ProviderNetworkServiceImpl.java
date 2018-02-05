package com.hcsc.keystone.services;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcsc.keystone.dao.ProviderNetworkDao;
import com.hcsc.keystone.model.ProviderNetwork;

@Component("providerNetworkService")
public class ProviderNetworkServiceImpl implements ProviderNetworkService {

	@Autowired
	private ProviderNetworkDao providerNetworkDao;

	public void setProviderNetworkDao(ProviderNetworkDao providerNetworkDao) {
		this.providerNetworkDao = providerNetworkDao;
	}

	@Override
	public ProviderNetwork getAdminPlan(int adminPlanID) {
		System.out.println("Hi");
		//return this.providerNetworkDao.getAdminPlan(adminPlanID);
		
				ClassLoader classLoader = getClass().getClassLoader();
	             ObjectMapper mapper = new ObjectMapper();
	             ProviderNetwork provider = null;
	             
	             try {
	                    provider = mapper.readValue(new File(classLoader.getResource("adminPlan.json").getFile()), ProviderNetwork.class);
	             } catch (JsonParseException e) {
	                    System.out.println("Exception while parsing the json file:  " + e.getMessage());
	             } catch (JsonMappingException e) {
	                    System.out.println("Exception while Mapping the json file to Object:  " + e.getMessage());
	             } catch (IOException e) {
	                    System.out.println("Exception while Reading/Writing the JSON file:  " + e.getMessage());
	             }
	             return provider;
	       } 

		
		
		
		
		
	

	@Override
	public boolean addAdminPlan(ProviderNetwork providerNetwork) {

		return false;
	}

}
