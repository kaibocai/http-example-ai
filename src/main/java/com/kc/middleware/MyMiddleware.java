package com.kc.middleware;

import com.microsoft.azure.functions.internal.spi.middleware.Middleware;
import com.microsoft.azure.functions.internal.spi.middleware.MiddlewareChain;
import com.microsoft.azure.functions.internal.spi.middleware.MiddlewareContext;

public class MyMiddleware implements Middleware {
    @Override
    public void invoke(MiddlewareContext context, MiddlewareChain chain) throws Exception {
        context.getLogger().info("This is from MyMiddleware :)");
        chain.doNext(context);
    }
}
