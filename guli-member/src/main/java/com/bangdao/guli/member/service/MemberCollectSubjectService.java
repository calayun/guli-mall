package com.bangdao.guli.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:19:12
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

