package com.bcoe.bricarbon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcoe.bricarbon.common.R;
import com.bcoe.bricarbon.dao.ParticipaterDao;
import com.bcoe.bricarbon.entity.ParticipaterEntity;
import com.bcoe.bricarbon.service.ParticipaterService;

/**
 * 
* <p>Title: ParticipaterServiceImpl</p>
* <p>Description: </p>
* @author he_jiebing@jiuyv.com
  @date   2021年5月24日 上午11:35:17
 */

@Service("participaterService")
public class ParticipaterServiceImpl extends ServiceImpl<ParticipaterDao, ParticipaterEntity> implements ParticipaterService {

	@Autowired
	private ParticipaterDao participaterDao;
	
	@Override
	public R queryAll() {
		List<ParticipaterEntity> list = participaterDao.queryAll();
		return R.ok(list);
	}
}