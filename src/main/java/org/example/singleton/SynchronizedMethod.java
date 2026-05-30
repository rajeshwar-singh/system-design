package org.example.singleton;
//3. Synchornized Method : Combination of lazy  + synchronized keylword
public class SynchronizedMethod {

    private static SynchronizedMethod instance;
    private SynchronizedMethod(){}

    public static synchronized SynchronizedMethod getInstance()
    {
        if(instance == null)
        {
            instance = new SynchronizedMethod();
        }
        return instance;
    }
}
