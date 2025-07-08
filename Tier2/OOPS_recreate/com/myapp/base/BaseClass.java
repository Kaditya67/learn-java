// File: com/myapp/base/BaseClass.java
package com.myapp.base;

public class BaseClass {
    public String pub = "public member";
    protected String pro = "protected member";
    String def = "default/package-private member";
    private String pri = "private member";

    public void printAccess() {
        System.out.println("Inside BaseClass:");
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);
        System.out.println(pri);
    }
}
