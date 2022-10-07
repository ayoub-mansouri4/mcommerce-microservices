package com.mcommerce.zuulserver.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class ReponseFilter extends ZuulFilter {


    @Override

    public String filterType() {
        return "post";
    }

    @Override

    public int filterOrder() {
        return 1;
    }

    @Override

    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();

        response.setStatus(400);

        log.info(" CODE HTTP {} ", response.getStatus());

        return null;
    }
}