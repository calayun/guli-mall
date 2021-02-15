package com.bangdao.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bangdao.common.utils.PageUtils;
import com.bangdao.guli.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 11:30:47
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

