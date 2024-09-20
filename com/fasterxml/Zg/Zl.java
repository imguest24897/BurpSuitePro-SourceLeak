package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.util.Objects;

public class Zl extends Zg {
  private static final long serialVersionUID = 2L;
  
  protected final Object ZI;
  
  private static final String a;
  
  public Zl(Object paramObject) {
    this.ZI = paramObject;
  }
  
  public Zfr ZF() {
    return Zfr.POJO;
  }
  
  public com.fasterxml.Zb.Zl ZV() {
    return com.fasterxml.Zb.Zl.VALUE_EMBEDDED_OBJECT;
  }
  
  public byte[] Zw() throws IOException {
    try {
      if (this.ZI instanceof byte[])
        return (byte[])this.ZI; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return super.Zw();
  }
  
  public String Zp() {
    return (this.ZI == null) ? a : this.ZI.toString();
  }
  
  @Deprecated
  public String ZR(String paramString) {
    return (this.ZI == null) ? paramString : this.ZI.toString();
  }
  
  public boolean ZA(boolean paramBoolean) {
    return (this.ZI != null && this.ZI instanceof Boolean) ? ((Boolean)this.ZI).booleanValue() : paramBoolean;
  }
  
  public final void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZI : Ljava/lang/Object;
    //   8: ifnonnull -> 27
    //   11: aload_2
    //   12: aload_1
    //   13: invokevirtual ZT : (Lcom/fasterxml/Zb/Zf;)V
    //   16: aload_3
    //   17: ifnonnull -> 85
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   26: athrow
    //   27: aload_0
    //   28: getfield ZI : Ljava/lang/Object;
    //   31: instanceof com/fasterxml/Zor/Zh
    //   34: ifeq -> 69
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   43: athrow
    //   44: aload_0
    //   45: getfield ZI : Ljava/lang/Object;
    //   48: checkcast com/fasterxml/Zor/Zh
    //   51: aload_1
    //   52: aload_2
    //   53: invokeinterface Zh : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   58: aload_3
    //   59: ifnonnull -> 85
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   68: athrow
    //   69: aload_2
    //   70: aload_0
    //   71: getfield ZI : Ljava/lang/Object;
    //   74: aload_1
    //   75: invokevirtual ZK : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;)V
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   84: athrow
    //   85: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/io/IOException
    //   11	37	40	java/io/IOException
    //   27	62	65	java/io/IOException
    //   44	78	81	java/io/IOException
  }
  
  public Object ZI() {
    return this.ZI;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject == null) ? false : ((paramObject instanceof Zl) ? ZE((Zl)paramObject) : false));
  }
  
  protected boolean ZE(Zl paramZl) {
    return (this.ZI == null) ? ((paramZl.ZI == null)) : this.ZI.equals(paramZl.ZI);
  }
  
  public int hashCode() {
    return Objects.hashCode(this.ZI);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #63
    //   2: ldc '7NW'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zg/Zl.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 93, 4 -> 98, 5 -> 103
    //   80: bipush #102
    //   82: goto -> 110
    //   85: iconst_4
    //   86: goto -> 110
    //   89: iconst_4
    //   90: goto -> 110
    //   93: bipush #73
    //   95: goto -> 110
    //   98: bipush #52
    //   100: goto -> 110
    //   103: bipush #107
    //   105: goto -> 110
    //   108: bipush #65
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */