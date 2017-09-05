# app-monitor

## 数据保存位置
发送的数据保存在 app-monitor\Record\record.txt
## 使用说明
在使用的时候，需要修改 pom.xml中的RECORD.PATH这个路径
```xml
   <profiles>
        <profile>
            <id>develop</id>
            <properties>
                <RECORD.PATH>D:/IdeaProjects/app-monitor/Record/record.txt</RECORD.PATH>
            </properties>
        </profile>
   </profiles>
```
 