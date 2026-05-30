package org.example.singleton;

public class SingletonClass {

    private SingletonClass(){}


    //static instance
    static volatile SingletonClass instance = null;


    //public static method :: double cecked loocking
    public static SingletonClass getInstance()
    {
        if(instance == null)
        {
            synchronized (SingletonClass.class){
                if(instance == null)
                {
                    instance = new SingletonClass();
                }
            }

        }
        return instance;
    }


}
