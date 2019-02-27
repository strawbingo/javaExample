package com.strawbingo.cas.client.config;

import org.jasig.cas.client.authentication.AuthenticationFilter;
import org.jasig.cas.client.session.SingleSignOutFilter;
import org.jasig.cas.client.session.SingleSignOutHttpSessionListener;
import org.jasig.cas.client.util.HttpServletRequestWrapperFilter;
import org.jasig.cas.client.validation.Cas30ProxyReceivingTicketValidationFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EventListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liubin15 on 2019/1/24.
 */
@Configuration
public class CasConfig {

    private static final String CAS_SERVER_URL_PREFIX = "https://cas.example.org:8443/cas/";
    private static final String CAS_SERVER_URL_LOGIN = "https://cas.example.org:8443/cas/login";

    //本机的名称
    private static final String SERVER_NAME = "http://cas.zlx.com:8002/";

    /**
     * description: 登录过滤器
     * @param: []
     * @return: org.springframework.boot.web.servlet.FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean filterSingleRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SingleSignOutFilter());
        // 设定匹配的路径
        registration.addUrlPatterns("/*");
        Map<String,String> initParameters = new HashMap<String, String>();
        initParameters.put("casServerUrlPrefix", CAS_SERVER_URL_PREFIX);
        registration.setInitParameters(initParameters);
        // 设定加载的顺序
        registration.setOrder(1);
        return registration;
    }


    /**
     * description:过滤验证器
     *     * @param: []
     * @return: org.springframework.boot.web.servlet.FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean filterValidationRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new Cas30ProxyReceivingTicketValidationFilter());
        // 设定匹配的路径
        registration.addUrlPatterns("/*");
        Map<String,String>  initParameters = new HashMap<String, String>();
        initParameters.put("casServerUrlPrefix", CAS_SERVER_URL_PREFIX);
        initParameters.put("serverName", SERVER_NAME);
        initParameters.put("useSession", "true");
        registration.setInitParameters(initParameters);
        // 设定加载的顺序
        registration.setOrder(1);
        return registration;
    }


    /**
     * The AuthenticationFilter is what detects whether a user needs to be authenticated or not.
     * If a user needs to be authenticated, it will redirect the user to the CAS server.
     * description:授权过滤器
     * @param: []
     * @return: org.springframework.boot.web.servlet.FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean filterAuthenticationRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new AuthenticationFilter());
        // 设定匹配的路径
        registration.addUrlPatterns("/*");
        Map<String,String>  initParameters = new HashMap<String, String>();
        initParameters.put("casServerLoginUrl", CAS_SERVER_URL_LOGIN);
        initParameters.put("serverName", SERVER_NAME);
        //忽略/logout的路径
        initParameters.put("ignorePattern", "/logout/*");
        initParameters.put("ignoreUrlPatternType", "com.strawbingo.cas.client.auth.SimpleUrlPatternMatcherStrategy");

        registration.setInitParameters(initParameters);
        // 设定加载的顺序
        registration.setOrder(1);
        return registration;
    }

    /**
     * wraper过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean filterWrapperRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new HttpServletRequestWrapperFilter());
        // 设定匹配的路径
        registration.addUrlPatterns("/*");
        // 设定加载的顺序
        registration.setOrder(1);
        return registration;
    }

    /**
     * 添加监听器
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean<EventListener> singleSignOutListenerRegistration(){
        ServletListenerRegistrationBean<EventListener> registrationBean = new ServletListenerRegistrationBean<EventListener>();
        registrationBean.setListener(new SingleSignOutHttpSessionListener());
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
