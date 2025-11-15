package com.aph.thriftserver;

import org.apache.thrift.transport.TTransportException;

public class Main {
    public static void main(String[] args) throws TTransportException {
        CrossPlatformServiceServer crossPlatformServiceServer = new CrossPlatformServiceServer();
        crossPlatformServiceServer.start();
    }
}
