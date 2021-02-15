package com.bangdao.guli.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:19:12
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

