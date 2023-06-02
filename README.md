## 功能说明
使用spring boot搭建的最简单的验证SSRF的程序

当访问/attack接口并传入一个url参数的时候，服务器会访问该url的资源并返回给客户端

## 启动项目

```shell
./mvnw clean package
docker image build -t test:v1 .
docker run -p 8080:8080 test:v1
```

## 使用方式

```shell
# 获取实例元数据
http://hw.liguanghui.pro:8080/attack?url=http://169.254.169.254/latest/meta-data/instance-type

# 获取本地文件内容
http://hw.liguanghui.pro:8080/attack?url=file:///etc/hosts
```