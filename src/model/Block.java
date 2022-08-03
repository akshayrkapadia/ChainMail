package model;

import java.time.LocalDateTime;

public class Block implements IBlock {
	
	private LocalDateTime timestamp;
	private String msg;
	private String destIPAddr;
	private String srcIPAddr;
	private String blockHash;
	private String prevBlockHash;

	
	public Block(String msg, String prevBlockHash, String destIPAddr, String srcIPAddr) {
		
		this.timestamp = LocalDateTime.now();
		this.msg = msg;
		this.destIPAddr = destIPAddr;
		this.srcIPAddr = destIPAddr;
		this.prevBlockHash = prevBlockHash;
		this.blockHash = this.hash();
		
	}
	
	public Block(LocalDateTime timestamp, String msg, String prevBlockHash, String destIPAddr, String srcIPAddr, String blockHash) {
		
		this.timestamp = timestamp;
		this.msg = msg;
		this.destIPAddr = destIPAddr;
		this.srcIPAddr = srcIPAddr;
		this.prevBlockHash = prevBlockHash;
		this.blockHash = blockHash;
		
	}

	@Override
	public String getPrevBlockHash() {
		// TODO Auto-generated method stub
		return this.prevBlockHash;
	}

	@Override
	public String getBlockHash() {
		// TODO Auto-generated method stub
		return this.blockHash;
	}

	@Override
	public LocalDateTime getTimestamp() {
		// TODO Auto-generated method stub
		return this.timestamp;
	}

	@Override
	public String getMSG() {
		// TODO Auto-generated method stub
		return this.msg;
	}

	@Override
	public String getDESTIPAddr() {
		// TODO Auto-generated method stub
		return this.destIPAddr;
	}

	@Override
	public String getSRCIPAddr() {
		// TODO Auto-generated method stub
		return this.srcIPAddr;
	}
	

}
