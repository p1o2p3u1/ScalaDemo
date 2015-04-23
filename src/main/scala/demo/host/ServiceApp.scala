package demo.host

import demo.service.ApiService

object ServiceApp extends App {
  //System.setProperty("hadoop.home.dir", "C:\\Users\\WU\\Downloads\\hadoop")
  //System.setProperty("HADOOP_USER_NAME", "root")
  //System.setProperty("hive.metastore.uris","thrift://Naruto.ccntgrid.zju.edu:9083")
  ApiService.StartService("0.0.0.0", 1234)
}
