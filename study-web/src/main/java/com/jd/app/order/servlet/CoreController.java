package com.jd.app.order.servlet;

import com.jd.app.order.bean.Cat;
import com.jd.app.order.bean.Master;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hanwensheng
 * @date 2019/5/5
 * CoreController
 */
@Controller
public class CoreController {
    @RequestMapping(value = "/showUser.action", method = RequestMethod.GET)
    public void showUser(HttpServletResponse response) throws IOException {
        response.getWriter().print("<h1>Hello SpringMVC</h1>");
        response.flushBuffer();
    }

    @RequestMapping(value = "/testGet.action")
    public String testGet(){
        System.out.println("debug methodHandler testGet");
        return "test";
    }

    @RequestMapping(value = "/testPost.action",method = RequestMethod.POST)
    public String testPost(Cat cat , Master master){
//    public String testPost(Cat cat ){
        System.out.println("debug methodHandler testPost");
        System.out.println("cat : " + cat + "\t master : "+ master);
        System.out.println("cat : " + cat );
        return "test";
    }

    @RequestMapping(value= {"/vm.action"} )
    public String news(Model model){
        model.addAttribute("username","Lily");
        return "news";
    }
}
