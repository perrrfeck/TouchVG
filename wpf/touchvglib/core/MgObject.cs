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

public class MgObject : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal MgObject(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(MgObject obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          throw new global::System.MethodAccessException("C++ destructor does not have public access");
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  public virtual MgObject clone() {
    global::System.IntPtr cPtr = touchvgPINVOKE.MgObject_clone(swigCPtr);
    MgObject ret = (cPtr == global::System.IntPtr.Zero) ? null : new MgObject(cPtr, false);
    return ret;
  }

  public virtual void copy(MgObject src) {
    touchvgPINVOKE.MgObject_copy(swigCPtr, MgObject.getCPtr(src));
    if (touchvgPINVOKE.SWIGPendingException.Pending) throw touchvgPINVOKE.SWIGPendingException.Retrieve();
  }

  public virtual void release() {
    touchvgPINVOKE.MgObject_release(swigCPtr);
  }

  public virtual void addRef() {
    touchvgPINVOKE.MgObject_addRef(swigCPtr);
  }

  public virtual bool equals(MgObject src) {
    bool ret = touchvgPINVOKE.MgObject_equals(swigCPtr, MgObject.getCPtr(src));
    if (touchvgPINVOKE.SWIGPendingException.Pending) throw touchvgPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int getType() {
    int ret = touchvgPINVOKE.MgObject_getType(swigCPtr);
    return ret;
  }

  public virtual bool isKindOf(int type) {
    bool ret = touchvgPINVOKE.MgObject_isKindOf(swigCPtr, type);
    return ret;
  }

  public MgObject() : this(touchvgPINVOKE.new_MgObject(), true) {
    SwigDirectorConnect();
  }

  private void SwigDirectorConnect() {
    if (SwigDerivedClassHasMethod("clone", swigMethodTypes0))
      swigDelegate0 = new SwigDelegateMgObject_0(SwigDirectorclone);
    if (SwigDerivedClassHasMethod("copy", swigMethodTypes1))
      swigDelegate1 = new SwigDelegateMgObject_1(SwigDirectorcopy);
    if (SwigDerivedClassHasMethod("release", swigMethodTypes2))
      swigDelegate2 = new SwigDelegateMgObject_2(SwigDirectorrelease);
    if (SwigDerivedClassHasMethod("addRef", swigMethodTypes3))
      swigDelegate3 = new SwigDelegateMgObject_3(SwigDirectoraddRef);
    if (SwigDerivedClassHasMethod("equals", swigMethodTypes4))
      swigDelegate4 = new SwigDelegateMgObject_4(SwigDirectorequals);
    if (SwigDerivedClassHasMethod("getType", swigMethodTypes5))
      swigDelegate5 = new SwigDelegateMgObject_5(SwigDirectorgetType);
    if (SwigDerivedClassHasMethod("isKindOf", swigMethodTypes6))
      swigDelegate6 = new SwigDelegateMgObject_6(SwigDirectorisKindOf);
    touchvgPINVOKE.MgObject_director_connect(swigCPtr, swigDelegate0, swigDelegate1, swigDelegate2, swigDelegate3, swigDelegate4, swigDelegate5, swigDelegate6);
  }

  private bool SwigDerivedClassHasMethod(string methodName, global::System.Type[] methodTypes) {
    global::System.Reflection.MethodInfo methodInfo = this.GetType().GetMethod(methodName, global::System.Reflection.BindingFlags.Public | global::System.Reflection.BindingFlags.NonPublic | global::System.Reflection.BindingFlags.Instance, null, methodTypes, null);
    bool hasDerivedMethod = methodInfo.DeclaringType.IsSubclassOf(typeof(MgObject));
    return hasDerivedMethod;
  }

  private global::System.IntPtr SwigDirectorclone() {
    return MgObject.getCPtr(clone()).Handle;
  }

  private void SwigDirectorcopy(global::System.IntPtr src) {
    copy(new MgObject(src, false));
  }

  private void SwigDirectorrelease() {
    release();
  }

  private void SwigDirectoraddRef() {
    addRef();
  }

  private bool SwigDirectorequals(global::System.IntPtr src) {
    return equals(new MgObject(src, false));
  }

  private int SwigDirectorgetType() {
    return getType();
  }

  private bool SwigDirectorisKindOf(int type) {
    return isKindOf(type);
  }

  public delegate global::System.IntPtr SwigDelegateMgObject_0();
  public delegate void SwigDelegateMgObject_1(global::System.IntPtr src);
  public delegate void SwigDelegateMgObject_2();
  public delegate void SwigDelegateMgObject_3();
  public delegate bool SwigDelegateMgObject_4(global::System.IntPtr src);
  public delegate int SwigDelegateMgObject_5();
  public delegate bool SwigDelegateMgObject_6(int type);

  private SwigDelegateMgObject_0 swigDelegate0;
  private SwigDelegateMgObject_1 swigDelegate1;
  private SwigDelegateMgObject_2 swigDelegate2;
  private SwigDelegateMgObject_3 swigDelegate3;
  private SwigDelegateMgObject_4 swigDelegate4;
  private SwigDelegateMgObject_5 swigDelegate5;
  private SwigDelegateMgObject_6 swigDelegate6;

  private static global::System.Type[] swigMethodTypes0 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes1 = new global::System.Type[] { typeof(MgObject) };
  private static global::System.Type[] swigMethodTypes2 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes3 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes4 = new global::System.Type[] { typeof(MgObject) };
  private static global::System.Type[] swigMethodTypes5 = new global::System.Type[] {  };
  private static global::System.Type[] swigMethodTypes6 = new global::System.Type[] { typeof(int) };
}

}
