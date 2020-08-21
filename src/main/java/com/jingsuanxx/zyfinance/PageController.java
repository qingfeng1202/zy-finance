package com.jingsuanxx.zyfinance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/{path}")
    public String index(@PathVariable() String path) {
        System.out.println("PageController");
        return path;
    }

}
