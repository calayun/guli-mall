package com.bangdao.guli.order.dao;

import com.bangdao.guli.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:25:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
