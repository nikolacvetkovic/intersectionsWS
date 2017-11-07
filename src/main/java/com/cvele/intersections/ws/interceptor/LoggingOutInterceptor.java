package com.cvele.intersections.ws.interceptor;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.StaxOutInterceptor;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.CachedOutputStreamCallback;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 *
 * @author Nikola Cvetkovic
 */

public class LoggingOutInterceptor extends AbstractPhaseInterceptor<Message>{
    
    private static final Logger LOG = LogManager.getLogger(LoggingOutInterceptor.class);
    
    public LoggingOutInterceptor(){
        super(Phase.PRE_STREAM);
    }   

    @Override
    public void handleMessage(Message t) throws Fault {
        OutputStream is = t.getContent(OutputStream.class);
        
        CacheAndWriteOutputStream os = new CacheAndWriteOutputStream(is);
                
        t.setContent(OutputStream.class, os);
        Callback callback = new Callback();
        callback.setStack(ThreadContext.cloneStack());
        os.registerCallback(callback);
        
        ThreadContext.pop();
                
//        ThreadContext.clearAll();
                
    }
    
    class Callback implements CachedOutputStreamCallback{

        ThreadContext.ContextStack stack;
        
        @Override
        public void onClose(CachedOutputStream arg0) {
            ThreadContext.setStack(this.stack);
            LOG.info(arg0.getOut().toString());
        }

        @Override
        public void onFlush(CachedOutputStream arg0) {
            
        }
        
        public void setStack(ThreadContext.ContextStack stack){
            this.stack = stack;
        }    
    }

}
