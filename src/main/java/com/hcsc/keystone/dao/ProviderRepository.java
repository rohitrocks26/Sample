package com.hcsc.keystone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcsc.keystone.model.ProviderNetwork;

@Repository
public interface ProviderRepository extends JpaRepository<ProviderNetwork, Integer> {
	
	@Query("select p from ProviderNetwork p where p.adminPlanId = :adminPlanId")
	public ProviderNetwork findByPlanId(@Param("adminPlanId")Integer adminPlanId);
	
}
