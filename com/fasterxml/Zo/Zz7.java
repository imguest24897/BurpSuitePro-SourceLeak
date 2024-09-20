package com.fasterxml.Zo;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Ze.Zw;
import com.fasterxml.Zor.Zy_;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zz7 extends Zy_ {
  private static final long serialVersionUID = 1L;
  
  private Zw ZA;
  
  private List<Zzc> ZX;
  
  private static final String e;
  
  public Zz7(Zg paramZg, String paramString, Zm5 paramZm5, Zw paramZw) {
    super((Closeable)paramZg, paramString, paramZm5);
    this.ZA = paramZw;
  }
  
  public Zz7(Zg paramZg, String paramString) {
    super((Closeable)paramZg, paramString);
    this.ZX = new ArrayList<>();
  }
  
  public Zw ZM() {
    return this.ZA;
  }
  
  public Object ZB() {
    return (this.ZA.Zh()).key;
  }
  
  public void ZQ(Object paramObject, Class<?> paramClass, Zm5 paramZm5) {
    this.ZX.add(new Zzc(paramObject, paramClass, paramZm5));
  }
  
  public String getMessage() {
    String str2 = super.getMessage();
    String str1 = Zzp.ZP();
    if (this.ZX == null)
      return str2; 
    StringBuilder stringBuilder = new StringBuilder(str2);
    Iterator<Zzc> iterator = this.ZX.iterator();
    while (iterator.hasNext()) {
      Zzc zzc = iterator.next();
      stringBuilder.append(zzc.toString());
      if (iterator.hasNext())
        stringBuilder.append(e); 
      if (str1 != null)
        break; 
    } 
    stringBuilder.append('.');
    return stringBuilder.toString();
  }
  
  public synchronized Zz7 Zk() {
    return this;
  }
  
  public Zz7 Za() {
    super.fillInStackTrace();
    return this;
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: ldc '/J'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zo/Zz7.e : Ljava/lang/String;
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
    //   80: bipush #29
    //   82: goto -> 112
    //   85: bipush #116
    //   87: goto -> 112
    //   90: bipush #109
    //   92: goto -> 112
    //   95: bipush #20
    //   97: goto -> 112
    //   100: bipush #39
    //   102: goto -> 112
    //   105: bipush #52
    //   107: goto -> 112
    //   110: bipush #53
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zz7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */