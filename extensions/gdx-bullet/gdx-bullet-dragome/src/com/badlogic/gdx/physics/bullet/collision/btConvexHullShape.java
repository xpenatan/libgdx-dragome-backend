/*-------------------------------------------------------
 * This file was automatically generated by XpeCodeGen
 *
 * Dont make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;

/** @author xpenatan */
public class btConvexHullShape extends btPolyhedralConvexAabbCachingShape {

    public btConvexHullShape() {
        resetObj(createNative(), true);
    }

    public static long createNative() {
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(new Bullet.btConvexHullShape());",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("this.$$$jsObj=Bullet.wrapPointer(this.$$$cPointer,Bullet.btConvexHullShape);",this);
	}

    @Override
    protected void delete() {
		long addr = cPointer;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.wrapPointer(addr,Bullet.btConvexHullShape);Bullet.destroy(vec);",this);
    }

    public void addPoint(Vector3 point) {
		checkPointer();
		float x=point.x, y=point.y,z=point.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.Temp.prototype.btVec3();vec.setValue(x,y,z);this.$$$jsObj.addPoint(vec,true);",this);
    }

    public void addPoint(Vector3 point, boolean recalculateLocalAabb) {
		checkPointer();
		float x=point.x, y=point.y,z=point.z;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=Bullet.Temp.prototype.btVec3();vec.setValue(x,y,z);this.$$$jsObj.addPoint(vec,recalculateLocalAabb);",this);
    }
}
