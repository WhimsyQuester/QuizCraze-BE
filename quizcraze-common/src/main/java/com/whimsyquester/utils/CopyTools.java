package com.whimsyquester.utils;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.utils
 * @ClassName: CopyTools
 * @Datetime: 2023/11/19 23:29
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义了两个泛型方法用于对象之间的属性拷贝
 */

public class CopyTools {
    public static <T, S> List<T> copyList(List<S> sList, Class<T> classz) {
        List<T> list = new ArrayList<T>();
        for (S s : sList) {
            T t = null;
            try {
                t = classz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            BeanUtils.copyProperties(s, t);
            list.add(t);
        }
        return list;
    }

    public static <T, S> T copy(S s, Class<T> classz) {
        T t = null;
        try {
            t = classz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        BeanUtils.copyProperties(s, t);
        return t;
    }
}

