package com.example.designmodel.composite.safety;

import static cn.hutool.core.io.FileUtil.file;

/**
 * @author xiongda
 * @ClassName SafetyComposite
 * @Description 安全-组合模式
 * @createTime 2022/3/16 15:06
 */
public class SafetyComposite {

    public static void main(String[] args) {

        File qq= new File("qq.exe");
        File webChat= new File("webChat.exe");

        Folder folder= new Folder("聊天软件",2);
        folder.add(qq);
        folder.add(webChat);

        File word = new File("word.exe");
        File ppt = new File("ppt.exe");
        File excel = new File("excel.exe");

        Folder office = new Folder("聊天软件",3);
        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder root = new Folder("root",1);
        root.add(folder);
        root.add(office);

        root.show();

        root.list();
    }

}
