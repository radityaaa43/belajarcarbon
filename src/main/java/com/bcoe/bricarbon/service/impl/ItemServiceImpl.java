package com.bcoe.bricarbon.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcoe.bricarbon.dao.ItemDao;
import com.bcoe.bricarbon.entity.ItemEntity;
import com.bcoe.bricarbon.service.ItemService;


@Service("itemService")
public class ItemServiceImpl extends ServiceImpl<ItemDao, ItemEntity> implements ItemService {

    

}