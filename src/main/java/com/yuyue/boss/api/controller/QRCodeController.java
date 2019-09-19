package com.yuyue.boss.api.controller;

import com.yuyue.boss.annotation.CurrentUser;
import com.yuyue.boss.api.domain.SystemUser;
import com.yuyue.boss.enums.ResponseData;
import com.yuyue.boss.utils.QRCodeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/qrCode", produces = "application/json; charset=UTF-8")
public class QRCodeController extends BaseController{


    /**
     * 生成二维码
     * @param
     * @param request
     */
    @RequestMapping("/getQRCodeWithLogo")
    @ResponseBody
    public void getMenuList(HttpServletRequest request) {
        getParameterMap(request);
        log.info("生成二维码------------>>/qrCode/getQRCodeWithLogo");
        String content=request.getParameter("id");
        String qrCodeName = request.getParameter("siteTitle")+request.getParameter("startTime").split(":")[0]+"点";
        int size=Integer.parseInt(request.getParameter("size"));
        String logoPath=System.getProperty("user.dir")+"/src/main/resources/logo/logo.png";
        System.out.println(content);
        System.out.println(qrCodeName);
        System.out.println(size);
        System.out.println(logoPath);
        QRCodeUtil.zxingCodeCreate(content, qrCodeName, size, logoPath);
    }

}
