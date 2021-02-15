package com.bangdao.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:25:40
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

