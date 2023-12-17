package com.whimsyquester.entity.po;

import java.io.Serializable;


/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.po
 * @ClassName: ExamQuestionItem
 * @Datetime: 2023/11/20 02:43
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示一个考试问题的项目
 */

public class ExamQuestionItem implements Serializable {


    /**
     *
     */
    private Integer itemId;

    /**
     * 问题ID
     */
    private Integer questionId;

    /**
     * 标题
     */
    private String title;

    /**
     * 排序
     */
    private Integer sort;

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "itemId:" + (itemId == null ? "空" : itemId) + "，问题ID:" + (questionId == null ? "空" : questionId) + "，标题:" + (title == null ? "空" : title) + "，排序:" + (sort == null ? "空" : sort);
    }
}

