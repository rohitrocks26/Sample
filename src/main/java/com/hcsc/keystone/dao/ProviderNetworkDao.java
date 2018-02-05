package com.hcsc.keystone.dao;

import com.hcsc.keystone.model.ProviderNetwork;

public interface ProviderNetworkDao  {

	public ProviderNetwork getAdminPlan(Integer adminPlanID);

	public boolean addAdminPlan(ProviderNetwork providerNetwork);

}
