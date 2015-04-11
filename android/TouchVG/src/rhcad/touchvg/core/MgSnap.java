/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgSnap {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgSnap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgSnap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgSnap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void clearSnap(MgMotion sender) {
    touchvgJNI.MgSnap_clearSnap(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public boolean drawSnap(MgMotion sender, GiGraphics gs) {
    return touchvgJNI.MgSnap_drawSnap(swigCPtr, this, MgMotion.getCPtr(sender), sender, GiGraphics.getCPtr(gs), gs);
  }

  public boolean drawPerpMark(GiGraphics gs, GiContext ctx, Point2d a, Point2d b, Point2d perp, Point2d c, float len) {
    return touchvgJNI.MgSnap_drawPerpMark(swigCPtr, this, GiGraphics.getCPtr(gs), gs, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(a), a, Point2d.getCPtr(b), b, Point2d.getCPtr(perp), perp, Point2d.getCPtr(c), c, len);
  }

  public int getSnapOptions(MgView view) {
    return touchvgJNI.MgSnap_getSnapOptions(swigCPtr, this, MgView.getCPtr(view), view);
  }

  public void setSnapOptions(MgView view, int bits) {
    touchvgJNI.MgSnap_setSnapOptions(swigCPtr, this, MgView.getCPtr(view), view, bits);
  }

  public int getSnappedType() {
    return touchvgJNI.MgSnap_getSnappedType(swigCPtr, this);
  }

  public int getSnappedPoint(Point2d fromPt, Point2d toPt) {
    return touchvgJNI.MgSnap_getSnappedPoint__SWIG_0(swigCPtr, this, Point2d.getCPtr(fromPt), fromPt, Point2d.getCPtr(toPt), toPt);
  }

  public int getSnappedPoint(Point2d fromPt, Point2d toPt, Point2d startPt, Point2d guildPt) {
    return touchvgJNI.MgSnap_getSnappedPoint__SWIG_1(swigCPtr, this, Point2d.getCPtr(fromPt), fromPt, Point2d.getCPtr(toPt), toPt, Point2d.getCPtr(startPt), startPt, Point2d.getCPtr(guildPt), guildPt);
  }

  public void setIgnoreStartPoint(Point2d pt) {
    touchvgJNI.MgSnap_setIgnoreStartPoint(swigCPtr, this, Point2d.getCPtr(pt), pt);
  }

  public Point2d snapPoint(MgMotion sender, Point2d orignPt) {
    return new Point2d(touchvgJNI.MgSnap_snapPoint(swigCPtr, this, MgMotion.getCPtr(sender), sender, Point2d.getCPtr(orignPt), orignPt), true);
  }

}
