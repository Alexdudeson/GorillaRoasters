package crc647c0cbf32cd524b5e;


public class ButtonFrameRenderer
	extends crc64720bb2db43a66fe9.FrameRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("GorillaRoasters.Droid.ButtonFrameRenderer, GorillaRoasters.Android", ButtonFrameRenderer.class, __md_methods);
	}


	public ButtonFrameRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ButtonFrameRenderer.class)
			mono.android.TypeManager.Activate ("GorillaRoasters.Droid.ButtonFrameRenderer, GorillaRoasters.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ButtonFrameRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ButtonFrameRenderer.class)
			mono.android.TypeManager.Activate ("GorillaRoasters.Droid.ButtonFrameRenderer, GorillaRoasters.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ButtonFrameRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ButtonFrameRenderer.class)
			mono.android.TypeManager.Activate ("GorillaRoasters.Droid.ButtonFrameRenderer, GorillaRoasters.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
