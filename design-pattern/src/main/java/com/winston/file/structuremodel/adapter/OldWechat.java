package com.winston.file.structuremodel.adapter;

/**
 * @author Winston
 * @date 2022/3/9
 */
public class OldWechat implements IOldWechatService {
    @Override
    public String chat(String content) {
        return "使用旧版本的微信进行聊天,内容为：" + content;
    }
}
