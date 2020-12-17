package com.bbx.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

    @GetMapping("/jump/{path}")
    public String jumphtml(@PathVariable String path){
        if (!StringUtils.isEmpty(path)) {
            return path;
        }
        return "index";
    }
}
