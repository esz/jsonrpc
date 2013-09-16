package com.googlecode.jsonrpc4j;

import java.util.Map;

/**
 * @author <a href="mailto:eduard.szente@gmx.at">Eduard Szente</a>
 */
public interface HttpHeaderResolver {

	Map<String, String> resolveHeaders();

}
