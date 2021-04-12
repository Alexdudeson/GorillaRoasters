package crc647c0cbf32cd524b5e;


public class RatingViewRenderer
	extends crc64720bb2db43a66fe9.ViewRenderer_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"";
		mono.android.Runtime.register ("GorillaRoasters.Droid.RatingViewRenderer, GorillaRoasters.Android", RatingViewRenderer.class, __md_methods);
	}


	public RatingViewRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == RatingViewRenderer.class)
			mono.android.TypeManager.Activate ("GorillaRoasters.Droid.RatingViewRenderer, GorillaRoasters.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public RatingViewRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == RatingViewRenderer.class)
			mono.android.TypeManager.Activate ("GorillaRoasters.Droid.RatingViewRenderer, GorillaRoasters.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public RatingViewRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == RatingViewRenderer.class)
			mono.android.TypeManager.Activate ("GorillaRoasters.Droid.RatingViewRenderer, GorillaRoasters.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);

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
