/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.collision.btBroadphaseInterface;
import com.badlogic.gdx.physics.bullet.collision.btCollisionConfiguration;
import com.badlogic.gdx.physics.bullet.collision.btDispatcher;

/** @author xpenatan */
public class btDiscreteDynamicsWorld extends btDynamicsWorld {

    public btDiscreteDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface broadInterface, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) {
        this.dispatcher = dispatcher;
        this.broadphasePairCache = broadInterface;
        resetObj(createNative(dispatcher.cPointer, broadInterface.cPointer, constraintSolver.cPointer, collisionConfiguration.cPointer), true);
    }

    private long createNative(long dispatcherAddr, long pairCacheAddr, long constraintSolverAddr, long collisionConfigurationAddr) {
		com.dragome.commons.javascript.ScriptHelper.put("collisionConfigurationAddr",collisionConfigurationAddr,this);
		com.dragome.commons.javascript.ScriptHelper.put("constraintSolverAddr",constraintSolverAddr,this);
		com.dragome.commons.javascript.ScriptHelper.put("pairCacheAddr",pairCacheAddr,this);
		com.dragome.commons.javascript.ScriptHelper.put("dispatcherAddr",dispatcherAddr,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var dispatch=Bullet.wrapPointer(dispatcherAddr,Bullet.btDispatcher);var binterface=Bullet.wrapPointer(pairCacheAddr,Bullet.btBroadphaseInterface);var solver=Bullet.wrapPointer(constraintSolverAddr,Bullet.btConstraintSolver);var conf=Bullet.wrapPointer(collisionConfigurationAddr,Bullet.btCollisionConfiguration);var cobj=new Bullet.btDiscreteDynamicsWorld(dispatch,binterface,solver,conf);",this);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(cobj);",this);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btDiscreteDynamicsWorld);",this);
	}
}
