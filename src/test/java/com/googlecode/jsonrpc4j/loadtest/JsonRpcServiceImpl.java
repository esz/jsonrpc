package com.googlecode.jsonrpc4j.loadtest;

import org.slf4j.LoggerFactory;

/**
 * @author Eduard Szente
 */
public class JsonRpcServiceImpl implements JsonRpcService {
	public void doSomething() {
		LoggerFactory.getLogger(JsonRpcServiceImpl.class).info("doSomething()");
	}
}
