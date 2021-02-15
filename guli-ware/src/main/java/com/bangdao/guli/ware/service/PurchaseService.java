package com.bangdao.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:30:47
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

