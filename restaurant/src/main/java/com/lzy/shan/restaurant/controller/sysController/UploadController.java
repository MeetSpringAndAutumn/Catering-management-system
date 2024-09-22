package com.lzy.shan.restaurant.controller.sysController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadController {
    @GetMapping("/upload")
    public String Upload(){
        return "upload";
    }
}
