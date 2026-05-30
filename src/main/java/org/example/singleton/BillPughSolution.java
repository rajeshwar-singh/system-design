package org.example.singleton;

public class BillPughSolution {

    private BillPughSolution(){}

    //create a inner class
    private static class InstanceCreationHelper{
        private static final BillPughSolution INSTANCE_OBJECT = new BillPughSolution();

    }
    public static BillPughSolution getInstance()
    {
        return InstanceCreationHelper.INSTANCE_OBJECT;
    }
}
