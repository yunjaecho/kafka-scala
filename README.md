==========================
zookeeper server start
=========================
./zookeeper-server-start.sh ../config/zookeeper.properties &

==========================
kafka server1 start
=========================
./kafka-server-start.sh ../config/server1.properties &

==========================
kafka server2 start
=========================
./kafka-server-start.sh ../config/server2.properties &

==========================
create topic
=========================
./kafka-topics.sh --zookeeper localhost:2181 --create --topic first --partitions 2  --replication-factor 2


==========================
producer console 
=========================
./kafka-console-producer.sh --broker-list localhost:9092 --topic first


==========================
consumer console 
=========================
./kafka-console-consumer.sh --zookeeper localhost:2181 --topic first
// before producer
./kafka-console-consumer.sh --zookeeper localhost:2181 --topic first --from-beginning