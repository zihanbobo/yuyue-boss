package com.yuyue.boss.api.mapper;


import com.yuyue.boss.api.domain.AdPrice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdPriceMapper extends MyBaseMapper<AdPrice> {

    List<AdPrice> getAdvertisementFeeInfo(@Param(value = "priceId") String priceId);


    AdPrice getAdFee(@Param(value = "priceId") String priceId);

}
