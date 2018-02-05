package com.hcsc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hcsc.keystone.dao.ProviderRepository;
import com.hcsc.keystone.model.Network;
import com.hcsc.keystone.model.NetworkSet;
import com.hcsc.keystone.model.ProviderNetwork;

@SpringBootApplication
@EnableJpaRepositories
public class KeyStoneApplication implements CommandLineRunner {

	@Autowired
	private ProviderRepository providerRepository;

	public static void main(String[] args) {
		SpringApplication.run(KeyStoneApplication.class, args);

	}

	@Override
	public void run(String... arg0) throws Exception {

		ProviderNetwork providerNetwork = new ProviderNetwork();
		List<Network> networks = new ArrayList<Network>();
		providerNetwork.setNetworkPackage("IL1-3 TIER-BCO-BCO/PPO/NOP");

		/* Network 1 */
		Network network1 = new Network();
		network1.setNetworkLevel(1);
		network1.setNetworkName("BCO");
		network1.setNetworkStatus("In Network");

		NetworkSet proNetworkSet1_1 = new NetworkSet();
		proNetworkSet1_1.setNetworkSetName("BCO");
		NetworkSet proNetworkSet1_2 = new NetworkSet();
		proNetworkSet1_2.setNetworkSetName("INJ");
		NetworkSet proNetworkSet1_3 = new NetworkSet();
		proNetworkSet1_3.setNetworkSetName("IVF");
		NetworkSet proNetworkSet1_4 = new NetworkSet();
		proNetworkSet1_4.setNetworkSetName("BDS");

		List<NetworkSet> pro1 = new ArrayList<NetworkSet>();
		pro1.add(proNetworkSet1_1);
		pro1.add(proNetworkSet1_2);
		pro1.add(proNetworkSet1_3);
		pro1.add(proNetworkSet1_4);

		NetworkSet facNetworkSet1_1 = new NetworkSet();
		facNetworkSet1_1.setNetworkSetName("BCO");
		NetworkSet facNetworkSet1_2 = new NetworkSet();
		facNetworkSet1_1.setNetworkSetName("DCC");
		NetworkSet facNetworkSet1_3 = new NetworkSet();
		facNetworkSet1_1.setNetworkSetName("DDC");

		List<NetworkSet> fac1 = new ArrayList<NetworkSet>();
		fac1.add(facNetworkSet1_1);
		fac1.add(facNetworkSet1_2);
		fac1.add(facNetworkSet1_3);

		network1.setProffessionalNetworkSetList(pro1);
		network1.setFacilityNetworkSetList(pro1);

		/* Network 2 */
		Network network2 = new Network();
		network2.setNetworkLevel(2);
		network2.setNetworkStatus("In Network");
		network2.setNetworkName("PPO");

		NetworkSet proNetworkSet2_1 = new NetworkSet();
		proNetworkSet2_1.setNetworkSetName("PPO");

		List<NetworkSet> pro2 = new ArrayList<NetworkSet>();
		pro2.add(proNetworkSet2_1);

		NetworkSet facNetworkSet2_1 = new NetworkSet();
		facNetworkSet2_1.setNetworkSetName("PPO");

		List<NetworkSet> fac2 = new ArrayList<NetworkSet>();
		fac2.add(facNetworkSet2_1);

		network2.setProffessionalNetworkSetList(pro2);
		network2.setFacilityNetworkSetList(fac2);

		/* Network 3 */
		Network network3 = new Network();
		network3.setNetworkLevel(3);
		network3.setNetworkStatus("Out Network");
		network3.setNetworkName("NOP");

		NetworkSet proNetworkSet3_1 = new NetworkSet();
		proNetworkSet3_1.setNetworkSetName("NOP");

		List<NetworkSet> pro3 = new ArrayList<NetworkSet>();
		pro3.add(proNetworkSet3_1);

		NetworkSet facNetworkSet3_1 = new NetworkSet();
		facNetworkSet3_1.setNetworkSetName("PAR");
		NetworkSet facNetworkSet3_2 = new NetworkSet();
		facNetworkSet3_1.setNetworkSetName("NOP");

		List<NetworkSet> fac3 = new ArrayList<NetworkSet>();
		fac3.add(facNetworkSet3_1);
		fac3.add(facNetworkSet3_2);

		network3.setProffessionalNetworkSetList(pro3);
		network3.setFacilityNetworkSetList(fac3);

		networks.add(network1);
		networks.add(network2);
		networks.add(network3);
		providerNetwork.setNetworkList(networks);
		providerRepository.save(providerNetwork);
		providerRepository.findAll().stream().forEach(System.out::println);
	}

}
