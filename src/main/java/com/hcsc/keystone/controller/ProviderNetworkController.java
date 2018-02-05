package com.hcsc.keystone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcsc.keystone.model.ProviderNetwork;
import com.hcsc.keystone.services.ProviderNetworkService;

@RestController
@RequestMapping("provider")
public class ProviderNetworkController {

	@Autowired
	private ProviderNetworkService providerNetworkService;

	public void setProviderNetworkService(ProviderNetworkService providerNetworkService) {
		this.providerNetworkService = providerNetworkService;
	}

	@RequestMapping(value = "/network-package/{adminId}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProviderNetwork getNetowrkPackage(@PathVariable(value = "adminId") String id) {
		return this.providerNetworkService.getAdminPlan(Integer.valueOf(id));
	}

	@RequestMapping(value = "/test/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String test() {
		return "welocme to rest work";
	}

}
