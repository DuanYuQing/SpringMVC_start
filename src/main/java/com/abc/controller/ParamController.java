package com.abc.controller;

import com.abc.domain.Account;
import com.abc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
// 把 msg=东方老赢 再存一份到session域对象（原先在request域对象中）
@SessionAttributes({"msg"})
public class ParamController {
    /**
     * 封装客户端post请求带过来的请求参数，并封装到Account JavaBean中。
     *
     * @param account 账户实体类。
     * @return success
     */
    @RequestMapping(path = "/params/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("saveAccount()方法执行了...");
        System.out.println("要保存的账户信息: " + account);
        return "success";
    }

    @RequestMapping(path = "/testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println("testModelAttribute(..)方法执行了...");
        System.out.println(user);
        return "success";
    }

    /**
     * 该方法会先执行，与表单提交重复的内容会被表单覆盖，表单没有的内容原封不动的传上去。
     *
     * @param uname 用户名。
     * @return 拥有完整数据的user对象。
     */
    @ModelAttribute
    public User showUser(String uname) {
        System.out.println("testModelAttribute(..)方法执行了...");
        // 通过用户名查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(22);
        user.setBirthday(new Date());
        return user;
    }

    /*@RequestMapping("/testModelAttribute")
    public String testModelAttribute02(@ModelAttribute("9527") User user) {
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser02(String uname, Map<String, User> map) {
        System.out.println("showUser02方法执行了...");
        //通过用户名查询数据库（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setBirthday(new Date());
        map.put("9527", user);
    }*/

    /**
     * 存入session
     *
     * @param model
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        model.addAttribute("msg", "东方老赢");
        return "success";
    }

    /**
     * 获取session
     *
     * @return
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelmap) {
        String msg = (String) modelmap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * 删除session
     *
     * @return
     */
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status) {
        status.setComplete();
        return "success";
    }

}
