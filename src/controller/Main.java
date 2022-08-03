package controller;

import model.Block;

public class Main {
	
	public static void main(String[] args) {
		
		Block genBlock = new Block("This is the gen block", "prevBlockHash", "192.62.19.23", "192.62.19.25");
		System.out.println(genBlock.getBlockHash());
		System.out.println(genBlock.getTimestamp());
	
	}

}
