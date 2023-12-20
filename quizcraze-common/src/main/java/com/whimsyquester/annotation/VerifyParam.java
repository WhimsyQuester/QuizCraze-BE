package com.whimsyquester.annotation;

import com.whimsyquester.entity.enums.VerifyRegexEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.annotation
 * @ClassName: VerifyParam
 * @Datetime: 2023/11/19 22:26
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 自定义注解类，用于在方法参数或类字段上标记需要进行验证的参数，并提供了一些属性来指定验证规则和要求
 */

@Retention(RetentionPolicy.RUNTIME) // 该注解在运行时可被访问和使用
@Target({ElementType.PARAMETER, ElementType.FIELD}) // 该注解可以应用于方法参数和类字段
public @interface VerifyParam {
    // 校验的正则表达式
    VerifyRegexEnum regex() default VerifyRegexEnum.NO;

    // 指定最小长度，整数类型
    int min() default -1;

    // 指定最大长度，整数类型
    int max() default -1;

    // 指定是否为必需参数
    boolean required() default false;
}

