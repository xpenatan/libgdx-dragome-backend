/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

/** @author xpenatan */
public class btDefaultCollisionConfiguration extends btCollisionConfiguration {

    public btDefaultCollisionConfiguration() {
        resetObj(createNative(), true);
    }

    private static long createNative() {
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var conf=new Bullet.btDefaultCollisionConfiguration();",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(conf);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btDefaultCollisionConfiguration);",this);
	}
}
