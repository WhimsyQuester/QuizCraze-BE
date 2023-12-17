package com.whimsyquester.entity.constants;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.constants
 * @ClassName: Constants
 * @Datetime: 2023/11/20 02:01
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 静态常量
 */

public class Constants {
    // 长度常量，用于表示不同长度的整数值
    public static final Integer LENGTH_2 = 2;
    public static final Integer LENGTH_6 = 6;
    public static final Integer LENGTH_8 = 8;
    public static final Integer LENGTH_16 = 16;
    public static final Integer LENGTH_10 = 10;
    public static final Integer LENGTH_15 = 15;
    public static final Integer LENGTH_20 = 20;
    public static final Integer LENGTH_30 = 30;
    public static final Integer LENGTH_50 = 50;
    public static final Integer LENGTH_150 = 150;

    public static final Integer WIDTH_70 = 70;

    // 数字常量
    public static final Integer ZERO = 0;
    public static final Integer ONE = 1;
    public static final Integer TWO = 2;

    // 字符串常量
    public static final String ZERO_STR = "0";
    public static final String ONE_STR = "1";

    // 键常量
    public static final String CHECK_CODE_KEY = "check_code_key";

    // 会话常量
    public static final String SESSION_KEY = "session_key";

    public static final String SESSION_KEY_APP = "session_key_app";

    // 布尔常量
    public static final String TRUE_STR = "正确";
    public static final String FALSE_STR = "错误";

    // 字符串数组常量
    public static final String[] LETTERS = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};

    // Excel标题常量
    public static final String[] EXCEL_TITLE_EXAM_QUESTION = new String[]{"标题", "分类名称", "难度", "问题类型", "问题选项", "问题答案", "问题描述", "答案分析"};

    public static final String[] EXCEL_TITLE_QUESTION = new String[]{"标题", "分类名称", "难度", "问题描述", "答案分析"};

    // 数据库表名常量
    public static final String TABLE_NAME_QUESTION_INFO = "question_info";

    public static final String TABLE_NAME_SHARE_INFO = "share_info";

    // JWT常量
    public static final String JWT_KEY_LOGIN_TOKEN = "jwt_login_token_key";

    public static final Integer JWT_TOKEN_EXPIRES_DAYS = 7;

    // Redis键常量
    public static final String REDIS_KEY_CHECKCODE = "quizcraze:check:";

    // 文件路径常量
    public static final String APP_UPDATE_FOLDER = "/app/";
    public static final String FOLDER_AVATAR = "avatar/";
    public static final String READ_IMAGE_PATH = "/api/file/getImage/";
}

