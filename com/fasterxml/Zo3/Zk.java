package com.fasterxml.Zo3;

import burp.Zbqc;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Zio;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Zd;
import com.fasterxml.Zp.Zq;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zk extends Zq implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected LinkedHashSet<Zd> ZT;
  
  private static final String a;
  
  public void Zt(Zd... paramVarArgs) {
    String[] arrayOfString = Zo.Zs();
    try {
      if (this.ZT == null)
        this.ZT = new LinkedHashSet<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zd[] arrayOfZd = paramVarArgs;
    int i = arrayOfZd.length;
    byte b = 0;
    while (b < i) {
      Zd zd = arrayOfZd[b];
      this.ZT.add(zd);
      b++;
      if (arrayOfString != null)
        break; 
    } 
  }
  
  public Collection<Zd> ZP(Zf<?> paramZf, Ziz paramZiz, com.fasterxml.Zor.Zk paramZk) {
    // Byte code:
    //   0: invokestatic Zs : ()[Ljava/lang/String;
    //   3: aload_1
    //   4: invokevirtual ZK : ()Lcom/fasterxml/Zor/Zt;
    //   7: astore #5
    //   9: astore #4
    //   11: aload_3
    //   12: ifnull -> 26
    //   15: aload_3
    //   16: invokevirtual Zf : ()Ljava/lang/Class;
    //   19: astore #6
    //   21: aload #4
    //   23: ifnull -> 63
    //   26: aload_2
    //   27: ifnull -> 48
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   36: athrow
    //   37: aload_2
    //   38: invokevirtual ZN : ()Ljava/lang/Class;
    //   41: astore #6
    //   43: aload #4
    //   45: ifnull -> 63
    //   48: new java/lang/IllegalArgumentException
    //   51: dup
    //   52: getstatic com/fasterxml/Zo3/Zk.a : Ljava/lang/String;
    //   55: invokespecial <init> : (Ljava/lang/String;)V
    //   58: athrow
    //   59: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   62: athrow
    //   63: new java/util/HashMap
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: astore #7
    //   72: aload_0
    //   73: getfield ZT : Ljava/util/LinkedHashSet;
    //   76: ifnull -> 152
    //   79: aload_0
    //   80: getfield ZT : Ljava/util/LinkedHashSet;
    //   83: invokevirtual iterator : ()Ljava/util/Iterator;
    //   86: astore #8
    //   88: aload #8
    //   90: invokeinterface hasNext : ()Z
    //   95: ifeq -> 152
    //   98: aload #8
    //   100: invokeinterface next : ()Ljava/lang/Object;
    //   105: checkcast com/fasterxml/Zp/Zd
    //   108: astore #9
    //   110: aload #6
    //   112: aload #9
    //   114: invokevirtual Zm : ()Ljava/lang/Class;
    //   117: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   120: ifeq -> 147
    //   123: aload_1
    //   124: aload #9
    //   126: invokevirtual Zm : ()Ljava/lang/Class;
    //   129: invokestatic ZX : (Lcom/fasterxml/Zj/Zf;Ljava/lang/Class;)Lcom/fasterxml/Zoz/Zia;
    //   132: astore #10
    //   134: aload_0
    //   135: aload #10
    //   137: aload #9
    //   139: aload_1
    //   140: aload #5
    //   142: aload #7
    //   144: invokevirtual ZD : (Lcom/fasterxml/Zoz/Zia;Lcom/fasterxml/Zp/Zd;Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zor/Zt;Ljava/util/HashMap;)V
    //   147: aload #4
    //   149: ifnull -> 88
    //   152: aload_2
    //   153: ifnull -> 229
    //   156: aload #5
    //   158: aload_2
    //   159: invokevirtual ZW : (Lcom/fasterxml/Zoz/Ziv;)Ljava/util/List;
    //   162: astore #8
    //   164: aload #8
    //   166: ifnull -> 229
    //   169: aload #8
    //   171: invokeinterface iterator : ()Ljava/util/Iterator;
    //   176: astore #9
    //   178: aload #9
    //   180: invokeinterface hasNext : ()Z
    //   185: ifeq -> 229
    //   188: aload #9
    //   190: invokeinterface next : ()Ljava/lang/Object;
    //   195: checkcast com/fasterxml/Zp/Zd
    //   198: astore #10
    //   200: aload_1
    //   201: aload #10
    //   203: invokevirtual Zm : ()Ljava/lang/Class;
    //   206: invokestatic ZX : (Lcom/fasterxml/Zj/Zf;Ljava/lang/Class;)Lcom/fasterxml/Zoz/Zia;
    //   209: astore #11
    //   211: aload_0
    //   212: aload #11
    //   214: aload #10
    //   216: aload_1
    //   217: aload #5
    //   219: aload #7
    //   221: invokevirtual ZD : (Lcom/fasterxml/Zoz/Zia;Lcom/fasterxml/Zp/Zd;Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zor/Zt;Ljava/util/HashMap;)V
    //   224: aload #4
    //   226: ifnull -> 178
    //   229: new com/fasterxml/Zp/Zd
    //   232: dup
    //   233: aload #6
    //   235: aconst_null
    //   236: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/String;)V
    //   239: astore #8
    //   241: aload_1
    //   242: aload #6
    //   244: invokestatic ZX : (Lcom/fasterxml/Zj/Zf;Ljava/lang/Class;)Lcom/fasterxml/Zoz/Zia;
    //   247: astore #9
    //   249: aload_0
    //   250: aload #9
    //   252: aload #8
    //   254: aload_1
    //   255: aload #5
    //   257: aload #7
    //   259: invokevirtual ZD : (Lcom/fasterxml/Zoz/Zia;Lcom/fasterxml/Zp/Zd;Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zor/Zt;Ljava/util/HashMap;)V
    //   262: new java/util/ArrayList
    //   265: dup
    //   266: aload #7
    //   268: invokevirtual values : ()Ljava/util/Collection;
    //   271: invokespecial <init> : (Ljava/util/Collection;)V
    //   274: invokestatic Zwu : ()[Lburp/Zbqc;
    //   277: ifnonnull -> 294
    //   280: iconst_5
    //   281: anewarray java/lang/String
    //   284: invokestatic ZH : ([Ljava/lang/String;)V
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   293: athrow
    //   294: areturn
    // Exception table:
    //   from	to	target	type
    //   21	30	33	java/lang/IllegalArgumentException
    //   43	59	59	java/lang/IllegalArgumentException
    //   249	287	290	java/lang/IllegalArgumentException
  }
  
  public Collection<Zd> ZJ(Zf<?> paramZf, Zia paramZia) {
    Zt zt = paramZf.ZK();
    String[] arrayOfString = Zo.Zs();
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (this.ZT != null) {
      Class clazz = paramZia.ZN();
      for (Zd zd1 : this.ZT) {
        if (clazz.isAssignableFrom(zd1.Zm())) {
          Zia zia = Zio.ZX(paramZf, zd1.Zm());
          ZD(zia, zd1, paramZf, zt, (HashMap)hashMap);
        } 
        if (arrayOfString != null)
          break; 
      } 
    } 
    Zd zd = new Zd(paramZia.ZN(), null);
    ZD(paramZia, zd, paramZf, zt, (HashMap)hashMap);
    return new ArrayList<>(hashMap.values());
  }
  
  public Collection<Zd> Zw(Zf<?> paramZf, Ziz paramZiz, com.fasterxml.Zor.Zk paramZk) {
    Zt zt = paramZf.ZK();
    String[] arrayOfString = Zo.Zs();
    Class<?> clazz = paramZk.Zf();
    LinkedHashSet<Class<?>> linkedHashSet = new LinkedHashSet();
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Zd zd = new Zd(clazz, null);
    Zia zia = Zio.ZX(paramZf, clazz);
    ZK(zia, zd, paramZf, linkedHashSet, (Map)linkedHashMap);
    if (paramZiz != null) {
      List list = zt.ZW((Ziv)paramZiz);
      if (list != null)
        for (Zd zd1 : list) {
          zia = Zio.ZX(paramZf, zd1.Zm());
          ZK(zia, zd1, paramZf, linkedHashSet, (Map)linkedHashMap);
          if (arrayOfString != null) {
            Zbqc.Zr(new Zbqc[4]);
            break;
          } 
        }  
    } 
    if (this.ZT != null)
      for (Zd zd1 : this.ZT) {
        if (clazz.isAssignableFrom(zd1.Zm())) {
          Zia zia1 = Zio.ZX(paramZf, zd1.Zm());
          ZK(zia1, zd1, paramZf, linkedHashSet, (Map)linkedHashMap);
        } 
        if (arrayOfString != null)
          break; 
      }  
    return Zf(clazz, linkedHashSet, (Map)linkedHashMap);
  }
  
  public Collection<Zd> Zx(Zf<?> paramZf, Zia paramZia) {
    Class<?> clazz = paramZia.ZN();
    String[] arrayOfString = Zo.Zs();
    LinkedHashSet<Class<?>> linkedHashSet = new LinkedHashSet();
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Zd zd = new Zd(clazz, null);
    ZK(paramZia, zd, paramZf, linkedHashSet, (Map)linkedHashMap);
    if (this.ZT != null)
      for (Zd zd1 : this.ZT) {
        if (clazz.isAssignableFrom(zd1.Zm())) {
          Zia zia = Zio.ZX(paramZf, zd1.Zm());
          ZK(zia, zd1, paramZf, linkedHashSet, (Map)linkedHashMap);
        } 
        if (arrayOfString != null)
          break; 
      }  
    return Zf(clazz, linkedHashSet, (Map)linkedHashMap);
  }
  
  protected void ZD(Zia paramZia, Zd paramZd, Zf<?> paramZf, Zt paramZt, HashMap<Zd, Zd> paramHashMap) {
    String[] arrayOfString = Zo.Zs();
    if (!paramZd.ZT()) {
      String str = paramZt.ZL(paramZia);
      if (str != null)
        paramZd = new Zd(paramZd.Zm(), str); 
    } 
    Zd zd = new Zd(paramZd.Zm());
    try {
      if (paramHashMap.containsKey(zd)) {
        if (paramZd.ZT()) {
          Zd zd1 = paramHashMap.get(zd);
          try {
            if (!zd1.ZT())
              paramHashMap.put(zd, paramZd); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramHashMap.put(zd, paramZd);
    List list = paramZt.ZW((Ziv)paramZia);
    try {
      if (list != null && !list.isEmpty())
        for (Zd zd1 : list) {
          Zia zia = Zio.ZX(paramZf, zd1.Zm());
          ZD(zia, zd1, paramZf, paramZt, paramHashMap);
          if (arrayOfString != null)
            break; 
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  protected void ZK(Zia paramZia, Zd paramZd, Zf<?> paramZf, Set<Class<?>> paramSet, Map<String, Zd> paramMap) {
    Zt zt = paramZf.ZK();
    String[] arrayOfString = Zo.Zs();
    if (!paramZd.ZT()) {
      String str = zt.ZL(paramZia);
      if (str != null)
        paramZd = new Zd(paramZd.Zm(), str); 
    } 
    try {
      if (paramZd.ZT())
        paramMap.put(paramZd.Zj(), paramZd); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (paramSet.add(paramZd.Zm())) {
      List list = zt.ZW((Ziv)paramZia);
      try {
        if (list != null && !list.isEmpty())
          for (Zd zd : list) {
            Zia zia = Zio.ZX(paramZf, zd.Zm());
            ZK(zia, zd, paramZf, paramSet, paramMap);
            if (arrayOfString != null)
              break; 
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  protected Collection<Zd> Zf(Class<?> paramClass, Set<Class<?>> paramSet, Map<String, Zd> paramMap) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_3
    //   5: invokeinterface values : ()Ljava/util/Collection;
    //   10: invokespecial <init> : (Ljava/util/Collection;)V
    //   13: astore #5
    //   15: invokestatic Zs : ()[Ljava/lang/String;
    //   18: aload_3
    //   19: invokeinterface values : ()Ljava/util/Collection;
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #6
    //   31: astore #4
    //   33: aload #6
    //   35: invokeinterface hasNext : ()Z
    //   40: ifeq -> 72
    //   43: aload #6
    //   45: invokeinterface next : ()Ljava/lang/Object;
    //   50: checkcast com/fasterxml/Zp/Zd
    //   53: astore #7
    //   55: aload_2
    //   56: aload #7
    //   58: invokevirtual Zm : ()Ljava/lang/Class;
    //   61: invokeinterface remove : (Ljava/lang/Object;)Z
    //   66: pop
    //   67: aload #4
    //   69: ifnull -> 33
    //   72: aload_2
    //   73: invokeinterface iterator : ()Ljava/util/Iterator;
    //   78: astore #6
    //   80: aload #6
    //   82: invokeinterface hasNext : ()Z
    //   87: ifeq -> 158
    //   90: aload #6
    //   92: invokeinterface next : ()Ljava/lang/Object;
    //   97: checkcast java/lang/Class
    //   100: astore #7
    //   102: aload #7
    //   104: aload_1
    //   105: if_acmpne -> 138
    //   108: aload #7
    //   110: invokevirtual getModifiers : ()I
    //   113: invokestatic isAbstract : (I)Z
    //   116: ifeq -> 138
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   125: athrow
    //   126: aload #4
    //   128: ifnull -> 80
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   137: athrow
    //   138: aload #5
    //   140: new com/fasterxml/Zp/Zd
    //   143: dup
    //   144: aload #7
    //   146: invokespecial <init> : (Ljava/lang/Class;)V
    //   149: invokevirtual add : (Ljava/lang/Object;)Z
    //   152: pop
    //   153: aload #4
    //   155: ifnull -> 80
    //   158: aload #5
    //   160: areturn
    // Exception table:
    //   from	to	target	type
    //   102	119	122	java/lang/IllegalArgumentException
    //   108	131	134	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #86
    //   2: ldc 'ii7aMkDv&{bSJh')z N&7p~SJt&)nGu'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zo3/Zk.a : Ljava/lang/String;
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
    //   80: bipush #125
    //   82: goto -> 112
    //   85: bipush #80
    //   87: goto -> 112
    //   90: bipush #21
    //   92: goto -> 112
    //   95: bipush #95
    //   97: goto -> 112
    //   100: bipush #59
    //   102: goto -> 112
    //   105: bipush #77
    //   107: goto -> 112
    //   110: bipush #37
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */