package com.roncoo.eshop.hystrix_turbine_server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
/**
 * hystrix dashboard
 * @author dream
 *
 */
@SpringBootApplication
@EnableTurbine
public class HystrixTurbineServer {
	public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixTurbineServer.class).web(true).run(args);
    }
}
