package com.hcsc.keystone.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "Network")
public class Network {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer networkId;

	private String networkPlan;
	private int networkLevel;
	private String networkName;
	private String networkStatus;

	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<NetworkSet> proffessionalNetworkSetList;

	@OneToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<NetworkSet> facilityNetworkSetList;

	public String getNetworkPlan() {
		return networkPlan;
	}

	public void setNetworkPlan(String networkPlan) {
		this.networkPlan = networkPlan;
	}

	public int getNetworkLevel() {
		return networkLevel;
	}

	public void setNetworkLevel(int networkLevel) {
		this.networkLevel = networkLevel;
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public String getNetworkStatus() {
		return networkStatus;
	}

	public void setNetworkStatus(String networkStatus) {
		this.networkStatus = networkStatus;
	}

	public List<NetworkSet> getProffessionalNetworkSetList() {

		if (proffessionalNetworkSetList == null) {
			proffessionalNetworkSetList = new ArrayList<NetworkSet>();
		}
		return proffessionalNetworkSetList;
	}

	public void setProffessionalNetworkSetList(List<NetworkSet> proffessionalNetworkSetList) {
		this.proffessionalNetworkSetList = proffessionalNetworkSetList;
	}

	public List<NetworkSet> getFacilityNetworkSetList() {
		if (facilityNetworkSetList == null) {
			facilityNetworkSetList = new ArrayList<NetworkSet>();
		}
		return facilityNetworkSetList;
	}

	public void setFacilityNetworkSetList(List<NetworkSet> facilityNetworkSetList) {
		this.facilityNetworkSetList = facilityNetworkSetList;
	}

	@Override
	public String toString() {
		return "Network [networkId=" + networkId + ", networkPlan=" + networkPlan + ", networkLevel=" + networkLevel
				+ ", networkName=" + networkName + ", networkStatus=" + networkStatus + ", proffessionalNetworkSetList="
				+ proffessionalNetworkSetList + ", facilityNetworkSetList=" + facilityNetworkSetList + "]";
	}

	

}
