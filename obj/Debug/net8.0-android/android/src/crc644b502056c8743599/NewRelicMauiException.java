package crc644b502056c8743599;


public class NewRelicMauiException
	extends java.lang.Exception
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("NewRelic.MAUI.Plugin.NewRelicMauiException, NewRelic.MAUI.Plugin", NewRelicMauiException.class, __md_methods);
	}


	public NewRelicMauiException ()
	{
		super ();
		if (getClass () == NewRelicMauiException.class) {
			mono.android.TypeManager.Activate ("NewRelic.MAUI.Plugin.NewRelicMauiException, NewRelic.MAUI.Plugin", "", this, new java.lang.Object[] {  });
		}
	}


	public NewRelicMauiException (java.lang.String p0, java.lang.Throwable p1)
	{
		super (p0, p1);
		if (getClass () == NewRelicMauiException.class) {
			mono.android.TypeManager.Activate ("NewRelic.MAUI.Plugin.NewRelicMauiException, NewRelic.MAUI.Plugin", "System.String, System.Private.CoreLib:Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}


	public NewRelicMauiException (java.lang.String p0)
	{
		super (p0);
		if (getClass () == NewRelicMauiException.class) {
			mono.android.TypeManager.Activate ("NewRelic.MAUI.Plugin.NewRelicMauiException, NewRelic.MAUI.Plugin", "System.String, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}


	public NewRelicMauiException (java.lang.Throwable p0)
	{
		super (p0);
		if (getClass () == NewRelicMauiException.class) {
			mono.android.TypeManager.Activate ("NewRelic.MAUI.Plugin.NewRelicMauiException, NewRelic.MAUI.Plugin", "Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public NewRelicMauiException (java.lang.String p0, java.lang.StackTraceElement[] p1)
	{
		super ();
		if (getClass () == NewRelicMauiException.class) {
			mono.android.TypeManager.Activate ("NewRelic.MAUI.Plugin.NewRelicMauiException, NewRelic.MAUI.Plugin", "System.String, System.Private.CoreLib:Java.Lang.StackTraceElement[], Mono.Android", this, new java.lang.Object[] { p0, p1 });
		}
	}

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
