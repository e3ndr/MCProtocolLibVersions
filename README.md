[![](https://jitpack.io/v/mistrix-software/MCProtocolLibVersions.svg)](https://jitpack.io/#mistrix-software/MCProtocolLibVersions)

# MCProtocolLibVersions
A simple JitPack repository to allow better usage of @Steveice10's MCProtocolLib

[The JitPack for this repo](https://jitpack.io/#mistrix-software/MCProtocolLibVersions/)

# Usage
Add the JitPack maven repo:
```xml
<repositories>
<repository>
	<id>jitpack.io</id>
	<url>https://jitpack.io</url>
</repository>
</repositories>
```

Add your desired version of MCProtocolLib as a dependency, replacing `MCVERSION` with your desired version of Minecraft.
(ex: `1.15.2`, you can find the supported version list in the _added_ column [here](https://github.com/mistrix-software/MCProtocolLibVersions/projects/1).):
```xml
<dependencies>
	<dependency>
	    <groupId>com.github.mistrix-software.MCProtocolLibVersions</groupId>
		<artifactId>mcplv-MCVERSION</artifactId>
		<version>u1.1</version>
	</dependency>
</dependencies>
```
or add all supported versions:
```xml
<dependencies>
	<dependency>
	    <groupId>com.github.mistrix-software</groupId>
		<artifactId>MCProtocolLibVersions</artifactId>
		<version>u1.1</version>
	</dependency>
</dependencies>
```
You can always revert to an older mcplv release by replacing u1.1 with the desired version (even commit hashes!)

# Contributing
Want to contribute and add more versions? Fork this repo, add more maven modules configured with the proper versions and make a pr.
