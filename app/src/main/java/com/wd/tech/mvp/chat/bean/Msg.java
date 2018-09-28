package com.wd.tech.mvp.chat.bean;

public class Msg {
    private String content;

    /**
     * 类型
     */
    private TYPE type;

    public enum TYPE{
        /**
         * 接收
         */
        RECEIVED,
        /**
         * 发送
         */
        SENT
    }


    public Msg(String content, TYPE type){
        this.content = content;
        this.type = type;
    }

    public TYPE getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}


