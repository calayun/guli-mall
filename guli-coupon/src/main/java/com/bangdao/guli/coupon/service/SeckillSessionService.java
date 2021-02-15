package com.bangdao.guli.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 10:41:58
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

