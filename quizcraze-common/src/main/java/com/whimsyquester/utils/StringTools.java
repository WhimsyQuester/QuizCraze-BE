package com.whimsyquester.utils;

import com.whimsyquester.exception.BusinessException;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.utils
 * @ClassName: StringTools
 * @Datetime: 2023/11/19 23:38
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于字符串处理、参数校验和随机字符串生成
 */

public class StringTools {
    /**
     * @param param
     * @return void
     * @description 检查传入的参数对象是否为空
     */
    public static void checkParam(Object param) {
        try {
            Field[] fields = param.getClass().getDeclaredFields();
            boolean notEmpty = false;
            for (Field field : fields) {
                String methodName = "get" + StringTools.upperCaseFirstLetter(field.getName());
                Method method = param.getClass().getMethod(methodName);
                Object object = method.invoke(param);
                if (object != null && object instanceof java.lang.String && !StringTools.isEmpty(object.toString())
                        || object != null && !(object instanceof java.lang.String)) {
                    notEmpty = true;
                    break;
                }
            }
            if (!notEmpty) {
                throw new BusinessException("多参数更新，删除，必须有非空条件");
            }
        } catch (BusinessException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException("校验参数是否为空失败");
        }
    }

    /**
     * @param field
     * @return String
     * @description 将输入字符串的首字母转换为大写
     */
    public static String upperCaseFirstLetter(String field) {
        if (isEmpty(field)) {
            return field;
        }
        //如果第二个字母是大写，第一个字母不大写
        if (field.length() > 1 && Character.isUpperCase(field.charAt(1))) {
            return field;
        }
        return field.substring(0, 1).toUpperCase() + field.substring(1);
    }

    /**
     * @param str
     * @return boolean
     * @description 判断输入字符串是否为空
     */
    public static boolean isEmpty(String str) {
        if (null == str || "".equals(str) || "null".equals(str) || "\u0000".equals(str)) {
            return true;
        } else return "".equals(str.trim());
    }

    /**
     * @param originString
     * @return String
     * @description 对输入字符串进行MD5加密
     */
    public static String encodeByMD5(String originString) {
        return StringTools.isEmpty(originString) ? null : DigestUtils.md5Hex(originString);
    }

    /**
     * @param fileName
     * @return String
     * @description 获取文件名的后缀部分
     */
    public static String getFileSuffix(String fileName) {
        Integer index = fileName.lastIndexOf(".");
        if (index == -1) {
            return "";
        }
        String suffix = fileName.substring(index);
        return suffix;
    }

    /**
     * @param path
     * @return boolean
     * @description 检查路径字符串是否合法
     */
    public static boolean pathIsOk(String path) {
        if (StringTools.isEmpty(path)) {
            return true;
        }
        return !path.contains("../") && !path.contains("..\\");
    }

    /**
     * @param count
     * @return String
     * @description 生成指定长度的随机字符串
     */
    public static String getRandomString(Integer count) {
        return RandomStringUtils.random(count, true, true);
    }

    /**
     * @param count
     * @return String
     * @description 生成指定长度的随机数字串
     */
    public static String getRandomNumber(Integer count) {
        return RandomStringUtils.random(count, false, true);
    }
}

