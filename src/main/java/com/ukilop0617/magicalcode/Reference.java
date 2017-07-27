package com.ukilop0617.magicalcode;

public class Reference {
	
	public static final String MOD_ID = "umc";
	public static final String NAME = "Magical Code";
	public static final String VERSION = "0.1-alpha";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.ukilop0617.magicalcode.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.ukilop0617.magicalcode.proxy.ServerProxy";
	
	public static enum MagicalCodeItems {	
		OBSIDIANINGOT("obsidianingot", "itemobsidianingot");
		
		private String unlocalizedName;
		private String registryName;
		
		MagicalCodeItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName; 
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
