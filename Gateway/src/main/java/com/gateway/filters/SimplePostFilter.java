package com.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class SimplePostFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
        ctx.getResponseBody();
        
        return null;
	}

	@Override
	public String filterType() {

		return "post";
	}

	@Override
	public int filterOrder() {
		
		return 1;
	}

}
