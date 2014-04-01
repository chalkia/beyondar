package com.beyondar.android.plugin;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import com.beyondar.android.opengl.renderer.ARRenderer;
import com.beyondar.android.opengl.texture.Texture;
import com.beyondar.android.util.math.geom.Point3;
import com.beyondar.android.world.BeyondarObject;
import com.beyondar.android.world.World;

public interface GLPlugin extends Plugin {

	/**
	 * This method is invoked when the plug-in is removed.
	 */
	public void onDetached();

	/**
	 * Check if the plug-in is attached.
	 * 
	 * @return
	 */
	public boolean isAttached();

	/**
	 * Setup the plug-in according to the world. This method is also call if a
	 * new world is set.
	 * 
	 * @param world
	 *            The {@link World} information
	 * 
	 */
	public void setup(World world, ARRenderer renderer);
	
	public void onCameraPositionChanged(Point3 newCameraPos);
	
	public void onDrawBeyondaarObject(GL10 gl, BeyondarObject beyondarObject, Texture defaultTexture);

	public void onDrawFrame (GL10 gl);
	
	public void onMaxDistanceSizeChanged (float newMaxDistance);
	
	public void onMinDistanceSizeChanged (float newMinDistance);
	
	public void onSurfaceChanged(GL10 gl, int width, int height) ;
	
	public void onSurfaceCreated(GL10 gl, EGLConfig config);
	
	public void loadAdditionalTextures (GL10 gl);
	
	/** 
	 * Called when the activity has been paused.
	 */
	public void onPause();
	
	/**
	 * Called when the activity has been resumed.
	 */
	public void onResume();

}
