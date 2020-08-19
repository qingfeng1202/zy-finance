package com.jingsuanxx.zyfinance;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class PageController {

    @RequestMapping("/{path}")
    public String index(@PathVariable() String path) {
        return path;
    }

}
