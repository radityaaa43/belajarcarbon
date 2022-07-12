package com.bcoe.bricarbon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bcoe.bricarbon.common.R;
import com.bcoe.bricarbon.entity.ChainEntity;
import com.bcoe.bricarbon.vo.ReqNewChain;
import com.bcoe.bricarbon.vo.ReqPay;
import com.bcoe.bricarbon.vo.ReqSign;

/**
 * 
 *
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
public interface ChainService extends IService<ChainEntity> {
	
	/**
	 * 建链
	 * @param reqNewChain
	 * @return
	 */
	R newChain(ReqNewChain reqNewChain);
	
	/**
	 * 获取登录成功后首页自己建的链信息
	 * @param userId
	 * @return
	 */
	R getIndexNewInfo(String userId);
	
	/**
	 * 获取登录成功后参与的链信息
	 * @param userId
	 * @return
	 */
	R getIndexJoinInfo(String userId);
	
	/**
	 * 校验供应商验签
	 * @return
	 */
	R checkSignStatus(Integer chainId);
	
	/**
	 * 根据用户id获取链路信息
	 * @param userId
	 * @return
	 */
	R getChainInfoByUserId(String userId);
	
	/**
	 * 签名
	 * @param reqSign
	 * @return
	 */
	R sign(ReqSign reqSign);
	
	/**
	 * 支付
	 * @param reqPay
	 * @return
	 */
	R pay(ReqPay reqPay);

}

