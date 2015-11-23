package com.qtkj.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2015/11/3.
 */
@Controller
public class ConnectController {

    @ResponseBody
    @RequestMapping(value = "/user/qq/login",produces = MediaType.APPLICATION_JSON_VALUE)
    public String qqCallback(){
        return "success";
    }
    @ResponseBody
    @RequestMapping(value = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(){
        return "aa";
    }
    @ResponseBody
    @RequestMapping(value = "/ttt",produces = MediaType.APPLICATION_JSON_VALUE)
    public String ttt(){

        return "aaaaaaa";
    }

    @ResponseBody
    @RequestMapping(value = "/nnn",produces = MediaType.APPLICATION_JSON_VALUE)
    public String nnn(){

        return "nnn";
    }
    @ResponseBody
    @RequestMapping(value = "/aaa",produces = MediaType.APPLICATION_JSON_VALUE)
    public String aaa(){

        return "aaa";
    }


}
