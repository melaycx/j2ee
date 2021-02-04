package cn.edu.zjut.app;

import cn.edu.zjut.bean.IItemOrder;
import cn.edu.zjut.bean.ItemOrder;
import cn.edu.zjut.bean.ShoppingCart;
import cn.edu.zjut.event.EmailEvent;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.edu.zjut.bean.IItem;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.*;

public class SpringEnvTest {
    public static void main(String[] args) throws InterruptedException {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IItem item1 = (IItem) ctx.getBean("item1");
//        System.out.println(item1.getItemID());
//        System.out.println(item1.getTitle());
//        System.out.println(item1.getDescription());
//        System.out.println(item1.getCost());
//        IItem item2 = (IItem) ctx.getBean("item2");
//        System.out.println(item2.getItemID());
//        System.out.println(item2.getTitle());
//        System.out.println(item2.getDescription());
//        System.out.println(item2.getCost());

//        IItemOrder itemorder1 = (IItemOrder) ctx.getBean("itemorder1");
//        System.out.println("书名："+itemorder1.getItem().getTitle());
//        System.out.println("数量：" + itemorder1.getNumItems());
//        IItemOrder itemorder2 = (IItemOrder) ctx.getBean("itemorder2");
//        System.out.println("书名："+itemorder2.getItem().getTitle());
//        System.out.println("数量：" + itemorder2.getNumItems());

//        ShoppingCart obj=(ShoppingCart) ctx.getBean("shoppingcart");
//        List<ItemOrder> list=obj.getItemsOrdered();
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));

//          ShoppingCart obj=(ShoppingCart) ctx.getBean("shoppingcart");
//          Set<ItemOrder> set=obj.getItemsOrdered();
//        for(Iterator iterator = set.iterator(); iterator.hasNext();){
//             ItemOrder temp=(ItemOrder)iterator.next();
//                 System.out.println(temp); }

//            ShoppingCart obj=(ShoppingCart) ctx.getBean("shoppingcart");
//            Map map=obj.getItemsOrdered();
//            System.out.println((ItemOrder)map.get("1"));
//            System.out.println((ItemOrder)map.get("2"));

//              ShoppingCart obj=(ShoppingCart)ctx.getBean("shoppingcart") ;
//              System.out.println(obj.getItemsOrdered());

//        System.out.println("getBean(item1)---1");
//        IItem item11 = (IItem) ctx.getBean("item1");
//        System.out.println("getBean(item1)---2");
//        IItem item12 = (IItem) ctx.getBean("item1");
//        System.out.println("getBean(item2)---1");
//        IItem item21 = (IItem) ctx.getBean("item2");
//        System.out.println("getBean(item2)---2");
//        IItem item22 = (IItem) ctx.getBean("item2");

//        IItemOrder itemorder1 = (IItemOrder) ctx.getBean("itemorder1");
//        ((ClassPathXmlApplicationContext) ctx).close();

//        FileSystemResource isr = new
//                FileSystemResource("out/production/resources/applicationContext.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(isr);

//        ClassPathResource res = new
//                ClassPathResource("applicationContext.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(res);

//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");

//        ApplicationContext ctx = new FileSystemXmlApplicationContext( "out/production/resources/applicationContext.xml");
//        IItemOrder itemorder2 = (IItemOrder)ctx.getBean("itemorder2");

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Object[] objects = new Object[]{"HelloWorld", new Date()};
        String message = ctx.getMessage("HelloWorld", objects, Locale.CHINA);
	String message1=
	ctx.getMessage("HelloWorld",objects,Locale.US);
        System.out.println(message);
        System.out.println(message1);

//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        EmailEvent ele = new EmailEvent("hello",
//                "spring_test@zjut.edu.cn", "this is a test");
//       ctx.publishEvent(ele);
    }

}

