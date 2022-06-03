FROM registry.access.redhat.com/openjdk/openjdk-11-rhel7:1.1-9

COPY ./target/*.jar /deployments/

COPY run /usr/local/s2i/
