package com.cfx.demo;

import com.cfx.demo.vo.UserVO;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class TestDemo {

    //优化递归中重复计算
    private static Map<Integer,Integer> map = new HashMap<>();

    @Test
    public  Integer String() {
        List<Object> objects = Collections.emptyList();
        List<Object> collect = objects.stream().collect(Collectors.toList());
        return null;
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        if (map.get(n) != null) {
            return map.get(n);
        }
        int ret = f(n - 1) + f(n - 2);
        map.put(n,ret);
        return ret;
    }
}
