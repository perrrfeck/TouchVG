//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.5
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace touchvg.core {

public class Ints : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal Ints(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(Ints obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~Ints() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          touchvgPINVOKE.delete_Ints(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public Ints(int n) : this(touchvgPINVOKE.new_Ints__SWIG_0(n), true) {
  }

  public Ints() : this(touchvgPINVOKE.new_Ints__SWIG_1(), true) {
  }

  public void setSize(int n) {
    touchvgPINVOKE.Ints_setSize(swigCPtr, n);
  }

  public Ints(int v1, int v2) : this(touchvgPINVOKE.new_Ints__SWIG_2(v1, v2), true) {
  }

  public Ints(int v1, int v2, int v3, int v4) : this(touchvgPINVOKE.new_Ints__SWIG_3(v1, v2, v3, v4), true) {
  }

  public int count() {
    int ret = touchvgPINVOKE.Ints_count(swigCPtr);
    return ret;
  }

  public int get(int index) {
    int ret = touchvgPINVOKE.Ints_get(swigCPtr, index);
    return ret;
  }

  public void set(int index, int value) {
    touchvgPINVOKE.Ints_set__SWIG_0(swigCPtr, index, value);
  }

  public void set(int index, int v1, int v2) {
    touchvgPINVOKE.Ints_set__SWIG_1(swigCPtr, index, v1, v2);
  }

}

}
