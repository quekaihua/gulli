package com.qkh.gulimall.order.dao;

import com.qkh.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author qkh
 * @email qkhforstudy@gmail.com
 * @date 2023-08-28 07:31:56
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
