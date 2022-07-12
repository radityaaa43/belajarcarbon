package com.bcoe.bricarbon.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bcoe.bricarbon.entity.ContractTemplateEntity;

/**
 * 
 * 
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-24 17:13:31
 */
@Mapper
public interface ContractTemplateDao extends BaseMapper<ContractTemplateEntity> {

	/**
	 * 查询模板信息
	 * @param template
	 * @return
	 */
	ContractTemplateEntity queryByTemplate(@Param("template") String template);
	
}
