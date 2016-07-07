package com.zengzhi.dynamicsql.core;


/**
 *  A thread-safe abstract class
 * @author zengzhi
 *
 */
public abstract class AbstractDynamicAppend implements DynamicAppendAble{
	
	
	/**
	 * The value is user for operation
	 */
	protected StringBuffer value;
	
	/**
	 * Constructs a DynamicStringAppend with a object
	 * @param value original value
	 */
	public AbstractDynamicAppend(Object value){
		this.value = new StringBuffer(String.valueOf(value));
	}
	
	/**
	 * Constructs a DynamicStringAppend with no parameter
	 */
	public AbstractDynamicAppend(){
		this.value = new StringBuffer();
	}


	public synchronized DynamicAppendAble append(Object value) {
		this.value.append(value);
		return this;
	}

	public synchronized DynamicAppendAble appendIfNotNull(Object toAppend, Object checkValue) {
		if(checkValue instanceof String){
			if(checkValue!=null&&!((String)checkValue).isEmpty()){
				this.value.append(toAppend);
			}
		} else{
			if(checkValue!=null){
				this.value.append(toAppend);
			}
		}
		return this;
	}

	public abstract String toString();
	
	public abstract int length();
	
	

}
