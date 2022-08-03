package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;



public interface IBlock extends Serializable {
	
	String getPrevBlockHash();
	String getBlockHash();
	LocalDateTime getTimestamp();
	String getMSG();
	String getDESTIPAddr();
	String getSRCIPAddr();
	
	default String hash() {
		
		String target = this.getTimestamp() + this.getMSG() + this.getDESTIPAddr();
		return this.hash(target);
	}
	
	default String hash(String target) {
		
		 String targetString = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] messageDigest = md.digest(target.getBytes(StandardCharsets.UTF_8));
			BigInteger bigint = new BigInteger(1, messageDigest);
			targetString = bigint.toString(16);
		    while (targetString.length() < 32) {
		    	targetString = "0".concat(targetString);
		    }
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	     return targetString;
	}

}
