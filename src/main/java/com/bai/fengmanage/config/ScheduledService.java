package com.bai.fengmanage.config;

import com.bai.fengmanage.issuelist.entity.IssueList;
import com.bai.fengmanage.issuelist.service.IssueListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author admin
 * @version 2018/9/28
 */
@Component
public class ScheduledService {

    @Autowired
    private IssueListService issueListService;

    @Scheduled(cron="0 0 12 * * ?")
    public void scheduled(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(new Date());
        List<IssueList> list = issueListService.getList();
        List<IssueList> news = new ArrayList<>();
        for(IssueList li:list){
            if(format.equals(li.getItime())){
                news.add(li);
            }
        }
    }
}
