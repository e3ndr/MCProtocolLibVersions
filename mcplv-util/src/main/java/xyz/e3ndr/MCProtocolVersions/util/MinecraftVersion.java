package xyz.e3ndr.MCProtocolVersions.util;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum MinecraftVersion {
	mc1_15_2("1.15.2", 578, "com.github.steveice10.mc1_15_2"),
	mc1_14_4("1.14.4", 498, "com.github.steveice10.mc1_14_4"),
	mc1_13_2("1.13.2", 404, "com.github.steveice10.mc1_13_2"),
	mc1_12_2("1.12.2", 340, "com.github.steveice10.mc1_12_2"),
    mc1_8("1.8", 47, "com.github.steveice10.mc1_8");
    
	private String version;
	private int protocol;
	private String versionPackage;
	
	private MinecraftVersion(String version, int protocol, String versionPackage) {
		this.version = version;
		this.protocol = protocol;
		this.versionPackage = versionPackage;
	}

	/**
	 * Gets a MinecraftVersion from version string.
	 *
	 * @param version the version
	 * @return the minecraft version, null if invalid
	 */
	public static MinecraftVersion fromVersion(String version) {
		for (MinecraftVersion mc : MinecraftVersion.values()) {
			if (mc.version.equalsIgnoreCase(version)) return mc;
		}
		
		return null;
	}

	/**
	 * Gets a MinecraftVersion from protocol number.
	 *
	 * @param protocol the protocol
	 * @return the minecraft version, null if invalid
	 */
	public static MinecraftVersion fromProtocol(int protocol) {
		for (MinecraftVersion mc : MinecraftVersion.values()) {
			if (mc.protocol == protocol) return mc;
		}
		
		return null;
	}

}
