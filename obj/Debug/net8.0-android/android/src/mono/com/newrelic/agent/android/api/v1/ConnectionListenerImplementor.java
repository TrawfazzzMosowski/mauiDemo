package mono.com.newrelic.agent.android.api.v1;


public class ConnectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.newrelic.agent.android.api.v1.ConnectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_connected:(Lcom/newrelic/agent/android/api/v1/ConnectionEvent;)V:GetConnected_Lcom_newrelic_agent_android_api_v1_ConnectionEvent_Handler:Com.Newrelic.Agent.Android.Api.V1.IConnectionListenerInvoker, NewRelic.MAUI.Android.Binding\n" +
			"n_disconnected:(Lcom/newrelic/agent/android/api/v1/ConnectionEvent;)V:GetDisconnected_Lcom_newrelic_agent_android_api_v1_ConnectionEvent_Handler:Com.Newrelic.Agent.Android.Api.V1.IConnectionListenerInvoker, NewRelic.MAUI.Android.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Newrelic.Agent.Android.Api.V1.IConnectionListenerImplementor, NewRelic.MAUI.Android.Binding", ConnectionListenerImplementor.class, __md_methods);
	}


	public ConnectionListenerImplementor ()
	{
		super ();
		if (getClass () == ConnectionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Newrelic.Agent.Android.Api.V1.IConnectionListenerImplementor, NewRelic.MAUI.Android.Binding", "", this, new java.lang.Object[] {  });
		}
	}


	public void connected (com.newrelic.agent.android.api.v1.ConnectionEvent p0)
	{
		n_connected (p0);
	}

	private native void n_connected (com.newrelic.agent.android.api.v1.ConnectionEvent p0);


	public void disconnected (com.newrelic.agent.android.api.v1.ConnectionEvent p0)
	{
		n_disconnected (p0);
	}

	private native void n_disconnected (com.newrelic.agent.android.api.v1.ConnectionEvent p0);

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
