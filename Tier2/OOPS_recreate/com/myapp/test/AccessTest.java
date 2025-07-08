// File: com/myapp/test/AccessTest.java
package com.myapp.test;

import com.myapp.base.BaseClass;

public class AccessTest extends BaseClass {
    public static void main(String[] args) {
        BaseClass b = new BaseClass();

        System.out.println("== From Different Package (AccessTest) ==");
        System.out.println("Public: " + b.pub);            // ✅ public
        // System.out.println("Protected: " + b.pro);      // ❌ not accessible without inheritance
        // System.out.println("Default: " + b.def);        // ❌ not accessible (different package)
        // System.out.println("Private: " + b.pri);        // ❌ never accessible

        AccessTest obj = new AccessTest();
        System.out.println("\n== From Subclass (AccessTest extends BaseClass) ==");
        System.out.println("Protected via subclass: " + obj.pro);  // ✅ allowed via inheritance
    }
}
