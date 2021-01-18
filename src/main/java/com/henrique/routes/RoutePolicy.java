package com.henrique.routes;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.camel.Exchange;
import org.apache.camel.Route;
import org.apache.camel.support.RoutePolicySupport;

public class RoutePolicy extends RoutePolicySupport {
	private AtomicInteger counter = new AtomicInteger();

	@Override
	public void onExchangeBegin(Route route, Exchange exchange) {
		exchange.setProperty("counter", counter);
	}

	public int getCounter() {
		return counter.get();
	}

}
