package com.company.ProblemSheet.queue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 *
 * Implement the LRUCache class:
 *
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise,
 * add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation,
 * evict the least recently used key.
 *
 * The functions get and put must each run in O(1) average time complexity.
 *
 */

public class LRUCache {

    /**
     *
     *to implement this we will use two data structures double Linked List and Map
     *
     * Map will store the key and node reference of the DLL's node, pair
     *
     * DLL will store key and the value
     */

    //create head and tail node

    Node head = new Node(0,0);
    Node tail = new Node(0,0);

    // creating Map
    Map<Integer,Node> cache = new HashMap<>();

    int capacity;

    //creating constructor to initialise the capacity and DLL

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    //implementing get() method

    public int get(int key) {

        //check first map is having key, if yes then follow the steps
        if(cache.containsKey(key)) {
            Node node = cache.get(key);
            //remove the node , so that we can add it at right after the head in DLL, because it is now most
            //recently used guy
            remove(node);
            //adding the node
            insert(node);
            //return the value for the corresponding key
            return node.value;
        }
        // in case key is not present then return -1
        else return -1;
    }

    //implementing put() method

    public void put(int key, int value) {

        // before adding the key and value, we need to check two things
        // 1. if key is already present then remove the key, coz we have to update its value.
        // 2. check the capacity of the cache , if it is full then remove the LRU value
        // and at the end insert the node.

        if (cache.containsKey(key)) cache.remove(key);

        if (cache.size() == capacity ) remove(tail.prev);

        insert(new Node(key, value));
    }

    //lets now implement the helpers methods remove and insert

    private void remove(Node node) {
        //first remove from the cache
        cache.remove(node.key);

        // remove the node from the DLL
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node ) {
        //insert first in the cache
        cache.put(node.key, node);

        // now add this node in DLL at the right after the head
        Node nextNode = head.next;
        head.next = node;
        node.prev = head;
        node.next = nextNode;
        nextNode.prev = node;

    }

    public static void main(String [] ar) {

        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(3));

    }

}
