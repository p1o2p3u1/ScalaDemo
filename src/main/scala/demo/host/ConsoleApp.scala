package demo.host

object ConsoleApp extends App{
  System.setProperty("hadoop.home.dir", "C:\\Users\\WU\\Downloads\\hadoop")
  System.setProperty("HADOOP_USER_NAME", "root")
  System.setProperty("hive.metastore.uris","thrift://n0.ccntgrid.zju.edu:9083")

}
