package com.jnshu;

import org.apache.tuscany.sca.node.Node;
import org.apache.tuscany.sca.node.NodeFactory;

public class Service {
    public static void main(String[] args) {
        Node node = NodeFactory.newInstance().createNode("demo.composite");
        node.start();
        System.out.println("service启动");
    }
}
