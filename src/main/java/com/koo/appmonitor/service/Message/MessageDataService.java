package com.koo.appmonitor.service.Message;

import com.koo.appmonitor.constant.GlobalConfig;
import com.koo.appmonitor.utils.FileHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by gucailiang on 2017/8/25.
 */
@Service
public class MessageDataService {

    @Resource
    FileHelper fileHelper;

    public void saveInfo(int temperature, int humidity) {
        fileHelper.doFileWrite(GlobalConfig.getValue("RECORD.PATH"), temperature + " - " + humidity);
    }

}
