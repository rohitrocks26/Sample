package com.hcsc.keystone.dao;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcsc.keystone.model.ProviderNetwork;

@Repository("providerNetworkDao")
public class ProviderNetworkDaoImpl implements ProviderNetworkDao {

	@Autowired
	private ProviderRepository providerRepository;

	public void setProviderRepository(ProviderRepository providerRepository) {
		this.providerRepository = providerRepository;
	}

	@Override
	public ProviderNetwork getAdminPlan(Integer adminPlanID) {
		if(providerRepository.exists(adminPlanID)) {
			System.out.println("Hi");
		}
		
		Iterator<ProviderNetwork> iterable = this.providerRepository.findAll().iterator();
		while(iterable.hasNext()) {
			System.out.println(iterable.next().toString());
		}
		return this.providerRepository.findByPlanId(adminPlanID);
	}

	@Override
	public boolean addAdminPlan(ProviderNetwork providerNetwork) {

		return false;
	}

}
