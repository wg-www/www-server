FROM hub.c.163.com/xbingo/jdk8

MAINTAINER <wangliheng@k2data.com.cn>

ADD ./target/www-0.0.1-SNAPSHOT.jar /www-server.jar

EXPOSE 9099

CMD ["java","-jar","www-server.jar"]