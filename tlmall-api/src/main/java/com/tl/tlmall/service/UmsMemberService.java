package com.tl.tlmall.service;


import com.tl.tlmall.Bean.UmsMember;

import java.util.List;

/**
 * @Author: lqq
 * @ClassName: UserService
 * @Time: 2020/5/20
 * @Describe:
 */
public interface UmsMemberService {

    List<UmsMember> findAllUser();
}