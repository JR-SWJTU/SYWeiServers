package com.swjtu.SYWeiServers.web.controller;

import com.swjtu.SYWeiServers.util.SignUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("wx")
@ResponseBody
public class WxVerifyContronller {
    @RequestMapping(value="/vertify", method = RequestMethod.GET)
    public String vertify(String signature, String timestamp, String nonce, String echostr) throws  Exception{
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            return echostr;
        }
        return null;
    }
}
