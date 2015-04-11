/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgCmdDrawRect extends MgCommandDraw {
  private long swigCPtr;

  protected MgCmdDrawRect(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgCmdDrawRect_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgCmdDrawRect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgCmdDrawRect(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    touchvgJNI.MgCmdDrawRect_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    touchvgJNI.MgCmdDrawRect_change_ownership(this, swigCPtr, true);
  }

  public MgCmdDrawRect(String name) {
    this(touchvgJNI.new_MgCmdDrawRect__SWIG_0(name), true);
    touchvgJNI.MgCmdDrawRect_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public MgCmdDrawRect() {
    this(touchvgJNI.new_MgCmdDrawRect__SWIG_1(), true);
    touchvgJNI.MgCmdDrawRect_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void release() {
    if (getClass() == MgCmdDrawRect.class) touchvgJNI.MgCmdDrawRect_release(swigCPtr, this); else touchvgJNI.MgCmdDrawRect_releaseSwigExplicitMgCmdDrawRect(swigCPtr, this);
  }

  public boolean initialize(MgMotion sender, MgStorage s) {
    return (getClass() == MgCmdDrawRect.class) ? touchvgJNI.MgCmdDrawRect_initialize(swigCPtr, this, MgMotion.getCPtr(sender), sender, MgStorage.getCPtr(s), s) : touchvgJNI.MgCmdDrawRect_initializeSwigExplicitMgCmdDrawRect(swigCPtr, this, MgMotion.getCPtr(sender), sender, MgStorage.getCPtr(s), s);
  }

  public boolean backStep(MgMotion sender) {
    return (getClass() == MgCmdDrawRect.class) ? touchvgJNI.MgCmdDrawRect_backStep(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCmdDrawRect_backStepSwigExplicitMgCmdDrawRect(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean touchBegan(MgMotion sender) {
    return (getClass() == MgCmdDrawRect.class) ? touchvgJNI.MgCmdDrawRect_touchBegan(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCmdDrawRect_touchBeganSwigExplicitMgCmdDrawRect(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean touchMoved(MgMotion sender) {
    return (getClass() == MgCmdDrawRect.class) ? touchvgJNI.MgCmdDrawRect_touchMoved(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCmdDrawRect_touchMovedSwigExplicitMgCmdDrawRect(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean touchEnded(MgMotion sender) {
    return (getClass() == MgCmdDrawRect.class) ? touchvgJNI.MgCmdDrawRect_touchEnded(swigCPtr, this, MgMotion.getCPtr(sender), sender) : touchvgJNI.MgCmdDrawRect_touchEndedSwigExplicitMgCmdDrawRect(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  protected void addRectShape(MgMotion sender) {
    if (getClass() == MgCmdDrawRect.class) touchvgJNI.MgCmdDrawRect_addRectShape(swigCPtr, this, MgMotion.getCPtr(sender), sender); else touchvgJNI.MgCmdDrawRect_addRectShapeSwigExplicitMgCmdDrawRect(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

}
