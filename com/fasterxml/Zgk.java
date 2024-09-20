package com.fasterxml;

import com.fasterxml.Zb.Zj;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Zgk implements Zj, Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Zqw Zb;
  
  protected final String Zj;
  
  protected byte[] ZO;
  
  protected byte[] ZW;
  
  protected char[] ZB;
  
  protected transient String ZQ;
  
  private static final String a;
  
  public Zgk(String paramString) {
    if (paramString == null)
      throw new IllegalStateException(a); 
    this.Zj = paramString;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException {
    this.ZQ = paramObjectInputStream.readUTF();
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.writeUTF(this.Zj);
  }
  
  protected Object readResolve() {
    return new Zgk(this.ZQ);
  }
  
  public final String ZV() {
    return this.Zj;
  }
  
  public final char[] Ze() {
    char[] arrayOfChar = this.ZB;
    if (arrayOfChar == null)
      this.ZB = arrayOfChar = Zb.Zf(this.Zj); 
    return arrayOfChar;
  }
  
  public final byte[] Zx() {
    byte[] arrayOfByte = this.ZO;
    if (arrayOfByte == null)
      this.ZO = arrayOfByte = Zb.Za(this.Zj); 
    return arrayOfByte;
  }
  
  public final byte[] Zv() {
    byte[] arrayOfByte = this.ZW;
    if (arrayOfByte == null)
      this.ZW = arrayOfByte = Zb.Ze(this.Zj); 
    return arrayOfByte;
  }
  
  public int ZX(char[] paramArrayOfchar, int paramInt) {
    char[] arrayOfChar = this.ZB;
    if (arrayOfChar == null)
      this.ZB = arrayOfChar = Zb.Zf(this.Zj); 
    int i = arrayOfChar.length;
    try {
      if (paramInt + i > paramArrayOfchar.length)
        return -1; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    System.arraycopy(arrayOfChar, 0, paramArrayOfchar, paramInt, i);
    return i;
  }
  
  public int ZN(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = this.ZO;
    if (arrayOfByte == null)
      this.ZO = arrayOfByte = Zb.Za(this.Zj); 
    int i = arrayOfByte.length;
    try {
      if (paramInt + i > paramArrayOfbyte.length)
        return -1; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt, i);
    return i;
  }
  
  public int ZZ(char[] paramArrayOfchar, int paramInt) {
    String str = this.Zj;
    int i = str.length();
    try {
      if (paramInt + i > paramArrayOfchar.length)
        return -1; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    str.getChars(0, i, paramArrayOfchar, paramInt);
    return i;
  }
  
  public int Zk(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = this.ZW;
    if (arrayOfByte == null)
      this.ZW = arrayOfByte = Zb.Ze(this.Zj); 
    int i = arrayOfByte.length;
    try {
      if (paramInt + i > paramArrayOfbyte.length)
        return -1; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt, i);
    return i;
  }
  
  public final String toString() {
    return this.Zj;
  }
  
  public final int hashCode() {
    return this.Zj.hashCode();
  }
  
  public final boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (paramObject.getClass() == getClass()) {
            Zgk zgk = (Zgk)paramObject;
            return this.Zj.equals(zgk.Zj);
          } 
          return false;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #80
    //   2: ldc 'Ei5Utyu>olgy8P&fdnW\\nYtijp#YbSn7['
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zgk.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #91
    //   82: goto -> 112
    //   85: bipush #76
    //   87: goto -> 112
    //   90: bipush #39
    //   92: goto -> 112
    //   95: bipush #9
    //   97: goto -> 112
    //   100: bipush #108
    //   102: goto -> 112
    //   105: bipush #86
    //   107: goto -> 112
    //   110: bipush #80
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: invokestatic ZO : ()Lcom/fasterxml/Zqw;
    //   157: putstatic com/fasterxml/Zgk.Zb : Lcom/fasterxml/Zqw;
    //   160: return
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */