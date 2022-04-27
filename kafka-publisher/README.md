# Apache-Kafka-Publisher
 
## Start zookeeper Server
> zookeeper-server-start.bat C:\Users\mkhan339\arif\kafka_2.12-3.1.0\config\zookeeper.properties

## Start kafka server
> kafka-server-start.bat C:\Users\mkhan339\arif\kafka_2.12-3.1.0\config\server.properties

## Create topic in the kafka_2.12-3.1.0 version no longer requires ZooKeeper connection string
> kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic arif

## To see messages in the topic
> kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic arif