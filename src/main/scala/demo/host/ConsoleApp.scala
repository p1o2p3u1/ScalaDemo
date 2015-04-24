package demo.host

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.stat.Statistics
import org.apache.spark.rdd.RDD

object ConsoleApp extends App{
  System.setProperty("hadoop.home.dir", "C:\\Users\\WU\\Downloads\\hadoop")
  System.setProperty("HADOOP_USER_NAME", "root")
  System.setProperty("hive.metastore.uris","thrift://n0.ccntgrid.zju.edu:9083")
  System.setProperty("SPARK_MASTER_IP", "10.214.0.172")
  val conf = new SparkConf().setMaster("spark://10.214.0.172:7077").setAppName("SparkDemo")
  val sc = new SparkContext(conf)

  val x: RDD[Double] = sc.parallelize(1 to 10).map(_.toDouble)
  val y: RDD[Double] = sc.parallelize(11 to 20).map(_.toDouble)
  val corr: Double = Statistics.corr(x, y)
  println(corr)
}
