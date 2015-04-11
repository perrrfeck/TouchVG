/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgComposite extends MgBaseShape {
  private long swigCPtr;

  protected MgComposite(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgComposite_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgComposite obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
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
    touchvgJNI.MgComposite_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    touchvgJNI.MgComposite_change_ownership(this, swigCPtr, true);
  }

  public static int Type() {
    return touchvgJNI.MgComposite_Type();
  }

  public int getShapeCount() {
    return touchvgJNI.MgComposite_getShapeCount(swigCPtr, this);
  }

  public MgShapes shapes() {
    long cPtr = touchvgJNI.MgComposite_shapes(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapes(cPtr, false);
  }

  public MgShape getOwnerShape() {
    long cPtr = touchvgJNI.MgComposite_getOwnerShape(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShape(cPtr, false);
  }

  public boolean canOffsetShapeAlone(MgShape shape) {
    return (getClass() == MgComposite.class) ? touchvgJNI.MgComposite_canOffsetShapeAlone(swigCPtr, this, MgShape.getCPtr(shape), shape) : touchvgJNI.MgComposite_canOffsetShapeAloneSwigExplicitMgComposite(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  protected MgComposite() {
    this(touchvgJNI.new_MgComposite(), true);
    touchvgJNI.MgComposite_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
