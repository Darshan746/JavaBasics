package com.java.ComparableDemo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ReducerDemo {
    Map<String, User> userMap = new HashMap<>();
    static HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

    public static HashMap<Integer, String> getHash_map() {
        return ( HashMap<Integer, String> )hash_map.clone();
    }

    public static void setHash_map(HashMap<Integer, String> hash_map) {
        ReducerDemo.hash_map = hash_map;
    }


//    public Map<String, User> getUserMap() {
//        return  (HashMap<Integer, User>) userMap.;
//    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public static void main(String[] args) {
        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
        User user = new User(1,23,"Darshan");
        User user2 = new User(1,23,"Darshan123");
        User user3 = new User(1,20,"Darshan123");
        List<User> users  = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("Da", "SH");
        if(0.1*3==0.30000000000000004){
            System.out.println("Correct!");
        }


        Integer i1 = new Integer(30);

        int b =i1;
        System.out.println(b);
        System.out.println(1.0/0.0);
        System.out.println(Double.NaN==Double.NaN);

        System.out.println(users.stream().allMatch(p->p.getAge()>21));
     //   System.out.println("darshan".concat(null));
        ReducerDemo d = new ReducerDemo();
        System.out.println(d.getDescription("hell1o"));


        

    }

    public  String getDescription(Object obj){
        return obj.toString();
    }
}
