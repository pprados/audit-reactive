package com.octo.reactive.audit.javax.xml.ws;

import com.octo.reactive.audit.AuditReactive;
import com.octo.reactive.audit.TestTools;
import com.octo.reactive.audit.lib.NetworkAuditReactiveException;
import org.junit.Test;

import javax.xml.ws.Dispatch;
import javax.xml.ws.spi.Invoker;
import java.lang.reflect.InvocationTargetException;

public class DispatchTest
{
	Dispatch x = (Dispatch) TestTools.createProxy(Dispatch.class);

	@Test(expected = NetworkAuditReactiveException.class)
	public void invoke() throws InvocationTargetException, IllegalAccessException
	{
		AuditReactive.strict.commit();
		x.invoke(null, null);
	}

}