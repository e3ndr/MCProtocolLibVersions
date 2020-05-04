[![](https://jitpack.io/v/e3ndr/MCProtocolLibVersions.svg)](https://jitpack.io/#e3ndr/MCProtocolLibVersions) [![](https://jitci.com/gh/e3ndr/MCProtocolLibVersions/svg)](https://jitci.com/gh/e3ndr/MCProtocolLibVersions)

# MCProtocolLibVersions
A simple JitPack repository to allow better usage of @Steveice10's MCProtocolLib

[The JitPack for this repo](https://jitpack.io/#e3ndr/MCProtocolLibVersions/)

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
(ex: `1.15.2`, you can find the supported version list in the _added_ column [here](https://github.com/e3ndr/MCProtocolLibVersions/projects/1).):
```xml
<dependencies>
	<dependency>
	    <groupId>com.github.e3ndr.MCProtocolLibVersions</groupId>
		<artifactId>mcplv-MCVERSION</artifactId>
		<version>u2.1</version>
	</dependency>
</dependencies>
```
or add all supported versions:
```xml
<dependencies>
	<dependency>
	    <groupId>com.github.e3ndr</groupId>
		<artifactId>MCProtocolLibVersions</artifactId>
		<version>u2.1</version>
	</dependency>
</dependencies>
```
util dependency:
```xml
<dependencies>
	<dependency>
	    <groupId>com.github.e3ndr.MCProtocolLibVersions</groupId>
		<artifactId>mcplv-util</artifactId>
		<version>u2.1</version>
	</dependency>
</dependencies>
```

You can always revert to an older mcplv release by replacing the version with the desired version (even commit hashes!)

# Contributing
Want to contribute and add more versions? Fork this repo, add more maven modules configured with the proper versions and make a pr.
