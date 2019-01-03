
# ע������
��Ҫ�ڱ���host�м������
```
127.0.0.1 eurekaserver1
127.0.0.1 eurekaserver2
127.0.0.1 eurekaserver3
```
## ����������
��pom.xml�ļ���properties��ǩ����Ҫ���
```xml
<!--nameһ��Ϊbank/XXX-->
 <docker.image.name>bank/demo-consumer</docker.image.name>
 <!--tag ͳһΪ1.0-->
  <docker.image.tag>1.0</docker.image.tag>
```
��build->plugins��ǩ�л���Ҫ����docker��ǩ
```xml
            <plugin>
                <artifactId>maven-resources-plugin</artifactId>
                <executions>
                    <execution>
                        <id>copy-resources</id>
                        <!-- here the phase you need -->
                        <phase>validate</phase>
                        <goals>
                            <goal>copy-resources</goal>
                        </goals>
                        <configuration>
                            <outputDirectory>${basedir}/target/dockerfile</outputDirectory>
                            <resources>
                                <resource>
                                    <directory>src/main/docker</directory>
                                    <filtering>true</filtering>
                                </resource>
                            </resources>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>com.spotify</groupId>
                <artifactId>docker-maven-plugin</artifactId>
                <version>0.4.10</version>
                <configuration>
                    <imageName>${docker.image.name}:${docker.image.tag}</imageName>
                    <dockerDirectory>${basedir}/target/dockerfile</dockerDirectory>
                    <resources>
                        <resource>
                            <targetPath>/</targetPath>
                            <directory>${project.build.directory}</directory>
                            <include>${project.build.finalName}.jar</include>
                        </resource>
                    </resources>
                </configuration>
            </plugin>
```
## ���ݿ��������
��ʹ��֮ǰ��Ҫ�޸�application.yml�е�������ã������û����������<br>
����localhost:9001/test/database����<br>
��������druid���ҳ��,ͨ�� localhost:9001/druid���ʣ��˺����붼��admin
