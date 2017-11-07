package com.cvele.intersections.ws.interceptor;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 *
 * @author Nikola Cvetkovic
 */

public class LoggingInInterceptor extends AbstractPhaseInterceptor<SoapMessage>{
    
    private static final Logger LOG = LogManager.getLogger(LoggingInInterceptor.class);

    public LoggingInInterceptor() {
        super(Phase.RECEIVE);
    }

    @Override
    public void handleMessage(SoapMessage t) throws Fault {
        InputStream is = t.getContent(InputStream.class);
        
        CachedOutputStream os = new CachedOutputStream();
        
        ThreadContext.push(UUID.randomUUID().toString());
        
        try {
            IOUtils.copy(is, os);
            is.close();
            os.close();
            LOG.info(os.getOut().toString());
            t.setContent(InputStream.class, os.getInputStream());
        } catch (IOException ex) {
            LOG.fatal(ex.getMessage());
        }
        
    }

    

}
