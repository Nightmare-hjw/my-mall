package com.shura.mall.feignapi.pms;

import com.shura.mall.common.api.CommonResult;
import com.shura.mall.domain.FlashPromotionProduct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Garvey
 * @Created: 2021/10/21
 * @Description:
 */
public interface PmsProductFeignApi {

    @GetMapping(value = "/flashPromotion/getHomeSecKillProductList")
    @ResponseBody
    CommonResult<List<FlashPromotionProduct>> getHomeSecKillProductList();
}
