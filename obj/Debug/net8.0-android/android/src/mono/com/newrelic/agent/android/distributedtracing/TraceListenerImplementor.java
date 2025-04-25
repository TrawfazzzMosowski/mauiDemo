package mono.com.newrelic.agent.android.distributedtracing;


public class TraceListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.newrelic.agent.android.distributedtracing.TraceListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSpanCreated:(Ljava/util/Map;)V:GetOnSpanCreated_Ljava_util_Map_Handler:Com.Newrelic.Agent.Android.Distributedtracing.ITraceListenerInvoker, NewRelic.MAUI.Android.Binding\n" +
			"n_onTraceCreated:(Ljava/util/Map;)V:GetOnTraceCreated_Ljava_util_Map_Handler:Com.Newrelic.Agent.Android.Distributedtracing.ITraceListenerInvoker, NewRelic.MAUI.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Newrelic.Agent.Android.Distributedtracing.ITraceListenerImplementor, NewRelic.MAUI.Android.Binding", TraceListenerImplementor.class, __md_methods);
	}


	public TraceListenerImplementor ()
	{
		super ();
		if (getClass () == TraceListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Newrelic.Agent.Android.Distributedtracing.ITraceListenerImplementor, NewRelic.MAUI.Android.Binding", "", this, new java.lang.Object[] {  });
		}
	}


	public void onSpanCreated (java.util.Map p0)
	{
		n_onSpanCreated (p0);
	}

	private native void n_onSpanCreated (java.util.Map p0);


	public void onTraceCreated (java.util.Map p0)
	{
		n_onTraceCreated (p0);
	}

	private native void n_onTraceCreated (java.util.Map p0);

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
