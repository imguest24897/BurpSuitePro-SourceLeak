package com.fasterxml.Zb;

import java.io.Serializable;
import java.util.Objects;

public class Zmk implements Comparable<Zmk>, Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Zmk Za = new Zmk(0, 0, 0, null, null, null);
  
  protected final int Zv;
  
  protected final int Zb;
  
  protected final int Zu;
  
  protected final String Zk;
  
  protected final String Zo;
  
  protected final String ZR;
  
  public Zmk(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3) {
    this.Zv = paramInt1;
    this.Zb = paramInt2;
    this.Zu = paramInt3;
    this.ZR = paramString1;
    this.Zk = (paramString2 == null) ? "" : paramString2;
    this.Zo = (paramString3 == null) ? "" : paramString3;
  }
  
  public static Zmk ZM() {
    return Za;
  }
  
  public boolean Zf() {
    return (this.ZR != null && !this.ZR.isEmpty());
  }
  
  public String Zh() {
    return this.Zo;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.Zv).append('.');
    stringBuilder.append(this.Zb).append('.');
    stringBuilder.append(this.Zu);
    if (Zf())
      stringBuilder.append('-').append(this.ZR); 
    return stringBuilder.toString();
  }
  
  public int hashCode() {
    return this.Zo.hashCode() ^ this.Zk.hashCode() ^ Objects.hashCode(this.ZR) + this.Zv - this.Zb + this.Zu;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() != getClass())
      return false; 
    Zmk zmk = (Zmk)paramObject;
    return (zmk.Zv == this.Zv && zmk.Zb == this.Zb && zmk.Zu == this.Zu && Objects.equals(zmk.ZR, this.ZR) && zmk.Zo.equals(this.Zo) && zmk.Zk.equals(this.Zk));
  }
  
  public int Zn(Zmk paramZmk) {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: aload_0
    //   6: if_acmpne -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: aload_0
    //   12: getfield Zk : Ljava/lang/String;
    //   15: aload_1
    //   16: getfield Zk : Ljava/lang/String;
    //   19: invokevirtual compareTo : (Ljava/lang/String;)I
    //   22: istore_3
    //   23: iload_3
    //   24: ifne -> 136
    //   27: aload_0
    //   28: getfield Zo : Ljava/lang/String;
    //   31: aload_1
    //   32: getfield Zo : Ljava/lang/String;
    //   35: invokevirtual compareTo : (Ljava/lang/String;)I
    //   38: istore_3
    //   39: iload_3
    //   40: ifne -> 136
    //   43: aload_0
    //   44: getfield Zv : I
    //   47: aload_1
    //   48: getfield Zv : I
    //   51: isub
    //   52: istore_3
    //   53: iload_3
    //   54: ifne -> 136
    //   57: aload_0
    //   58: getfield Zb : I
    //   61: aload_1
    //   62: getfield Zb : I
    //   65: isub
    //   66: istore_3
    //   67: iload_3
    //   68: ifne -> 136
    //   71: aload_0
    //   72: getfield Zu : I
    //   75: aload_1
    //   76: getfield Zu : I
    //   79: isub
    //   80: istore_3
    //   81: iload_3
    //   82: ifne -> 136
    //   85: aload_0
    //   86: invokevirtual Zf : ()Z
    //   89: ifeq -> 121
    //   92: aload_1
    //   93: invokevirtual Zf : ()Z
    //   96: ifeq -> 115
    //   99: aload_0
    //   100: getfield ZR : Ljava/lang/String;
    //   103: aload_1
    //   104: getfield ZR : Ljava/lang/String;
    //   107: invokevirtual compareTo : (Ljava/lang/String;)I
    //   110: istore_3
    //   111: iload_2
    //   112: ifne -> 136
    //   115: iconst_m1
    //   116: istore_3
    //   117: iload_2
    //   118: ifne -> 136
    //   121: aload_1
    //   122: invokevirtual Zf : ()Z
    //   125: ifeq -> 134
    //   128: iconst_1
    //   129: istore_3
    //   130: iload_2
    //   131: ifne -> 136
    //   134: iconst_0
    //   135: istore_3
    //   136: iload_3
    //   137: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zmk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */