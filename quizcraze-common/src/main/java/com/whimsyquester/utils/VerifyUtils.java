package com.whimsyquester.utils;

import com.whimsyquester.entity.constants.Constants;
import com.whimsyquester.entity.enums.VerifyRegexEnum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.utils
 * @ClassName: VerifyUtils
 * @Datetime: 2023/11/19 23:40
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于校验字符串是否符合特定的正则表达式规则
 */

public class VerifyUtils {

    /**
     * @param regex
     * @param value
     * @return boolean
     * @description 使用正则表达式验证给定的字符串是否满足指定的格式要求
     */
    public static boolean verify(String regex, String value) {
        if (StringTools.isEmpty(value)) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    /**
     * @param regex
     * @param value
     * @return boolean
     * @description 使用VerifyRegexEnum枚举类型中定义的正则表达式验证给定的字符串是否满足指定的格式要求
     */
    public static boolean verify(VerifyRegexEnum regex, String value) {
        return verify(regex.getRegex(), value);
    }

    /**
     * @param account
     * @return boolean
     * @description 验证账号字符串是否符合要求
     */
    public static boolean checkAccount(String account) {
        if (StringTools.isEmpty(account) || account.length() < Constants.LENGTH_8 || account.length() > Constants.LENGTH_20) {
            return false;
        }
        return verify(VerifyRegexEnum.ACCOUNT, account);
    }

    /**
     * @param password
     * @return boolean
     * @description 验证密码字符串是否符合要求
     */
    public static boolean checkPassWord(String password) {
        return verify(VerifyRegexEnum.PASSWORD, password);
    }
}

