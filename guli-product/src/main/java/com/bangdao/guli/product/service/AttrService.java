package com.bangdao.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 09:11:25
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

