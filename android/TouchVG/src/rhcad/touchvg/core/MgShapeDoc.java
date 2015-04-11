/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgShapeDoc extends MgObject {
  private long swigCPtr;

  protected MgShapeDoc(long cPtr, boolean cMemoryOwn) {
    super(touchvgJNI.MgShapeDoc_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgShapeDoc obj) {
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

  public static int Type() {
    return touchvgJNI.MgShapeDoc_Type();
  }

  public MgShapeDoc cloneDoc() {
    long cPtr = touchvgJNI.MgShapeDoc_cloneDoc(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public MgShapeDoc shallowCopy() {
    long cPtr = touchvgJNI.MgShapeDoc_shallowCopy(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public int copyShapes(MgShapeDoc src, boolean deeply) {
    return touchvgJNI.MgShapeDoc_copyShapes(swigCPtr, this, MgShapeDoc.getCPtr(src), src, deeply);
  }

  public static MgShapeDoc createDoc() {
    long cPtr = touchvgJNI.MgShapeDoc_createDoc();
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public boolean save(MgStorage s, int startIndex) {
    return touchvgJNI.MgShapeDoc_save(swigCPtr, this, MgStorage.getCPtr(s), s, startIndex);
  }

  public boolean saveAll(MgStorage s, GiTransform xform) {
    return touchvgJNI.MgShapeDoc_saveAll(swigCPtr, this, MgStorage.getCPtr(s), s, GiTransform.getCPtr(xform), xform);
  }

  public boolean load(MgShapeFactory factory, MgStorage s, boolean addOnly) {
    return touchvgJNI.MgShapeDoc_load(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s, addOnly);
  }

  public boolean loadAll(MgShapeFactory factory, MgStorage s, GiTransform xform) {
    return touchvgJNI.MgShapeDoc_loadAll(swigCPtr, this, MgShapeFactory.getCPtr(factory), factory, MgStorage.getCPtr(s), s, GiTransform.getCPtr(xform), xform);
  }

  public void clear() {
    touchvgJNI.MgShapeDoc_clear(swigCPtr, this);
  }

  public void clearCachedData() {
    touchvgJNI.MgShapeDoc_clearCachedData(swigCPtr, this);
  }

  public int draw(GiGraphics gs) {
    return touchvgJNI.MgShapeDoc_draw(swigCPtr, this, GiGraphics.getCPtr(gs), gs);
  }

  public int dyndraw(int mode, GiGraphics gs) {
    return touchvgJNI.MgShapeDoc_dyndraw(swigCPtr, this, mode, GiGraphics.getCPtr(gs), gs);
  }

  public Box2d getExtent() {
    return new Box2d(touchvgJNI.MgShapeDoc_getExtent(swigCPtr, this), true);
  }

  public int getShapeCount() {
    return touchvgJNI.MgShapeDoc_getShapeCount(swigCPtr, this);
  }

  public MgShape findShape(int sid) {
    long cPtr = touchvgJNI.MgShapeDoc_findShape(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new MgShape(cPtr, false);
  }

  public MgShape getLastShape() {
    long cPtr = touchvgJNI.MgShapeDoc_getLastShape(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShape(cPtr, false);
  }

  public MgShapes getCurrentShapes() {
    long cPtr = touchvgJNI.MgShapeDoc_getCurrentShapes(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapes(cPtr, false);
  }

  public boolean setCurrentShapes(MgShapes shapes) {
    return touchvgJNI.MgShapeDoc_setCurrentShapes(swigCPtr, this, MgShapes.getCPtr(shapes), shapes);
  }

  public MgLayer getCurrentLayer() {
    long cPtr = touchvgJNI.MgShapeDoc_getCurrentLayer(swigCPtr, this);
    return (cPtr == 0) ? null : new MgLayer(cPtr, false);
  }

  public boolean switchLayer(int index) {
    return touchvgJNI.MgShapeDoc_switchLayer(swigCPtr, this, index);
  }

  public int getLayerCount() {
    return touchvgJNI.MgShapeDoc_getLayerCount(swigCPtr, this);
  }

  public GiContext context() {
    long cPtr = touchvgJNI.MgShapeDoc_context(swigCPtr, this);
    return (cPtr == 0) ? null : new GiContext(cPtr, false);
  }

  public Matrix2d modelTransform() {
    return new Matrix2d(touchvgJNI.MgShapeDoc_modelTransform(swigCPtr, this), false);
  }

  public Box2d getPageRectW() {
    return new Box2d(touchvgJNI.MgShapeDoc_getPageRectW(swigCPtr, this), false);
  }

  public float getViewScale() {
    return touchvgJNI.MgShapeDoc_getViewScale(swigCPtr, this);
  }

  public void setPageRectW(Box2d rectW, float viewScale, boolean resetInitial) {
    touchvgJNI.MgShapeDoc_setPageRectW__SWIG_0(swigCPtr, this, Box2d.getCPtr(rectW), rectW, viewScale, resetInitial);
  }

  public void setPageRectW(Box2d rectW, float viewScale) {
    touchvgJNI.MgShapeDoc_setPageRectW__SWIG_1(swigCPtr, this, Box2d.getCPtr(rectW), rectW, viewScale);
  }

  public boolean zoomToInitial(GiTransform xform) {
    return touchvgJNI.MgShapeDoc_zoomToInitial(swigCPtr, this, GiTransform.getCPtr(xform), xform);
  }

  public boolean isReadOnly() {
    return touchvgJNI.MgShapeDoc_isReadOnly(swigCPtr, this);
  }

  public void setReadOnly(boolean readOnly) {
    touchvgJNI.MgShapeDoc_setReadOnly(swigCPtr, this, readOnly);
  }

  public static MgShapeDoc fromHandle(int h) {
    long cPtr = touchvgJNI.MgShapeDoc_fromHandle(h);
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public int toHandle() {
    return touchvgJNI.MgShapeDoc_toHandle(swigCPtr, this);
  }

  public MgObject clone() {
    long cPtr = touchvgJNI.MgShapeDoc_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MgObject(cPtr, false);
  }

  public void copy(MgObject src) {
    touchvgJNI.MgShapeDoc_copy(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public void release() {
    touchvgJNI.MgShapeDoc_release(swigCPtr, this);
  }

  public void addRef() {
    touchvgJNI.MgShapeDoc_addRef(swigCPtr, this);
  }

  public boolean equals(MgObject src) {
    return touchvgJNI.MgShapeDoc_equals(swigCPtr, this, MgObject.getCPtr(src), src);
  }

  public int getType() {
    return touchvgJNI.MgShapeDoc_getType(swigCPtr, this);
  }

  public boolean isKindOf(int type) {
    return touchvgJNI.MgShapeDoc_isKindOf(swigCPtr, this, type);
  }

}
