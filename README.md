Kafka 설치
  1. Download (http://kafka.apache.org)
  
  2. config/server.properties 복사  server1.properties, server2.properties

      수정항목 

      broker.id=0  //  고유번호지정
      
      #listeners=PLAINTEXT://:9092  //  주석을 해제하고 고유 고유 포트지정

      num.partitions=1  // partition 개수를 2개지정 

      offsets.topic.replication.factor=1  // replication 2개 지정
      
  3. zookeeper 시작 

    ./zookeeper-server-start.sh ../config/zookeeper.properties &
  
  4. kafka broker server1 start
  
    ./kafka-server-start.sh ../config/server1.properties &
  
  5. kafka broker server1 start

    ./kafka-server-start.sh ../config/server1.properties &
  
  6. kafka topic 생성
  
    ./kafka-topics.sh --zookeeper localhost:2181 --create --topic first --partitions 2  --replication-factor 2
    
  7. kafka producer test
  
     ./kafka-console-producer.sh --broker-list localhost:9092 --topic first
     
  8. kafka consumer test
     ./kafka-console-consumer.sh --zookeeper localhost:2181 --topic first

     // befor all stream consumer

     ./kafka-console-consumer.sh --zookeeper localhost:2181 --topic first --from-beginning
