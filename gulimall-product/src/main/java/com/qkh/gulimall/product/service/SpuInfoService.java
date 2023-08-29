package com.qkh.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qkh.common.utils.PageUtils;
import com.qkh.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author qkh
 * @email qkhforstudy@gmail.com
 * @date 2023-08-27 13:50:31
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

