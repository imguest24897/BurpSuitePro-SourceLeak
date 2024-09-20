package burp;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public abstract class Zeku implements Zm31 {
  private final byte ZL;
  
  private final int Zx;
  
  private static Zbqc[] ZG;
  
  Zeku(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: iload_1
    //   5: iflt -> 23
    //   8: iload_1
    //   9: sipush #128
    //   12: if_icmpge -> 23
    //   15: iconst_1
    //   16: goto -> 24
    //   19: invokestatic a : (Lburp/Zzcb;)Lburp/Zzcb;
    //   22: athrow
    //   23: iconst_0
    //   24: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   27: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   30: aload_0
    //   31: iload_1
    //   32: i2b
    //   33: putfield ZL : B
    //   36: aload_0
    //   37: iload_2
    //   38: putfield Zx : I
    //   41: return
    // Exception table:
    //   from	to	target	type
    //   8	19	19	burp/Zzcb
  }
  
  public byte ZH() {
    return this.ZL;
  }
  
  public int ZB() {
    return this.Zx;
  }
  
  public Object ZS(Zgpi paramZgpi) {
    Zbqc[] arrayOfZbqc = Za();
    try {
      Field field = Zw(paramZgpi.getClass());
      if (field != null) {
        field.setAccessible(true);
        return field.get(paramZgpi);
      } 
      Method method = ZA(paramZgpi.getClass());
      if (method != null) {
        method.setAccessible(true);
        if (Zbqc.Zwu() == null)
          Zf(new Zbqc[5]); 
        return method.invoke(paramZgpi, new Object[0]);
      } 
      throw new Zzcb(paramZgpi.getClass(), this.ZL);
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      Zah.Zl(illegalAccessException, Zk_.UNEXPECTED);
      throw new Zkfw(illegalAccessException);
    } 
  }
  
  public void ZD(Zgpi paramZgpi, Object paramObject) {
    Zbqc[] arrayOfZbqc = Za();
    try {
      Field field = Zw(paramZgpi.getClass());
      if (field != null) {
        field.setAccessible(true);
        field.set(paramZgpi, paramObject);
        if (arrayOfZbqc == null)
          Zbqc.Zr(new Zbqc[4]); 
        return;
      } 
      throw new Zzcb(paramZgpi.getClass(), this.ZL);
    } catch (IllegalAccessException illegalAccessException) {
      Zah.Zl(illegalAccessException, Zk_.UNEXPECTED);
      throw new Zkfw(illegalAccessException);
    } 
  }
  
  private Field Zw(Class<?> paramClass) {
    Zbqc[] arrayOfZbqc = Za();
    try {
      if (paramClass == Object.class)
        return null; 
    } catch (Zzcb zzcb) {
      throw a(null);
    } 
    Field[] arrayOfField1 = paramClass.getDeclaredFields();
    Field[] arrayOfField2 = arrayOfField1;
    int i = arrayOfField2.length;
    byte b = 0;
    while (b < i) {
      Field field = arrayOfField2[b];
      Zzvo zzvo = field.<Zzvo>getAnnotation(Zzvo.class);
      if (zzvo != null) {
        int j = zzvo.value();
        try {
          if (j == this.ZL)
            return field; 
        } catch (Zzcb zzcb) {
          throw a(null);
        } 
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return Zw(paramClass.getSuperclass());
  }
  
  private Method ZA(Class<?> paramClass) {
    Zbqc[] arrayOfZbqc = Za();
    try {
      if (paramClass == Object.class)
        return null; 
    } catch (Zzcb zzcb) {
      throw a(null);
    } 
    Method[] arrayOfMethod1 = paramClass.getDeclaredMethods();
    Method[] arrayOfMethod2 = arrayOfMethod1;
    int i = arrayOfMethod2.length;
    byte b = 0;
    while (b < i) {
      Method method = arrayOfMethod2[b];
      Zzvo zzvo = method.<Zzvo>getAnnotation(Zzvo.class);
      if (zzvo != null) {
        int j = zzvo.value();
        try {
          if (j == this.ZL)
            return method; 
        } catch (Zzcb zzcb) {
          throw a(null);
        } 
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return ZA(paramClass.getSuperclass());
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (Zzcb zzcb) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (Zzcb zzcb) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (Zzcb zzcb) {
      throw a(null);
    } 
    Zeku zeku = (Zeku)paramObject;
    try {
      if (this.ZL == zeku.ZL)
        try {
          if (this.Zx == zeku.Zx);
        } catch (Zzcb zzcb) {
          throw a(null);
        }  
    } catch (Zzcb zzcb) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Byte.valueOf(this.ZL), Integer.valueOf(this.Zx) });
  }
  
  public static void Zf(Zbqc[] paramArrayOfZbqc) {
    ZG = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Za() {
    return ZG;
  }
  
  private static Zzcb a(Zzcb paramZzcb) {
    return paramZzcb;
  }
  
  static {
    if (Za() == null)
      Zf(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeku.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */