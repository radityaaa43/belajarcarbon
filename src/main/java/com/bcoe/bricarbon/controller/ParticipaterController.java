package com.bcoe.bricarbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcoe.bricarbon.common.R;
import com.bcoe.bricarbon.service.ParticipaterService;





/**
 * 
 *
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
@RestController
@RequestMapping("carbon/participater")
public class ParticipaterController {
    @Autowired
    private ParticipaterService participaterService;
    
    @GetMapping("/list")
    public R getAll(){
    	return participaterService.queryAll();
    }



}
