package com.fasterxml.Zs;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

final class Zu {
  private final Zu ZO;
  
  private Zu ZQ;
  
  private boolean Zt;
  
  private boolean ZU;
  
  private String Zb;
  
  private Map<String, Object> Zj;
  
  private List<Object> Zu;
  
  private Zu(Zu paramZu) {
    this.ZO = paramZu;
    this.Zt = false;
    this.ZU = false;
  }
  
  private Zu(Zu paramZu, boolean paramBoolean1, boolean paramBoolean2) {
    this.ZO = paramZu;
    this.Zt = paramBoolean1;
    this.ZU = paramBoolean2;
  }
  
  public static Zu Zn(boolean paramBoolean) {
    return new Zu(null, true, paramBoolean);
  }
  
  public static Zu ZM() {
    return new Zu(null);
  }
  
  private Zu ZC() {
    this.Zt = false;
    return this;
  }
  
  private Zu ZD(boolean paramBoolean) {
    this.Zt = true;
    this.ZU = paramBoolean;
    return this;
  }
  
  public Zu ZD() {
    return (this.ZQ == null) ? new Zu(this, true, this.ZU) : this.ZQ.ZD(this.ZU);
  }
  
  public Zu Za(String paramString) {
    this.Zb = paramString;
    return (this.ZQ == null) ? new Zu(this, true, this.ZU) : this.ZQ.ZD(this.ZU);
  }
  
  public Zu Zd() {
    return (this.ZQ == null) ? new Zu(this) : this.ZQ.ZC();
  }
  
  public Zu ZY(String paramString) {
    this.Zb = paramString;
    return (this.ZQ == null) ? new Zu(this) : this.ZQ.ZC();
  }
  
  public boolean Zl() {
    return this.Zt;
  }
  
  public void ZV(String paramString, Object paramObject) {
    if (this.ZU) {
      Zj(paramString, paramObject);
      return;
    } 
    if (this.Zj == null)
      this.Zj = new LinkedHashMap<>(); 
    this.Zj.put(paramString, paramObject);
  }
  
  public Zu Zv(Object paramObject) {
    String str = Objects.<String>requireNonNull(this.Zb);
    this.Zb = null;
    if (this.ZU) {
      Zj(str, paramObject);
      return this;
    } 
    if (this.Zj == null)
      this.Zj = new LinkedHashMap<>(); 
    this.Zj.put(str, paramObject);
    return this;
  }
  
  public void Zh(Object paramObject) {
    if (this.Zu == null)
      this.Zu = new ArrayList(); 
    this.Zu.add(paramObject);
  }
  
  public Object ZP() {
    return (this.Zj == null) ? ZW() : this.Zj;
  }
  
  public Zu Zb() {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zj : Ljava/util/Map;
    //   8: ifnonnull -> 23
    //   11: new java/util/LinkedHashMap
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore_2
    //   19: aload_1
    //   20: ifnull -> 33
    //   23: aload_0
    //   24: getfield Zj : Ljava/util/Map;
    //   27: astore_2
    //   28: aload_0
    //   29: aconst_null
    //   30: putfield Zj : Ljava/util/Map;
    //   33: aload_0
    //   34: getfield ZO : Lcom/fasterxml/Zs/Zu;
    //   37: invokevirtual Zl : ()Z
    //   40: ifeq -> 52
    //   43: aload_0
    //   44: getfield ZO : Lcom/fasterxml/Zs/Zu;
    //   47: aload_2
    //   48: invokevirtual Zv : (Ljava/lang/Object;)Lcom/fasterxml/Zs/Zu;
    //   51: areturn
    //   52: aload_0
    //   53: getfield ZO : Lcom/fasterxml/Zs/Zu;
    //   56: aload_2
    //   57: invokevirtual Zh : (Ljava/lang/Object;)V
    //   60: aload_0
    //   61: getfield ZO : Lcom/fasterxml/Zs/Zu;
    //   64: areturn
  }
  
  public Object Zw(boolean paramBoolean) {
    return (this.Zu == null) ? (paramBoolean ? Zf7.Zh : Zf()) : (paramBoolean ? this.Zu.toArray(Zf7.Zh) : this.Zu);
  }
  
  public Zu Zy(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zu : Ljava/util/List;
    //   8: ifnonnull -> 31
    //   11: iload_1
    //   12: ifeq -> 23
    //   15: getstatic com/fasterxml/Zs/Zf7.Zh : [Ljava/lang/Object;
    //   18: astore_3
    //   19: aload_2
    //   20: ifnull -> 62
    //   23: invokestatic Zf : ()Ljava/util/List;
    //   26: astore_3
    //   27: aload_2
    //   28: ifnull -> 62
    //   31: iload_1
    //   32: ifeq -> 52
    //   35: aload_0
    //   36: getfield Zu : Ljava/util/List;
    //   39: getstatic com/fasterxml/Zs/Zf7.Zh : [Ljava/lang/Object;
    //   42: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   47: astore_3
    //   48: aload_2
    //   49: ifnull -> 57
    //   52: aload_0
    //   53: getfield Zu : Ljava/util/List;
    //   56: astore_3
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield Zu : Ljava/util/List;
    //   62: aload_0
    //   63: getfield ZO : Lcom/fasterxml/Zs/Zu;
    //   66: invokevirtual Zl : ()Z
    //   69: ifeq -> 81
    //   72: aload_0
    //   73: getfield ZO : Lcom/fasterxml/Zs/Zu;
    //   76: aload_3
    //   77: invokevirtual Zv : (Ljava/lang/Object;)Lcom/fasterxml/Zs/Zu;
    //   80: areturn
    //   81: aload_0
    //   82: getfield ZO : Lcom/fasterxml/Zs/Zu;
    //   85: aload_3
    //   86: invokevirtual Zh : (Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield ZO : Lcom/fasterxml/Zs/Zu;
    //   93: areturn
  }
  
  private void Zj(String paramString, Object paramObject) {
    Zbqc[] arrayOfZbqc = Zl.Zn();
    if (this.Zj == null) {
      this.Zj = new LinkedHashMap<>();
      this.Zj.put(paramString, paramObject);
      return;
    } 
    Object object = this.Zj.put(paramString, paramObject);
    if (object != null) {
      if (object instanceof List) {
        ((List<Object>)object).add(paramObject);
        this.Zj.put(paramString, object);
        if (arrayOfZbqc != null) {
          ArrayList<Object> arrayList1 = new ArrayList();
          arrayList1.add(object);
          arrayList1.add(paramObject);
          this.Zj.put(paramString, arrayList1);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    ArrayList<Object> arrayList = new ArrayList();
    arrayList.add(object);
    arrayList.add(paramObject);
    this.Zj.put(paramString, arrayList);
  }
  
  public static Map<String, Object> ZW() {
    return new LinkedHashMap<>(2);
  }
  
  public static List<Object> Zf() {
    return new ArrayList(2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */