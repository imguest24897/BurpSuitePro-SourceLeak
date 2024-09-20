package com.fasterxml.Zg;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zs;
import com.fasterxml.Zj.Zd;
import com.fasterxml.Zj.Zz;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Zr extends Zv<Zr> implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Map<String, Zb> ZB = new LinkedHashMap<>();
  
  public Zr(Zfc paramZfc) {
    super(paramZfc);
  }
  
  protected Zb Zu(Zs paramZs) {
    return ZL(paramZs.ZB());
  }
  
  public boolean Zq(Zyi paramZyi) {
    return this.ZB.isEmpty();
  }
  
  public Zfr ZF() {
    return Zfr.OBJECT;
  }
  
  public final boolean ZB() {
    return true;
  }
  
  public Zl ZV() {
    return Zl.START_OBJECT;
  }
  
  public int Zv() {
    return this.ZB.size();
  }
  
  public Iterator<Zb> Zn() {
    return this.ZB.values().iterator();
  }
  
  public Zb ZC(int paramInt) {
    return null;
  }
  
  public Zb ZL(String paramString) {
    return this.ZB.get(paramString);
  }
  
  public Iterator<String> ZM() {
    return this.ZB.keySet().iterator();
  }
  
  public Iterator<Map.Entry<String, Zb>> Zj() {
    return this.ZB.entrySet().iterator();
  }
  
  public List<Zb> ZI(String paramString, List<Zb> paramList) {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZB : Ljava/util/Map;
    //   7: invokeinterface entrySet : ()Ljava/util/Set;
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: astore_3
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 106
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast java/util/Map$Entry
    //   40: astore #5
    //   42: aload_1
    //   43: aload #5
    //   45: invokeinterface getKey : ()Ljava/lang/Object;
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifeq -> 86
    //   56: aload_2
    //   57: ifnonnull -> 68
    //   60: new java/util/ArrayList
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: astore_2
    //   68: aload_2
    //   69: aload #5
    //   71: invokeinterface getValue : ()Ljava/lang/Object;
    //   76: invokeinterface add : (Ljava/lang/Object;)Z
    //   81: pop
    //   82: aload_3
    //   83: ifnonnull -> 102
    //   86: aload #5
    //   88: invokeinterface getValue : ()Ljava/lang/Object;
    //   93: checkcast com/fasterxml/Zor/Zb
    //   96: aload_1
    //   97: aload_2
    //   98: invokevirtual ZI : (Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    //   101: astore_2
    //   102: aload_3
    //   103: ifnonnull -> 20
    //   106: aload_2
    //   107: areturn
  }
  
  public List<Zb> ZM(String paramString, List<Zb> paramList) {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZB : Ljava/util/Map;
    //   7: invokeinterface entrySet : ()Ljava/util/Set;
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: astore_3
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 100
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast java/util/Map$Entry
    //   40: astore #5
    //   42: aload_1
    //   43: aload #5
    //   45: invokeinterface getKey : ()Ljava/lang/Object;
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifeq -> 80
    //   56: aload_2
    //   57: ifnonnull -> 68
    //   60: new java/util/ArrayList
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: astore_2
    //   68: aload_2
    //   69: aload_0
    //   70: invokeinterface add : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: aload_3
    //   77: ifnonnull -> 96
    //   80: aload #5
    //   82: invokeinterface getValue : ()Ljava/lang/Object;
    //   87: checkcast com/fasterxml/Zor/Zb
    //   90: aload_1
    //   91: aload_2
    //   92: invokevirtual ZM : (Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    //   95: astore_2
    //   96: aload_3
    //   97: ifnonnull -> 20
    //   100: aload_2
    //   101: areturn
  }
  
  public void Zh(Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: ifnull -> 98
    //   8: aload_2
    //   9: getstatic com/fasterxml/Zor/Zy0.WRITE_EMPTY_JSON_ARRAYS : Lcom/fasterxml/Zor/Zy0;
    //   12: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   15: ifne -> 33
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   24: athrow
    //   25: iconst_1
    //   26: goto -> 34
    //   29: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   32: athrow
    //   33: iconst_0
    //   34: istore #4
    //   36: aload_2
    //   37: getstatic com/fasterxml/Zj/Zd.WRITE_NULL_PROPERTIES : Lcom/fasterxml/Zj/Zd;
    //   40: invokevirtual Zj : (Lcom/fasterxml/Zj/Zz;)Z
    //   43: ifne -> 54
    //   46: iconst_1
    //   47: goto -> 55
    //   50: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   53: athrow
    //   54: iconst_0
    //   55: istore #5
    //   57: iload #4
    //   59: ifne -> 74
    //   62: iload #5
    //   64: ifeq -> 98
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   73: athrow
    //   74: aload_1
    //   75: aload_0
    //   76: invokevirtual ZB : (Ljava/lang/Object;)V
    //   79: aload_0
    //   80: aload_1
    //   81: aload_2
    //   82: iload #4
    //   84: iload #5
    //   86: invokevirtual Zd : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;ZZ)V
    //   89: aload_1
    //   90: invokevirtual Zh : ()V
    //   93: return
    //   94: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   97: athrow
    //   98: aload_1
    //   99: aload_0
    //   100: invokevirtual ZB : (Ljava/lang/Object;)V
    //   103: aload_0
    //   104: aload_2
    //   105: invokevirtual Zv : (Lcom/fasterxml/Zor/Zyi;)Ljava/util/Map;
    //   108: invokeinterface entrySet : ()Ljava/util/Set;
    //   113: invokeinterface iterator : ()Ljava/util/Iterator;
    //   118: astore #4
    //   120: aload #4
    //   122: invokeinterface hasNext : ()Z
    //   127: ifeq -> 179
    //   130: aload #4
    //   132: invokeinterface next : ()Ljava/lang/Object;
    //   137: checkcast java/util/Map$Entry
    //   140: astore #5
    //   142: aload #5
    //   144: invokeinterface getValue : ()Ljava/lang/Object;
    //   149: checkcast com/fasterxml/Zor/Zb
    //   152: astore #6
    //   154: aload_1
    //   155: aload #5
    //   157: invokeinterface getKey : ()Ljava/lang/Object;
    //   162: checkcast java/lang/String
    //   165: invokevirtual ZY : (Ljava/lang/String;)V
    //   168: aload #6
    //   170: aload_1
    //   171: aload_2
    //   172: invokevirtual Zh : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   175: aload_3
    //   176: ifnonnull -> 120
    //   179: aload_1
    //   180: invokevirtual Zh : ()V
    //   183: return
    // Exception table:
    //   from	to	target	type
    //   4	18	21	java/io/IOException
    //   8	29	29	java/io/IOException
    //   36	50	50	java/io/IOException
    //   57	67	70	java/io/IOException
    //   62	94	94	java/io/IOException
  }
  
  public void Zy(Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: iconst_0
    //   4: istore #5
    //   6: iconst_0
    //   7: istore #6
    //   9: astore #4
    //   11: aload_2
    //   12: ifnull -> 64
    //   15: aload_2
    //   16: getstatic com/fasterxml/Zor/Zy0.WRITE_EMPTY_JSON_ARRAYS : Lcom/fasterxml/Zor/Zy0;
    //   19: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   22: ifne -> 40
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   31: athrow
    //   32: iconst_1
    //   33: goto -> 41
    //   36: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   39: athrow
    //   40: iconst_0
    //   41: istore #5
    //   43: aload_2
    //   44: getstatic com/fasterxml/Zj/Zd.WRITE_NULL_PROPERTIES : Lcom/fasterxml/Zj/Zd;
    //   47: invokevirtual Zj : (Lcom/fasterxml/Zj/Zz;)Z
    //   50: ifne -> 61
    //   53: iconst_1
    //   54: goto -> 62
    //   57: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   60: athrow
    //   61: iconst_0
    //   62: istore #6
    //   64: aload_3
    //   65: aload_1
    //   66: aload_3
    //   67: aload_0
    //   68: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   71: invokevirtual Zm : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zl;)Lcom/fasterxml/Zo2/Zn;
    //   74: invokevirtual ZA : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   77: astore #7
    //   79: iload #5
    //   81: ifne -> 96
    //   84: iload #6
    //   86: ifeq -> 132
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   95: athrow
    //   96: aload_0
    //   97: aload_1
    //   98: aload_2
    //   99: iload #5
    //   101: iload #6
    //   103: invokevirtual Zd : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;ZZ)V
    //   106: aload #4
    //   108: ifnonnull -> 209
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   117: athrow
    //   118: iconst_4
    //   119: anewarray burp/Zbqc
    //   122: invokestatic Zr : ([Lburp/Zbqc;)V
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   131: athrow
    //   132: aload_0
    //   133: aload_2
    //   134: invokevirtual Zv : (Lcom/fasterxml/Zor/Zyi;)Ljava/util/Map;
    //   137: invokeinterface entrySet : ()Ljava/util/Set;
    //   142: invokeinterface iterator : ()Ljava/util/Iterator;
    //   147: astore #8
    //   149: aload #8
    //   151: invokeinterface hasNext : ()Z
    //   156: ifeq -> 209
    //   159: aload #8
    //   161: invokeinterface next : ()Ljava/lang/Object;
    //   166: checkcast java/util/Map$Entry
    //   169: astore #9
    //   171: aload #9
    //   173: invokeinterface getValue : ()Ljava/lang/Object;
    //   178: checkcast com/fasterxml/Zor/Zb
    //   181: astore #10
    //   183: aload_1
    //   184: aload #9
    //   186: invokeinterface getKey : ()Ljava/lang/Object;
    //   191: checkcast java/lang/String
    //   194: invokevirtual ZY : (Ljava/lang/String;)V
    //   197: aload #10
    //   199: aload_1
    //   200: aload_2
    //   201: invokevirtual Zh : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   204: aload #4
    //   206: ifnonnull -> 149
    //   209: aload_3
    //   210: aload_1
    //   211: aload #7
    //   213: invokevirtual ZP : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   216: pop
    //   217: return
    // Exception table:
    //   from	to	target	type
    //   11	25	28	java/io/IOException
    //   15	36	36	java/io/IOException
    //   43	57	57	java/io/IOException
    //   79	89	92	java/io/IOException
    //   84	111	114	java/io/IOException
    //   96	125	128	java/io/IOException
  }
  
  protected void Zd(Zf paramZf, Zyi paramZyi, boolean paramBoolean1, boolean paramBoolean2) throws IOException {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: aload_0
    //   4: aload_2
    //   5: invokevirtual Zv : (Lcom/fasterxml/Zor/Zyi;)Ljava/util/Map;
    //   8: invokeinterface entrySet : ()Ljava/util/Set;
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #6
    //   20: astore #5
    //   22: aload #6
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 161
    //   32: aload #6
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast java/util/Map$Entry
    //   42: astore #7
    //   44: aload #7
    //   46: invokeinterface getValue : ()Ljava/lang/Object;
    //   51: checkcast com/fasterxml/Zor/Zb
    //   54: astore #8
    //   56: iload_3
    //   57: ifeq -> 103
    //   60: aload #8
    //   62: invokevirtual ZJ : ()Z
    //   65: ifeq -> 103
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   74: athrow
    //   75: aload #8
    //   77: aload_2
    //   78: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyi;)Z
    //   81: ifeq -> 103
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   90: athrow
    //   91: aload #5
    //   93: ifnonnull -> 22
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   102: athrow
    //   103: iload #4
    //   105: ifeq -> 135
    //   108: aload #8
    //   110: invokevirtual Zt : ()Z
    //   113: ifeq -> 135
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   122: athrow
    //   123: aload #5
    //   125: ifnonnull -> 22
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   134: athrow
    //   135: aload_1
    //   136: aload #7
    //   138: invokeinterface getKey : ()Ljava/lang/Object;
    //   143: checkcast java/lang/String
    //   146: invokevirtual ZY : (Ljava/lang/String;)V
    //   149: aload #8
    //   151: aload_1
    //   152: aload_2
    //   153: invokevirtual Zh : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;)V
    //   156: aload #5
    //   158: ifnonnull -> 22
    //   161: return
    // Exception table:
    //   from	to	target	type
    //   56	68	71	java/io/IOException
    //   60	84	87	java/io/IOException
    //   75	96	99	java/io/IOException
    //   103	116	119	java/io/IOException
    //   108	128	131	java/io/IOException
  }
  
  protected Map<String, Zb> Zv(Zyi paramZyi) {
    return (paramZyi.Zj((Zz)Zd.WRITE_PROPERTIES_SORTED) && !this.ZB.isEmpty()) ? new TreeMap<>(this.ZB) : this.ZB;
  }
  
  public <T extends Zb> T Zo(String paramString, Zb paramZb) {
    if (paramZb == null)
      paramZb = Zc(); 
    this.ZB.put(paramString, paramZb);
    return (T)this;
  }
  
  public Zb Zm(String paramString, Zb paramZb) {
    if (paramZb == null)
      paramZb = Zc(); 
    return this.ZB.put(paramString, paramZb);
  }
  
  public Zb Za(String paramString) {
    return this.ZB.remove(paramString);
  }
  
  public Zr ZG(String paramString1, String paramString2) {
    return Zr(paramString1, (paramString2 == null) ? Zc() : ZV(paramString2));
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject == null) ? false : ((paramObject instanceof Zr) ? ZB((Zr)paramObject) : false));
  }
  
  protected boolean ZB(Zr paramZr) {
    return this.ZB.equals(paramZr.ZB);
  }
  
  public int hashCode() {
    return this.ZB.hashCode();
  }
  
  protected Zr Zr(String paramString, Zb paramZb) {
    this.ZB.put(paramString, paramZb);
    return this;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */