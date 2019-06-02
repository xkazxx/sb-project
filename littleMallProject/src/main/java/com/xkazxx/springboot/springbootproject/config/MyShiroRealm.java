package com.xkazxx.springboot.springbootproject.config;

import com.xkazxx.springboot.springbootproject.bean.Cskaoyan_mall_admin;
import com.xkazxx.springboot.springbootproject.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*@Component
public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
        Cskaoyan_mall_admin cskaoyanMallAdmin = userService.getAdminByAdminname(username);
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, cskaoyanMallAdmin.getPassword(), "adminRealm");
        return info;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    public void clearCache() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }
}*/
