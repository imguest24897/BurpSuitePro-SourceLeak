package com.fasterxml.Zm;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zh;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;

public class Zj implements Zh {
  protected Object ZU;
  
  private static final String a;
  
  public Zj(String paramString) {
    this.ZU = paramString;
  }
  
  public void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    int i = Zx.Zo();
    try {
      if (this.ZU instanceof Zh) {
        try {
          ((Zh)this.ZU).Zh(paramZf, paramZyi);
          if (i == 0) {
            Zk(paramZf);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zk(paramZf);
  }
  
  public void Zy(Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    int i = Zx.ZY();
    try {
      if (this.ZU instanceof Zh) {
        try {
          ((Zh)this.ZU).Zy(paramZf, paramZyi, paramZa);
          if (i != 0) {
            try {
              if (this.ZU instanceof com.fasterxml.Zb.Zj)
                Zh(paramZf, paramZyi); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZU instanceof com.fasterxml.Zb.Zj)
        Zh(paramZf, paramZyi); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void ZE(Zf paramZf) throws IOException {
    int i = Zx.ZY();
    try {
      if (this.ZU instanceof Zh) {
        try {
          paramZf.ZZ(this.ZU);
          if (i != 0) {
            Zk(paramZf);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zk(paramZf);
  }
  
  protected void Zk(Zf paramZf) throws IOException {
    int i = Zx.ZY();
    try {
      if (this.ZU instanceof com.fasterxml.Zb.Zj) {
        try {
          paramZf.Zh((com.fasterxml.Zb.Zj)this.ZU);
          if (i != 0) {
            paramZf.Ze(String.valueOf(this.ZU));
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Ze(String.valueOf(this.ZU));
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof Zj))
      return false; 
    Zj zj = (Zj)paramObject;
    return (this.ZU == zj.ZU) ? true : ((this.ZU != null && this.ZU.equals(zj.ZU)));
  }
  
  public int hashCode() {
    return (this.ZU == null) ? 0 : this.ZU.hashCode();
  }
  
  public String toString() {
    return String.format(a, new Object[] { Zx.ZZ(this.ZU) });
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #50
    //   2: ldc '\\bxhei6@&O)}YwX*Zl2$q'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zm/Zj.a : Ljava/lang/String;
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
    //   80: bipush #97
    //   82: goto -> 112
    //   85: bipush #24
    //   87: goto -> 112
    //   90: bipush #59
    //   92: goto -> 112
    //   95: bipush #32
    //   97: goto -> 112
    //   100: bipush #13
    //   102: goto -> 112
    //   105: bipush #101
    //   107: goto -> 112
    //   110: bipush #30
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */