/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiGraphics {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GiGraphics(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiGraphics obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiGraphics(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GiGraphics() {
    this(touchvgJNI.new_GiGraphics__SWIG_0(), true);
  }

  public GiGraphics(GiTransform xform, boolean needFreeXf) {
    this(touchvgJNI.new_GiGraphics__SWIG_1(GiTransform.getCPtr(xform), xform, needFreeXf), true);
  }

  public GiGraphics(GiTransform xform) {
    this(touchvgJNI.new_GiGraphics__SWIG_2(GiTransform.getCPtr(xform), xform), true);
  }

  public GiGraphics(GiGraphics src) {
    this(touchvgJNI.new_GiGraphics__SWIG_3(GiGraphics.getCPtr(src), src), true);
  }

  public static GiGraphics fromHandle(int h) {
    long cPtr = touchvgJNI.GiGraphics_fromHandle(h);
    return (cPtr == 0) ? null : new GiGraphics(cPtr, false);
  }

  public int toHandle() {
    return touchvgJNI.GiGraphics_toHandle(swigCPtr, this);
  }

  public void copy(GiGraphics src) {
    touchvgJNI.GiGraphics_copy(swigCPtr, this, GiGraphics.getCPtr(src), src);
  }

  public GiTransform xf() {
    return new GiTransform(touchvgJNI.GiGraphics_xf(swigCPtr, this), false);
  }

  public boolean isDrawing() {
    return touchvgJNI.GiGraphics_isDrawing(swigCPtr, this);
  }

  public boolean isPrint() {
    return touchvgJNI.GiGraphics_isPrint(swigCPtr, this);
  }

  public boolean isStopping() {
    return touchvgJNI.GiGraphics_isStopping(swigCPtr, this);
  }

  public void stopDrawing(boolean stopped) {
    touchvgJNI.GiGraphics_stopDrawing__SWIG_0(swigCPtr, this, stopped);
  }

  public void stopDrawing() {
    touchvgJNI.GiGraphics_stopDrawing__SWIG_1(swigCPtr, this);
  }

  public Box2d getClipModel() {
    return new Box2d(touchvgJNI.GiGraphics_getClipModel(swigCPtr, this), true);
  }

  public Box2d getClipWorld() {
    return new Box2d(touchvgJNI.GiGraphics_getClipWorld(swigCPtr, this), true);
  }

  public RECT_2D getClipBox(RECT_2D rc) {
    return new RECT_2D(touchvgJNI.GiGraphics_getClipBox(swigCPtr, this, RECT_2D.getCPtr(rc), rc), false);
  }

  public boolean setClipBox(RECT_2D rc) {
    return touchvgJNI.GiGraphics_setClipBox(swigCPtr, this, RECT_2D.getCPtr(rc), rc);
  }

  public boolean setClipWorld(Box2d rectWorld) {
    return touchvgJNI.GiGraphics_setClipWorld(swigCPtr, this, Box2d.getCPtr(rectWorld), rectWorld);
  }

  public boolean isGrayMode() {
    return touchvgJNI.GiGraphics_isGrayMode(swigCPtr, this);
  }

  public void setGrayMode(boolean gray) {
    touchvgJNI.GiGraphics_setGrayMode(swigCPtr, this, gray);
  }

  public GiColor getBkColor() {
    return new GiColor(touchvgJNI.GiGraphics_getBkColor(swigCPtr, this), true);
  }

  public GiColor setBkColor(GiColor color) {
    return new GiColor(touchvgJNI.GiGraphics_setBkColor(swigCPtr, this, GiColor.getCPtr(color), color), true);
  }

  public GiColor calcPenColor(GiColor color) {
    return new GiColor(touchvgJNI.GiGraphics_calcPenColor(swigCPtr, this, GiColor.getCPtr(color), color), true);
  }

  public float calcPenWidth(float lineWidth, boolean useViewScale) {
    return touchvgJNI.GiGraphics_calcPenWidth(swigCPtr, this, lineWidth, useViewScale);
  }

  public void setMaxPenWidth(float pixels, float minw) {
    touchvgJNI.GiGraphics_setMaxPenWidth__SWIG_0(swigCPtr, this, pixels, minw);
  }

  public void setMaxPenWidth(float pixels) {
    touchvgJNI.GiGraphics_setMaxPenWidth__SWIG_1(swigCPtr, this, pixels);
  }

  public static void setPenWidthFactor(float factor) {
    touchvgJNI.GiGraphics_setPenWidthFactor(factor);
  }

  public boolean setPhaseEnabled(boolean enabled) {
    return touchvgJNI.GiGraphics_setPhaseEnabled(swigCPtr, this, enabled);
  }

  public boolean drawLine(GiContext ctx, Point2d startPt, Point2d endPt, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawLine__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(startPt), startPt, Point2d.getCPtr(endPt), endPt, modelUnit);
  }

  public boolean drawLine(GiContext ctx, Point2d startPt, Point2d endPt) {
    return touchvgJNI.GiGraphics_drawLine__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(startPt), startPt, Point2d.getCPtr(endPt), endPt);
  }

  public boolean drawRayline(GiContext ctx, Point2d startPt, Point2d endPt, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawRayline__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(startPt), startPt, Point2d.getCPtr(endPt), endPt, modelUnit);
  }

  public boolean drawRayline(GiContext ctx, Point2d startPt, Point2d endPt) {
    return touchvgJNI.GiGraphics_drawRayline__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(startPt), startPt, Point2d.getCPtr(endPt), endPt);
  }

  public boolean drawBeeline(GiContext ctx, Point2d startPt, Point2d endPt, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawBeeline__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(startPt), startPt, Point2d.getCPtr(endPt), endPt, modelUnit);
  }

  public boolean drawBeeline(GiContext ctx, Point2d startPt, Point2d endPt) {
    return touchvgJNI.GiGraphics_drawBeeline__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(startPt), startPt, Point2d.getCPtr(endPt), endPt);
  }

  public boolean drawLines(GiContext ctx, int count, Point2d points, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawLines__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(points), points, modelUnit);
  }

  public boolean drawLines(GiContext ctx, int count, Point2d points) {
    return touchvgJNI.GiGraphics_drawLines__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(points), points);
  }

  public boolean drawBeziers(GiContext ctx, int count, Point2d points, boolean closed, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawBeziers__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(points), points, closed, modelUnit);
  }

  public boolean drawBeziers(GiContext ctx, int count, Point2d points, boolean closed) {
    return touchvgJNI.GiGraphics_drawBeziers__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(points), points, closed);
  }

  public boolean drawBeziers(GiContext ctx, int count, Point2d points) {
    return touchvgJNI.GiGraphics_drawBeziers__SWIG_2(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(points), points);
  }

  public boolean drawBeziers(GiContext ctx, int count, Point2d knot, Vector2d knotvs, boolean closed, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawBeziers__SWIG_3(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(knot), knot, Vector2d.getCPtr(knotvs), knotvs, closed, modelUnit);
  }

  public boolean drawBeziers(GiContext ctx, int count, Point2d knot, Vector2d knotvs, boolean closed) {
    return touchvgJNI.GiGraphics_drawBeziers__SWIG_4(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(knot), knot, Vector2d.getCPtr(knotvs), knotvs, closed);
  }

  public boolean drawBeziers(GiContext ctx, int count, Point2d knot, Vector2d knotvs) {
    return touchvgJNI.GiGraphics_drawBeziers__SWIG_5(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(knot), knot, Vector2d.getCPtr(knotvs), knotvs);
  }

  public boolean drawArc(GiContext ctx, Point2d center, float rx, float ry, float startAngle, float sweepAngle, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawArc__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(center), center, rx, ry, startAngle, sweepAngle, modelUnit);
  }

  public boolean drawArc(GiContext ctx, Point2d center, float rx, float ry, float startAngle, float sweepAngle) {
    return touchvgJNI.GiGraphics_drawArc__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(center), center, rx, ry, startAngle, sweepAngle);
  }

  public boolean drawArc3P(GiContext ctx, Point2d startpt, Point2d midpt, Point2d endpt, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawArc3P__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(startpt), startpt, Point2d.getCPtr(midpt), midpt, Point2d.getCPtr(endpt), endpt, modelUnit);
  }

  public boolean drawArc3P(GiContext ctx, Point2d startpt, Point2d midpt, Point2d endpt) {
    return touchvgJNI.GiGraphics_drawArc3P__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(startpt), startpt, Point2d.getCPtr(midpt), midpt, Point2d.getCPtr(endpt), endpt);
  }

  public boolean drawPolygon(GiContext ctx, int count, Point2d points, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawPolygon__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(points), points, modelUnit);
  }

  public boolean drawPolygon(GiContext ctx, int count, Point2d points) {
    return touchvgJNI.GiGraphics_drawPolygon__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(points), points);
  }

  public boolean drawCircle(GiContext ctx, Point2d center, float r, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawCircle__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(center), center, r, modelUnit);
  }

  public boolean drawCircle(GiContext ctx, Point2d center, float r) {
    return touchvgJNI.GiGraphics_drawCircle__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(center), center, r);
  }

  public boolean drawEllipse(GiContext ctx, Point2d center, float rx, float ry, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawEllipse__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(center), center, rx, ry, modelUnit);
  }

  public boolean drawEllipse(GiContext ctx, Point2d center, float rx, float ry) {
    return touchvgJNI.GiGraphics_drawEllipse__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(center), center, rx, ry);
  }

  public boolean drawEllipse(GiContext ctx, Box2d rect, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawEllipse__SWIG_2(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Box2d.getCPtr(rect), rect, modelUnit);
  }

  public boolean drawEllipse(GiContext ctx, Box2d rect) {
    return touchvgJNI.GiGraphics_drawEllipse__SWIG_3(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Box2d.getCPtr(rect), rect);
  }

  public boolean drawPie(GiContext ctx, Point2d center, float rx, float ry, float startAngle, float sweepAngle, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawPie__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(center), center, rx, ry, startAngle, sweepAngle, modelUnit);
  }

  public boolean drawPie(GiContext ctx, Point2d center, float rx, float ry, float startAngle, float sweepAngle) {
    return touchvgJNI.GiGraphics_drawPie__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Point2d.getCPtr(center), center, rx, ry, startAngle, sweepAngle);
  }

  public boolean drawRect(GiContext ctx, Box2d rect, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawRect__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Box2d.getCPtr(rect), rect, modelUnit);
  }

  public boolean drawRect(GiContext ctx, Box2d rect) {
    return touchvgJNI.GiGraphics_drawRect__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Box2d.getCPtr(rect), rect);
  }

  public boolean drawRoundRect(GiContext ctx, Box2d rect, float rx, float ry, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawRoundRect__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Box2d.getCPtr(rect), rect, rx, ry, modelUnit);
  }

  public boolean drawRoundRect(GiContext ctx, Box2d rect, float rx, float ry) {
    return touchvgJNI.GiGraphics_drawRoundRect__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Box2d.getCPtr(rect), rect, rx, ry);
  }

  public boolean drawRoundRect(GiContext ctx, Box2d rect, float rx) {
    return touchvgJNI.GiGraphics_drawRoundRect__SWIG_2(swigCPtr, this, GiContext.getCPtr(ctx), ctx, Box2d.getCPtr(rect), rect, rx);
  }

  public boolean drawHermiteSplines(GiContext ctx, int count, Point2d knots, Vector2d knotvs, boolean closed, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawHermiteSplines__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs, closed, modelUnit);
  }

  public boolean drawHermiteSplines(GiContext ctx, int count, Point2d knots, Vector2d knotvs, boolean closed) {
    return touchvgJNI.GiGraphics_drawHermiteSplines__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs, closed);
  }

  public boolean drawHermiteSplines(GiContext ctx, int count, Point2d knots, Vector2d knotvs) {
    return touchvgJNI.GiGraphics_drawHermiteSplines__SWIG_2(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(knots), knots, Vector2d.getCPtr(knotvs), knotvs);
  }

  public boolean drawBSplines(GiContext ctx, int count, Point2d ctlpts, boolean closed, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawBSplines__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(ctlpts), ctlpts, closed, modelUnit);
  }

  public boolean drawBSplines(GiContext ctx, int count, Point2d ctlpts, boolean closed) {
    return touchvgJNI.GiGraphics_drawBSplines__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(ctlpts), ctlpts, closed);
  }

  public boolean drawBSplines(GiContext ctx, int count, Point2d ctlpts) {
    return touchvgJNI.GiGraphics_drawBSplines__SWIG_2(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(ctlpts), ctlpts);
  }

  public boolean drawQuadSplines(GiContext ctx, int count, Point2d ctlpts, boolean closed, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawQuadSplines__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(ctlpts), ctlpts, closed, modelUnit);
  }

  public boolean drawQuadSplines(GiContext ctx, int count, Point2d ctlpts, boolean closed) {
    return touchvgJNI.GiGraphics_drawQuadSplines__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(ctlpts), ctlpts, closed);
  }

  public boolean drawQuadSplines(GiContext ctx, int count, Point2d ctlpts) {
    return touchvgJNI.GiGraphics_drawQuadSplines__SWIG_2(swigCPtr, this, GiContext.getCPtr(ctx), ctx, count, Point2d.getCPtr(ctlpts), ctlpts);
  }

  public boolean drawPath(GiContext ctx, MgPath path, boolean fill, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawPath__SWIG_0(swigCPtr, this, GiContext.getCPtr(ctx), ctx, MgPath.getCPtr(path), path, fill, modelUnit);
  }

  public boolean drawPath(GiContext ctx, MgPath path, boolean fill) {
    return touchvgJNI.GiGraphics_drawPath__SWIG_1(swigCPtr, this, GiContext.getCPtr(ctx), ctx, MgPath.getCPtr(path), path, fill);
  }

  public boolean drawHandle(Point2d pnt, int type, float angle, boolean modelUnit) {
    return touchvgJNI.GiGraphics_drawHandle__SWIG_0(swigCPtr, this, Point2d.getCPtr(pnt), pnt, type, angle, modelUnit);
  }

  public boolean drawHandle(Point2d pnt, int type, float angle) {
    return touchvgJNI.GiGraphics_drawHandle__SWIG_1(swigCPtr, this, Point2d.getCPtr(pnt), pnt, type, angle);
  }

  public boolean drawHandle(Point2d pnt, int type) {
    return touchvgJNI.GiGraphics_drawHandle__SWIG_2(swigCPtr, this, Point2d.getCPtr(pnt), pnt, type);
  }

  public float drawTextAt(int argb, String text, Point2d pnt, float h, int align, float angle) {
    return touchvgJNI.GiGraphics_drawTextAt__SWIG_0(swigCPtr, this, argb, text, Point2d.getCPtr(pnt), pnt, h, align, angle);
  }

  public float drawTextAt(int argb, String text, Point2d pnt, float h, int align) {
    return touchvgJNI.GiGraphics_drawTextAt__SWIG_1(swigCPtr, this, argb, text, Point2d.getCPtr(pnt), pnt, h, align);
  }

  public float drawTextAt(int argb, String text, Point2d pnt, float h) {
    return touchvgJNI.GiGraphics_drawTextAt__SWIG_2(swigCPtr, this, argb, text, Point2d.getCPtr(pnt), pnt, h);
  }

  public boolean beginPaint(GiCanvas canvas, RECT_2D clipBox) {
    return touchvgJNI.GiGraphics_beginPaint__SWIG_0(swigCPtr, this, GiCanvas.getCPtr(canvas), canvas, RECT_2D.getCPtr(clipBox), clipBox);
  }

  public boolean beginPaint(GiCanvas canvas) {
    return touchvgJNI.GiGraphics_beginPaint__SWIG_1(swigCPtr, this, GiCanvas.getCPtr(canvas), canvas);
  }

  public void endPaint() {
    touchvgJNI.GiGraphics_endPaint(swigCPtr, this);
  }

  public final static int kAlignLeft = 0;
  public final static int kAlignCenter = 1;
  public final static int kAlignRight = 2;
  public final static int kAlignTop = 0;
  public final static int kAlignBottom = 0x10;
  public final static int kAlignVCenter = 0x20;
  public final static int kAlignHVCenter = kAlignCenter|kAlignVCenter;

}
