FROM maven:3.6.3-jdk-8-slim

COPY ./. /

ENTRYPOINT ["/usr/local/bin/mvn-entrypoint.sh"]
CMD ["mvn"]