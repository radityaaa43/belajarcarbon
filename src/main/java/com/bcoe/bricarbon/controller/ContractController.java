package com.bcoe.bricarbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcoe.bricarbon.service.ContractService;

/**
 * 
 *
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
@RestController
@RequestMapping("carbon/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;



}
