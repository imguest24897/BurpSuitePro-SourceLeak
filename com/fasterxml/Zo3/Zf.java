package com.fasterxml.Zo3;

import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zor.Zyw;
import com.fasterxml.Zp.Zd;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class Zf extends Zn implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final com.fasterxml.Zj.Zf<?> ZY;
  
  protected final ConcurrentHashMap<String, String> Za;
  
  protected final Map<String, Zk> Zm;
  
  protected final boolean Zb;
  
  private static final String c;
  
  protected Zf(com.fasterxml.Zj.Zf<?> paramZf, Zk paramZk, ConcurrentHashMap<String, String> paramConcurrentHashMap, HashMap<String, Zk> paramHashMap) {
    super(paramZk, paramZf.Zg());
    this.ZY = paramZf;
    this.Za = paramConcurrentHashMap;
    this.Zm = paramHashMap;
    this.Zb = paramZf.ZB(Zy9.ACCEPT_CASE_INSENSITIVE_VALUES);
  }
  
  public static Zf ZT(com.fasterxml.Zj.Zf<?> paramZf, Zk paramZk, Collection<Zd> paramCollection, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic Zs : ()[Ljava/lang/String;
    //   3: astore #5
    //   5: iload_3
    //   6: iload #4
    //   8: if_icmpne -> 23
    //   11: new java/lang/IllegalArgumentException
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: athrow
    //   19: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   22: athrow
    //   23: iload_3
    //   24: ifeq -> 44
    //   27: new java/util/concurrent/ConcurrentHashMap
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore #6
    //   36: aconst_null
    //   37: astore #7
    //   39: aload #5
    //   41: ifnull -> 63
    //   44: new java/util/HashMap
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: astore #7
    //   53: new java/util/concurrent/ConcurrentHashMap
    //   56: dup
    //   57: iconst_4
    //   58: invokespecial <init> : (I)V
    //   61: astore #6
    //   63: aload_0
    //   64: getstatic com/fasterxml/Zor/Zy9.ACCEPT_CASE_INSENSITIVE_VALUES : Lcom/fasterxml/Zor/Zy9;
    //   67: invokevirtual ZB : (Lcom/fasterxml/Zor/Zy9;)Z
    //   70: istore #8
    //   72: aload_2
    //   73: ifnull -> 256
    //   76: aload_2
    //   77: invokeinterface iterator : ()Ljava/util/Iterator;
    //   82: astore #9
    //   84: aload #9
    //   86: invokeinterface hasNext : ()Z
    //   91: ifeq -> 256
    //   94: aload #9
    //   96: invokeinterface next : ()Ljava/lang/Object;
    //   101: checkcast com/fasterxml/Zp/Zd
    //   104: astore #10
    //   106: aload #10
    //   108: invokevirtual Zm : ()Ljava/lang/Class;
    //   111: astore #11
    //   113: aload #10
    //   115: invokevirtual ZT : ()Z
    //   118: ifeq -> 133
    //   121: aload #10
    //   123: invokevirtual Zj : ()Ljava/lang/String;
    //   126: goto -> 138
    //   129: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   132: athrow
    //   133: aload #11
    //   135: invokestatic Zi : (Ljava/lang/Class;)Ljava/lang/String;
    //   138: astore #12
    //   140: iload_3
    //   141: ifeq -> 164
    //   144: aload #6
    //   146: aload #11
    //   148: invokevirtual getName : ()Ljava/lang/String;
    //   151: aload #12
    //   153: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   156: pop
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   163: athrow
    //   164: iload #4
    //   166: ifeq -> 251
    //   169: iload #8
    //   171: ifeq -> 188
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   180: athrow
    //   181: aload #12
    //   183: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   186: astore #12
    //   188: aload #7
    //   190: aload #12
    //   192: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   195: checkcast com/fasterxml/Zor/Zk
    //   198: astore #13
    //   200: aload #13
    //   202: ifnull -> 237
    //   205: aload #11
    //   207: aload #13
    //   209: invokevirtual Zf : ()Ljava/lang/Class;
    //   212: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   215: ifeq -> 237
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   224: athrow
    //   225: aload #5
    //   227: ifnull -> 84
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   236: athrow
    //   237: aload #7
    //   239: aload #12
    //   241: aload_0
    //   242: aload #11
    //   244: invokevirtual Zu : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   247: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   250: pop
    //   251: aload #5
    //   253: ifnull -> 84
    //   256: new com/fasterxml/Zo3/Zf
    //   259: dup
    //   260: aload_0
    //   261: aload_1
    //   262: aload #6
    //   264: aload #7
    //   266: invokespecial <init> : (Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zor/Zk;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/HashMap;)V
    //   269: areturn
    // Exception table:
    //   from	to	target	type
    //   5	19	19	java/lang/IllegalArgumentException
    //   113	129	129	java/lang/IllegalArgumentException
    //   140	157	160	java/lang/IllegalArgumentException
    //   164	174	177	java/lang/IllegalArgumentException
    //   200	218	221	java/lang/IllegalArgumentException
    //   205	230	233	java/lang/IllegalArgumentException
  }
  
  public String Zb(Object paramObject) {
    return ZS(paramObject.getClass());
  }
  
  protected String ZS(Class<?> paramClass) {
    try {
      if (paramClass == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str1 = paramClass.getName();
    String str2 = this.Za.get(str1);
    if (str2 == null) {
      Class<?> clazz = this.Zh.ZY(paramClass).Zf();
      if (this.ZY.Ze()) {
        Zyv zyv = this.ZY.Zv(clazz);
        str2 = this.ZY.ZK().ZL(zyv.Zo());
      } 
      if (str2 == null)
        str2 = Zi(clazz); 
      this.Za.put(str1, str2);
    } 
    return str2;
  }
  
  public String Zn(Object paramObject, Class<?> paramClass) {
    try {
      if (paramObject == null)
        return ZS(paramClass); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zb(paramObject);
  }
  
  public Zk Zn(Zyw paramZyw, String paramString) {
    return Zi(paramString);
  }
  
  protected Zk Zi(String paramString) {
    if (this.Zb)
      paramString = paramString.toLowerCase(); 
    return this.Zm.get(paramString);
  }
  
  public String ZK() {
    TreeSet treeSet = new TreeSet();
    String[] arrayOfString = Zo.Zs();
    for (Map.Entry<String, Zk> entry : this.Zm.entrySet()) {
      try {
        if (((Zk)entry.getValue()).Zp())
          treeSet.add(entry.getKey()); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (arrayOfString != null)
        break; 
    } 
    return treeSet.toString();
  }
  
  public String toString() {
    return String.format(c, new Object[] { getClass().getName(), this.Zm });
  }
  
  protected static String Zi(Class<?> paramClass) {
    String str = paramClass.getName();
    int i = Math.max(str.lastIndexOf('.'), str.lastIndexOf('$'));
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i < 0) ? str : str.substring(i + 1);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #49
    //   2: ldc 'yvIoY\\n'U;IGnF'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zo3/Zf.c : Ljava/lang/String;
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
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #19
    //   82: goto -> 110
    //   85: bipush #98
    //   87: goto -> 110
    //   90: bipush #11
    //   92: goto -> 110
    //   95: iconst_4
    //   96: goto -> 110
    //   99: bipush #126
    //   101: goto -> 110
    //   104: iconst_1
    //   105: goto -> 110
    //   108: bipush #95
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */