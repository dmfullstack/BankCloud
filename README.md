# 注意事项
需要在本地host中加入规则
```
127.0.0.1 eurekaserver1
127.0.0.1 eurekaserver2
127.0.0.1 eurekaserver3
```
## 容器化部署
每个模块运行docker插件的build命令，生成image<br>
根目录docker目录下运行 docker-compose up 命令即可<br>
访问localhost:8001可查看<br>
访问localhost:9002/hello测试调用