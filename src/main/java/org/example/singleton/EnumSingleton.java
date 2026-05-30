package org.example.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void showMessage()
    {
        System.out.println("Enum singleton is working fine");
    }
}
