package com.octo.reactive.audit.java.io;

import com.octo.reactive.audit.AuditReactiveException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import static com.octo.reactive.audit.Latency.LOW;

@Aspect
public class FileReaderAspect extends AbstractReaderAudit
{
	@Before("call(java.io.FileReader+.new(..))")
	public void new_(JoinPoint thisJoinPoint) throws AuditReactiveException
	{
		latency(LOW, thisJoinPoint);
	}

}
