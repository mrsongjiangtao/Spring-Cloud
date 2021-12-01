package com.springcloud.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author: jiangtao Song
 * @Date: 2021/12/1 10:14
 * @Description:
 */
@Component
public class GatewayFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("gateway 进入全局过滤器");
        String name = exchange.getRequest().getQueryParams().getFirst("names");
        if (StringUtils.isEmpty(name)){
            System.out.println("请求参数缺少name");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        System.out.println("放行");
        return chain.filter(exchange);
    }
}
