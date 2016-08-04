/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

/** @author xpenatan */
public class btCapsuleShape extends btConvexInternalShape {

    public btCapsuleShape(float radius, float height) {
        resetObj(createNative(radius, height), true);
    }

    public static long createNative(float radius, float height) {
		com.dragome.commons.javascript.ScriptHelper.put("height",height,null);
		com.dragome.commons.javascript.ScriptHelper.put("radius",radius,null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(new Bullet.btCapsuleShape(radius,height));",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btCapsuleShape);",this);
	}
}
