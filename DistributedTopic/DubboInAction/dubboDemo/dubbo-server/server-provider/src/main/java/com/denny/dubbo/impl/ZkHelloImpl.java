/**   
 * @Title: ZkHelloImpl.java 
 * @Package com.denny.dubbo.impl 
 * @Description: TODO
 * @author Zhangkui zhangkui_java@163.com   
 * @date 2018年12月29日 下午2:18:08 
 * @version V1.0   
 */
package com.denny.dubbo.impl;

import com.denny.dubbo.IZkHello;

/** 
 * @ClassName: ZkHelloImpl 
 * @Description: TODO
 * @author Zhangkui zhangkui_java@163.com 
 * @date 2018年12月29日 下午2:18:08 
 *  
 */
public class ZkHelloImpl implements IZkHello {

	/** 
	 * <p>Title: </p> 
	 * <p>Description: </p>  
	 */
	public ZkHelloImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc) 
	 * <p>Title: hello</p> 
	 * <p>Description: </p> 
	 * @param name 
	 * @see com.denny.dubbo.IZkHello#hello(java.lang.String) 
	 */
	public void hello(String name) {
		System.out.println("Hello: " + name);
	}

	
}
