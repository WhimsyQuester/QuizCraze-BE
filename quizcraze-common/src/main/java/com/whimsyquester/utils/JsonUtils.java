package com.whimsyquester.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.whimsyquester.entity.enums.ResponseCodeEnum;
import com.whimsyquester.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.utils
 * @ClassName: JsonUtils
 * @Datetime: 2023/11/19 23:34
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Json处理的工具类JsonUtils
 */

public class JsonUtils {
    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    /**
     * @param obj
     * @return String
     * @description 将对象转换为JSON格式的字符串
     */
    public static String convertObj2Json(Object obj) {
        return JSON.toJSONString(obj);
    }

    /**
     * @param json
     * @param classz
     * @return T
     * @description 将JSON格式的字符串转换为指定类型的对象
     */
    public static <T> T convertJson2Obj(String json, Class<T> classz) {
        try {
            return JSONObject.parseObject(json, classz);
        } catch (Exception e) {
            logger.error("convertJson2Obj异常，json:{}", json);
            throw new BusinessException(ResponseCodeEnum.CODE_601);
        }
    }

    /**
     * @param json
     * @param classz
     * @return List<T>
     * @description 将JSON格式的数组字符串转换为指定类型的对象列表
     */
    public static <T> List<T> convertJsonArray2List(String json, Class<T> classz) {
        try {
            return JSONArray.parseArray(json, classz);
        } catch (Exception e) {
            logger.error("convertJsonArray2List,json:{}", json, e);
            throw new BusinessException(ResponseCodeEnum.CODE_601);
        }
    }
}

