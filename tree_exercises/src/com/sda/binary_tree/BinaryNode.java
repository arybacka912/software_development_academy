package com.sda.binary_tree;

import com.sda.commons.IListNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryNode<T> implements IListNode<T> {
    T data;
    BinaryNode parent;
    BinaryNode leftChild;
    BinaryNode rightChild;

    public BinaryNode(T data) {
        this.data = data;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void addChild(BinaryNode child) {
        if (leftChild == null) {
            leftChild = child;
        } else if (rightChild == null) {
            rightChild = child;
        } else {
            System.out.println("Node " + data + " is full!");
        }
    }

    public BinaryNode getParent() {
        return parent;
    }

    public void setParent(BinaryNode parent) {
        this.parent = parent;
    }

    public T getData() {
        return data;
    }

    public BinaryNode getLeftChild() {
        return leftChild;
    }

    public BinaryNode getRightChild() {
        return rightChild;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
