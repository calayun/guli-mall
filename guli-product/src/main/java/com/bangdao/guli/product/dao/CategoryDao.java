package com.bangdao.guli.product.dao;

import com.bangdao.guli.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author stive
 * @email chen_hai888@126.com
 * @date 2021-02-15 09:11:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
