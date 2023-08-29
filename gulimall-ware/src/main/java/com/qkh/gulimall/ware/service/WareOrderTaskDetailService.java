package com.qkh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qkh.common.utils.PageUtils;
import com.qkh.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author qkh
 * @email qkhforstudy@gmail.com
 * @date 2023-08-28 08:10:52
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

