package com.whimsyquester.utils;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.utils
 * @ClassName: DateUtil
 * @Datetime: 2023/11/19 23:32
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一些用于处理日期的静态方法
 */

import com.whimsyquester.entity.enums.DateTimePatternEnum;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateUtil {

    /**
     * @param date
     * @param pattern
     * @return String
     * @description 将给定的Date对象按照指定的日期格式进行格式化
     */
    public static String format(Date date, String pattern) {
        return fromLocateDateTime2String(date).format(DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * @param date
     * @return LocalDateTime
     * @description 将给定的Date对象转换为LocalDateTime对象
     */
    public static LocalDateTime fromLocateDateTime2String(Date date) {
        Instant instant = date.toInstant();
        // 默认时区
        ZoneId zone = ZoneId.systemDefault();
        // 获取LocalDate对象
        LocalDateTime localDate = instant.atZone(zone).toLocalDateTime();
        return localDate;
    }

    /**
     * @param date
     * @return LocalDate
     * @description 将给定的Date对象转换为LocalDate对象
     */
    public static LocalDate fromLocateDate2String(Date date) {
        Instant instant = date.toInstant();
        // 默认时区
        ZoneId zone = ZoneId.systemDefault();
        // 获取LocalDate对象
        LocalDate localDate = instant.atZone(zone).toLocalDate();
        return localDate;
    }

    /**
     * @param day
     * @return Date
     * @description 获取当前日期前指定天数的日期
     */
    public static Date getDayAgo(Integer day) {
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(day);
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    /**
     * @param startDate
     * @param endDate
     * @return List<String>
     * @description 获取指定开始日期和结束日期之间（包括开始和结束日期）的所有日期，并以字符串列表的形式返回
     */
    public static List<String> getBetweenDate(Date startDate, Date endDate) {
        LocalDate startLocalDate = fromLocateDate2String(startDate);
        LocalDate endLocalDate = fromLocateDate2String(endDate);
        long numOfDays = ChronoUnit.DAYS.between(startLocalDate, endLocalDate) + 1;
        List<LocalDate> localDateList = Stream.iterate(startLocalDate, date -> date.plusDays(1))
                .limit(numOfDays).collect(Collectors.toList());
        // 默认时区
        List<String> dateList = localDateList.stream().map(date -> date.format(DateTimeFormatter.ofPattern(DateTimePatternEnum.YYYY_MM_DD.getPattern()))).
                collect(Collectors.toList());
        return dateList;
    }
}

