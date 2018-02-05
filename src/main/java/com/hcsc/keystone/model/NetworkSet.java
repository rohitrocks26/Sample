package com.hcsc.keystone.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="NetworkSet")
public class NetworkSet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer networkSetID;
	
	private String networkSetName;
	private int providerNPI_ID;
	private String providerTAX_ID;
	private LocalDate effectiveDate;
	private LocalDate terminationDate;

	public String getNetworkSetName() {
		return networkSetName;
	}

	public void setNetworkSetName(String networkSetName) {
		this.networkSetName = networkSetName;
	}

	public int getProviderNPI_ID() {
		return providerNPI_ID;
	}

	public void setProviderNPI_ID(int providerNPI_ID) {
		this.providerNPI_ID = providerNPI_ID;
	}

	public String getProviderTAX_ID() {
		return providerTAX_ID;
	}

	public void setProviderTAX_ID(String providerTAX_ID) {
		this.providerTAX_ID = providerTAX_ID;
	}

	public LocalDate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(LocalDate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public LocalDate getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(LocalDate terminationDate) {
		this.terminationDate = terminationDate;
	}

	@Override
	public String toString() {
		return "NetworkSet [networkSetID=" + networkSetID + ", networkSetName=" + networkSetName + ", providerNPI_ID="
				+ providerNPI_ID + ", providerTAX_ID=" + providerTAX_ID + ", effectiveDate=" + effectiveDate
				+ ", terminationDate=" + terminationDate + "]";
	}

	
}
