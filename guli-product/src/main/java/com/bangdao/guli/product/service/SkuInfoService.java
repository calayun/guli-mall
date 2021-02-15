package com.bangdao.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 09:11:24
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

