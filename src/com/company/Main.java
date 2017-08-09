package com.company;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d},%s", index, obj.toString()));
    }

    public static void demoOperation() {
        print(1, 5 / 2);
        print(2, 5 / 2.0);
        print(3, 5 + 2);
        print(4, 5 - 2);
        print(5, 5 * 2);
        print(6, 5 << 2);
        print(7, 5 >> 2);
        print(8, 5 & 2);    //xo101  xo10
        print(9, 5 | 2);
        print(10, 5 ^ 2);
        print(11, 5 == 2);
        print(12, 5 != 2);
    }

    public static void demoControlFlow() {
        int chengji = 70;
        if (chengji > 90) {
            print(1, "优秀");
        } else if (chengji < 80) {
            print(2, "B");
        } else {
            print(3, "C");
        }

        String aa = "C";
        switch (aa) {
            case "B":
                print(4, ">80");
                break;
            case "C":
                print(5, "(70,80)");
                break;
            default:
                print(6, "0,60");
        }

        String cc = "heoolllldhjhgka";
        for (char c : cc.toCharArray()) {
            print(10, c);
        }
    }

    public static void demoString() {
        StringBuilder str = new StringBuilder();
        str.append("ksjksksk");
        str.append("+shiyan");
        print(1, str);
        for (char c : str.toString().toCharArray()) {
            print(0, c);
        }
    }

    public static void demoList() {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strList.add(String.valueOf(i));
        }
        print(1, strList);
        List<String> strListB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strListB.add(String.valueOf(i * i));
        }
        strList.addAll(strListB);
        strList.remove(0);
        print(2, strList);

        Collections.sort(strList);
        print(3, strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(4, strList);
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intList.add(Integer.valueOf(i));
        }
        print(5, intList);
        List<Integer> intListB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intListB.add(Integer.valueOf(i * i));
        }
        intList.addAll(intListB);
        print(6, intList);
        Collections.sort(intList);
        print(7, intList);
        Collections.sort(intList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        print(8, intList);
        Collections.reverse(intList);
        print(9, intList);
    }

    public static void demoKeyValue() {
        Map<String, String> strMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            strMap.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(1, strMap);
        for (Map.Entry<String, String> aa : strMap.entrySet()) {
            print(2, aa.getKey() + ":" + aa.getValue());
        }
    }

    public static void demoException() {
        try {
            print(1, "hello");
            String s = null;
            s.indexOf("a");
        } catch (NullPointerException npe) {
            print(3, "npe");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            print(3, "finally");
        }
    }


    public static void demoCommon(){
        Random rnd = new Random();
        List<Integer> intList2=new ArrayList<>();
        //rnd.setSeed(10);
        for (int i = 0; i < 5; i++) {
            print(1,rnd.nextFloat());
            intList2.add(rnd.nextInt(100));
        }
        print(5,intList2);
        List<Integer> intList= Arrays.asList(new Integer[]{3,4,5,6});
        print(2,intList);
        Collections.shuffle(intList);
        print(3,intList);

    }

    public static void main(String[] args) {
        // write your code here
        //System.out.println("hello nowcoder");
        //print(1, "hello");
        //demoOperation();
        //demoControlFlow();
        //demoString();
        //demoList();
        //demoKeyValue();
        //demoException();
        demoCommon();
    }
}
