package com.winston.file.structuremodel.adapter;

/**
 * @author Winston
 * @date 2022/3/9
 */
public class NewWechat implements INewWechatService {

    @Override
    public String chat(String key, String content) {
        System.out.println("微信升级，使用秘钥KEY防止请求包被串改");
        // 省略校验接口
        return "使用新版微信聊天，内容为:" + content + " 秘钥为：" + key;
    }
}
