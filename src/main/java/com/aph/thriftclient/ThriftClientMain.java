package com.aph.thriftclient;

import com.aph.thriftserver.impl.CrossPlatformService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ThriftClientMain {
    public static void main(String[] args) throws TException {
        TTransport transport = new TSocket("localhost", 9090);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        CrossPlatformService.Client client = new CrossPlatformService.Client(protocol);

        boolean result = client.ping();
        System.out.println(result);
        System.out.println(client.get(1));
        transport.close();
    }
}
