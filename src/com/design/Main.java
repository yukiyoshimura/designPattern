package com.design;

import com.design.factory.Factory;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: Java Main class.name.ofConcreteFactory");
            System.out.println("Example 1:Java Main listfactory.ListFactory");
            System.out.println("Example 2:Java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);
	// write your code here
    }
}
