FROM hub.c.163.com/xbingo/jdk8

MAINTAINER <wangliheng@k2data.com.cn>

ADD ./target/www-server-0.0.1-SNAPSHOT.jar /www-server.jar

EXPOSE 8008

CMD ["java","-jar","www-server.jar"]