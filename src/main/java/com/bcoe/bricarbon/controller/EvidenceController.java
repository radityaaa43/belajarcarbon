package com.bcoe.bricarbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcoe.bricarbon.service.EvidenceService;

/**
 * 
 *
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
@RestController
@RequestMapping("carbon/evidence")
public class EvidenceController {
    @Autowired
    private EvidenceService evidenceService;



}
