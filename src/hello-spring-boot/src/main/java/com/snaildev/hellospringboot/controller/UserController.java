package com.snaildev.hellospringboot.controller;

import com.snaildev.hellospringboot.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    IUserService userService;

    @GetMapping("/list")
    public ModelAndView userList() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList", userService.userList());
        mv.setViewName("/user/list");
        return mv;
    }

    @GetMapping("/list2")
    public String userList2(Model model) {
        model.addAttribute("hello", "Hello Spring Boot.");
        model.addAttribute("userList", userService.userList());

        LOGGER.warn("您执行了UserController类中的userList2()方法。");
        return "/user/list2";
    }

    /** 其实和userlist一样，即和使用Freemarker模板引擎代码一致
     * @return
     */
    @GetMapping("/list3")
    public ModelAndView userList3() {
        LOGGER.warn("您执行了UserController类中的userList3()方法。");

        ModelAndView mv = new ModelAndView();
        mv.addObject("userList", userService.userList());
        mv.setViewName("list3");
        return mv;
    }
}
