package com.example.designmodel.composite.safety;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiongda
 * @ClassName Folder
 * @Description TODO
 * @createTime 2022/3/16 14:56
 */
public class Folder extends Directory {

    private List<Directory> dirs;

    private Integer level;

    public  Folder(String name, Integer level){
            super(name);
            this.level = level;
            this.dirs = new ArrayList<Directory>();
    }

    @Override
    public void show() {
        System.out.println(this.name);
        for(Directory dir:this.dirs){
            if(this.level != null){
                for(int i=0 ;i <this.level.intValue() ;i++){
                    System.out.println("   ");
                }
                for(int j=0 ;j<this.level;j++){
                    if(j==0){
                        System.out.println("+");
                    }
                    System.out.println("-");
                }
            }
            dir.show();
        }
    }

    public boolean add(Directory dir){
        return this.dirs.add(dir);
    }

    public boolean remove(Directory dir){
        return this.dirs.remove(dir);
    }

    public Directory getFolder(int index){
        return this.dirs.get(index);
    }

    public void list(){
        for(Directory dir:this.dirs){
            System.out.println(dir.name);
        }
    }

}
