package com.iqmsoft.spring.batch.hadoop.streaming;

import org.springframework.context.SmartLifecycle;
import org.springframework.integration.Message;
import org.springframework.integration.MessageHandlingException;
import org.springframework.integration.handler.AbstractMessageHandler;
import org.springframework.util.Assert;

public class HdfsWritingMessageHandler extends AbstractMessageHandler implements SmartLifecycle {

	private volatile boolean autoStartup = true;

	private volatile int phase;
	
	protected final Object lifecycleMonitor = new Object();

	private volatile boolean active;
		
	private HdfsWriter hdfsWriter;
	
	private HdfsWriterFactory hdfsWriterFactory;
	
	public HdfsWritingMessageHandler(HdfsWriterFactory hdfsWriterFactory) {
		Assert.notNull(hdfsWriterFactory,
				"HdfsWriterFactory must not be null.");
		this.hdfsWriterFactory = hdfsWriterFactory;
	}
	
	@Override
	protected void handleMessageInternal(Message<?> message) throws Exception {
		doWrite(message);
	}	
	
	protected void doWrite(Message<?> message) {
		try {
			hdfsWriter.write(message);
		} catch (Exception e) {
			throw new MessageHandlingException(message,
					"failed to write Message payload to HDFS", e);
		}
	}


	
	public boolean isRunning() {
		return this.active;
	}
	

	public void start() {		
		synchronized (this.lifecycleMonitor) {
			this.hdfsWriter = this.hdfsWriterFactory.createWriter();
		}
	}
	
	
	public void stop() {
		synchronized (this.lifecycleMonitor) {
			this.hdfsWriter.close();
		}
	}
	
	
	public void stop(Runnable callback) {
		//TODO
		stop();		
	}
	
	
	public int getPhase() {
		return this.phase;
	}
	
	public void setPhase(int phase) {
		this.phase = phase;
	}
	
	
	public boolean isAutoStartup() {
		return this.autoStartup;
	}
	
	public void setAutoStartup(boolean autoStartup) {
		this.autoStartup = autoStartup;
	}


}
