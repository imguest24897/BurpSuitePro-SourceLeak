package com.fasterxml.Zc;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import java.io.IOException;
import java.util.List;

public class Zv extends Zy {
  protected final Zg[] ZE;
  
  protected final boolean Zd;
  
  protected int Zn;
  
  protected boolean Zr;
  
  protected Zv(boolean paramBoolean, Zg[] paramArrayOfZg) {
    super(paramArrayOfZg[0]);
    this.Zd = paramBoolean;
    this.Zr = (paramBoolean && this.ZP.Zq());
    this.ZE = paramArrayOfZg;
    this.Zn = 1;
  }
  
  public static Zv Zn(boolean paramBoolean, Zg paramZg1, Zg paramZg2) {
    // Byte code:
    //   0: invokestatic Zc : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: instanceof com/fasterxml/Zc/Zv
    //   8: ifne -> 39
    //   11: aload_2
    //   12: instanceof com/fasterxml/Zc/Zv
    //   15: ifne -> 39
    //   18: new com/fasterxml/Zc/Zv
    //   21: dup
    //   22: iload_0
    //   23: iconst_2
    //   24: anewarray com/fasterxml/Zb/Zg
    //   27: dup
    //   28: iconst_0
    //   29: aload_1
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_2
    //   34: aastore
    //   35: invokespecial <init> : (Z[Lcom/fasterxml/Zb/Zg;)V
    //   38: areturn
    //   39: new java/util/ArrayList
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: astore #4
    //   48: aload_1
    //   49: instanceof com/fasterxml/Zc/Zv
    //   52: ifeq -> 68
    //   55: aload_1
    //   56: checkcast com/fasterxml/Zc/Zv
    //   59: aload #4
    //   61: invokevirtual Zs : (Ljava/util/List;)V
    //   64: aload_3
    //   65: ifnull -> 75
    //   68: aload #4
    //   70: aload_1
    //   71: invokevirtual add : (Ljava/lang/Object;)Z
    //   74: pop
    //   75: aload_2
    //   76: instanceof com/fasterxml/Zc/Zv
    //   79: ifeq -> 95
    //   82: aload_2
    //   83: checkcast com/fasterxml/Zc/Zv
    //   86: aload #4
    //   88: invokevirtual Zs : (Ljava/util/List;)V
    //   91: aload_3
    //   92: ifnull -> 102
    //   95: aload #4
    //   97: aload_2
    //   98: invokevirtual add : (Ljava/lang/Object;)Z
    //   101: pop
    //   102: new com/fasterxml/Zc/Zv
    //   105: dup
    //   106: iload_0
    //   107: aload #4
    //   109: aload #4
    //   111: invokevirtual size : ()I
    //   114: anewarray com/fasterxml/Zb/Zg
    //   117: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   120: checkcast [Lcom/fasterxml/Zb/Zg;
    //   123: invokespecial <init> : (Z[Lcom/fasterxml/Zb/Zg;)V
    //   126: areturn
  }
  
  protected void Zs(List<Zg> paramList) {
    // Byte code:
    //   0: invokestatic Zc : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zn : I
    //   7: iconst_1
    //   8: isub
    //   9: istore_3
    //   10: astore_2
    //   11: aload_0
    //   12: getfield ZE : [Lcom/fasterxml/Zb/Zg;
    //   15: arraylength
    //   16: istore #4
    //   18: iload_3
    //   19: iload #4
    //   21: if_icmpge -> 69
    //   24: aload_0
    //   25: getfield ZE : [Lcom/fasterxml/Zb/Zg;
    //   28: iload_3
    //   29: aaload
    //   30: astore #5
    //   32: aload #5
    //   34: instanceof com/fasterxml/Zc/Zv
    //   37: ifeq -> 53
    //   40: aload #5
    //   42: checkcast com/fasterxml/Zc/Zv
    //   45: aload_1
    //   46: invokevirtual Zs : (Ljava/util/List;)V
    //   49: aload_2
    //   50: ifnull -> 62
    //   53: aload_1
    //   54: aload #5
    //   56: invokeinterface add : (Ljava/lang/Object;)Z
    //   61: pop
    //   62: iinc #3, 1
    //   65: aload_2
    //   66: ifnull -> 18
    //   69: return
  }
  
  public void close() throws IOException {
    try {
      do {
        this.ZP.close();
      } while (ZDJ());
      return;
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Zl ZV() throws IOException {
    try {
      if (this.ZP == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zr) {
        this.Zr = false;
        return this.ZP.Zh();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zl zl = this.ZP.ZV();
    try {
      if (zl == null)
        return ZD7(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return zl;
  }
  
  public Zg Zc() throws IOException {
    String str = Zs.Zc();
    try {
      if (this.ZP.Zh() != Zl.START_OBJECT)
        try {
          if (this.ZP.Zh() != Zl.START_ARRAY)
            return this; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = 1;
    while (true) {
      Zl zl = ZV();
      try {
        if (zl == null)
          return this; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (zl.ZT()) {
          try {
            b++;
            if (str != null)
              continue; 
          } catch (IOException iOException) {
            throw a(null);
          } 
          continue;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      continue;
      try {
        if (SYNTHETIC_LOCAL_VARIABLE_3.Zf())
          try {
            if (--b == 0)
              return this; 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
  }
  
  protected boolean ZDJ() {
    if (this.Zn < this.ZE.length) {
      this.ZP = this.ZE[this.Zn++];
      return true;
    } 
    return false;
  }
  
  protected Zl ZD7() throws IOException {
    String str = Zs.Zc();
    while (this.Zn < this.ZE.length) {
      try {
        this.ZP = this.ZE[this.Zn++];
        if (this.Zd)
          try {
            if (this.ZP.Zq())
              return this.ZP.Zj(); 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      Zl zl = this.ZP.ZV();
      try {
        if (zl != null)
          return zl; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      if (str != null)
        break; 
    } 
    return null;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */