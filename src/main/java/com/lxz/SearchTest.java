package com.lxz;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by xiaolezheng on 15/10/13.
 */
public class SearchTest {
    public static void main(String[] args){
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> searchs = s.iterator();
        if (searchs.hasNext()) {
            Search curSearch = searchs.next();
            curSearch.search("test");
        }
    }
}
