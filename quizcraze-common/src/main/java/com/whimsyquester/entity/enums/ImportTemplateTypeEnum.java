package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: ImportTemplateTypeEnum
 * @Datetime: 2023/11/20 04:04
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示导入模板的类型
 */

public enum ImportTemplateTypeEnum {
    QUESTION(0, "/template/template_question.xlsx", "问题模板.xlsx"),
    QUESTION_EXAM(1, "/template/template_exam.xlsx", "试题库模板.xlsx");

    private final Integer type;
    private final String templatePath;
    private final String templateName;

    ImportTemplateTypeEnum(Integer type, String templatePath, String templateName) {
        this.type = type;
        this.templatePath = templatePath;
        this.templateName = templateName;
    }

    public static ImportTemplateTypeEnum getByType(Integer type) {
        for (ImportTemplateTypeEnum item : ImportTemplateTypeEnum.values()) {
            if (item.getType().equals(type)) {
                return item;
            }
        }
        return null;
    }

    public Integer getType() {
        return type;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public String getTemplateName() {
        return templateName;
    }
}

