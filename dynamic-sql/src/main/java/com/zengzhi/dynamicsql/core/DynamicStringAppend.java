package com.zengzhi.dynamicsql.core;

import java.io.Serializable;

public final class DynamicStringAppend extends AbstractDynamicAppend implements Serializable {

	private static final long serialVersionUID = 5301348962053756696L;

	@Override
	public String toString() {
		return this.value.toString();
	}

	@Override
	public int length() {
		return this.value.length();
	}

}
