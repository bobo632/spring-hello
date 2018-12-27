package com.sunyx.test;

/**
 * Created by liuli on 2018/12/27.
 */
public class ExampleBean {
    public ExampleBean() {
        System.out.println("exampleBean");
    }

    public void execute(){
        System.out.println("example execute");
    }

   public void init (){
       System.out.println("init");
   }
    public void destory(){
        System.out.println("destory");
    }
}
