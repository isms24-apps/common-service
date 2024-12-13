//package com.collections.commons.config;
//
//import com.collections.commons.util.HazelConstants;
//import com.hazelcast.config.Config;
//import com.hazelcast.config.JoinConfig;
//import com.hazelcast.config.MapConfig;
//import com.hazelcast.config.NetworkConfig;
//import com.hazelcast.config.TcpIpConfig;
//import com.hazelcast.core.Hazelcast;
//import com.hazelcast.core.HazelcastInstance;
//
//public class HazelcastserverApplication {
//
//	private static HazelcastInstance hazelcastInstance;
//
//	public static synchronized void startHazelcastServer() {
//		if (hazelcastInstance == null) {
//			Config config = createHazelcastConfig(5701, "hazelcast-server-instance-5701");
//			hazelcastInstance = Hazelcast.newHazelcastInstance(config);
//			System.out.println("Hazelcast server started on port 5701.");
//		}
//	}
//
//	public static HazelcastInstance getHazelcastInstance() {
//		return hazelcastInstance;
//	}
//
//	public static synchronized void stopHazelcastServer() {
//		if (hazelcastInstance != null) {
//			hazelcastInstance.shutdown();
//			hazelcastInstance = null;
//			System.out.println("Hazelcast server shut down.");
//		}
//	}
//
//	private static Config createHazelcastConfig(int port, String instanceName) {
//		Config config = new Config();
//		config.setInstanceName(instanceName);
//
//		// Configure maps
//		config.addMapConfig(createMapConfig(HazelConstants.LAST_MODIFIED_TIMES));
//
//		config.addMapConfig(createMapConfig(HazelConstants.ROLES));
//		config.addMapConfig(createMapConfig(HazelConstants.STANDARD));
//		config.addMapConfig(createMapConfig(HazelConstants.CATEGORY));
//		config.addMapConfig(createMapConfig(HazelConstants.COUPONS));
//		config.addMapConfig(createMapConfig(HazelConstants.CATEGORY_PACKAGES));
//		config.addMapConfig(createMapConfig(HazelConstants.APPLICATION));
//		config.addMapConfig(createMapConfig(HazelConstants.APPLICATION_PAGE));
//		config.addMapConfig(createMapConfig(HazelConstants.LANGUAGE));
//		config.addMapConfig(createMapConfig(HazelConstants.MESSAGE_KEY));
//
//		config.addMapConfig(createMapConfig(HazelConstants.COUNTRIES));
//		config.addMapConfig(createMapConfig(HazelConstants.CONFIG));
//
//		NetworkConfig networkConfig = config.getNetworkConfig();
//		networkConfig.setPort(port);
//		networkConfig.setPortAutoIncrement(true);
//
//		JoinConfig joinConfig = networkConfig.getJoin();
//		joinConfig.getMulticastConfig().setEnabled(false);
//
//		TcpIpConfig tcpIpConfig = joinConfig.getTcpIpConfig();
//		tcpIpConfig.setEnabled(true);
//		tcpIpConfig.addMember("localhost:5701");
//		return config;
//	}
//
//	private static MapConfig createMapConfig(String mapName) {
//		MapConfig mapConfig = new MapConfig(mapName);
//		mapConfig.setTimeToLiveSeconds(360);
//		mapConfig.setMaxIdleSeconds(400);
//		return mapConfig;
//	}
//}
