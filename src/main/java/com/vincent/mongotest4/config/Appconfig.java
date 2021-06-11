package com.vincent.mongotest4.config;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class Appconfig {
    public @Bean MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017");
    }

    public @Bean MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "test1");
    }
    /*
    public @Bean
    MongoDatabaseFactory mongoDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory(MongoClients.create(), "test1");
    }*/
    /*
     * Use the standard Mongo driver API to create a com.mongodb.client.MongoClient instance.
     */
    /*
    public @Bean
    MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017/test1");
    }*/
    /*
     * Factory bean that creates the com.mongodb.client.MongoClient instance
     */
    /*
    public @Bean
    MongoClientFactoryBean mongo() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        //mongo.setHost("localhost");
        return mongo;
    }
     */
}