package com.yuyue.boss.api.mapper;

import com.yuyue.boss.api.domain.YuYueSite;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface YuYueSiteMapper extends MyBaseMapper<YuYueSite> {


    List<YuYueSite> getYuYueSiteInfo(@Param("id") String id,@Param("status") String status);



    List<YuYueSite> searchYuYueSiteInfo(@Param(value = "siteAddr")String siteAddr,
                                        @Param(value = "status")String status,
                                        @Param(value = "jPushStatus")String jPushStatus,
                                        @Param(value = "mainPerson")String mainPerson,
                                        @Param(value = "startTime")String startTime,
                                        @Param(value = "endTime")String endTime);

    @Insert("UPDATE yuyue_site SET qrCodePath = #{qrCodePath} WHERE id= #{id}")
    void insertQRCodePath(@Param(value = "id")String id,@Param(value = "qrCodePath")String qrCodePath);


    void insertYuYueSite(YuYueSite yuYueSite);

    void deleteYuYueSiteById(String id);


    void updateYuYueSite(YuYueSite yuYueSite);

}