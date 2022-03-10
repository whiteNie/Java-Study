package com.winston.file.structuremodel.adapter;

/**
 * @author Winston
 * @date 2022/3/9
 */
public class WechatAdapter implements INewWechatService {
    private OldWechat oldWechat;

    public WechatAdapter(OldWechat oldWechat) {
        this.oldWechat = oldWechat;
    }

    @Override
    public String chat(String key, String content) {
        System.out.println("虽然微信后台升级了，但依旧需要兼容旧版本微信");
        return oldWechat.chat(content);
    }
}
