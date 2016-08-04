/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.physics.bullet.BulletBase;

/** @author xpenatan */
public class btQuaternion extends BulletBase {

    public static final float[] localArr_1 = new float[4];

    public static final float[] localArr_2 = new float[4];

    public btQuaternion() {
        resetObj(createNative(0, 0, 0, 0), true);
    }

    public btQuaternion(float x, float y, float z, float w) {
        resetObj(createNative(x, y, z, w), true);
    }

    public btQuaternion(long cPtr, boolean cMemoryOwn) {
        resetObj(cPtr, cMemoryOwn);
    }

    private static long createNative(float x, float y, float z, float w) {
		com.dragome.commons.javascript.ScriptHelper.put("w",w,null);
		com.dragome.commons.javascript.ScriptHelper.put("z",z,null);
		com.dragome.commons.javascript.ScriptHelper.put("y",y,null);
		com.dragome.commons.javascript.ScriptHelper.put("x",x,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var quat=new Bullet.btQuaternion(x,y,z,w);",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(quat);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btQuaternion);",this);
	}

    public static void set(btQuaternion quat, float[] value) {
		com.dragome.commons.javascript.ScriptHelper.put("value",value,null);
		quat.checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",quat.jsObj,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setValue(value[0],value[1],value[2],value[3]);",null);
    }

    public static void get(btQuaternion quaternion, float[] value) {
		com.dragome.commons.javascript.ScriptHelper.put("value",value,null);
		quaternion.checkPointer();
		Object quat = quaternion.jsObj;
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("value[0]=quat.x();value[1]=quat.y();value[2]=quat.z();value[3]=quat.w();",null);
    }

    public static void set(Quaternion in, btQuaternion out) {
		out.checkPointer();
		btQuaternion.localArr_1[0] = in.x;
		btQuaternion.localArr_1[1] = in.y;
		btQuaternion.localArr_1[2] = in.z;
		btQuaternion.localArr_1[3] = in.w;
		btQuaternion.set(out, btQuaternion.localArr_1);
    }

    public static void get(btQuaternion in, Quaternion out) {
		in.checkPointer();
		btQuaternion.get(in, btQuaternion.localArr_1);
		out.set(btQuaternion.localArr_1[0], btQuaternion.localArr_1[1], btQuaternion.localArr_1[2],btQuaternion.localArr_1[3]);
    }

    public void setValue(float x, float y, float z, float w) {
		com.dragome.commons.javascript.ScriptHelper.put("w",w,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",z,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",y,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",x,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setValue(x,y,z,w);",this);
    }

    public float getX() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.x();",this);
    }

    public float getY() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.y();",this);
    }

    public float getZ() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.z();",this);
    }

    public float getW() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.w();",this);
    }

    public void setX(float x) {
		com.dragome.commons.javascript.ScriptHelper.put("x",x,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setX(x);",this);
    }

    public void setY(float y) {
		com.dragome.commons.javascript.ScriptHelper.put("y",y,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setY(y);",this);
    }

    public void setZ(float z) {
		com.dragome.commons.javascript.ScriptHelper.put("z",z,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setZ(z);",this);
    }

    public void setW(float w) {
		com.dragome.commons.javascript.ScriptHelper.put("w",w,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setW(w);",this);
    }
}
