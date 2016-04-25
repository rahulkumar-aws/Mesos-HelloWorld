package com.example
import org.apache.mesos.MesosSchedulerDriver
import org.apache.mesos.Protos.FrameworkInfo
/**
  * Created by rahul on 23/04/16.
  */
object SigMain {
  def main(args: Array[String]) {

    val framework = FrameworkInfo.newBuilder.
      setName("SigView").
      setUser("").
      setRole("*").
      setCheckpoint(false).
      setFailoverTimeout(0.0d).
      build()
    val scheduler = new SigScheduler
    scheduler.submitTasks(args:_*)
    val mesosURL = "127.0.0.1:5050"
    val driver = new MesosSchedulerDriver(scheduler,framework,mesosURL)
    driver.run()
  }
}
