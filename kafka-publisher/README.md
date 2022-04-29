# Apache-Kafka-Publisher
Apache Kafka is basically used for the streaming purpose. In which we are having producer and consumer.
Producer will push messages to the kafka cluster (it consist of n number of brokers which is also called as kafka ecosystem)
and Consumer will pull messages from the broker from the kafka cluster. Inside the broker we are having the topic and each topic are partioned which is handled by the Zookeeper Service.
## Start zookeeper Server
> zookeeper-server-start.bat C:\Users\mkhan339\arif\kafka_2.12-3.1.0\config\zookeeper.properties

## Start kafka server
> kafka-server-start.bat C:\Users\mkhan339\arif\kafka_2.12-3.1.0\config\server.properties

## Create topic in the kafka_2.12-3.1.0 version no longer requires ZooKeeper connection string
> kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic arif

## To see messages in the topic
> kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic arif
