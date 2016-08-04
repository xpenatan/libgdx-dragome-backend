/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

/** @author xpenatan */
public class btCollisionDispatcher extends btDispatcher {

    public btCollisionDispatcher(btCollisionConfiguration collisionConfiguration) {
        resetObj(createNative(collisionConfiguration.cPointer), true);
    }

    private static long createNative(long collisionConfigurationAddr) {
		com.dragome.commons.javascript.ScriptHelper.put("collisionConfigurationAddr",collisionConfigurationAddr,null);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var config=Bullet.wrapPointer(collisionConfigurationAddr,Bullet.btCollisionConfiguration);var disp=new Bullet.btCollisionDispatcher(config);",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(disp);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btCollisionDispatcher);",this);
	}
}
