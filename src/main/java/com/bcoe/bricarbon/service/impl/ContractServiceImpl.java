package com.bcoe.bricarbon.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcoe.bricarbon.dao.ContractDao;
import com.bcoe.bricarbon.entity.ContractEntity;
import com.bcoe.bricarbon.service.ContractService;



@Service("contractService")
public class ContractServiceImpl extends ServiceImpl<ContractDao, ContractEntity> implements ContractService {

   

}