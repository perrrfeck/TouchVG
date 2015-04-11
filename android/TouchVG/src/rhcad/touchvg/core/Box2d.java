/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class Box2d {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Box2d(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Box2d obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_Box2d(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setXmin(float value) {
    touchvgJNI.Box2d_xmin_set(swigCPtr, this, value);
  }

  public float getXmin() {
    return touchvgJNI.Box2d_xmin_get(swigCPtr, this);
  }

  public void setYmin(float value) {
    touchvgJNI.Box2d_ymin_set(swigCPtr, this, value);
  }

  public float getYmin() {
    return touchvgJNI.Box2d_ymin_get(swigCPtr, this);
  }

  public void setXmax(float value) {
    touchvgJNI.Box2d_xmax_set(swigCPtr, this, value);
  }

  public float getXmax() {
    return touchvgJNI.Box2d_xmax_get(swigCPtr, this);
  }

  public void setYmax(float value) {
    touchvgJNI.Box2d_ymax_set(swigCPtr, this, value);
  }

  public float getYmax() {
    return touchvgJNI.Box2d_ymax_get(swigCPtr, this);
  }

  public static Box2d kIdentity() {
    return new Box2d(touchvgJNI.Box2d_kIdentity(), true);
  }

  public Box2d() {
    this(touchvgJNI.new_Box2d__SWIG_0(), true);
  }

  public Box2d(Box2d src, boolean normal) {
    this(touchvgJNI.new_Box2d__SWIG_1(Box2d.getCPtr(src), src, normal), true);
  }

  public Box2d(Box2d src) {
    this(touchvgJNI.new_Box2d__SWIG_2(Box2d.getCPtr(src), src), true);
  }

  public Box2d(Point2d pnt1, Point2d pnt2) {
    this(touchvgJNI.new_Box2d__SWIG_3(Point2d.getCPtr(pnt1), pnt1, Point2d.getCPtr(pnt2), pnt2), true);
  }

  public Box2d(float l, float t, float r, float b, boolean normal) {
    this(touchvgJNI.new_Box2d__SWIG_4(l, t, r, b, normal), true);
  }

  public Box2d(float l, float t, float r, float b) {
    this(touchvgJNI.new_Box2d__SWIG_5(l, t, r, b), true);
  }

  public Box2d(RECT_2D rc, boolean normal) {
    this(touchvgJNI.new_Box2d__SWIG_6(RECT_2D.getCPtr(rc), rc, normal), true);
  }

  public Box2d(RECT_2D rc) {
    this(touchvgJNI.new_Box2d__SWIG_7(RECT_2D.getCPtr(rc), rc), true);
  }

  public Box2d(int l, int t, int r, int b, boolean normal) {
    this(touchvgJNI.new_Box2d__SWIG_8(l, t, r, b, normal), true);
  }

  public Box2d(int l, int t, int r, int b) {
    this(touchvgJNI.new_Box2d__SWIG_9(l, t, r, b), true);
  }

  public Box2d(Point2d pnt1, Point2d pnt2, Point2d pnt3, Point2d pnt4) {
    this(touchvgJNI.new_Box2d__SWIG_10(Point2d.getCPtr(pnt1), pnt1, Point2d.getCPtr(pnt2), pnt2, Point2d.getCPtr(pnt3), pnt3, Point2d.getCPtr(pnt4), pnt4), true);
  }

  public Box2d(int count, Point2d points) {
    this(touchvgJNI.new_Box2d__SWIG_11(count, Point2d.getCPtr(points), points), true);
  }

  public Box2d(Point2d center, float width, float height) {
    this(touchvgJNI.new_Box2d__SWIG_12(Point2d.getCPtr(center), center, width, height), true);
  }

  public Box2d(float width, float height) {
    this(touchvgJNI.new_Box2d__SWIG_13(width, height), true);
  }

  public void get(Point2d p1, Point2d p2) {
    touchvgJNI.Box2d_get__SWIG_0(swigCPtr, this, Point2d.getCPtr(p1), p1, Point2d.getCPtr(p2), p2);
  }

  public RECT_2D get(RECT_2D rc) {
    return new RECT_2D(touchvgJNI.Box2d_get__SWIG_1(swigCPtr, this, RECT_2D.getCPtr(rc), rc), false);
  }

  public Box2d set(Box2d src, boolean normal) {
    return new Box2d(touchvgJNI.Box2d_set__SWIG_0(swigCPtr, this, Box2d.getCPtr(src), src, normal), false);
  }

  public Box2d set(Box2d src) {
    return new Box2d(touchvgJNI.Box2d_set__SWIG_1(swigCPtr, this, Box2d.getCPtr(src), src), false);
  }

  public Box2d set(Point2d p1, Point2d p2) {
    return new Box2d(touchvgJNI.Box2d_set__SWIG_2(swigCPtr, this, Point2d.getCPtr(p1), p1, Point2d.getCPtr(p2), p2), false);
  }

  public Box2d set(float x1, float y1, float x2, float y2) {
    return new Box2d(touchvgJNI.Box2d_set__SWIG_3(swigCPtr, this, x1, y1, x2, y2), false);
  }

  public Box2d set(Point2d p1, Point2d p2, Point2d p3, Point2d p4) {
    return new Box2d(touchvgJNI.Box2d_set__SWIG_4(swigCPtr, this, Point2d.getCPtr(p1), p1, Point2d.getCPtr(p2), p2, Point2d.getCPtr(p3), p3, Point2d.getCPtr(p4), p4), false);
  }

  public Box2d set(int count, Point2d points) {
    return new Box2d(touchvgJNI.Box2d_set__SWIG_5(swigCPtr, this, count, Point2d.getCPtr(points), points), false);
  }

  public Box2d set(Point2d center, float width, float height) {
    return new Box2d(touchvgJNI.Box2d_set__SWIG_6(swigCPtr, this, Point2d.getCPtr(center), center, width, height), false);
  }

  public float width() {
    return touchvgJNI.Box2d_width(swigCPtr, this);
  }

  public float height() {
    return touchvgJNI.Box2d_height(swigCPtr, this);
  }

  public Vector2d size() {
    return new Vector2d(touchvgJNI.Box2d_size(swigCPtr, this), true);
  }

  public Point2d center() {
    return new Point2d(touchvgJNI.Box2d_center(swigCPtr, this), true);
  }

  public Point2d leftTop() {
    return new Point2d(touchvgJNI.Box2d_leftTop(swigCPtr, this), true);
  }

  public Point2d rightTop() {
    return new Point2d(touchvgJNI.Box2d_rightTop(swigCPtr, this), true);
  }

  public Point2d leftBottom() {
    return new Point2d(touchvgJNI.Box2d_leftBottom(swigCPtr, this), true);
  }

  public Point2d rightBottom() {
    return new Point2d(touchvgJNI.Box2d_rightBottom(swigCPtr, this), true);
  }

  public Box2d normalize() {
    return new Box2d(touchvgJNI.Box2d_normalize(swigCPtr, this), false);
  }

  public Box2d swapTopBottom() {
    return new Box2d(touchvgJNI.Box2d_swapTopBottom(swigCPtr, this), false);
  }

  public Box2d empty() {
    return new Box2d(touchvgJNI.Box2d_empty(swigCPtr, this), false);
  }

  public boolean isNormalized() {
    return touchvgJNI.Box2d_isNormalized(swigCPtr, this);
  }

  public boolean isNull() {
    return touchvgJNI.Box2d_isNull(swigCPtr, this);
  }

  public boolean isEmpty(Tol tol, boolean useOr) {
    return touchvgJNI.Box2d_isEmpty__SWIG_0(swigCPtr, this, Tol.getCPtr(tol), tol, useOr);
  }

  public boolean isEmpty(Tol tol) {
    return touchvgJNI.Box2d_isEmpty__SWIG_1(swigCPtr, this, Tol.getCPtr(tol), tol);
  }

  public boolean isEmpty() {
    return touchvgJNI.Box2d_isEmpty__SWIG_2(swigCPtr, this);
  }

  public boolean isEmptyMinus(Tol tol) {
    return touchvgJNI.Box2d_isEmptyMinus__SWIG_0(swigCPtr, this, Tol.getCPtr(tol), tol);
  }

  public boolean isEmptyMinus() {
    return touchvgJNI.Box2d_isEmptyMinus__SWIG_1(swigCPtr, this);
  }

  public boolean contains(Point2d pt) {
    return touchvgJNI.Box2d_contains__SWIG_0(swigCPtr, this, Point2d.getCPtr(pt), pt);
  }

  public boolean contains(Point2d pt, Tol tol) {
    return touchvgJNI.Box2d_contains__SWIG_1(swigCPtr, this, Point2d.getCPtr(pt), pt, Tol.getCPtr(tol), tol);
  }

  public boolean contains(Box2d box) {
    return touchvgJNI.Box2d_contains__SWIG_2(swigCPtr, this, Box2d.getCPtr(box), box);
  }

  public boolean contains(Box2d box, Tol tol) {
    return touchvgJNI.Box2d_contains__SWIG_3(swigCPtr, this, Box2d.getCPtr(box), box, Tol.getCPtr(tol), tol);
  }

  public Box2d inflate(float d) {
    return new Box2d(touchvgJNI.Box2d_inflate__SWIG_0(swigCPtr, this, d), false);
  }

  public Box2d inflate(float x, float y) {
    return new Box2d(touchvgJNI.Box2d_inflate__SWIG_1(swigCPtr, this, x, y), false);
  }

  public Box2d inflate(Vector2d vec) {
    return new Box2d(touchvgJNI.Box2d_inflate__SWIG_2(swigCPtr, this, Vector2d.getCPtr(vec), vec), false);
  }

  public Box2d inflate(Box2d box) {
    return new Box2d(touchvgJNI.Box2d_inflate__SWIG_3(swigCPtr, this, Box2d.getCPtr(box), box), false);
  }

  public Box2d inflate(float l, float b, float r, float t) {
    return new Box2d(touchvgJNI.Box2d_inflate__SWIG_4(swigCPtr, this, l, b, r, t), false);
  }

  public Box2d deflate(float d) {
    return new Box2d(touchvgJNI.Box2d_deflate__SWIG_0(swigCPtr, this, d), false);
  }

  public Box2d deflate(float x, float y) {
    return new Box2d(touchvgJNI.Box2d_deflate__SWIG_1(swigCPtr, this, x, y), false);
  }

  public Box2d deflate(Vector2d vec) {
    return new Box2d(touchvgJNI.Box2d_deflate__SWIG_2(swigCPtr, this, Vector2d.getCPtr(vec), vec), false);
  }

  public Box2d deflate(Box2d box) {
    return new Box2d(touchvgJNI.Box2d_deflate__SWIG_3(swigCPtr, this, Box2d.getCPtr(box), box), false);
  }

  public Box2d deflate(float l, float b, float r, float t) {
    return new Box2d(touchvgJNI.Box2d_deflate__SWIG_4(swigCPtr, this, l, b, r, t), false);
  }

  public Box2d offset(float x, float y) {
    return new Box2d(touchvgJNI.Box2d_offset__SWIG_0(swigCPtr, this, x, y), false);
  }

  public Box2d offset(Vector2d vec) {
    return new Box2d(touchvgJNI.Box2d_offset__SWIG_1(swigCPtr, this, Vector2d.getCPtr(vec), vec), false);
  }

  public Box2d scaleBy(float sx, float sy) {
    return new Box2d(touchvgJNI.Box2d_scaleBy__SWIG_0(swigCPtr, this, sx, sy), false);
  }

  public Box2d scaleBy(float sx) {
    return new Box2d(touchvgJNI.Box2d_scaleBy__SWIG_1(swigCPtr, this, sx), false);
  }

  public boolean isIntersect(Box2d box) {
    return touchvgJNI.Box2d_isIntersect(swigCPtr, this, Box2d.getCPtr(box), box);
  }

  public Box2d intersectWith(Box2d r1, Box2d r2) {
    return new Box2d(touchvgJNI.Box2d_intersectWith__SWIG_0(swigCPtr, this, Box2d.getCPtr(r1), r1, Box2d.getCPtr(r2), r2), false);
  }

  public Box2d intersectWith(Box2d box) {
    return new Box2d(touchvgJNI.Box2d_intersectWith__SWIG_1(swigCPtr, this, Box2d.getCPtr(box), box), false);
  }

  public Box2d unionWith(Box2d r1, Box2d r2) {
    return new Box2d(touchvgJNI.Box2d_unionWith__SWIG_0(swigCPtr, this, Box2d.getCPtr(r1), r1, Box2d.getCPtr(r2), r2), false);
  }

  public Box2d unionWith(Box2d box) {
    return new Box2d(touchvgJNI.Box2d_unionWith__SWIG_1(swigCPtr, this, Box2d.getCPtr(box), box), false);
  }

  public Box2d unionWith(float x, float y) {
    return new Box2d(touchvgJNI.Box2d_unionWith__SWIG_2(swigCPtr, this, x, y), false);
  }

  public Box2d unionWith(Point2d pt) {
    return new Box2d(touchvgJNI.Box2d_unionWith__SWIG_3(swigCPtr, this, Point2d.getCPtr(pt), pt), false);
  }

  public Box2d offset(Box2d box) {
    return new Box2d(touchvgJNI.Box2d_offset__SWIG_2(swigCPtr, this, Box2d.getCPtr(box), box), true);
  }

  public boolean isEqualTo(Box2d box, Tol tol) {
    return touchvgJNI.Box2d_isEqualTo__SWIG_0(swigCPtr, this, Box2d.getCPtr(box), box, Tol.getCPtr(tol), tol);
  }

  public boolean isEqualTo(Box2d box) {
    return touchvgJNI.Box2d_isEqualTo__SWIG_1(swigCPtr, this, Box2d.getCPtr(box), box);
  }

}
