package com.bcoe.bricarbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcoe.bricarbon.common.R;
import com.bcoe.bricarbon.service.ChainService;
import com.bcoe.bricarbon.vo.ReqNewChain;
import com.bcoe.bricarbon.vo.ReqPay;
import com.bcoe.bricarbon.vo.ReqSign;

/**
 * 
 *
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
@RestController
@RequestMapping("carbon/chain")
public class ChainController {
    @Autowired
    private ChainService chainService;
    
    @PostMapping("/new")
    public R newChain(@RequestBody ReqNewChain reqNewChain){
    	return chainService.newChain(reqNewChain);
    }
    @GetMapping("/{userId}")
    public R getIndexNewInfo(@PathVariable("userId") String userId){
    	return chainService.getIndexNewInfo(userId);
    }
    @GetMapping("/join/{userId}")
    public R getIndexJoinInfo(@PathVariable("userId") String userId){
    	return chainService.getIndexJoinInfo(userId);
    }
    @GetMapping("/checkSign/{chainId}")
    public R checkSignStatus(@PathVariable("chainId") Integer chainId){
    	return chainService.checkSignStatus(chainId);
    }
    @GetMapping("/getInfo/{userId}")
    public R getChainInfoByUserId(@PathVariable("userId") String userId){
    	return chainService.getChainInfoByUserId(userId);
    }
    @PostMapping("/sign")
    public R sign(@RequestBody ReqSign reqSign){
    	return chainService.sign(reqSign);
    }
    @PostMapping("/pay")
    public R pay(@RequestBody ReqPay reqPay){
    	return chainService.pay(reqPay);
    }

    

}
