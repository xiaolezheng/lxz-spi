package com.lxz;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by xiaolezheng on 15/10/13.
 */
@Slf4j
public class FileSearch implements Search{
    @Override
    public List<String> search(String keyWord) {
        log.info("file search");
        System.out.println("file search");
        return null;
    }
}
