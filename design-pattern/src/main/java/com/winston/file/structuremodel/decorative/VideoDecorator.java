package com.winston.file.structuremodel.decorative;

/**
 * @author Winston
 * @date 2022/3/9
 */
public class VideoDecorator extends PhoneDecorator {

    public VideoDecorator(Phone phone) {
        super(phone);
    }

    @Override
    void addBehavior() {
        System.out.println("新增功能：播放视频");
    }
}
