package com.fasterxml.Zor;

import com.fasterxml.Zh.Zi;
import com.fasterxml.Zh.Zr;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo2.Ze;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

public abstract class Zk extends Ze implements Serializable, Type {
  private static final long serialVersionUID = 1L;
  
  protected final Class<?> ZM;
  
  protected final int ZU;
  
  protected final Object ZA;
  
  protected final Object Zf;
  
  protected final boolean ZZ;
  
  private static int[] ZO;
  
  protected Zk(Class<?> paramClass, int paramInt, Object paramObject1, Object paramObject2, boolean paramBoolean) {
    this.ZM = paramClass;
    this.ZU = 31 * paramInt + paramClass.hashCode();
    this.ZA = paramObject1;
    this.Zf = paramObject2;
    this.ZZ = paramBoolean;
  }
  
  public abstract Zk ZR(Zk paramZk);
  
  public abstract Zk Zq();
  
  public abstract Zk Zc(Object paramObject);
  
  public abstract Zk ZW(Object paramObject);
  
  public abstract Zk Zv(Object paramObject);
  
  public abstract Zk Zw(Object paramObject);
  
  public Zk ZH(Zk paramZk) {
    Zk zk = this;
    Object object = paramZk.Zi();
    if (object != this.Zf)
      zk = zk.Zc(object); 
    object = paramZk.ZY();
    if (object != this.ZA)
      zk = zk.Zv(object); 
    return zk;
  }
  
  public abstract Zk Zv(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk);
  
  public final Class<?> Zf() {
    return this.ZM;
  }
  
  public final boolean ZP(Class<?> paramClass) {
    return (this.ZM == paramClass);
  }
  
  public boolean ZG() {
    return true;
  }
  
  public final boolean Zf(Class<?> paramClass) {
    return (this.ZM == paramClass || paramClass.isAssignableFrom(this.ZM));
  }
  
  public final boolean Zq(Class<?> paramClass) {
    return (this.ZM == paramClass || this.ZM.isAssignableFrom(paramClass));
  }
  
  public boolean ZV() {
    return Modifier.isAbstract(this.ZM.getModifiers());
  }
  
  public boolean Zp() {
    int i = this.ZM.getModifiers();
    return ((i & 0x600) == 0) ? true : this.ZM.isPrimitive();
  }
  
  public boolean ZW() {
    return Throwable.class.isAssignableFrom(this.ZM);
  }
  
  public boolean ZC() {
    return false;
  }
  
  public final boolean ZF() {
    return Zx.Zb(this.ZM);
  }
  
  public final boolean ZM() {
    return (Zx.Zb(this.ZM) && this.ZM != Enum.class);
  }
  
  public final boolean Zv() {
    return Zx.Zr(this.ZM);
  }
  
  public final boolean ZU() {
    return this.ZM.isInterface();
  }
  
  public final boolean Zm() {
    return this.ZM.isPrimitive();
  }
  
  public final boolean ZE() {
    return Modifier.isFinal(this.ZM.getModifiers());
  }
  
  public abstract boolean ZH();
  
  public boolean Za() {
    return false;
  }
  
  public boolean Zh() {
    return false;
  }
  
  public final boolean Zr() {
    return (this.ZM == Object.class);
  }
  
  public final boolean ZS() {
    return this.ZZ;
  }
  
  public boolean Zk() {
    return (ZJ() > 0);
  }
  
  public Zk Zu() {
    return null;
  }
  
  public Zk ZB() {
    return null;
  }
  
  public Zk Zn() {
    return null;
  }
  
  public abstract int ZJ();
  
  public abstract Zk Zt(int paramInt);
  
  public Zk ZO(int paramInt) {
    Zk zk = Zt(paramInt);
    return (zk == null) ? Zi.Zs() : zk;
  }
  
  public abstract Zr ZR();
  
  public abstract Zk Zl(Class<?> paramClass);
  
  public abstract Zk Zw();
  
  public abstract List<Zk> ZN();
  
  public <T> T ZY() {
    return (T)this.ZA;
  }
  
  public <T> T Zi() {
    return (T)this.Zf;
  }
  
  public boolean Zg() {
    return (this.Zf != null || this.ZA != null);
  }
  
  public String Ze() {
    StringBuilder stringBuilder = new StringBuilder(40);
    Zc(stringBuilder);
    return stringBuilder.toString();
  }
  
  public abstract StringBuilder Zc(StringBuilder paramStringBuilder);
  
  public abstract StringBuilder ZS(StringBuilder paramStringBuilder);
  
  public abstract String toString();
  
  public abstract boolean equals(Object paramObject);
  
  public int hashCode() {
    return this.ZU;
  }
  
  public static void Zh(int[] paramArrayOfint) {
    ZO = paramArrayOfint;
  }
  
  public static int[] ZX() {
    return ZO;
  }
  
  static {
    if (ZX() == null)
      Zh(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */