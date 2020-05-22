package com.tl.tlmall.service;

import com.tl.tlmall.Bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Author: lqq
 * @ClassName: UmsMemberReceiveAddressService
 * @Time: 2020/5/21
 * @Describe:
 */
public interface UmsMemberReceiveAddressService{

    List<UmsMemberReceiveAddress> findUmsMemberId(String memberId);
}