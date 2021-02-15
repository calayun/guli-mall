package com.bangdao.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:25:41
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

