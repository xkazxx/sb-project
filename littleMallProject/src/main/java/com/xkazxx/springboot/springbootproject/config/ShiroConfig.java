package com.xkazxx.springboot.springbootproject.config;


import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;


import java.util.HashMap;
import java.util.Map;
/*
@Configuration
public class ShiroConfig {
    @Bean
    public SecurityManager getSecurityManager(MyShiroRealm shiroRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager(shiroRealm);
        *//*
        //注入缓存管理器
        securityManager.setCacheManager(ehCacheManager);
        //注入session管理器
        securityManager.setSessionManager(sessionManager);
        *//*
        return securityManager;
    }
    *//*@Bean
    public SessionManager getSessionManager(){
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        //设置session失效时间，单位毫秒
        sessionManager.setGlobalSessionTimeout(600000);
        //删除失效session
        sessionManager.setDeleteInvalidSessions(true);
        return sessionManager;
    }
    @Bean
    public EhCacheManager ehCacheManager(){
        EhCacheManager ehCacheManager = new EhCacheManager();
        ehCacheManager.setCacheManagerConfigFile("shiro-ehcache.xml");
        return ehCacheManager;
    }*//*

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setSecurityManager(securityManager);
        factoryBean.setLoginUrl("/auth/login");
        factoryBean.setUnauthorizedUrl("/admin/auth/403");
        Map map = new HashMap();
        map.put("/login","anon");
        map.put("/refuse","anon");
        map.put("/logout","logout");
        map.put("/**","authc");

        map.put("/admin/auth/login", "anon");
        map.put("/admin/auth/401", "anon");
        map.put("/admin/auth/index", "anon");
        map.put("/admin/auth/403", "anon");
        map.put("/admin/index/index", "anon");
        factoryBean.setFilterChainDefinitionMap(map);
        return factoryBean;
    }
    @Bean
    public AuthorizationAttributeSourceAdvisor getAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor sourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        sourceAdvisor.setSecurityManager(securityManager);
        return sourceAdvisor;
    }
}*/
