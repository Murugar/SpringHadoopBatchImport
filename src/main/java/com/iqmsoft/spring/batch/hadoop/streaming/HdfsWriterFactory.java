package com.iqmsoft.spring.batch.hadoop.streaming;


public interface HdfsWriterFactory {
	HdfsWriter createWriter();
}
