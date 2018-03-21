package com.yunjae.counter


object Main extends App {
  if (args.length == 0) {
    println("CounterOldProducer {brokers} {topic}")
    System.exit(1)
  }

  val producer = new Producer(brokers = args(0), topic = args(1))
  producer.sendMessages()

}
