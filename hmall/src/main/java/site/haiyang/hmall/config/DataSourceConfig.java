//package site.haiyang.hmall.config;
//
//import org.apache.commons.dbcp.BasicDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//
////@Configuration
//@Component
////@MapperScan(basePackages = "site.haiyang.*.mapper", sqlSessionTemplateRef  = "SqlSessionTemplate")
//@PropertySource("classpath:application.properties")
//@ConfigurationProperties(prefix="spring.datasource")
//public class DataSourceConfig {
//
//    @Value("${spring.datasource.url}")
//    String urla;
//
//    @Bean(name = "dataSource")
////    @Qualifier("dataSource")
////    @ConfigurationProperties(prefix="spring.datasource")
////    locations = "classpath:properyname.properties",
////    @ConfigurationProperties("application.properties")
//    public DataSource getMyDataSource(@Value("${spring.datasource.url}") String url){
//
//        String durl = url;
//        url = urla;
//        System.out.println(durl);
//        return DataSourceBuilder.create().build();
//    }
//
//
//    @Bean(name = "SqlSessionFactoryBean")
//    @Primary
//    public SqlSessionFactoryBean testSqlSessionFactoryBean(@Qualifier("dataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:site/haiyang/*/mapping/*.xml"));
//        return bean;
//    }
//
//    @Bean(name = "SqlSessionFactory")
//    @Primary
//    public SqlSessionFactory testSqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:site/haiyang/*/mapping/*.xml"));
//        return bean.getObject();
//    }
//
//    @Bean(name = "TransactionManager")
//    @Primary
//    public DataSourceTransactionManager testTransactionManager(@Qualifier("dataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean(name = "SqlSessionTemplate")
//    @Primary
//    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//    //这个bean不要忘记配置  如果不配置 上面取得的值为 @Value中的表达式 显然是不符合情况的
//     @Bean
//     public PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
//                return new PropertySourcesPlaceholderConfigurer();
//            }
//
//
//}