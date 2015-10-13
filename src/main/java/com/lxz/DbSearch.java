package com.lxz;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by xiaolezheng on 15/10/13.
 */
@Slf4j
public class DbSearch implements Search{
    @Override
    public List<String> search(String keyWord) {
        log.info("db search");
        return null;
    }
}
