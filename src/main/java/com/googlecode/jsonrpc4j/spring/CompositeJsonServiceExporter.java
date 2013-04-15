package com.googlecode.jsonrpc4j.spring;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.googlecode.jsonrpc4j.JsonRpcServer;

/**
 * A Composite service exporter for spring that exposes
 * multiple services via JSON-RPC over HTTP.
 *
 */
public class CompositeJsonServiceExporter
	extends AbstractCompositeJsonServiceExporter
	implements HttpRequestHandler {

	private JsonRpcServer jsonRpcServer;

	/**
	 * {@inheritDoc}
	 */
	protected void exportService()
		throws Exception {
		jsonRpcServer = getJsonRpcServer();
	}

	/**
	 * {@inheritDoc}
	 */
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,
		IOException {
		jsonRpcServer.handle(request, response);
		response.getOutputStream().flush();
	}

}
