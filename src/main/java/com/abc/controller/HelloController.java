package com.abc.controller;

import com.abc.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器类，用来接收用户的请求。
 */
// @Controller 注解实例化某个controller（handler），并将其存放在Spring的IoC容器中
@Controller
// @RequestMapping 还可以加在类上，加在类上作用是窄化路径
// @RequestMapping(path = "/account")
public class HelloController {
    /**
     * 第一个 handler method。
     *
     * @return success
     */
    // @RequestMapping 注解是用于建立请求URL和处理请求的方法之间的对应关系
    // @RequestMapping 注解的属性演示path(value)，method，params，headers
    @RequestMapping(path = "/account/hello", method = RequestMethod.GET, params = {"username=yduan", "password=root"})
    public String sayHello(String username, String password) {// 请求参数（username，password）绑定，内部是通过反射来做的
        System.out.println("Hello SpringMVC!");
        System.out.println("用户名: " + username + ", " + "密码: " + password);
        return "success";
    }
}
