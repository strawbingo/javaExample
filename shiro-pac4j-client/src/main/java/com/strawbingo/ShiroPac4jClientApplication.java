package com.strawbingo;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ShiroPac4jClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroPac4jClientApplication.class, args);
    }

    @RequiresPermissions(value = "role:edit")
    @GetMapping(value = "/roles/{id}")
    public String put(){
        return "允许修改角色";
    }

    @RequiresPermissions(value = "user:info")
    @GetMapping(value = "/users/{id}")
    public PrincipalCollection getUserById() {
        return SecurityUtils.getSubject().getPrincipals();
    }

    @GetMapping(value = "/you")
    public String you(){
        return "you you 不需要权限";
    }


}
