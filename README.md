# -kafka--publisher
Apache Kafka Publisher using SpringBoot <br />

Kafka commands used
To start Zookeeper <br />
zookeeper-server-start.bat  D:\JAVA_WORLD\Softwares\kafka\config\zookeeper.properties <br />
To start kafka broker/Kafka cluster <br />
kafka-server-start.bat D:\JAVA_WORLD\Softwares\kafka\config\server.properties <br />
To create a Kafka topic
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic testTopic <br />
To describe a kafka topic <br />
kafka-topics.bat --describe --zookeeper localhost:2181 --topic testTopic <br />
To create a kafka console producer <br />
kafka-console-producer.bat --broker-list localhost:9092 --topic testTopic <br />
To create a kafka console consumer <br />
kafka-console-consumer.bat --bootstrap-server localhost:9092 -topic testTopic <br />
