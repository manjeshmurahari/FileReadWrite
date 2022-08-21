package com.d14.interfaces.impl;

import com.d14.interfaces.WriteInfo;

public class WriterDecorator implements WriteInfo{
	protected WriteInfo  writeInfo;
	

	public WriterDecorator() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public WriterDecorator(WriteInfo writeInfo) {
		//super();
		this.writeInfo = writeInfo;
	}
	@Override
	public void Write() {
		// TODO Auto-generated method stub
		this.writeInfo.Write();
		
	}

}
