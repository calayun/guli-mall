package com.bangdao.guli.order.dao;

import com.bangdao.guli.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:25:40
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
