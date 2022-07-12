package com.bcoe.bricarbon.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bcoe.bricarbon.entity.UserEntity;
import com.bcoe.bricarbon.vo.LoginVO;

/**
 * 
 * 
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

	/**
	 * 查询登录信息
	 * @param loginVO
	 * @return
	 */
	UserEntity queryUserInfo(LoginVO loginVO);

	/**
	 * 统计平台用户总数
	 * @return
	 */
	Integer countUsers();
	
}
