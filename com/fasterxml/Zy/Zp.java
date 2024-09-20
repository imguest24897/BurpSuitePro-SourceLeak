package com.fasterxml.Zy;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class Zp extends AbstractSet<Map.Entry<K, V>> {
  final Zr<K, V> Ze = this.ZC;
  
  final Zr ZC;
  
  private static final String a;
  
  Zp(Zr paramZr) {}
  
  public int size() {
    return this.Ze.size();
  }
  
  public void clear() {
    this.Ze.clear();
  }
  
  public Iterator<Map.Entry<K, V>> iterator() {
    return new Zv(this.ZC);
  }
  
  public boolean contains(Object paramObject) {
    try {
      if (!(paramObject instanceof Map.Entry))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Map.Entry entry = (Map.Entry)paramObject;
    Zc zc = this.Ze.Zi.get(entry.getKey());
    try {
      if (zc != null)
        try {
          if (zc.ZF().equals(entry.getValue()));
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean Zs(Map.Entry<K, V> paramEntry) {
    throw new UnsupportedOperationException(a);
  }
  
  public boolean remove(Object paramObject) {
    try {
      if (!(paramObject instanceof Map.Entry))
        return false; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Map.Entry entry = (Map.Entry)paramObject;
    return this.Ze.remove(entry.getKey(), entry.getValue());
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #95
    //   2: ldc 'q_PYpepLYzY]V#]n1XJp~HPqfD\\nj~GN_}P@NSp1YK\\bEMtH\\rU'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zy/Zp.a : Ljava/lang/String;
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
    //   80: bipush #99
    //   82: goto -> 112
    //   85: bipush #65
    //   87: goto -> 112
    //   90: bipush #78
    //   92: goto -> 112
    //   95: bipush #99
    //   97: goto -> 112
    //   100: bipush #122
    //   102: goto -> 112
    //   105: bipush #35
    //   107: goto -> 112
    //   110: bipush #49
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */