package com.huang.aimybatisplus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Main {
    public static void main(String[] args) {
        //创建generator对象
        AutoGenerator autoGenerator = new AutoGenerator();
        //数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        //数据库基本信息
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/mybatis?useUniconde=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("981222");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        //将数据源装进generator对象
        autoGenerator.setDataSource(dataSourceConfig);
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        //获取绝对路径
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        //生成后是否弹窗
        globalConfig.setOpen(false);
        //默认service生成时会有i在前面，通过setServiceName方法去掉
        globalConfig.setServiceName("%sService");
        //默认作者计算机名称
        globalConfig.setAuthor("huang");
        //将全局配置装进generator对象
        autoGenerator.setGlobalConfig(globalConfig);
        //包信息
        PackageConfig packageConfig = new PackageConfig();
        //创建文件的路径
        packageConfig.setParent("com.huang.aimybatisplus");
        //创建文件的名字
        //packageConfig.setModuleName("generator");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setMapper("mapper");
        packageConfig.setEntity("entity");
        //将包信息装进generator对象
        autoGenerator.setPackageInfo(packageConfig);
        //配置策略
        StrategyConfig strategyConfig = new StrategyConfig();
        //生成部分表
        strategyConfig.setInclude("user");
        //每个实体类都添加Lombok注解
        strategyConfig.setEntityLombokModel(true);
        //下划线转驼峰命名
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        //将配置策略装进generator对象
        autoGenerator.setStrategy(strategyConfig);
        //运行
        autoGenerator.execute();
    }
}
