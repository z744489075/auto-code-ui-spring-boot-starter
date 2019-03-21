package com.zengtengpeng;

import com.zengtengpeng.autoCode.config.GlobalConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * 配置
 */
@ConfigurationProperties(prefix = "auto-code")
public class AutoCodeProperties extends GlobalConfig {



}
