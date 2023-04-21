package com.example.autoconfigure;

import com.example.springcloud.registry.ServiceRegistry;
import com.example.springcloud.registry.ServiceRegistryImpl;
import org.apache.curator.framework.CuratorFramework;
import org.springframework.cloud.zookeeper.discovery.ZookeeperDiscoveryProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudDiscoveryAutoConfiguration {

    @Bean
    public ServiceRegistry serviceRegistry(CuratorFramework curatorFramework, ZookeeperDiscoveryProperties zookeeperDiscoveryProperties){
        return new ServiceRegistryImpl(curatorFramework, zookeeperDiscoveryProperties);
    }
}
