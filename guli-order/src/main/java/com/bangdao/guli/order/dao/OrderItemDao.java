package com.bangdao.guli.order.dao;

import com.bangdao.guli.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:25:40
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
