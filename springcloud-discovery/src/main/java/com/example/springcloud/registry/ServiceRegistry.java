package com.example.springcloud.registry;

public interface ServiceRegistry extends AutoCloseable{

    ServiceInstanceMapper getInstanceByName(String name);
}
