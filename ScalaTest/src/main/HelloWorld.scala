package main

import java.io.{File, PrintWriter}

import scala.io.StdIn

/**
  * scala hello
  */
object HelloWorld {

  def myMethod(a: Int, b:Int): Int = {
    var sum = a + b;
    return sum;
  }

  def inputTestt () :Unit = {
    print("请输入你的名字：");
    var line = StdIn.readLine()
    println("谢谢，你输入的是：" + line)
  }


  def inputTest () :Unit = {
    print("请输入你的名字：");
    var line = StdIn.readLine()
    println("谢谢，你输入的是：" + line)
  }

  def main(args: Array[String]): Unit = {
        println("hello,world");
    var writer = new PrintWriter(new File("test.txt"));
    writer.write("hello,world!!!!");
    writer.close();

    var s = myMethod(1,3);
    print(s)
    inputTest();

  }

}
