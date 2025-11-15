package com.aph.thriftserver;

import com.aph.thriftserver.impl.CrossPlatformResource;
import com.aph.thriftserver.impl.CrossPlatformService;
import com.aph.thriftserver.impl.InvalidOperationException;
import org.apache.thrift.TException;

import java.util.Collections;
import java.util.List;

public class CrossPlatformServiceImpl implements CrossPlatformService.Iface {

    @Override
    public CrossPlatformResource get(int id)
            throws InvalidOperationException, TException {
        return new CrossPlatformResource();
    }

    @Override
    public void save(CrossPlatformResource resource)
            throws InvalidOperationException, TException {
        System.out.println("Here");
    }

    @Override
    public List<CrossPlatformResource> getList()
            throws InvalidOperationException, TException {
        return Collections.emptyList();
    }

    @Override
    public boolean ping() throws InvalidOperationException, TException {
        return true;
    }
}
