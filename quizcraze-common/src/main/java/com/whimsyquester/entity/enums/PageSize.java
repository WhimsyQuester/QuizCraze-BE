package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: PageSize
 * @Datetime: 2023/11/20 04:05
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示页面大小选项
 */

public enum PageSize {
    SIZE15(15), SIZE20(20), SIZE30(30), SIZE40(40), SIZE50(50);
    int size;

    PageSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}

