# -kafka--publisher
Apache Kafka Publisher using SpringBoot

Kafka commands used
To start Zookeeper 
zookeeper-server-start.bat  D:\JAVA_WORLD\Softwares\kafka\config\zookeeper.properties
To start kafka broker/Kafka cluster
kafka-server-start.bat D:\JAVA_WORLD\Softwares\kafka\config\server.properties
To create a Kafka topic
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic testTopic
To describe a kafka topic
kafka-topics.bat --describe --zookeeper localhost:2181 --topic testTopic
To create a kafka console producer
kafka-console-producer.bat --broker-list localhost:9092 --topic testTopic
To create a kafka console consumer
kafka-console-consumer.bat --bootstrap-server localhost:9092 -topic testTopic
