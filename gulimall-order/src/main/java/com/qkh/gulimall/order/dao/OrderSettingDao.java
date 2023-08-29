package com.qkh.gulimall.order.dao;

import com.qkh.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author qkh
 * @email qkhforstudy@gmail.com
 * @date 2023-08-28 07:31:56
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
