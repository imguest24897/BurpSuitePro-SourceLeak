package burp;

import java.util.Map;

class Zr6i implements Map.Entry<K, V> {
  private int Zy;
  
  final Zbpl Zh;
  
  private static final String a;
  
  private Zr6i(Zbpl paramZbpl, int paramInt) {
    this.Zy = paramInt;
  }
  
  public K Zk() {
    ZZ();
    return (K)Zrlv.ZE(this.Zh.ZN[this.Zy]);
  }
  
  public V getValue() {
    ZZ();
    return (V)this.Zh.ZN[this.Zy + 1];
  }
  
  public V setValue(V paramV) {
    ZZ();
    Object object = this.Zh.ZN[this.Zy + 1];
    try {
      this.Zh.ZN[this.Zy + 1] = paramV;
      if (this.Zh.ZN != this.Zh.ZL.Zo)
        this.Zh.ZL.Zl((Zgpi)this.Zh.ZN[this.Zy], paramV); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (V)object;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this.Zy < 0)
        return super.equals(paramObject); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Map.Entry))
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Map.Entry entry = (Map.Entry)paramObject;
    Object object = Zrlv.ZE(this.Zh.ZN[this.Zy]);
    try {
      if (object == null) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        try {
          if (((Zgpi)object).ZF(entry.getKey()))
            try {
              if (entry.getValue() == this.Zh.ZN[this.Zy + 1]);
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    try {
      if (this.Zh.ZY < 0)
        return super.hashCode(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Object object = Zrlv.ZE(this.Zh.ZN[this.Zy]);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (object == null) ? 0 : (object.hashCode() ^ System.identityHashCode(this.Zh.ZN[this.Zy + 1]));
  }
  
  public String toString() {
    try {
      if (this.Zy < 0)
        return super.toString(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return String.valueOf(Zrlv.ZE(this.Zh.ZN[this.Zy])) + "=" + String.valueOf(Zrlv.ZE(this.Zh.ZN[this.Zy]));
  }
  
  private void ZZ() {
    try {
      if (this.Zy < 0)
        throw new IllegalStateException(a); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #127
    //   2: ldc '>M2S[p.PfSG=6\\rF"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr6i.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_4
    //   81: goto -> 111
    //   84: bipush #92
    //   86: goto -> 111
    //   89: bipush #57
    //   91: goto -> 111
    //   94: bipush #94
    //   96: goto -> 111
    //   99: bipush #93
    //   101: goto -> 111
    //   104: bipush #47
    //   106: goto -> 111
    //   109: bipush #38
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */