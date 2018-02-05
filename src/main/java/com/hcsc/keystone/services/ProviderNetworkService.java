package com.hcsc.keystone.services;

import org.springframework.stereotype.Service;

import com.hcsc.keystone.model.ProviderNetwork;

@Service("ProviderNetworkService")
public interface ProviderNetworkService {

	public ProviderNetwork getAdminPlan(int adminPlanID);
	public boolean addAdminPlan(ProviderNetwork providerNetwork);
	
}
