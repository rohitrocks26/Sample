package com.hcsc.keystone.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ProviderNetwork")
@JsonIgnoreProperties
public class ProviderNetwork {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer adminPlanId;

	private String networkPackage;
	
	private String dshflshfl;

	@ManyToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Network> networkList;

	public String getNetworkPackage() {
		return networkPackage;
	}

	public void setNetworkPackage(String networkPackage) {
		this.networkPackage = networkPackage;
	}

	public List<Network> getNetworkList() {
		if (networkList == null) {
			networkList = new ArrayList<Network>();
		}
		return networkList;
	}

	public void setNetworkList(List<Network> networkList) {
		this.networkList = networkList;
	}

	@Override
	public String toString() {
		return "ProviderNetwork [adminPlanId=" + adminPlanId + ", networkPackage=" + networkPackage + ", networkList="
				+ networkList + "]";
	}

}
