# tower
Spring MVC 基础框架
使用此框架有以下几点需要修改主要是注解配置
1、spring-mvc.xml中的<context:component-scan base-package="cn.tower.*.controller" />
2、spring-mybatis中的<context:component-scan base-package="cn.tower"/>
                    <property name="mapperLocations" value="classpath*:cn/tower/**/mapper/*.xml"/>
                    <property name="basePackage" value="cn.tower.*.mapper"/>
                    <aop:pointcut expression=" execution(* cn.tower.*.service..*(..))"/>
