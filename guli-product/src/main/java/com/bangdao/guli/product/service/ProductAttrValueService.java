package com.bangdao.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 09:11:25
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

