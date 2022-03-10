package com.winston.file.structuremodel.adapter;

/**
 * @author Winston
 * @date 2022/3/9
 */
public class AdapterDemo {

    public static void main(String[] args) {
        // 旧版微信
        OldWechat oldWechat = new OldWechat();
        System.out.println(oldWechat.chat("旧版微信输出"));
        // 新版微信
        NewWechat newWechat = new NewWechat();
        System.out.println(newWechat.chat("key123", "新版微信输出"));

        // 我的微信客户端没有升级，但是微信服务端升级了，这时候我用旧版微信发送消息
        WechatAdapter wechatAdapter = new WechatAdapter(oldWechat);
        System.out.println(wechatAdapter.chat("key123", "新版微信输出"));
    }

}
