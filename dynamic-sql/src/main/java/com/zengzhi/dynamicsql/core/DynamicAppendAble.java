package com.zengzhi.dynamicsql.core;
/**
 * 
 * @author zengzhi
 *
 */
public interface DynamicAppendAble {
	/**
	 * Append value to caller
	 * @param value
	 * @return DynamicAppendAble
	 */
	public DynamicAppendAble append(Object value);
	
	/**
	 * If the checkValue is not null appendd the toAppend value to the  caller
	 * @param toAppend
	 * @param checkValue
	 * @return DynamicAppendAble
	 */
	public DynamicAppendAble appendIfNotNull(Object toAppend,Object checkValue);
}
