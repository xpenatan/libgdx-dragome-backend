/*-------------------------------------------------------
 * This file was generated by XpeCodeGen
 * Version 1.0.0
 *
 * Do not make changes to this file
 *-------------------------------------------------------*/
package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;

/** @author xpenatan */
public class btCollisionObject extends BulletBase {

    btCollisionWorld world;

    int userValue;

    public Object userData;

    protected btCollisionShape shape;

    private btBroadphaseProxy broadphaseProxy;

    public btCollisionObject() {
        create();
    }

    protected void create() {
        resetObj(createNative(), true);
    }

    public btCollisionObject(long cPtr, boolean cMemoryOwn) {
        resetObj(cPtr, cMemoryOwn);
    }

    @Override
    protected void delete() {
		super.delete();
		userData = null;
		if(shape != null)
		shape.dispose();
		shape = null;
    }

    private static long createNative() {
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var cobj=new Bullet.btCollisionObject();",null);
		return com.dragome.commons.javascript.ScriptHelper.evalLong("Bullet.getPointer(cobj);",null);
    }

	protected void cacheObj() {
		com.dragome.commons.javascript.ScriptHelper.put("addr",this.cPointer,this);
		this.jsObj = com.dragome.commons.javascript.ScriptHelper.eval("Bullet.wrapPointer(addr,Bullet.btCollisionObject);",this);
	}

    public btCollisionWorld getWorld() {
        checkPointer();
        return world;
    }

    public boolean mergesSimulationIslands() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.mergesSimulationIslands();",this);
    }

    public void getAnisotropicFriction(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var vec=jsObj.getAnisotropicFriction();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.x();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.y();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("vec.z();",this);
    }

    public void setAnisotropicFriction(Vector3 anisotropicFriction, int frictionMode) {
		com.dragome.commons.javascript.ScriptHelper.put("frictionMode",frictionMode,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",anisotropicFriction.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",anisotropicFriction.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",anisotropicFriction.z,this);
		com.dragome.commons.javascript.ScriptHelper.put("vec",btVector3.btVector3_1.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("vec.setValue(x,y,z);jsObj.setAnisotropicFriction(vec,frictionMode);",this);
    }

    public void setAnisotropicFriction(Vector3 anisotropicFriction) {
		checkPointer();
		setAnisotropicFriction(anisotropicFriction, AnisotropicFrictionFlags.CF_ANISOTROPIC_FRICTION);
    }

    public boolean hasAnisotropicFriction(int frictionMode) {
		com.dragome.commons.javascript.ScriptHelper.put("frictionMode",frictionMode,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.hasAnisotropicFriction(frictionMode);",this);
    }

    public boolean hasAnisotropicFriction() {
		checkPointer();
		return hasAnisotropicFriction(AnisotropicFrictionFlags.CF_ANISOTROPIC_FRICTION);
    }

    public void setContactProcessingThreshold(float contactProcessingThreshold) {
		com.dragome.commons.javascript.ScriptHelper.put("contactProcessingThreshold",contactProcessingThreshold,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setContactProcessingThreshold(contactProcessingThreshold);",this);
    }

    public float getContactProcessingThreshold() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getContactProcessingThreshold();",this);
    }

    public boolean isStaticObject() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.isStaticObject();",this);
    }

    public boolean isKinematicObject() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.isKinematicObject();",this);
    }

    public boolean isStaticOrKinematicObject() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.isStaticOrKinematicObject();",this);
    }

    public boolean hasContactResponse() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.hasContactResponse();",this);
    }

    public void setCollisionShape(btCollisionShape shape) {
		checkPointer();
		this.shape = shape;
		com.dragome.commons.javascript.ScriptHelper.put("jsShape",shape.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setCollisionShape(jsShape);",this);
    }

    public btCollisionShape getCollisionShape() {
        checkPointer();
        return shape;
    }

    public void setIgnoreCollisionCheck(btCollisionObject co, boolean ignoreCollisionCheck) {
		com.dragome.commons.javascript.ScriptHelper.put("ignoreCollisionCheck",ignoreCollisionCheck,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("coObj",co.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setIgnoreCollisionCheck(coObj);",this);
    }

    public boolean checkCollideWithOverride(btCollisionObject co) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("coObj",co.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.checkCollideWithOverride(coObj);",this);
    }

    public int getActivationState() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getActivationState();",this);
    }

    public void setActivationState(int newState) {
		com.dragome.commons.javascript.ScriptHelper.put("newState",newState,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setActivationState(newState);",this);
    }

    public void setDeactivationTime(float time) {
		com.dragome.commons.javascript.ScriptHelper.put("time",time,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setDeactivationTime(time);",this);
    }

    public float getDeactivationTime() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getDeactivationTime();",this);
    }

    public void forceActivationState(int newState) {
		com.dragome.commons.javascript.ScriptHelper.put("newState",newState,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.forceActivationState(newState);",this);
    }

    public void activate(boolean forceActivation) {
		com.dragome.commons.javascript.ScriptHelper.put("forceActivation",forceActivation,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.activate(forceActivation);",this);
    }

    public void activate() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.activate();",this);
    }

    public boolean isActive() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.isActive();",this);
    }

    public void setRestitution(float rest) {
		com.dragome.commons.javascript.ScriptHelper.put("rest",rest,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setRestitution(rest);",this);
    }

    public float getRestitution() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getRestitution();",this);
    }

    public void setFriction(float frict) {
		com.dragome.commons.javascript.ScriptHelper.put("frict",frict,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setFriction(frict);",this);
    }

    public float getFriction() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getFriction();",this);
    }

    public void setRollingFriction(float frict) {
		com.dragome.commons.javascript.ScriptHelper.put("frict",frict,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setRollingFriction(frict);",this);
    }

    public float getRollingFriction() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getRollingFriction();",this);
    }

    public int getInternalType() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getInternalType();",this);
    }

    public void getWorldTransform(Matrix4 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		Object btTra = com.dragome.commons.javascript.ScriptHelper.eval("jsObj.getWorldTransform();",this);
		com.badlogic.gdx.physics.bullet.linearmath.btTransform.getOpenGLMatrix(btTra, out.val);
    }

    public void setWorldTransform(Matrix4 worldTrans) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("value",worldTrans.val,this);
		com.dragome.commons.javascript.ScriptHelper.put("btTran",com.badlogic.gdx.physics.bullet.linearmath.btTransform.btTransform_1.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("btTran.setFromOpenGLMatrix(value);jsObj.setWorldTransform(btTran);",this);
    }

    public btBroadphaseProxy getBroadphaseHandle() {
        checkPointer();
        return broadphaseProxy;
    }

    public void setBroadphaseHandle(btBroadphaseProxy handle) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		this.broadphaseProxy = handle;
		com.dragome.commons.javascript.ScriptHelper.put("handler",handle.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setBroadphaseHandle(handler);",this);
    }

    public void getInterpolationWorldTransform(Matrix4 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		Object btTra = com.dragome.commons.javascript.ScriptHelper.eval("jsObj.getInterpolationWorldTransform();",this);
		com.badlogic.gdx.physics.bullet.linearmath.btTransform.getOpenGLMatrix(btTra, out.val);
    }

    public void setInterpolationWorldTransform(Matrix4 trans) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("value",trans.val,this);
		com.dragome.commons.javascript.ScriptHelper.put("btTran",com.badlogic.gdx.physics.bullet.linearmath.btTransform.btTransform_1.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("btTran.setFromOpenGLMatrix(value);jsObj.setInterpolationWorldTransform(btTran);",this);
    }

    public void setInterpolationLinearVelocity(Vector3 linvel) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",linvel.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",linvel.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",linvel.z,this);
		com.dragome.commons.javascript.ScriptHelper.put("btVec",com.badlogic.gdx.physics.bullet.linearmath.btVector3.btVector3_1.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("btVec.setValue(x,y,z);jsObj.setInterpolationLinearVelocity(btVec);",this);
    }

    public void setInterpolationAngularVelocity(Vector3 angvel) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("x",angvel.x,this);
		com.dragome.commons.javascript.ScriptHelper.put("y",angvel.y,this);
		com.dragome.commons.javascript.ScriptHelper.put("z",angvel.z,this);
		com.dragome.commons.javascript.ScriptHelper.put("btVec",com.badlogic.gdx.physics.bullet.linearmath.btVector3.btVector3_1.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("btVec.setValue(x,y,z);jsObj.setInterpolationAngularVelocity(btVec);",this);
    }

    public void getInterpolationLinearVelocity(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var btVec=jsObj.getInterpolationLinearVelocity();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("btVec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("btVec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("btVec.z();",this);
    }

    public void getInterpolationAngularVelocity(Vector3 out) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("var btVec=jsObj.getInterpolationAngularVelocity();",this);
		out.x = com.dragome.commons.javascript.ScriptHelper.evalFloat("btVec.x();",this);
		out.y = com.dragome.commons.javascript.ScriptHelper.evalFloat("btVec.y();",this);
		out.z = com.dragome.commons.javascript.ScriptHelper.evalFloat("btVec.z();",this);
    }

    public int getIslandTag() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getIslandTag();",this);
    }

    public void setIslandTag(int tag) {
		com.dragome.commons.javascript.ScriptHelper.put("tag",tag,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setIslandTag(tag);",this);
    }

    public int getCompanionId() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getCompanionId();",this);
    }

    public void setCompanionId(int id) {
		com.dragome.commons.javascript.ScriptHelper.put("id",id,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setCompanionId(id);",this);
    }

    public float getHitFraction() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getHitFraction();",this);
    }

    public void setHitFraction(float hitFraction) {
		com.dragome.commons.javascript.ScriptHelper.put("hitFraction",hitFraction,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setHitFraction(hitFraction);",this);
    }

    public int getCollisionFlags() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getCollisionFlags();",this);
    }

    public void setCollisionFlags(int flags) {
		com.dragome.commons.javascript.ScriptHelper.put("flags",flags,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setCollisionFlags(flags);",this);
    }

    public float getCcdSweptSphereRadius() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getCcdSweptSphereRadius();",this);
    }

    public void setCcdSweptSphereRadius(float radius) {
		com.dragome.commons.javascript.ScriptHelper.put("radius",radius,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setCcdSweptSphereRadius(radius);",this);
    }

    public float getCcdMotionThreshold() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getCcdMotionThreshold();",this);
    }

    public float getCcdSquareMotionThreshold() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalFloat("jsObj.getCcdSquareMotionThreshold();",this);
    }

    public void setCcdMotionThreshold(float ccdMotionThreshold) {
		com.dragome.commons.javascript.ScriptHelper.put("ccdMotionThreshold",ccdMotionThreshold,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setCcdMotionThreshold(ccdMotionThreshold);",this);
    }

    public int getUserIndex() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getUserIndex();",this);
    }

    public int getUserValue() {
        return this.userValue;
    }

    public void setUserIndex(int index) {
		com.dragome.commons.javascript.ScriptHelper.put("index",index,this);
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.evalNoResult("jsObj.setUserIndex(index);",this);
    }

    public void setUserValue(int userValue) {
        this.userValue = userValue;
    }

    public int getUpdateRevisionInternal() {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalInt("jsObj.getUpdateRevisionInternal();",this);
    }

    public boolean checkCollideWith(btCollisionObject co) {
		checkPointer();
		com.dragome.commons.javascript.ScriptHelper.put("jsObj",this.jsObj,this);
		com.dragome.commons.javascript.ScriptHelper.put("cobj",co.jsObj,this);
		return com.dragome.commons.javascript.ScriptHelper.evalBoolean("jsObj.checkCollideWith(cobj);",this);
    }

    public static final class CollisionFlags {

        public static final int CF_STATIC_OBJECT = 1;

        public static final int CF_KINEMATIC_OBJECT = 2;

        public static final int CF_NO_CONTACT_RESPONSE = 4;

        public static final int CF_CUSTOM_MATERIAL_CALLBACK = 8;

        public static final int CF_CHARACTER_OBJECT = 16;

        public static final int CF_DISABLE_VISUALIZE_OBJECT = 32;

        public static final int CF_DISABLE_SPU_COLLISION_PROCESSING = 64;
    }

    public static final class CollisionObjectTypes {

        public static final int CO_COLLISION_OBJECT = 1;

        public static final int CO_RIGID_BODY = 2;

        public static final int CO_GHOST_OBJECT = 4;

        public static final int CO_SOFT_BODY = 8;

        public static final int CO_HF_FLUID = 16;

        public static final int CO_USER_TYPE = 32;

        public static final int CO_FEATHERSTONE_LINK = 64;
    }

    public static final class AnisotropicFrictionFlags {

        public static final int CF_ANISOTROPIC_FRICTION_DISABLED = 0;

        public static final int CF_ANISOTROPIC_FRICTION = 1;

        public static final int CF_ANISOTROPIC_ROLLING_FRICTION = 2;
    }
}
