package mono.com.newrelic.agent.android.instrumentation.io;


public class StreamCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.newrelic.agent.android.instrumentation.io.StreamCompleteListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_streamComplete:(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V:GetStreamComplete_Lcom_newrelic_agent_android_instrumentation_io_StreamCompleteEvent_Handler:Com.Newrelic.Agent.Android.Instrumentation.IO.IStreamCompleteListenerInvoker, NewRelic.MAUI.Android.Binding\n" +
			"n_streamError:(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V:GetStreamError_Lcom_newrelic_agent_android_instrumentation_io_StreamCompleteEvent_Handler:Com.Newrelic.Agent.Android.Instrumentation.IO.IStreamCompleteListenerInvoker, NewRelic.MAUI.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Newrelic.Agent.Android.Instrumentation.IO.IStreamCompleteListenerImplementor, NewRelic.MAUI.Android.Binding", StreamCompleteListenerImplementor.class, __md_methods);
	}


	public StreamCompleteListenerImplementor ()
	{
		super ();
		if (getClass () == StreamCompleteListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Newrelic.Agent.Android.Instrumentation.IO.IStreamCompleteListenerImplementor, NewRelic.MAUI.Android.Binding", "", this, new java.lang.Object[] {  });
		}
	}


	public void streamComplete (com.newrelic.agent.android.instrumentation.io.StreamCompleteEvent p0)
	{
		n_streamComplete (p0);
	}

	private native void n_streamComplete (com.newrelic.agent.android.instrumentation.io.StreamCompleteEvent p0);


	public void streamError (com.newrelic.agent.android.instrumentation.io.StreamCompleteEvent p0)
	{
		n_streamError (p0);
	}

	private native void n_streamError (com.newrelic.agent.android.instrumentation.io.StreamCompleteEvent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
