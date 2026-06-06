package org.example;

import org.example.builder.simpleBuilder.HttpRequest;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



//        //Strategy design pattern
//        Robot comRobot = new CompanionRobot(new NormalTalk(), new SpecialWalk(), new JetFly());
//        comRobot.fly();
//        comRobot.talk();
//        comRobot.walk();
//
//
//        //simple factory
//        BurgerFactory burgerFactory = new SinghBurger();
//        Burger burger = burgerFactory.createBurger("normal");
//        burger.prepare();



        //singleton design pattern
       /* SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj1 = SingletonClass.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj.hashCode());

        System.out.println(obj1 == obj);*/


        //1 . Eagger Initialization
       /* Thread t1 = new Thread(()->{
            EagerInitialization instance = EagerInitialization.getInstance();
            System.out.println(instance.hashCode());
        });
        Thread t2 = new Thread(()->{
            EagerInitialization instance = EagerInitialization.getInstance();
            System.out.println(instance.hashCode());
        });

        t1.start();
        t2.start();*/


        //2. Lazy Initialization

        /*Thread t1 = new Thread(()->{
            LazyInitialization instance = LazyInitialization.getInstance();
            System.out.println(instance.hashCode());
        });

        Thread t2 = new Thread(()->{
            LazyInitialization instance = LazyInitialization.getInstance();
            System.out.println(instance.hashCode());
        });
        Thread t3 = new Thread(()->{
            LazyInitialization instance = LazyInitialization.getInstance();
            System.out.println(instance.hashCode());
        });
        t1.start();
        t2.start();
        t3.start();*/

        //3. Synchronized Method
        /*Thread t1 = new Thread(()->{
            SynchronizedMethod instance = SynchronizedMethod.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        Thread t2 = new Thread(()->{
            SynchronizedMethod instance = SynchronizedMethod.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        Thread t3 = new Thread(()->{
            SynchronizedMethod instance = SynchronizedMethod.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        t1.start();
        t2.start();
        t3.start();*/


        //4. Double Checked Locking
        /*Thread t1 = new Thread(()->{
            DoubleCheckedLocking instance = DoubleCheckedLocking.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        Thread t2 = new Thread(()->{
            DoubleCheckedLocking instance = DoubleCheckedLocking.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        Thread t3 = new Thread(()->{
            DoubleCheckedLocking instance = DoubleCheckedLocking.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        Thread t4 = new Thread(()->{
            DoubleCheckedLocking instance = DoubleCheckedLocking.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();*/

        //5. Bill Pugh Solution
        /*Thread t1 = new Thread(()->{

            BillPughSolution instance = BillPughSolution.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        Thread t2 = new Thread(()->{

            BillPughSolution instance = BillPughSolution.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        Thread t3 = new Thread(()->{

            BillPughSolution instance = BillPughSolution.getInstance();
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        t1.start();
        t2.start();
        t3.start();*/

        //6. ENUM singleton
        /*EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;

        singleton1.showMessage();

        System.out.println("first hashcode : "+singleton1.hashCode());
        System.out.println("second hashcode : " + singleton2.hashCode());*/

        /*Thread t1 = new Thread(()->{
            EnumSingleton instance = EnumSingleton.INSTANCE;
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });

        Thread t2 = new Thread(()->{
            EnumSingleton instance = EnumSingleton.INSTANCE;
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });

        Thread t3 = new Thread(()->{
            EnumSingleton instance = EnumSingleton.INSTANCE;
            System.out.println(Thread.currentThread().getName());
            System.out.println(instance.hashCode());
        });
        t1.start();
        t2.start();
        t3.start();*/





        //Builder design pattern

        //1. SImple Builder

        Map<String,String> headers = new HashMap<>();
        headers.put("authorization","bearer");
        headers.put("content-type", "application/json");

        HttpRequest request = HttpRequest.builder()
                .withUrl("www.example.com")
                .withMethod("POST")/*
                .withHeaders(Map.of(
                        "authorization","bearer",
                        "content-type", "application/json"
                ))*/
                .withHeaders(headers)
                .withQueryParam(Map.of("query","What is Builder Design Pattern?"))
                .withBody("rajeshwar@google.com")
                .withTimeout(1000)
                .build();


        System.out.println("HashCode : " + request.hashCode());
        request.execute();
        headers.put("hack", "hogya");
        request.execute();


    }
}