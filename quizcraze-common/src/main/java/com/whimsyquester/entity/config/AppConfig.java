package com.whimsyquester.entity.config;

import com.whimsyquester.utils.StringTools;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.config
 * @ClassName: AppConfig
 * @Datetime: 2023/11/20 01:59
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于读取配置文件中的属性值，并提供方法来访问这些属性值
 */

@Configuration  // 一个Spring配置类
public class AppConfig {
    // 项目文件夹的路径
    @Value("${project.folder:}")
    private String projectFolder;

    // 超级管理员的手机号码
    @Value("${super.admin.phones:}")
    private String superAdminPhones;

    // JSON Web Token（JWT）的公共密钥
    @Value("${jwt.common.secret:}")
    private String jwtCommonSecret;

    // 应用程序的名称，默认值为"QuizCraze"
    @Value("${app.name:QuizCraze}")
    private String appName;

    // 应用程序的域名
    @Value("${app.domain:}")
    private String appDomain;

    /**
     * @param
     * @return String
     * @description 对projectFolder进行了处理，如果它不为空并且不以斜杠结尾，会在末尾添加斜杠
     */
    public String getProjectFolder() {
        if (!StringTools.isEmpty(projectFolder) && !projectFolder.endsWith("/")) {
            projectFolder = projectFolder + "/";
        }
        return projectFolder;
    }

    public String getSuperAdminPhones() {
        return superAdminPhones;
    }

    public String getJwtCommonSecret() {
        return jwtCommonSecret;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppDomain() {
        return appDomain;
    }
}

