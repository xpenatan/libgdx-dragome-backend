/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;

/** @author xpenatan */
public class btBoxShape extends btPolyhedralConvexShape {

    public btBoxShape(Vector3 boxHalfExtents) {
        resetObj(createNative(boxHalfExtents.x, boxHalfExtents.y, boxHalfExtents.z), true);
    }

    public static long createNative(float x, float y, float z) {
		com.dragome.commons.javascript.ScriptHelper.put("z",z,null);
		com.dragome.commons.javascript.ScriptHelper.put("y",y,null);
		com.dragome.commons.javascript.ScriptHelper.put("x",x,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var tmp=Bullet.MyTemp.prototype.btVec3_1(x,y,z);",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(new Bullet.btBoxShape(tmp));",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btBoxShape);",this);
	}

    public void getHalfExtentsWithMargin(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getHalfExtentsWithMargin();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void getHalfExtentsWithoutMargin(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getHalfExtentsWithoutMargin();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }
}
