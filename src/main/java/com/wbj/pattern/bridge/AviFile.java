package com.wbj.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: AviFile
 * @Description: avi视频文件（具体的实现化角色）
 */
public class AviFile implements VideoFile {

    public void decode(String fileName) {
        System.out.println("avi视频文件 ：" + fileName);
    }
}
