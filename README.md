# spring-cloud-config

分布式配置中心管理demo

1、先在git上进行coufig相关配置文件进行配置
2、根据用例启动config-server
3、根据用例启动client-server消费配置方

1）http://localhost:8080/application/pre-product/master 用于验证config-server访问git配置文件是否正常
2）http://localhost:8888/title 用于测试消费方是否正常

