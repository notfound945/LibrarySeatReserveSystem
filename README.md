# 图书馆座位预定系统


## 编译环境

+ OS:
    
    OS 名称:          Microsoft Windows 10 专业版
    
    OS 版本:          10.0.17763 暂缺 Build 17763
    
    OS 制造商:        Microsoft Corporation
    
    OS 配置:          独立工作站
    
    OS 构建类型:      Multiprocessor Free
    

+ JDK:

    java version "1.8.0_251"
    
    Java(TM) SE Runtime Environment (build 1.8.0_251-b08)
    
    Java HotSpot(TM) 64-Bit Server VM (build 25.251-b08, mixed mode)
   
   
+ IDE

    IntelliJ IDEA 2020.1.2 (Ultimate Edition)
            
    JFormDesigner Version 7.0.2.4
    
    Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
    
+ Maven 依赖
    
```css
        <!--    Swing 窗体UI-->
        <dependency>
            <groupId>io.github.vincenzopalazzo</groupId>
            <artifactId>material-ui-swing</artifactId>
            <version>1.1.1_pre-release_6.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.miglayout/miglayout -->
        <dependency>
            <groupId>com.miglayout</groupId>
            <artifactId>miglayout</artifactId>
            <version>3.7.4</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.jdesktop/beansbinding -->
        <dependency>
            <groupId>org.jdesktop</groupId>
            <artifactId>beansbinding</artifactId>
            <version>1.2.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.19</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.alibaba/druid -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
            <version>1.1.22</version>
        </dependency>

```

+ maven Repositories

```xml
  <repositories>
    <repository>
      <id>central</id>
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    </repository>
  </repositories>
  <pluginRepositories>
    <pluginRepository>
      <id>central</id>
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    </pluginRepository>
  </pluginRepositories>
```

+ maven 镜像源

```xml
	<mirror>
		<id>alimaven</id>
		<name>aliyun maven</name>
		<mirrorOf>central</mirrorOf>
		<url>http://maven.aliyun.com/nexue/content/groups/public/</url>
	</mirror>
  </mirrors>
```
