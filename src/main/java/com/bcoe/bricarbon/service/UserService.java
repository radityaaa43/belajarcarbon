package com.bcoe.bricarbon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bcoe.bricarbon.common.R;
import com.bcoe.bricarbon.entity.UserEntity;
import com.bcoe.bricarbon.vo.LoginVO;
import com.bcoe.bricarbon.vo.RegisterVO;

/**
 * 
 *
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
public interface UserService extends IService<UserEntity> {
	
	/**
	 * 注册接口
	 * @param registerVO
	 * @return
	 */
	R register(RegisterVO registerVO) throws Exception;
	
	/**
	 * 登录
	 * @param loginVO
	 * @return
	 */
	R login(LoginVO loginVO) throws Exception;
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	R getUserInfo(String userId);
	
	/**
	 * 登出
	 * @return
	 */
	R logout();
	
	/**
	 * 获取首页未登陆信息数据
	 * @return
	 */
	R getTotalInfo();

}

