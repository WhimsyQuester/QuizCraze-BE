package com.whimsyquester.entity.dto;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.dto
 * @ClassName: AppExamPostDto
 * @Datetime: 2023/11/20 02:02
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于在不同层之间传输与考试相关的数据
 */

import com.whimsyquester.entity.po.AppExamQuestion;

import java.util.List;

public class AppExamPostDto {
    private Integer examId; // 考试ID
    private String remark;  // 备注信息
    private List<AppExamQuestion> appExamQuestionList;  // 考试题目列表

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<AppExamQuestion> getAppExamQuestionList() {
        return appExamQuestionList;
    }

    public void setAppExamQuestionList(List<AppExamQuestion> appExamQuestionList) {
        this.appExamQuestionList = appExamQuestionList;
    }
}

