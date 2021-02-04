package cn.edu.zjut.ejb.lifecycle;

import javax.annotation.PostConstruct; import javax.annotation.PreDestroy; import javax.ejb.Init; import javax.ejb.PostActivate; import javax.ejb.PrePassivate; import javax.ejb.Remove; import javax.ejb.Stateful;
@Stateful public class LifeCycle implements LifeCycleRemote { public LifeCycle() {
// TODO Auto-generated constructor stub
} public String hello(String name){
    try {
        Thread.sleep(1000*3);
    } catch(InterruptedException e) {
        e.printStackTrace(); } return "hello"+name+"!";
}
    @Init
    public void initialize() {
        System.out.println("@Init事件触发");
    }
    @PostConstruct public void construct() {
        System.out.println("@PostConstruct事件触发"); }
    @PreDestroy public void exit() {
        System.out.println("@PreDestroy事件触发");
    }
    @PostActivate public void activate() {
        System.out.println("@PostActivate事件触发");
    }
    @PrePassivate public void prePassivate() {
        System.out.println("@prePassivate事件触发");
    }
    @Remove
    public void removeSession() {
        System.out.println("@remove事件触发"); }
}