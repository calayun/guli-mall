package com.bangdao.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:25:40
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

