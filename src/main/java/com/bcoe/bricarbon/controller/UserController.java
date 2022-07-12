package com.bcoe.bricarbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcoe.bricarbon.common.R;
import com.bcoe.bricarbon.service.UserService;
import com.bcoe.bricarbon.vo.LoginVO;
import com.bcoe.bricarbon.vo.RegisterVO;




/**
 *
 *
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
@RestController
@RequestMapping("carbon/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public R register(@RequestBody RegisterVO registerVO) throws Exception{
        return userService.register(registerVO);
    }

    @PostMapping("/login")
    public R login(@RequestBody LoginVO loginVO) throws Exception{
        return userService.login(loginVO);
    }

    @GetMapping("/{userId}")
    public R getUserInfo(@PathVariable("userId") String userId){
        return userService.getUserInfo(userId);
    }

    @GetMapping("/getUnLoginTotalInfo")
    public R getUnLoginTotalInfo(){
        return userService.getTotalInfo();
    }



}
