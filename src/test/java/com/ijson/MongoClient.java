package com.ijson;

import com.ijson.bean.User;
import com.ijson.mongo.support.DatastoreExt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by cuiyongxu on 17/8/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mongo-datastore.xml")
public class MongoClient {
    @Resource(name = "mongoDatastore")
    private DatastoreExt datastore;

    @Test
    public void addUser() {
        for (int i = 0; i < 500; i++) {
            User user = new User("1318-" + i);
            datastore.save(user);
        }
    }
}

