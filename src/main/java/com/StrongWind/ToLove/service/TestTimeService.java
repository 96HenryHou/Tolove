package com.StrongWind.ToLove.service;

import com.StrongWind.ToLove.entity.TestTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.*;
import java.util.Date;

@Service
public class TestTimeService {

    @Autowired
    private TestTime instance;

  public void testTime(){
      synchronized (instance){
          Date lastTime = instance.getLastTime();
          Date currentTime = new Date();
           if(lastTime == null){
               lastTime = currentTime;
               instance.setLastTime(currentTime);
               System.out.println(" instance.setLastTime(currentTime)"+"时间是："+instance.getLastTime());
           }

           long differenTime = timeDifference(instance.getLastTime(),currentTime);
           if(differenTime>=10){
               instance.setLastTime(currentTime);
               System.out.println("已经到10分钟"+differenTime);
           }else{
               System.out.println("还没到10分钟");

           }      }
  }

    public static long timeDifference(Date start,Date end) {

        LocalDateTime startTime = start.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime endTime = end.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        Duration differenTime = Duration.between(startTime,endTime);
        System.out.println(startTime+"   "+endTime+"时间差为： "+differenTime.toMinutes());
        return differenTime.toMinutes();
    }
}
