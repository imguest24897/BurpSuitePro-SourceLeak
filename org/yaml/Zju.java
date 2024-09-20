package org.yaml;

import burp.Zbqc;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class Zju implements Zjl {
  private static final Pattern ZT;
  
  public static final Map<Character, String> Ze;
  
  public static final Map<Character, Integer> ZE;
  
  private final Zlx Zy;
  
  private boolean Zo = false;
  
  private int ZF;
  
  private final List<Z_8> Zd;
  
  private Z_8 ZN;
  
  private int ZV;
  
  private int Zj;
  
  private final Zq<Integer> ZK;
  
  private final boolean ZU;
  
  private final Ztw Zl;
  
  private boolean Zu;
  
  private final Map<Integer, Zl0> Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zju(Zlx paramZlx, Ztw paramZtw) {
    int i = Z_s.ZB();
    try {
      this.ZF = 0;
      this.ZV = 0;
      this.Zj = -1;
      this.Zu = true;
      if (paramZtw == null)
        throw new NullPointerException(a(-26645, 25142)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.ZU = paramZtw.ZM();
      this.Zy = paramZlx;
      this.Zd = new ArrayList<>(100);
      this.ZK = new Zq<>(10);
      this.Zh = new LinkedHashMap<>();
      this.Zl = paramZtw;
      Zk();
      if (i == 0)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public boolean ZC(Ztt... paramVarArgs) {
    int i = Z_s.ZB();
    while (ZF()) {
      ZJ();
      if (i == 0)
        break; 
    } 
    try {
      if (!this.Zd.isEmpty()) {
        try {
          if (paramVarArgs.length == 0)
            return true; 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        Ztt ztt = ((Z_8)this.Zd.get(0)).ZI();
        byte b = 0;
        while (b < paramVarArgs.length) {
          try {
            if (ztt == paramVarArgs[b])
              return true; 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          b++;
          if (i == 0)
            break; 
        } 
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public Z_8 ZG() {
    int i = Z_s.ZB();
    while (ZF()) {
      ZJ();
      if (i == 0)
        break; 
    } 
    return this.Zd.get(0);
  }
  
  public Z_8 Zs() {
    this.ZV++;
    return this.Zd.remove(0);
  }
  
  private void Zm(Z_8 paramZ_8) {
    this.ZN = paramZ_8;
    this.Zd.add(paramZ_8);
  }
  
  private void Zj(int paramInt, Z_8 paramZ_8) {
    try {
      if (paramInt == this.Zd.size())
        this.ZN = paramZ_8; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zd.add(paramInt, paramZ_8);
  }
  
  private void ZF(List<Z_8> paramList) {
    this.ZN = paramList.get(paramList.size() - 1);
    this.Zd.addAll(paramList);
  }
  
  private boolean ZF() {
    try {
      if (this.Zo)
        return false; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (this.Zd.isEmpty())
        return true; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      Zi();
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (ZP() == this.ZV);
  }
  
  private void ZJ() {
    try {
      if (this.Zy.Zg() > this.Zl.Ze())
        throw new Zj3(a(-26642, 738) + this.Zl.Ze() + a(-26654, 3317)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    ZS();
    Zi();
    ZH(this.Zy.ZO());
    int i = this.Zy.Zr();
    try {
      switch (i) {
        case 0:
          ZW();
          return;
        case 37:
          try {
            if (ZL()) {
              Zv();
              return;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          break;
        case 45:
          try {
            if (ZK()) {
              ZZ();
              return;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          try {
            if (ZX()) {
              Zh();
              return;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          break;
        case 46:
          try {
            if (ZR()) {
              ZU();
              return;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          break;
        case 91:
          ZD();
          return;
        case 123:
          ZM();
          return;
        case 93:
          Zp();
          return;
        case 125:
          Zf();
          return;
        case 44:
          Zu();
          return;
        case 63:
          try {
            if (Zd()) {
              ZQ();
              return;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          break;
        case 58:
          try {
            if (ZV()) {
              ZC();
              return;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          break;
        case 42:
          Zt();
          return;
        case 38:
          Zr();
          return;
        case 33:
          Zo();
          return;
        case 124:
          try {
            if (this.ZF == 0) {
              ZB();
              return;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          break;
        case 62:
          try {
            if (this.ZF == 0) {
              Zc();
              return;
            } 
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          break;
        case 39:
          Zy();
          return;
        case 34:
          ZO();
          return;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (Za()) {
        ZY();
        return;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    String str1 = Zx(String.valueOf(Character.toChars(i)));
    if (i == 9)
      str1 = str1 + a(-26671, 15525); 
    String str2 = String.format(a(-26658, -9026), new Object[] { str1, str1 });
    throw new Zl1(a(-26682, -15940), null, str2, this.Zy.ZA());
  }
  
  private String Zx(String paramString) {
    Iterator<Character> iterator = Ze.keySet().iterator();
    int i = Z_s.ZB();
    while (iterator.hasNext()) {
      Character character = iterator.next();
      String str = Ze.get(character);
      try {
        if (str.equals(paramString))
          return "\\" + character; 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      if (i == 0)
        break; 
    } 
    return paramString;
  }
  
  private int ZP() {
    try {
      if (!this.Zh.isEmpty())
        return ((Zl0)this.Zh.values().iterator().next()).ZT(); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return -1;
  }
  
  private void Zi() {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : Ljava/util/Map;
    //   8: invokeinterface isEmpty : ()Z
    //   13: ifne -> 154
    //   16: aload_0
    //   17: getfield Zh : Ljava/util/Map;
    //   20: invokeinterface values : ()Ljava/util/Collection;
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore_2
    //   31: aload_2
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 154
    //   40: aload_2
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast org/yaml/Zl0
    //   49: astore_3
    //   50: aload_3
    //   51: invokevirtual Zi : ()I
    //   54: aload_0
    //   55: getfield Zy : Lorg/yaml/Zlx;
    //   58: invokevirtual ZG : ()I
    //   61: if_icmpne -> 89
    //   64: aload_0
    //   65: getfield Zy : Lorg/yaml/Zlx;
    //   68: invokevirtual ZY : ()I
    //   71: aload_3
    //   72: invokevirtual ZQ : ()I
    //   75: isub
    //   76: sipush #1024
    //   79: if_icmple -> 150
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload_3
    //   90: invokevirtual ZY : ()Z
    //   93: ifeq -> 144
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: new org/yaml/Zl1
    //   106: dup
    //   107: sipush #-26751
    //   110: sipush #25263
    //   113: invokestatic a : (II)Ljava/lang/String;
    //   116: aload_3
    //   117: invokevirtual ZZ : ()Lorg/yaml/Zt1;
    //   120: sipush #-26655
    //   123: sipush #-5236
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: aload_0
    //   130: getfield Zy : Lorg/yaml/Zlx;
    //   133: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   136: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   139: athrow
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: aload_2
    //   145: invokeinterface remove : ()V
    //   150: iload_1
    //   151: ifne -> 31
    //   154: return
    // Exception table:
    //   from	to	target	type
    //   50	82	85	java/lang/NullPointerException
    //   64	96	99	java/lang/NullPointerException
    //   89	140	140	java/lang/NullPointerException
  }
  
  private void Zm() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : I
    //   4: ifne -> 36
    //   7: aload_0
    //   8: getfield Zj : I
    //   11: aload_0
    //   12: getfield Zy : Lorg/yaml/Zlx;
    //   15: invokevirtual ZO : ()I
    //   18: if_icmpne -> 36
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   27: athrow
    //   28: iconst_1
    //   29: goto -> 37
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: iconst_0
    //   37: istore_1
    //   38: aload_0
    //   39: getfield Zu : Z
    //   42: ifne -> 80
    //   45: iload_1
    //   46: ifne -> 63
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: goto -> 80
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: new org/yaml/Zj3
    //   66: dup
    //   67: sipush #-26739
    //   70: sipush #-19992
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: invokespecial <init> : (Ljava/lang/String;)V
    //   79: athrow
    //   80: aload_0
    //   81: getfield Zu : Z
    //   84: ifeq -> 162
    //   87: aload_0
    //   88: invokespecial Zg : ()V
    //   91: aload_0
    //   92: getfield ZV : I
    //   95: aload_0
    //   96: getfield Zd : Ljava/util/List;
    //   99: invokeinterface size : ()I
    //   104: iadd
    //   105: istore_2
    //   106: new org/yaml/Zl0
    //   109: dup
    //   110: iload_2
    //   111: iload_1
    //   112: aload_0
    //   113: getfield Zy : Lorg/yaml/Zlx;
    //   116: invokevirtual ZY : ()I
    //   119: aload_0
    //   120: getfield Zy : Lorg/yaml/Zlx;
    //   123: invokevirtual ZG : ()I
    //   126: aload_0
    //   127: getfield Zy : Lorg/yaml/Zlx;
    //   130: invokevirtual ZO : ()I
    //   133: aload_0
    //   134: getfield Zy : Lorg/yaml/Zlx;
    //   137: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   140: invokespecial <init> : (IZIIILorg/yaml/Zt1;)V
    //   143: astore_3
    //   144: aload_0
    //   145: getfield Zh : Ljava/util/Map;
    //   148: aload_0
    //   149: getfield ZF : I
    //   152: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   155: aload_3
    //   156: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: return
    // Exception table:
    //   from	to	target	type
    //   0	21	24	java/lang/NullPointerException
    //   7	32	32	java/lang/NullPointerException
    //   38	49	52	java/lang/NullPointerException
    //   45	59	59	java/lang/NullPointerException
  }
  
  private void Zg() {
    Zl0 zl0 = this.Zh.remove(Integer.valueOf(this.ZF));
    try {
      if (zl0 != null)
        try {
          if (zl0.ZY())
            throw new Zl1(a(-26722, -14598), zl0.ZZ(), a(-26670, 25376), this.Zy.ZA()); 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  private void ZH(int paramInt) {
    int i = Z_s.Zp();
    try {
      if (this.ZF != 0)
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    while (this.Zj > paramInt) {
      Zt1 zt1 = this.Zy.ZA();
      this.Zj = ((Integer)this.ZK.ZE()).intValue();
      Zm(new Z_m(zt1, zt1));
      if (i != 0)
        break; 
    } 
  }
  
  private boolean ZN(int paramInt) {
    try {
      if (this.Zj < paramInt) {
        this.ZK.Zq(Integer.valueOf(this.Zj));
        this.Zj = paramInt;
        return true;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  private void Zk() {
    Zt1 zt1 = this.Zy.ZA();
    Zgc zgc = new Zgc(zt1, zt1);
    Zm(zgc);
  }
  
  private void ZW() {
    ZH(-1);
    Zg();
    this.Zu = false;
    this.Zh.clear();
    Zt1 zt1 = this.Zy.ZA();
    Zgx zgx = new Zgx(zt1, zt1);
    Zm(zgx);
    this.Zo = true;
  }
  
  private void Zv() {
    ZH(-1);
    Zg();
    this.Zu = false;
    List<Z_8> list = ZH();
    ZF(list);
  }
  
  private void ZZ() {
    ZO(true);
  }
  
  private void ZU() {
    ZO(false);
  }
  
  private void ZO(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: aload_0
    //   4: iconst_m1
    //   5: invokespecial ZH : (I)V
    //   8: aload_0
    //   9: invokespecial Zg : ()V
    //   12: aload_0
    //   13: iconst_0
    //   14: putfield Zu : Z
    //   17: istore_2
    //   18: aload_0
    //   19: getfield Zy : Lorg/yaml/Zlx;
    //   22: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   25: astore_3
    //   26: aload_0
    //   27: getfield Zy : Lorg/yaml/Zlx;
    //   30: iconst_3
    //   31: invokevirtual Zj : (I)V
    //   34: aload_0
    //   35: getfield Zy : Lorg/yaml/Zlx;
    //   38: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   41: astore #4
    //   43: iload_1
    //   44: ifeq -> 63
    //   47: new org/yaml/Zgz
    //   50: dup
    //   51: aload_3
    //   52: aload #4
    //   54: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   57: astore #5
    //   59: iload_2
    //   60: ifne -> 75
    //   63: new org/yaml/Zgf
    //   66: dup
    //   67: aload_3
    //   68: aload #4
    //   70: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   73: astore #5
    //   75: aload_0
    //   76: aload #5
    //   78: invokespecial Zm : (Lorg/yaml/Z_8;)V
    //   81: return
  }
  
  private void ZD() {
    Zq(false);
  }
  
  private void ZM() {
    Zq(true);
  }
  
  private void Zq(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: aload_0
    //   4: invokespecial Zm : ()V
    //   7: istore_2
    //   8: aload_0
    //   9: dup
    //   10: getfield ZF : I
    //   13: iconst_1
    //   14: iadd
    //   15: putfield ZF : I
    //   18: aload_0
    //   19: iconst_1
    //   20: putfield Zu : Z
    //   23: aload_0
    //   24: getfield Zy : Lorg/yaml/Zlx;
    //   27: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   30: astore_3
    //   31: aload_0
    //   32: getfield Zy : Lorg/yaml/Zlx;
    //   35: iconst_1
    //   36: invokevirtual Zj : (I)V
    //   39: aload_0
    //   40: getfield Zy : Lorg/yaml/Zlx;
    //   43: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   46: astore #4
    //   48: iload_1
    //   49: ifeq -> 68
    //   52: new org/yaml/Zgq
    //   55: dup
    //   56: aload_3
    //   57: aload #4
    //   59: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   62: astore #5
    //   64: iload_2
    //   65: ifeq -> 80
    //   68: new org/yaml/Zg9
    //   71: dup
    //   72: aload_3
    //   73: aload #4
    //   75: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   78: astore #5
    //   80: aload_0
    //   81: aload #5
    //   83: invokespecial Zm : (Lorg/yaml/Z_8;)V
    //   86: return
  }
  
  private void Zp() {
    ZW(false);
  }
  
  private void Zf() {
    ZW(true);
  }
  
  private void ZW(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: aload_0
    //   4: invokespecial Zg : ()V
    //   7: istore_2
    //   8: aload_0
    //   9: dup
    //   10: getfield ZF : I
    //   13: iconst_1
    //   14: isub
    //   15: putfield ZF : I
    //   18: aload_0
    //   19: iconst_0
    //   20: putfield Zu : Z
    //   23: aload_0
    //   24: getfield Zy : Lorg/yaml/Zlx;
    //   27: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   30: astore_3
    //   31: aload_0
    //   32: getfield Zy : Lorg/yaml/Zlx;
    //   35: invokevirtual ZK : ()V
    //   38: aload_0
    //   39: getfield Zy : Lorg/yaml/Zlx;
    //   42: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   45: astore #4
    //   47: iload_1
    //   48: ifeq -> 67
    //   51: new org/yaml/Zgs
    //   54: dup
    //   55: aload_3
    //   56: aload #4
    //   58: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   61: astore #5
    //   63: iload_2
    //   64: ifne -> 79
    //   67: new org/yaml/Zgl
    //   70: dup
    //   71: aload_3
    //   72: aload #4
    //   74: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   77: astore #5
    //   79: aload_0
    //   80: aload #5
    //   82: invokespecial Zm : (Lorg/yaml/Z_8;)V
    //   85: return
  }
  
  private void Zu() {
    this.Zu = true;
    Zg();
    Zt1 zt11 = this.Zy.ZA();
    this.Zy.ZK();
    Zt1 zt12 = this.Zy.ZA();
    Zg1 zg1 = new Zg1(zt11, zt12);
    Zm(zg1);
  }
  
  private void Zh() {
    try {
      if (this.ZF == 0) {
        try {
          if (!this.Zu)
            throw new Zl1(null, null, a(-26653, 15093), this.Zy.ZA()); 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        if (ZN(this.Zy.ZO())) {
          Zt1 zt1 = this.Zy.ZA();
          Zm(new Z_4(zt1, zt1));
        } 
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zu = true;
    Zg();
    Zt1 zt11 = this.Zy.ZA();
    this.Zy.ZK();
    Zt1 zt12 = this.Zy.ZA();
    Z_3 z_3 = new Z_3(zt11, zt12);
    Zm(z_3);
  }
  
  private void ZQ() {
    try {
      if (this.ZF == 0) {
        try {
          if (!this.Zu)
            throw new Zl1(null, null, a(-26674, 25064), this.Zy.ZA()); 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        if (ZN(this.Zy.ZO())) {
          Zt1 zt1 = this.Zy.ZA();
          Zm(new Z_a(zt1, zt1));
        } 
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zu = (this.ZF == 0);
    Zg();
    Zt1 zt11 = this.Zy.ZA();
    this.Zy.ZK();
    Zt1 zt12 = this.Zy.ZA();
    Zgo zgo = new Zgo(zt11, zt12);
    Zm(zgo);
  }
  
  private void ZC() {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: aload_0
    //   4: getfield Zh : Ljava/util/Map;
    //   7: aload_0
    //   8: getfield ZF : I
    //   11: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   19: checkcast org/yaml/Zl0
    //   22: astore_2
    //   23: istore_1
    //   24: aload_2
    //   25: ifnull -> 132
    //   28: aload_0
    //   29: aload_2
    //   30: invokevirtual ZT : ()I
    //   33: aload_0
    //   34: getfield ZV : I
    //   37: isub
    //   38: new org/yaml/Zgo
    //   41: dup
    //   42: aload_2
    //   43: invokevirtual ZZ : ()Lorg/yaml/Zt1;
    //   46: aload_2
    //   47: invokevirtual ZZ : ()Lorg/yaml/Zt1;
    //   50: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   53: invokespecial Zj : (ILorg/yaml/Z_8;)V
    //   56: aload_0
    //   57: getfield ZF : I
    //   60: ifne -> 123
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: aload_0
    //   71: aload_2
    //   72: invokevirtual ZE : ()I
    //   75: invokespecial ZN : (I)Z
    //   78: ifeq -> 123
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: aload_0
    //   89: aload_2
    //   90: invokevirtual ZT : ()I
    //   93: aload_0
    //   94: getfield ZV : I
    //   97: isub
    //   98: new org/yaml/Z_a
    //   101: dup
    //   102: aload_2
    //   103: invokevirtual ZZ : ()Lorg/yaml/Zt1;
    //   106: aload_2
    //   107: invokevirtual ZZ : ()Lorg/yaml/Zt1;
    //   110: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   113: invokespecial Zj : (ILorg/yaml/Z_8;)V
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: aload_0
    //   124: iconst_0
    //   125: putfield Zu : Z
    //   128: iload_1
    //   129: ifeq -> 263
    //   132: aload_0
    //   133: getfield ZF : I
    //   136: ifne -> 190
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   145: athrow
    //   146: aload_0
    //   147: getfield Zu : Z
    //   150: ifne -> 190
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   159: athrow
    //   160: new org/yaml/Zl1
    //   163: dup
    //   164: aconst_null
    //   165: aconst_null
    //   166: sipush #-26742
    //   169: sipush #-31710
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: aload_0
    //   176: getfield Zy : Lorg/yaml/Zlx;
    //   179: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   182: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   185: athrow
    //   186: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   189: athrow
    //   190: aload_0
    //   191: getfield ZF : I
    //   194: ifne -> 239
    //   197: aload_0
    //   198: aload_0
    //   199: getfield Zy : Lorg/yaml/Zlx;
    //   202: invokevirtual ZO : ()I
    //   205: invokespecial ZN : (I)Z
    //   208: ifeq -> 239
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: aload_0
    //   219: getfield Zy : Lorg/yaml/Zlx;
    //   222: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   225: astore_3
    //   226: aload_0
    //   227: new org/yaml/Z_a
    //   230: dup
    //   231: aload_3
    //   232: aload_3
    //   233: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   236: invokespecial Zm : (Lorg/yaml/Z_8;)V
    //   239: aload_0
    //   240: aload_0
    //   241: getfield ZF : I
    //   244: ifne -> 255
    //   247: iconst_1
    //   248: goto -> 256
    //   251: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   254: athrow
    //   255: iconst_0
    //   256: putfield Zu : Z
    //   259: aload_0
    //   260: invokespecial Zg : ()V
    //   263: aload_0
    //   264: getfield Zy : Lorg/yaml/Zlx;
    //   267: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   270: astore_3
    //   271: aload_0
    //   272: getfield Zy : Lorg/yaml/Zlx;
    //   275: invokevirtual ZK : ()V
    //   278: aload_0
    //   279: getfield Zy : Lorg/yaml/Zlx;
    //   282: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   285: astore #4
    //   287: new org/yaml/Zgn
    //   290: dup
    //   291: aload_3
    //   292: aload #4
    //   294: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   297: astore #5
    //   299: aload_0
    //   300: aload #5
    //   302: invokespecial Zm : (Lorg/yaml/Z_8;)V
    //   305: return
    // Exception table:
    //   from	to	target	type
    //   24	63	66	java/lang/NullPointerException
    //   28	81	84	java/lang/NullPointerException
    //   70	116	119	java/lang/NullPointerException
    //   123	139	142	java/lang/NullPointerException
    //   132	153	156	java/lang/NullPointerException
    //   146	186	186	java/lang/NullPointerException
    //   190	211	214	java/lang/NullPointerException
    //   239	251	251	java/lang/NullPointerException
  }
  
  private void Zt() {
    Zm();
    this.Zu = false;
    Z_8 z_8 = Zx(false);
    Zm(z_8);
  }
  
  private void Zr() {
    Zm();
    this.Zu = false;
    Z_8 z_8 = Zx(true);
    Zm(z_8);
  }
  
  private void Zo() {
    Zm();
    this.Zu = false;
    Z_8 z_8 = Zz();
    Zm(z_8);
  }
  
  private void ZB() {
    ZM('|');
  }
  
  private void Zc() {
    ZM('>');
  }
  
  private void ZM(char paramChar) {
    this.Zu = true;
    Zg();
    List<Z_8> list = Zi(paramChar);
    ZF(list);
  }
  
  private void Zy() {
    ZJ('\'');
  }
  
  private void ZO() {
    ZJ('"');
  }
  
  private void ZJ(char paramChar) {
    Zm();
    this.Zu = false;
    Z_8 z_8 = Zj(paramChar);
    Zm(z_8);
  }
  
  private void ZY() {
    Zm();
    this.Zu = false;
    Z_8 z_8 = Z_();
    Zm(z_8);
  }
  
  private boolean ZL() {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (this.Zy.ZO() == 0);
  }
  
  private boolean ZK() {
    try {
      if (this.Zy.ZO() == 0) {
        try {
          if (a(-26673, -21828).equals(this.Zy.Zl(3)))
            try {
              if (Z_s.Zp.Zj(this.Zy.Zt(3)));
            } catch (NullPointerException nullPointerException) {
              throw a(null);
            }  
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean ZR() {
    try {
      if (this.Zy.ZO() == 0) {
        try {
          if (a(-26638, 15443).equals(this.Zy.Zl(3)))
            try {
              if (Z_s.Zp.Zj(this.Zy.Zt(3)));
            } catch (NullPointerException nullPointerException) {
              throw a(null);
            }  
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean ZX() {
    return Z_s.Zp.Zj(this.Zy.Zt(1));
  }
  
  private boolean Zd() {
    try {
      if (this.ZF != 0)
        return true; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Z_s.Zp.Zj(this.Zy.Zt(1));
  }
  
  private boolean ZV() {
    try {
      if (this.ZF != 0)
        return true; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Z_s.Zp.Zj(this.Zy.Zt(1));
  }
  
  private boolean Za() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zy : Lorg/yaml/Zlx;
    //   4: invokevirtual Zr : ()I
    //   7: istore_1
    //   8: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   11: iload_1
    //   12: sipush #-26643
    //   15: sipush #27316
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: invokevirtual Zc : (ILjava/lang/String;)Z
    //   24: ifne -> 102
    //   27: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   30: aload_0
    //   31: getfield Zy : Lorg/yaml/Zlx;
    //   34: iconst_1
    //   35: invokevirtual Zt : (I)I
    //   38: invokevirtual ZS : (I)Z
    //   41: ifeq -> 110
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: iload_1
    //   52: bipush #45
    //   54: if_icmpeq -> 102
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   63: athrow
    //   64: aload_0
    //   65: getfield ZF : I
    //   68: ifne -> 110
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: sipush #-26648
    //   81: sipush #-12480
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: iload_1
    //   88: invokevirtual indexOf : (I)I
    //   91: iconst_m1
    //   92: if_icmpeq -> 110
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: iconst_1
    //   103: goto -> 111
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: iconst_0
    //   111: ireturn
    // Exception table:
    //   from	to	target	type
    //   8	44	47	java/lang/NullPointerException
    //   27	57	60	java/lang/NullPointerException
    //   51	71	74	java/lang/NullPointerException
    //   64	95	98	java/lang/NullPointerException
    //   78	106	106	java/lang/NullPointerException
  }
  
  private void ZS() {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zy : Lorg/yaml/Zlx;
    //   8: invokevirtual ZY : ()I
    //   11: ifne -> 47
    //   14: aload_0
    //   15: getfield Zy : Lorg/yaml/Zlx;
    //   18: invokevirtual Zr : ()I
    //   21: ldc 65279
    //   23: if_icmpne -> 47
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: aload_0
    //   34: getfield Zy : Lorg/yaml/Zlx;
    //   37: invokevirtual ZK : ()V
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: iconst_0
    //   48: istore_2
    //   49: iconst_m1
    //   50: istore_3
    //   51: iload_2
    //   52: ifne -> 364
    //   55: aload_0
    //   56: getfield Zy : Lorg/yaml/Zlx;
    //   59: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   62: astore #4
    //   64: aload_0
    //   65: getfield Zy : Lorg/yaml/Zlx;
    //   68: invokevirtual ZO : ()I
    //   71: istore #5
    //   73: iconst_0
    //   74: istore #6
    //   76: iconst_0
    //   77: istore #7
    //   79: aload_0
    //   80: getfield Zy : Lorg/yaml/Zlx;
    //   83: iload #7
    //   85: invokevirtual Zt : (I)I
    //   88: bipush #32
    //   90: if_icmpne -> 100
    //   93: iinc #7, 1
    //   96: iload_1
    //   97: ifne -> 79
    //   100: iload #7
    //   102: ifle -> 121
    //   105: aload_0
    //   106: getfield Zy : Lorg/yaml/Zlx;
    //   109: iload #7
    //   111: invokevirtual Zj : (I)V
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   120: athrow
    //   121: aload_0
    //   122: getfield Zy : Lorg/yaml/Zlx;
    //   125: invokevirtual Zr : ()I
    //   128: bipush #35
    //   130: if_icmpne -> 254
    //   133: iconst_1
    //   134: istore #6
    //   136: iload #5
    //   138: ifeq -> 192
    //   141: aload_0
    //   142: getfield ZN : Lorg/yaml/Z_8;
    //   145: ifnull -> 175
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: aload_0
    //   156: getfield ZN : Lorg/yaml/Z_8;
    //   159: invokevirtual ZI : ()Lorg/yaml/Ztt;
    //   162: getstatic org/yaml/Ztt.BlockEntry : Lorg/yaml/Ztt;
    //   165: if_acmpeq -> 192
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   174: athrow
    //   175: getstatic org/yaml/Zto.IN_LINE : Lorg/yaml/Zto;
    //   178: astore #8
    //   180: aload_0
    //   181: getfield Zy : Lorg/yaml/Zlx;
    //   184: invokevirtual ZO : ()I
    //   187: istore_3
    //   188: iload_1
    //   189: ifne -> 226
    //   192: iload_3
    //   193: aload_0
    //   194: getfield Zy : Lorg/yaml/Zlx;
    //   197: invokevirtual ZO : ()I
    //   200: if_icmpne -> 219
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   209: athrow
    //   210: getstatic org/yaml/Zto.IN_LINE : Lorg/yaml/Zto;
    //   213: astore #8
    //   215: iload_1
    //   216: ifne -> 226
    //   219: iconst_m1
    //   220: istore_3
    //   221: getstatic org/yaml/Zto.BLOCK : Lorg/yaml/Zto;
    //   224: astore #8
    //   226: aload_0
    //   227: aload #8
    //   229: invokespecial ZZ : (Lorg/yaml/Zto;)Lorg/yaml/Zg6;
    //   232: astore #9
    //   234: aload_0
    //   235: getfield ZU : Z
    //   238: ifeq -> 254
    //   241: aload_0
    //   242: aload #9
    //   244: invokespecial Zm : (Lorg/yaml/Z_8;)V
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   253: athrow
    //   254: aload_0
    //   255: invokespecial ZT : ()Ljava/lang/String;
    //   258: astore #8
    //   260: aload #8
    //   262: invokevirtual length : ()I
    //   265: ifeq -> 358
    //   268: aload_0
    //   269: getfield ZU : Z
    //   272: ifeq -> 335
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   281: athrow
    //   282: iload #6
    //   284: ifne -> 335
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   293: athrow
    //   294: iload #5
    //   296: ifne -> 335
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   305: athrow
    //   306: aload_0
    //   307: getfield Zy : Lorg/yaml/Zlx;
    //   310: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   313: astore #9
    //   315: aload_0
    //   316: new org/yaml/Zg6
    //   319: dup
    //   320: getstatic org/yaml/Zto.BLANK_LINE : Lorg/yaml/Zto;
    //   323: aload #8
    //   325: aload #4
    //   327: aload #9
    //   329: invokespecial <init> : (Lorg/yaml/Zto;Ljava/lang/String;Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   332: invokespecial Zm : (Lorg/yaml/Z_8;)V
    //   335: aload_0
    //   336: getfield ZF : I
    //   339: ifne -> 360
    //   342: aload_0
    //   343: iconst_1
    //   344: putfield Zu : Z
    //   347: iload_1
    //   348: ifne -> 360
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   357: athrow
    //   358: iconst_1
    //   359: istore_2
    //   360: iload_1
    //   361: ifne -> 51
    //   364: return
    // Exception table:
    //   from	to	target	type
    //   4	26	29	java/lang/NullPointerException
    //   14	40	43	java/lang/NullPointerException
    //   100	114	117	java/lang/NullPointerException
    //   136	148	151	java/lang/NullPointerException
    //   141	168	171	java/lang/NullPointerException
    //   188	203	206	java/lang/NullPointerException
    //   234	247	250	java/lang/NullPointerException
    //   260	275	278	java/lang/NullPointerException
    //   268	287	290	java/lang/NullPointerException
    //   282	299	302	java/lang/NullPointerException
    //   335	351	354	java/lang/NullPointerException
  }
  
  private Zg6 ZZ(Zto paramZto) {
    Zt1 zt11 = this.Zy.ZA();
    this.Zy.ZK();
    byte b = 0;
    int i = Z_s.ZB();
    while (Z_s.ZL.ZS(this.Zy.Zt(b))) {
      b++;
      if (i == 0)
        break; 
    } 
    String str = this.Zy.Zr(b);
    Zt1 zt12 = this.Zy.ZA();
    return new Zg6(paramZto, str, zt11, zt12);
  }
  
  private List<Z_8> ZH() {
    Zt1 zt12;
    Zt1 zt11 = this.Zy.ZA();
    this.Zy.ZK();
    String str = ZH(zt11);
    List<Integer> list = null;
    int i = Z_s.Zp();
    if (a(-26651, 25482).equals(str)) {
      list = Zl(zt11);
      zt12 = this.Zy.ZA();
    } else if (a(-26668, 30201).equals(str)) {
      list = (List)ZR(zt11);
      zt12 = this.Zy.ZA();
    } else {
      zt12 = this.Zy.ZA();
      byte b = 0;
      while (Z_s.ZL.ZS(this.Zy.Zt(b))) {
        b++;
        if (i != 0)
          break; 
      } 
      try {
        if (b > 0)
          this.Zy.Zj(b); 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
    } 
    Zg6 zg6 = ZE(zt11);
    Zgh<Integer> zgh = new Zgh<>(str, list, zt11, zt12);
    return Zf(new Z_8[] { zgh, zg6 });
  }
  
  private String ZH(Zt1 paramZt1) {
    byte b = 0;
    int i = Z_s.Zp();
    int j = this.Zy.Zt(b);
    while (Z_s.Zb.Zj(j)) {
      j = this.Zy.Zt(++b);
      if (i != 0)
        break; 
    } 
    if (b == 0) {
      String str1 = String.valueOf(Character.toChars(j));
      throw new Zl1(a(-26628, 22582), paramZt1, a(-26664, 16802) + str1 + "(" + j + ")", this.Zy.ZA());
    } 
    String str = this.Zy.Zr(b);
    j = this.Zy.Zr();
    if (Z_s.Zr.ZS(j)) {
      String str1 = String.valueOf(Character.toChars(j));
      throw new Zl1(a(-26628, 22582), paramZt1, a(-26666, -26605) + str1 + "(" + j + ")", this.Zy.ZA());
    } 
    return str;
  }
  
  private List<Integer> Zl(Zt1 paramZt1) {
    int i = Z_s.Zp();
    while (this.Zy.Zr() == 32) {
      this.Zy.ZK();
      if (i != 0)
        break; 
    } 
    Integer integer1 = Zt(paramZt1);
    int j = this.Zy.Zr();
    if (j != 46) {
      String str = String.valueOf(Character.toChars(j));
      throw new Zl1(a(-26628, 22582), paramZt1, a(-26641, 9243) + str + "(" + j + ")", this.Zy.ZA());
    } 
    this.Zy.ZK();
    Integer integer2 = Zt(paramZt1);
    j = this.Zy.Zr();
    if (Z_s.Zr.ZS(j)) {
      String str = String.valueOf(Character.toChars(j));
      throw new Zl1(a(-26628, 22582), paramZt1, a(-26632, -8332) + str + "(" + j + ")", this.Zy.ZA());
    } 
    ArrayList<Integer> arrayList = new ArrayList(2);
    arrayList.add(integer1);
    arrayList.add(integer2);
    return arrayList;
  }
  
  private Integer Zt(Zt1 paramZt1) {
    int j = this.Zy.Zr();
    int i = Z_s.Zp();
    if (!Character.isDigit(j)) {
      String str1 = String.valueOf(Character.toChars(j));
      throw new Zl1(a(-26627, -8655), paramZt1, a(-26744, -13014) + str1 + "(" + j + ")", this.Zy.ZA());
    } 
    byte b = 0;
    while (Character.isDigit(this.Zy.Zt(b))) {
      b++;
      if (i != 0)
        break; 
    } 
    String str = this.Zy.Zr(b);
    try {
      if (b > 3)
        throw new Zl1(a(-26737, 5893), paramZt1, a(-26675, -31819) + str, this.Zy.ZA()); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Integer.valueOf(Integer.parseInt(str));
  }
  
  private List<String> ZR(Zt1 paramZt1) {
    int i = Z_s.Zp();
    while (this.Zy.Zr() == 32) {
      this.Zy.ZK();
      if (i != 0)
        break; 
    } 
    String str1 = Z_(paramZt1);
    while (this.Zy.Zr() == 32) {
      this.Zy.ZK();
      if (i != 0)
        break; 
    } 
    String str2 = ZQ(paramZt1);
    ArrayList<String> arrayList = new ArrayList(2);
    arrayList.add(str1);
    arrayList.add(str2);
    return arrayList;
  }
  
  private String Z_(Zt1 paramZt1) {
    String str = ZO(a(-26631, 21618), paramZt1);
    int i = this.Zy.Zr();
    if (i != 32) {
      String str1 = String.valueOf(Character.toChars(i));
      throw new Zl1(a(-26628, 22582), paramZt1, a(-26646, -32739) + str1 + "(" + i + ")", this.Zy.ZA());
    } 
    return str;
  }
  
  private String ZQ(Zt1 paramZt1) {
    String str = Zk(a(-26747, 11770), paramZt1);
    int i = this.Zy.Zr();
    if (Z_s.Zr.ZS(i)) {
      String str1 = String.valueOf(Character.toChars(i));
      throw new Zl1(a(-26628, 22582), paramZt1, a(-26636, 72) + str1 + "(" + i + ")", this.Zy.ZA());
    } 
    return str;
  }
  
  private Zg6 ZE(Zt1 paramZt1) {
    int i = Z_s.Zp();
    while (this.Zy.Zr() == 32) {
      this.Zy.ZK();
      if (i != 0)
        break; 
    } 
    Zg6 zg6 = null;
    if (this.Zy.Zr() == 35) {
      Zg6 zg61 = ZZ(Zto.IN_LINE);
      if (this.ZU)
        zg6 = zg61; 
    } 
    int j = this.Zy.Zr();
    String str = ZT();
    try {
      if (str.length() == 0 && j != 0) {
        String str1 = String.valueOf(Character.toChars(j));
        throw new Zl1(a(-26628, 22582), paramZt1, a(-26634, 6338) + str1 + "(" + j + ")", this.Zy.ZA());
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return zg6;
  }
  
  private Z_8 Zx(boolean paramBoolean) {
    Zt1 zt11 = this.Zy.ZA();
    int i = Z_s.Zp();
    int j = this.Zy.Zr();
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    String str1 = (j == 42) ? a(-26684, 30140) : a(-26663, 21158);
    this.Zy.ZK();
    byte b = 0;
    int k = this.Zy.Zt(b);
    while (Z_s.Zp.Zc(k, a(-26650, 12358))) {
      k = this.Zy.Zt(++b);
      if (i != 0)
        break; 
    } 
    if (b == 0) {
      String str = String.valueOf(Character.toChars(k));
      throw new Zl1(a(-26721, 18044) + str1, zt11, a(-26652, -31479) + str + "(" + k + ")", this.Zy.ZA());
    } 
    String str2 = this.Zy.Zr(b);
    k = this.Zy.Zr();
    if (Z_s.Zp.Zc(k, a(-26685, -16244))) {
      String str = String.valueOf(Character.toChars(k));
      throw new Zl1(a(-26680, 7613) + str1, zt11, a(-26637, 21951) + str + "(" + k + ")", this.Zy.ZA());
    } 
    Zt1 zt12 = this.Zy.ZA();
    if (paramBoolean) {
      Z__ z__ = new Z__(str2, zt11, zt12);
      return (Z_8)((i != 0) ? new Z_g(str2, zt11, zt12) : z__);
    } 
    return new Z_g(str2, zt11, zt12);
  }
  
  private Z_8 Zz() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zy : Lorg/yaml/Zlx;
    //   4: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   7: astore_2
    //   8: invokestatic Zp : ()I
    //   11: aload_0
    //   12: getfield Zy : Lorg/yaml/Zlx;
    //   15: iconst_1
    //   16: invokevirtual Zt : (I)I
    //   19: istore_3
    //   20: istore_1
    //   21: aconst_null
    //   22: astore #4
    //   24: aconst_null
    //   25: astore #5
    //   27: iload_3
    //   28: bipush #60
    //   30: if_icmpne -> 163
    //   33: aload_0
    //   34: getfield Zy : Lorg/yaml/Zlx;
    //   37: iconst_2
    //   38: invokevirtual Zj : (I)V
    //   41: aload_0
    //   42: sipush #-26657
    //   45: sipush #11641
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: aload_2
    //   52: invokespecial Zk : (Ljava/lang/String;Lorg/yaml/Zt1;)Ljava/lang/String;
    //   55: astore #5
    //   57: aload_0
    //   58: getfield Zy : Lorg/yaml/Zlx;
    //   61: invokevirtual Zr : ()I
    //   64: istore_3
    //   65: iload_3
    //   66: bipush #62
    //   68: if_icmpeq -> 153
    //   71: iload_3
    //   72: invokestatic toChars : (I)[C
    //   75: invokestatic valueOf : ([C)Ljava/lang/String;
    //   78: astore #6
    //   80: new org/yaml/Zl1
    //   83: dup
    //   84: sipush #-26743
    //   87: sipush #13429
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: aload_2
    //   94: new java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial <init> : ()V
    //   101: sipush #-26669
    //   104: sipush #15585
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: aload #6
    //   115: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: sipush #-26740
    //   121: sipush #-12738
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: iload_3
    //   131: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   134: ldc ')'
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual toString : ()Ljava/lang/String;
    //   142: aload_0
    //   143: getfield Zy : Lorg/yaml/Zlx;
    //   146: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   149: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   152: athrow
    //   153: aload_0
    //   154: getfield Zy : Lorg/yaml/Zlx;
    //   157: invokevirtual ZK : ()V
    //   160: goto -> 284
    //   163: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   166: iload_3
    //   167: invokevirtual Zj : (I)Z
    //   170: ifeq -> 187
    //   173: ldc '!'
    //   175: astore #5
    //   177: aload_0
    //   178: getfield Zy : Lorg/yaml/Zlx;
    //   181: invokevirtual ZK : ()V
    //   184: goto -> 284
    //   187: iconst_1
    //   188: istore #6
    //   190: iconst_0
    //   191: istore #7
    //   193: getstatic org/yaml/Z_s.Zr : Lorg/yaml/Z_s;
    //   196: iload_3
    //   197: invokevirtual ZS : (I)Z
    //   200: ifeq -> 233
    //   203: iload_3
    //   204: bipush #33
    //   206: if_icmpne -> 216
    //   209: iconst_1
    //   210: istore #7
    //   212: iload_1
    //   213: ifeq -> 233
    //   216: iinc #6, 1
    //   219: aload_0
    //   220: getfield Zy : Lorg/yaml/Zlx;
    //   223: iload #6
    //   225: invokevirtual Zt : (I)I
    //   228: istore_3
    //   229: iload_1
    //   230: ifeq -> 193
    //   233: iload #7
    //   235: ifeq -> 257
    //   238: aload_0
    //   239: sipush #-26661
    //   242: sipush #14817
    //   245: invokestatic a : (II)Ljava/lang/String;
    //   248: aload_2
    //   249: invokespecial ZO : (Ljava/lang/String;Lorg/yaml/Zt1;)Ljava/lang/String;
    //   252: astore #4
    //   254: goto -> 268
    //   257: ldc '!'
    //   259: astore #4
    //   261: aload_0
    //   262: getfield Zy : Lorg/yaml/Zlx;
    //   265: invokevirtual ZK : ()V
    //   268: aload_0
    //   269: sipush #-26661
    //   272: sipush #14817
    //   275: invokestatic a : (II)Ljava/lang/String;
    //   278: aload_2
    //   279: invokespecial Zk : (Ljava/lang/String;Lorg/yaml/Zt1;)Ljava/lang/String;
    //   282: astore #5
    //   284: aload_0
    //   285: getfield Zy : Lorg/yaml/Zlx;
    //   288: invokevirtual Zr : ()I
    //   291: istore_3
    //   292: getstatic org/yaml/Z_s.Zr : Lorg/yaml/Z_s;
    //   295: iload_3
    //   296: invokevirtual ZS : (I)Z
    //   299: ifeq -> 384
    //   302: iload_3
    //   303: invokestatic toChars : (I)[C
    //   306: invokestatic valueOf : ([C)Ljava/lang/String;
    //   309: astore #6
    //   311: new org/yaml/Zl1
    //   314: dup
    //   315: sipush #-26745
    //   318: sipush #28933
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: aload_2
    //   325: new java/lang/StringBuilder
    //   328: dup
    //   329: invokespecial <init> : ()V
    //   332: sipush #-26724
    //   335: sipush #15604
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: aload #6
    //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: sipush #-26683
    //   352: sipush #3580
    //   355: invokestatic a : (II)Ljava/lang/String;
    //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: iload_3
    //   362: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   365: ldc ')'
    //   367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: invokevirtual toString : ()Ljava/lang/String;
    //   373: aload_0
    //   374: getfield Zy : Lorg/yaml/Zlx;
    //   377: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   380: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   383: athrow
    //   384: new org/yaml/Ztj
    //   387: dup
    //   388: aload #4
    //   390: aload #5
    //   392: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   395: astore #6
    //   397: aload_0
    //   398: getfield Zy : Lorg/yaml/Zlx;
    //   401: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   404: astore #7
    //   406: new org/yaml/Zg0
    //   409: dup
    //   410: aload #6
    //   412: aload_2
    //   413: aload #7
    //   415: invokespecial <init> : (Lorg/yaml/Ztj;Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   418: areturn
  }
  
  private List<Z_8> Zi(char paramChar) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: bipush #62
    //   7: if_icmpne -> 18
    //   10: iconst_1
    //   11: goto -> 19
    //   14: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   17: athrow
    //   18: iconst_0
    //   19: istore_3
    //   20: new java/lang/StringBuilder
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #4
    //   29: aload_0
    //   30: getfield Zy : Lorg/yaml/Zlx;
    //   33: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   36: astore #5
    //   38: aload_0
    //   39: getfield Zy : Lorg/yaml/Zlx;
    //   42: invokevirtual ZK : ()V
    //   45: aload_0
    //   46: aload #5
    //   48: invokespecial Zf : (Lorg/yaml/Zt1;)Lorg/yaml/Z_5;
    //   51: astore #6
    //   53: aload #6
    //   55: invokevirtual ZA : ()I
    //   58: istore #7
    //   60: aload_0
    //   61: aload #5
    //   63: invokespecial Zu : (Lorg/yaml/Zt1;)Lorg/yaml/Zg6;
    //   66: astore #8
    //   68: aload_0
    //   69: getfield Zj : I
    //   72: iconst_1
    //   73: iadd
    //   74: istore #9
    //   76: iload #9
    //   78: iconst_1
    //   79: if_icmpge -> 85
    //   82: iconst_1
    //   83: istore #9
    //   85: iload #7
    //   87: iconst_m1
    //   88: if_icmpne -> 140
    //   91: aload_0
    //   92: invokespecial Zj : ()[Ljava/lang/Object;
    //   95: astore #14
    //   97: aload #14
    //   99: iconst_0
    //   100: aaload
    //   101: checkcast java/lang/String
    //   104: astore #10
    //   106: aload #14
    //   108: iconst_1
    //   109: aaload
    //   110: checkcast java/lang/Integer
    //   113: invokevirtual intValue : ()I
    //   116: istore #11
    //   118: aload #14
    //   120: iconst_2
    //   121: aaload
    //   122: checkcast org/yaml/Zt1
    //   125: astore #13
    //   127: iload #9
    //   129: iload #11
    //   131: invokestatic max : (II)I
    //   134: istore #12
    //   136: iload_2
    //   137: ifeq -> 175
    //   140: iload #9
    //   142: iload #7
    //   144: iadd
    //   145: iconst_1
    //   146: isub
    //   147: istore #12
    //   149: aload_0
    //   150: iload #12
    //   152: invokespecial ZE : (I)[Ljava/lang/Object;
    //   155: astore #14
    //   157: aload #14
    //   159: iconst_0
    //   160: aaload
    //   161: checkcast java/lang/String
    //   164: astore #10
    //   166: aload #14
    //   168: iconst_1
    //   169: aaload
    //   170: checkcast org/yaml/Zt1
    //   173: astore #13
    //   175: ldc ''
    //   177: astore #14
    //   179: aload_0
    //   180: getfield Zy : Lorg/yaml/Zlx;
    //   183: invokevirtual ZO : ()I
    //   186: iload #12
    //   188: if_icmpne -> 477
    //   191: aload_0
    //   192: getfield Zy : Lorg/yaml/Zlx;
    //   195: invokevirtual Zr : ()I
    //   198: ifeq -> 477
    //   201: aload #4
    //   203: aload #10
    //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: sipush #-26741
    //   212: sipush #6843
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: aload_0
    //   219: getfield Zy : Lorg/yaml/Zlx;
    //   222: invokevirtual Zr : ()I
    //   225: invokevirtual indexOf : (I)I
    //   228: iconst_m1
    //   229: if_icmpne -> 247
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: iconst_1
    //   240: goto -> 248
    //   243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   246: athrow
    //   247: iconst_0
    //   248: istore #15
    //   250: iconst_0
    //   251: istore #16
    //   253: getstatic org/yaml/Z_s.ZL : Lorg/yaml/Z_s;
    //   256: aload_0
    //   257: getfield Zy : Lorg/yaml/Zlx;
    //   260: iload #16
    //   262: invokevirtual Zt : (I)I
    //   265: invokevirtual ZS : (I)Z
    //   268: ifeq -> 278
    //   271: iinc #16, 1
    //   274: iload_2
    //   275: ifeq -> 253
    //   278: aload #4
    //   280: aload_0
    //   281: getfield Zy : Lorg/yaml/Zlx;
    //   284: iload #16
    //   286: invokevirtual Zr : (I)Ljava/lang/String;
    //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload_0
    //   294: invokespecial ZT : ()Ljava/lang/String;
    //   297: astore #14
    //   299: aload_0
    //   300: iload #12
    //   302: invokespecial ZE : (I)[Ljava/lang/Object;
    //   305: astore #17
    //   307: aload #17
    //   309: iconst_0
    //   310: aaload
    //   311: checkcast java/lang/String
    //   314: astore #10
    //   316: aload #17
    //   318: iconst_1
    //   319: aaload
    //   320: checkcast org/yaml/Zt1
    //   323: astore #13
    //   325: aload_0
    //   326: getfield Zy : Lorg/yaml/Zlx;
    //   329: invokevirtual ZO : ()I
    //   332: iload #12
    //   334: if_icmpne -> 477
    //   337: aload_0
    //   338: getfield Zy : Lorg/yaml/Zlx;
    //   341: invokevirtual Zr : ()I
    //   344: ifeq -> 477
    //   347: goto -> 354
    //   350: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   353: athrow
    //   354: iload_3
    //   355: ifeq -> 458
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   364: athrow
    //   365: ldc '\\n'
    //   367: aload #14
    //   369: invokevirtual equals : (Ljava/lang/Object;)Z
    //   372: ifeq -> 458
    //   375: goto -> 382
    //   378: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   381: athrow
    //   382: iload #15
    //   384: ifeq -> 458
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   393: athrow
    //   394: sipush #-26741
    //   397: sipush #6843
    //   400: invokestatic a : (II)Ljava/lang/String;
    //   403: aload_0
    //   404: getfield Zy : Lorg/yaml/Zlx;
    //   407: invokevirtual Zr : ()I
    //   410: invokevirtual indexOf : (I)I
    //   413: iconst_m1
    //   414: if_icmpne -> 458
    //   417: goto -> 424
    //   420: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   423: athrow
    //   424: aload #10
    //   426: invokevirtual length : ()I
    //   429: ifne -> 473
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   438: athrow
    //   439: aload #4
    //   441: ldc ' '
    //   443: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: pop
    //   447: iload_2
    //   448: ifeq -> 473
    //   451: goto -> 458
    //   454: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   457: athrow
    //   458: aload #4
    //   460: aload #14
    //   462: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: pop
    //   466: goto -> 473
    //   469: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   472: athrow
    //   473: iload_2
    //   474: ifeq -> 179
    //   477: aload #6
    //   479: invokevirtual Zl : ()Z
    //   482: ifeq -> 500
    //   485: aload #4
    //   487: aload #14
    //   489: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: pop
    //   493: goto -> 500
    //   496: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   499: athrow
    //   500: aload #6
    //   502: invokevirtual Zi : ()Z
    //   505: ifeq -> 523
    //   508: aload #4
    //   510: aload #10
    //   512: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: pop
    //   516: goto -> 523
    //   519: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   522: athrow
    //   523: new org/yaml/Zgt
    //   526: dup
    //   527: aload #4
    //   529: invokevirtual toString : ()Ljava/lang/String;
    //   532: iconst_0
    //   533: aload #5
    //   535: aload #13
    //   537: iload_1
    //   538: invokestatic valueOf : (C)Ljava/lang/Character;
    //   541: invokestatic ZD : (Ljava/lang/Character;)Lorg/yaml/Zjm;
    //   544: invokespecial <init> : (Ljava/lang/String;ZLorg/yaml/Zt1;Lorg/yaml/Zt1;Lorg/yaml/Zjm;)V
    //   547: astore #15
    //   549: aload_0
    //   550: iconst_2
    //   551: anewarray org/yaml/Z_8
    //   554: dup
    //   555: iconst_0
    //   556: aload #8
    //   558: aastore
    //   559: dup
    //   560: iconst_1
    //   561: aload #15
    //   563: aastore
    //   564: invokespecial Zf : ([Lorg/yaml/Z_8;)Ljava/util/List;
    //   567: areturn
    // Exception table:
    //   from	to	target	type
    //   4	14	14	java/lang/NullPointerException
    //   191	232	235	java/lang/NullPointerException
    //   201	243	243	java/lang/NullPointerException
    //   325	347	350	java/lang/NullPointerException
    //   337	358	361	java/lang/NullPointerException
    //   354	375	378	java/lang/NullPointerException
    //   365	387	390	java/lang/NullPointerException
    //   382	417	420	java/lang/NullPointerException
    //   394	432	435	java/lang/NullPointerException
    //   424	451	454	java/lang/NullPointerException
    //   439	466	469	java/lang/NullPointerException
    //   477	493	496	java/lang/NullPointerException
    //   500	516	519	java/lang/NullPointerException
  }
  
  private Z_5 Zf(Zt1 paramZt1) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_m1
    //   3: istore_3
    //   4: aload_0
    //   5: getfield Zy : Lorg/yaml/Zlx;
    //   8: invokevirtual Zr : ()I
    //   11: istore #4
    //   13: iload #4
    //   15: bipush #45
    //   17: if_icmpeq -> 34
    //   20: iload #4
    //   22: bipush #43
    //   24: if_icmpne -> 151
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   33: athrow
    //   34: iload #4
    //   36: bipush #43
    //   38: if_icmpne -> 55
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   51: astore_2
    //   52: goto -> 59
    //   55: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   58: astore_2
    //   59: aload_0
    //   60: getfield Zy : Lorg/yaml/Zlx;
    //   63: invokevirtual ZK : ()V
    //   66: aload_0
    //   67: getfield Zy : Lorg/yaml/Zlx;
    //   70: invokevirtual Zr : ()I
    //   73: istore #4
    //   75: iload #4
    //   77: invokestatic isDigit : (I)Z
    //   80: ifeq -> 286
    //   83: iload #4
    //   85: invokestatic toChars : (I)[C
    //   88: invokestatic valueOf : ([C)Ljava/lang/String;
    //   91: astore #5
    //   93: aload #5
    //   95: invokestatic parseInt : (Ljava/lang/String;)I
    //   98: istore_3
    //   99: iload_3
    //   100: ifne -> 141
    //   103: new org/yaml/Zl1
    //   106: dup
    //   107: sipush #-26639
    //   110: sipush #-4164
    //   113: invokestatic a : (II)Ljava/lang/String;
    //   116: aload_1
    //   117: sipush #-26746
    //   120: sipush #23342
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: aload_0
    //   127: getfield Zy : Lorg/yaml/Zlx;
    //   130: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   133: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   136: athrow
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: aload_0
    //   142: getfield Zy : Lorg/yaml/Zlx;
    //   145: invokevirtual ZK : ()V
    //   148: goto -> 286
    //   151: iload #4
    //   153: invokestatic isDigit : (I)Z
    //   156: ifeq -> 286
    //   159: iload #4
    //   161: invokestatic toChars : (I)[C
    //   164: invokestatic valueOf : ([C)Ljava/lang/String;
    //   167: astore #5
    //   169: aload #5
    //   171: invokestatic parseInt : (Ljava/lang/String;)I
    //   174: istore_3
    //   175: iload_3
    //   176: ifne -> 217
    //   179: new org/yaml/Zl1
    //   182: dup
    //   183: sipush #-26639
    //   186: sipush #-4164
    //   189: invokestatic a : (II)Ljava/lang/String;
    //   192: aload_1
    //   193: sipush #-26656
    //   196: sipush #21402
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: aload_0
    //   203: getfield Zy : Lorg/yaml/Zlx;
    //   206: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   209: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   212: athrow
    //   213: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   216: athrow
    //   217: aload_0
    //   218: getfield Zy : Lorg/yaml/Zlx;
    //   221: invokevirtual ZK : ()V
    //   224: aload_0
    //   225: getfield Zy : Lorg/yaml/Zlx;
    //   228: invokevirtual Zr : ()I
    //   231: istore #4
    //   233: iload #4
    //   235: bipush #45
    //   237: if_icmpeq -> 254
    //   240: iload #4
    //   242: bipush #43
    //   244: if_icmpne -> 286
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   253: athrow
    //   254: iload #4
    //   256: bipush #43
    //   258: if_icmpne -> 275
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   267: athrow
    //   268: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   271: astore_2
    //   272: goto -> 279
    //   275: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   278: astore_2
    //   279: aload_0
    //   280: getfield Zy : Lorg/yaml/Zlx;
    //   283: invokevirtual ZK : ()V
    //   286: aload_0
    //   287: getfield Zy : Lorg/yaml/Zlx;
    //   290: invokevirtual Zr : ()I
    //   293: istore #4
    //   295: getstatic org/yaml/Z_s.Zr : Lorg/yaml/Z_s;
    //   298: iload #4
    //   300: invokevirtual ZS : (I)Z
    //   303: ifeq -> 383
    //   306: iload #4
    //   308: invokestatic toChars : (I)[C
    //   311: invokestatic valueOf : ([C)Ljava/lang/String;
    //   314: astore #5
    //   316: new org/yaml/Zl1
    //   319: dup
    //   320: sipush #-26639
    //   323: sipush #-4164
    //   326: invokestatic a : (II)Ljava/lang/String;
    //   329: aload_1
    //   330: new java/lang/StringBuilder
    //   333: dup
    //   334: invokespecial <init> : ()V
    //   337: sipush #-26633
    //   340: sipush #-30183
    //   343: invokestatic a : (II)Ljava/lang/String;
    //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: aload #5
    //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: ldc '('
    //   356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: iload #4
    //   361: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   364: ldc ')'
    //   366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: invokevirtual toString : ()Ljava/lang/String;
    //   372: aload_0
    //   373: getfield Zy : Lorg/yaml/Zlx;
    //   376: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   379: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   382: athrow
    //   383: new org/yaml/Z_5
    //   386: dup
    //   387: aload_2
    //   388: iload_3
    //   389: invokespecial <init> : (Ljava/lang/Boolean;I)V
    //   392: areturn
    // Exception table:
    //   from	to	target	type
    //   13	27	30	java/lang/NullPointerException
    //   20	41	44	java/lang/NullPointerException
    //   99	137	137	java/lang/NullPointerException
    //   175	213	213	java/lang/NullPointerException
    //   233	247	250	java/lang/NullPointerException
    //   240	261	264	java/lang/NullPointerException
  }
  
  private Zg6 Zu(Zt1 paramZt1) {
    int i = Z_s.ZB();
    while (this.Zy.Zr() == 32) {
      this.Zy.ZK();
      if (i == 0)
        break; 
    } 
    Zg6 zg6 = null;
    if (this.Zy.Zr() == 35)
      zg6 = ZZ(Zto.IN_LINE); 
    int j = this.Zy.Zr();
    String str = ZT();
    try {
      if (str.length() == 0 && j != 0) {
        String str1 = String.valueOf(Character.toChars(j));
        throw new Zl1(a(-26640, 672), paramZt1, a(-26667, -5306) + str1 + "(" + j + ")", this.Zy.ZA());
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return zg6;
  }
  
  private Object[] Zj() {
    StringBuilder stringBuilder = new StringBuilder();
    int j = 0;
    int i = Z_s.ZB();
    Zt1 zt1 = this.Zy.ZA();
    while (true) {
      while (true)
        break; 
      if (this.Zy.ZO() > j) {
        j = this.Zy.ZO();
        if (i == 0)
          break; 
      } 
    } 
    return new Object[] { stringBuilder.toString(), Integer.valueOf(j), zt1 };
  }
  
  private Object[] ZE(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    Zt1 zt1 = this.Zy.ZA();
    int i = Z_s.Zp();
    int j = this.Zy.ZO();
    while (j < paramInt) {
      try {
        if (this.Zy.Zr() == 32) {
          this.Zy.ZK();
          j++;
          if (i != 0)
            break; 
        } 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
    } 
    String str = null;
    while ((str = ZT()).length() != 0) {
      stringBuilder.append(str);
      zt1 = this.Zy.ZA();
      j = this.Zy.ZO();
      label18: while (j < paramInt && this.Zy.Zr() == 32) {
        this.Zy.ZK();
        j++;
        if (i != 0)
          break label18; 
      } 
    } 
    return new Object[] { stringBuilder.toString(), zt1 };
  }
  
  private Z_8 Zj(char paramChar) {
    int i = Z_s.ZB();
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    boolean bool = (paramChar == '"') ? true : false;
    StringBuilder stringBuilder = new StringBuilder();
    Zt1 zt11 = this.Zy.ZA();
    int j = this.Zy.Zr();
    this.Zy.ZK();
    stringBuilder.append(ZQ(bool, zt11));
    while (this.Zy.Zr() != j) {
      stringBuilder.append(Zd(zt11));
      stringBuilder.append(ZQ(bool, zt11));
      if (i == 0)
        break; 
    } 
    this.Zy.ZK();
    Zt1 zt12 = this.Zy.ZA();
    return new Zgt(stringBuilder.toString(), false, zt11, zt12, Zjm.ZD(Character.valueOf(paramChar)));
  }
  
  private String ZQ(boolean paramBoolean, Zt1 paramZt1) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #4
    //   12: istore_3
    //   13: iconst_0
    //   14: istore #5
    //   16: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   19: aload_0
    //   20: getfield Zy : Lorg/yaml/Zlx;
    //   23: iload #5
    //   25: invokevirtual Zt : (I)I
    //   28: sipush #-26676
    //   31: sipush #1816
    //   34: invokestatic a : (II)Ljava/lang/String;
    //   37: invokevirtual Zc : (ILjava/lang/String;)Z
    //   40: ifeq -> 50
    //   43: iinc #5, 1
    //   46: iload_3
    //   47: ifeq -> 16
    //   50: iload #5
    //   52: ifeq -> 77
    //   55: aload #4
    //   57: aload_0
    //   58: getfield Zy : Lorg/yaml/Zlx;
    //   61: iload #5
    //   63: invokevirtual Zr : (I)Ljava/lang/String;
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: aload_0
    //   78: getfield Zy : Lorg/yaml/Zlx;
    //   81: invokevirtual Zr : ()I
    //   84: istore #6
    //   86: iload_1
    //   87: ifne -> 151
    //   90: iload #6
    //   92: bipush #39
    //   94: if_icmpne -> 151
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: aload_0
    //   105: getfield Zy : Lorg/yaml/Zlx;
    //   108: iconst_1
    //   109: invokevirtual Zt : (I)I
    //   112: bipush #39
    //   114: if_icmpne -> 151
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: aload #4
    //   126: ldc '''
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: aload_0
    //   133: getfield Zy : Lorg/yaml/Zlx;
    //   136: iconst_2
    //   137: invokevirtual Zj : (I)V
    //   140: iload_3
    //   141: ifeq -> 741
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   150: athrow
    //   151: iload_1
    //   152: ifeq -> 176
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   161: athrow
    //   162: iload #6
    //   164: bipush #39
    //   166: if_icmpeq -> 212
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: iload_1
    //   177: ifne -> 238
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   186: athrow
    //   187: sipush #-26644
    //   190: sipush #-940
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: iload #6
    //   198: invokevirtual indexOf : (I)I
    //   201: iconst_m1
    //   202: if_icmpeq -> 238
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload #4
    //   214: iload #6
    //   216: invokevirtual appendCodePoint : (I)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload_0
    //   221: getfield Zy : Lorg/yaml/Zlx;
    //   224: invokevirtual ZK : ()V
    //   227: iload_3
    //   228: ifeq -> 741
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   237: athrow
    //   238: iload_1
    //   239: ifeq -> 735
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   248: athrow
    //   249: iload #6
    //   251: bipush #92
    //   253: if_icmpne -> 735
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   262: athrow
    //   263: aload_0
    //   264: getfield Zy : Lorg/yaml/Zlx;
    //   267: invokevirtual ZK : ()V
    //   270: aload_0
    //   271: getfield Zy : Lorg/yaml/Zlx;
    //   274: invokevirtual Zr : ()I
    //   277: istore #6
    //   279: iload #6
    //   281: invokestatic isSupplementaryCodePoint : (I)Z
    //   284: ifne -> 352
    //   287: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   290: iload #6
    //   292: i2c
    //   293: invokestatic valueOf : (C)Ljava/lang/Character;
    //   296: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   301: ifeq -> 352
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   310: athrow
    //   311: aload #4
    //   313: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   316: iload #6
    //   318: i2c
    //   319: invokestatic valueOf : (C)Ljava/lang/Character;
    //   322: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   327: checkcast java/lang/String
    //   330: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: pop
    //   334: aload_0
    //   335: getfield Zy : Lorg/yaml/Zlx;
    //   338: invokevirtual ZK : ()V
    //   341: iload_3
    //   342: ifeq -> 741
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   351: athrow
    //   352: iload #6
    //   354: invokestatic isSupplementaryCodePoint : (I)Z
    //   357: ifne -> 619
    //   360: goto -> 367
    //   363: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   366: athrow
    //   367: getstatic org/yaml/Zju.ZE : Ljava/util/Map;
    //   370: iload #6
    //   372: i2c
    //   373: invokestatic valueOf : (C)Ljava/lang/Character;
    //   376: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   381: ifeq -> 619
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   390: athrow
    //   391: getstatic org/yaml/Zju.ZE : Ljava/util/Map;
    //   394: iload #6
    //   396: i2c
    //   397: invokestatic valueOf : (C)Ljava/lang/Character;
    //   400: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   405: checkcast java/lang/Integer
    //   408: invokevirtual intValue : ()I
    //   411: istore #5
    //   413: aload_0
    //   414: getfield Zy : Lorg/yaml/Zlx;
    //   417: invokevirtual ZK : ()V
    //   420: aload_0
    //   421: getfield Zy : Lorg/yaml/Zlx;
    //   424: iload #5
    //   426: invokevirtual Zl : (I)Ljava/lang/String;
    //   429: astore #7
    //   431: getstatic org/yaml/Zju.ZT : Ljava/util/regex/Pattern;
    //   434: aload #7
    //   436: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   439: invokevirtual find : ()Z
    //   442: ifeq -> 518
    //   445: new org/yaml/Zl1
    //   448: dup
    //   449: sipush #-26687
    //   452: sipush #-20198
    //   455: invokestatic a : (II)Ljava/lang/String;
    //   458: aload_2
    //   459: new java/lang/StringBuilder
    //   462: dup
    //   463: invokespecial <init> : ()V
    //   466: sipush #-26678
    //   469: sipush #9071
    //   472: invokestatic a : (II)Ljava/lang/String;
    //   475: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: iload #5
    //   480: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   483: sipush #-26660
    //   486: sipush #-1492
    //   489: invokestatic a : (II)Ljava/lang/String;
    //   492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: aload #7
    //   497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: invokevirtual toString : ()Ljava/lang/String;
    //   503: aload_0
    //   504: getfield Zy : Lorg/yaml/Zlx;
    //   507: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   510: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   513: athrow
    //   514: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   517: athrow
    //   518: aload #7
    //   520: bipush #16
    //   522: invokestatic parseInt : (Ljava/lang/String;I)I
    //   525: istore #8
    //   527: new java/lang/String
    //   530: dup
    //   531: iload #8
    //   533: invokestatic toChars : (I)[C
    //   536: invokespecial <init> : ([C)V
    //   539: astore #9
    //   541: aload #4
    //   543: aload #9
    //   545: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   548: pop
    //   549: aload_0
    //   550: getfield Zy : Lorg/yaml/Zlx;
    //   553: iload #5
    //   555: invokevirtual Zj : (I)V
    //   558: goto -> 615
    //   561: astore #9
    //   563: new org/yaml/Zl1
    //   566: dup
    //   567: sipush #-26629
    //   570: sipush #-23410
    //   573: invokestatic a : (II)Ljava/lang/String;
    //   576: aload_2
    //   577: new java/lang/StringBuilder
    //   580: dup
    //   581: invokespecial <init> : ()V
    //   584: sipush #-26749
    //   587: sipush #23299
    //   590: invokestatic a : (II)Ljava/lang/String;
    //   593: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   596: aload #7
    //   598: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   601: invokevirtual toString : ()Ljava/lang/String;
    //   604: aload_0
    //   605: getfield Zy : Lorg/yaml/Zlx;
    //   608: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   611: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   614: athrow
    //   615: iload_3
    //   616: ifeq -> 741
    //   619: aload_0
    //   620: invokespecial ZT : ()Ljava/lang/String;
    //   623: invokevirtual length : ()I
    //   626: ifeq -> 658
    //   629: goto -> 636
    //   632: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   635: athrow
    //   636: aload #4
    //   638: aload_0
    //   639: aload_2
    //   640: invokespecial Zs : (Lorg/yaml/Zt1;)Ljava/lang/String;
    //   643: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   646: pop
    //   647: iload_3
    //   648: ifeq -> 741
    //   651: goto -> 658
    //   654: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   657: athrow
    //   658: iload #6
    //   660: invokestatic toChars : (I)[C
    //   663: invokestatic valueOf : ([C)Ljava/lang/String;
    //   666: astore #7
    //   668: new org/yaml/Zl1
    //   671: dup
    //   672: sipush #-26629
    //   675: sipush #-23410
    //   678: invokestatic a : (II)Ljava/lang/String;
    //   681: aload_2
    //   682: new java/lang/StringBuilder
    //   685: dup
    //   686: invokespecial <init> : ()V
    //   689: sipush #-26752
    //   692: sipush #-13893
    //   695: invokestatic a : (II)Ljava/lang/String;
    //   698: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   701: aload #7
    //   703: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   706: ldc '('
    //   708: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   711: iload #6
    //   713: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   716: ldc ')'
    //   718: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   721: invokevirtual toString : ()Ljava/lang/String;
    //   724: aload_0
    //   725: getfield Zy : Lorg/yaml/Zlx;
    //   728: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   731: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   734: athrow
    //   735: aload #4
    //   737: invokevirtual toString : ()Ljava/lang/String;
    //   740: areturn
    //   741: goto -> 13
    // Exception table:
    //   from	to	target	type
    //   50	70	73	java/lang/IllegalArgumentException
    //   86	97	100	java/lang/IllegalArgumentException
    //   90	117	120	java/lang/IllegalArgumentException
    //   104	144	147	java/lang/IllegalArgumentException
    //   124	155	158	java/lang/IllegalArgumentException
    //   151	169	172	java/lang/IllegalArgumentException
    //   162	180	183	java/lang/IllegalArgumentException
    //   176	205	208	java/lang/IllegalArgumentException
    //   187	231	234	java/lang/IllegalArgumentException
    //   212	242	245	java/lang/IllegalArgumentException
    //   238	256	259	java/lang/IllegalArgumentException
    //   279	304	307	java/lang/IllegalArgumentException
    //   287	345	348	java/lang/IllegalArgumentException
    //   311	360	363	java/lang/IllegalArgumentException
    //   352	384	387	java/lang/IllegalArgumentException
    //   431	514	514	java/lang/IllegalArgumentException
    //   527	558	561	java/lang/IllegalArgumentException
    //   615	629	632	java/lang/IllegalArgumentException
    //   619	651	654	java/lang/IllegalArgumentException
  }
  
  private String Zd(Zt1 paramZt1) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: iconst_0
    //   12: istore #4
    //   14: istore_2
    //   15: sipush #-26741
    //   18: sipush #6843
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: aload_0
    //   25: getfield Zy : Lorg/yaml/Zlx;
    //   28: iload #4
    //   30: invokevirtual Zt : (I)I
    //   33: invokevirtual indexOf : (I)I
    //   36: iconst_m1
    //   37: if_icmpeq -> 47
    //   40: iinc #4, 1
    //   43: iload_2
    //   44: ifeq -> 15
    //   47: aload_0
    //   48: getfield Zy : Lorg/yaml/Zlx;
    //   51: iload #4
    //   53: invokevirtual Zr : (I)Ljava/lang/String;
    //   56: astore #5
    //   58: aload_0
    //   59: getfield Zy : Lorg/yaml/Zlx;
    //   62: invokevirtual Zr : ()I
    //   65: istore #6
    //   67: iload #6
    //   69: ifne -> 110
    //   72: new org/yaml/Zl1
    //   75: dup
    //   76: sipush #-26672
    //   79: sipush #4814
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: aload_1
    //   86: sipush #-26662
    //   89: sipush #-28820
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: aload_0
    //   96: getfield Zy : Lorg/yaml/Zlx;
    //   99: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   102: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   105: athrow
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: aload_0
    //   111: invokespecial ZT : ()Ljava/lang/String;
    //   114: astore #7
    //   116: aload #7
    //   118: invokevirtual length : ()I
    //   121: ifeq -> 199
    //   124: aload_0
    //   125: aload_1
    //   126: invokespecial Zs : (Lorg/yaml/Zt1;)Ljava/lang/String;
    //   129: astore #8
    //   131: ldc '\\n'
    //   133: aload #7
    //   135: invokevirtual equals : (Ljava/lang/Object;)Z
    //   138: ifne -> 159
    //   141: aload_3
    //   142: aload #7
    //   144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: iload_2
    //   149: ifeq -> 188
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   158: athrow
    //   159: aload #8
    //   161: invokevirtual length : ()I
    //   164: ifne -> 188
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: aload_3
    //   175: ldc ' '
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: aload_3
    //   189: aload #8
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: iload_2
    //   196: ifeq -> 213
    //   199: aload_3
    //   200: aload #5
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   212: athrow
    //   213: aload_3
    //   214: invokevirtual toString : ()Ljava/lang/String;
    //   217: areturn
    // Exception table:
    //   from	to	target	type
    //   67	106	106	java/lang/NullPointerException
    //   131	152	155	java/lang/NullPointerException
    //   141	167	170	java/lang/NullPointerException
    //   159	181	184	java/lang/NullPointerException
    //   188	206	209	java/lang/NullPointerException
  }
  
  private String Zs(Zt1 paramZt1) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: istore_2
    //   12: aload_0
    //   13: getfield Zy : Lorg/yaml/Zlx;
    //   16: iconst_3
    //   17: invokevirtual Zl : (I)Ljava/lang/String;
    //   20: astore #4
    //   22: sipush #-26635
    //   25: sipush #-1907
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: aload #4
    //   33: invokevirtual equals : (Ljava/lang/Object;)Z
    //   36: ifne -> 63
    //   39: sipush #-26681
    //   42: sipush #8319
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: aload #4
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifeq -> 125
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   62: athrow
    //   63: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   66: aload_0
    //   67: getfield Zy : Lorg/yaml/Zlx;
    //   70: iconst_3
    //   71: invokevirtual Zt : (I)I
    //   74: invokevirtual Zj : (I)Z
    //   77: ifeq -> 125
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: new org/yaml/Zl1
    //   90: dup
    //   91: sipush #-26659
    //   94: sipush #26004
    //   97: invokestatic a : (II)Ljava/lang/String;
    //   100: aload_1
    //   101: sipush #-26738
    //   104: sipush #12945
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: aload_0
    //   111: getfield Zy : Lorg/yaml/Zlx;
    //   114: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   117: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   120: athrow
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: sipush #-26647
    //   128: sipush #1628
    //   131: invokestatic a : (II)Ljava/lang/String;
    //   134: aload_0
    //   135: getfield Zy : Lorg/yaml/Zlx;
    //   138: invokevirtual Zr : ()I
    //   141: invokevirtual indexOf : (I)I
    //   144: iconst_m1
    //   145: if_icmpeq -> 159
    //   148: aload_0
    //   149: getfield Zy : Lorg/yaml/Zlx;
    //   152: invokevirtual ZK : ()V
    //   155: iload_2
    //   156: ifeq -> 125
    //   159: aload_0
    //   160: invokespecial ZT : ()Ljava/lang/String;
    //   163: astore #5
    //   165: aload #5
    //   167: invokevirtual length : ()I
    //   170: ifeq -> 191
    //   173: aload_3
    //   174: aload #5
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: iload_2
    //   181: ifeq -> 200
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   190: athrow
    //   191: aload_3
    //   192: invokevirtual toString : ()Ljava/lang/String;
    //   195: areturn
    //   196: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   199: athrow
    //   200: goto -> 12
    // Exception table:
    //   from	to	target	type
    //   22	56	59	java/lang/NullPointerException
    //   39	80	83	java/lang/NullPointerException
    //   63	121	121	java/lang/NullPointerException
    //   165	184	187	java/lang/NullPointerException
    //   173	196	196	java/lang/NullPointerException
  }
  
  private Z_8 Z_() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Zp : ()I
    //   11: aload_0
    //   12: getfield Zy : Lorg/yaml/Zlx;
    //   15: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   18: astore_3
    //   19: aload_3
    //   20: astore #4
    //   22: istore_1
    //   23: aload_0
    //   24: getfield Zj : I
    //   27: iconst_1
    //   28: iadd
    //   29: istore #5
    //   31: ldc ''
    //   33: astore #6
    //   35: iconst_0
    //   36: istore #8
    //   38: aload_0
    //   39: getfield Zy : Lorg/yaml/Zlx;
    //   42: invokevirtual Zr : ()I
    //   45: bipush #35
    //   47: if_icmpne -> 54
    //   50: iload_1
    //   51: ifeq -> 338
    //   54: aload_0
    //   55: getfield Zy : Lorg/yaml/Zlx;
    //   58: iload #8
    //   60: invokevirtual Zt : (I)I
    //   63: istore #7
    //   65: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   68: iload #7
    //   70: invokevirtual Zj : (I)Z
    //   73: ifne -> 199
    //   76: iload #7
    //   78: bipush #58
    //   80: if_icmpne -> 135
    //   83: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   86: aload_0
    //   87: getfield Zy : Lorg/yaml/Zlx;
    //   90: iload #8
    //   92: iconst_1
    //   93: iadd
    //   94: invokevirtual Zt : (I)I
    //   97: aload_0
    //   98: getfield ZF : I
    //   101: ifeq -> 127
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: sipush #-26686
    //   114: sipush #26098
    //   117: invokestatic a : (II)Ljava/lang/String;
    //   120: goto -> 129
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: ldc ''
    //   129: invokevirtual Zd : (ILjava/lang/String;)Z
    //   132: ifne -> 199
    //   135: aload_0
    //   136: getfield ZF : I
    //   139: ifeq -> 185
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: sipush #-26679
    //   152: sipush #-13986
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: iload #7
    //   160: invokevirtual indexOf : (I)I
    //   163: iconst_m1
    //   164: if_icmpeq -> 185
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: iload_1
    //   175: ifeq -> 199
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   184: athrow
    //   185: iinc #8, 1
    //   188: iload_1
    //   189: ifeq -> 54
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   198: athrow
    //   199: iload #8
    //   201: ifne -> 215
    //   204: iload_1
    //   205: ifeq -> 338
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: aload_0
    //   216: iconst_0
    //   217: putfield Zu : Z
    //   220: aload_2
    //   221: aload #6
    //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: pop
    //   227: aload_2
    //   228: aload_0
    //   229: getfield Zy : Lorg/yaml/Zlx;
    //   232: iload #8
    //   234: invokevirtual Zr : (I)Ljava/lang/String;
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: aload_0
    //   242: getfield Zy : Lorg/yaml/Zlx;
    //   245: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   248: astore #4
    //   250: aload_0
    //   251: invokespecial Ze : ()Ljava/lang/String;
    //   254: astore #6
    //   256: aload #6
    //   258: invokevirtual length : ()I
    //   261: ifeq -> 338
    //   264: aload_0
    //   265: getfield Zy : Lorg/yaml/Zlx;
    //   268: invokevirtual Zr : ()I
    //   271: bipush #35
    //   273: if_icmpeq -> 338
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   282: athrow
    //   283: aload_0
    //   284: getfield ZF : I
    //   287: ifne -> 327
    //   290: goto -> 297
    //   293: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   296: athrow
    //   297: aload_0
    //   298: getfield Zy : Lorg/yaml/Zlx;
    //   301: invokevirtual ZO : ()I
    //   304: iload #5
    //   306: if_icmpge -> 327
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   315: athrow
    //   316: iload_1
    //   317: ifeq -> 338
    //   320: goto -> 327
    //   323: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   326: athrow
    //   327: iload_1
    //   328: ifeq -> 35
    //   331: goto -> 338
    //   334: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   337: athrow
    //   338: new org/yaml/Zgt
    //   341: dup
    //   342: aload_2
    //   343: invokevirtual toString : ()Ljava/lang/String;
    //   346: aload_3
    //   347: aload #4
    //   349: iconst_1
    //   350: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Lorg/yaml/Zt1;Z)V
    //   353: areturn
    // Exception table:
    //   from	to	target	type
    //   76	104	107	java/lang/NullPointerException
    //   83	123	123	java/lang/NullPointerException
    //   129	142	145	java/lang/NullPointerException
    //   135	167	170	java/lang/NullPointerException
    //   149	178	181	java/lang/NullPointerException
    //   174	192	195	java/lang/NullPointerException
    //   199	208	211	java/lang/NullPointerException
    //   256	276	279	java/lang/NullPointerException
    //   264	290	293	java/lang/NullPointerException
    //   283	309	312	java/lang/NullPointerException
    //   297	320	323	java/lang/NullPointerException
    //   316	331	334	java/lang/NullPointerException
  }
  
  private boolean Zw() {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: iconst_0
    //   4: istore_2
    //   5: istore_1
    //   6: aload_0
    //   7: getfield Zy : Lorg/yaml/Zlx;
    //   10: invokevirtual ZO : ()I
    //   13: istore_3
    //   14: aload_0
    //   15: getfield Zy : Lorg/yaml/Zlx;
    //   18: iload_2
    //   19: invokevirtual Zt : (I)I
    //   22: dup
    //   23: istore #4
    //   25: ifeq -> 130
    //   28: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   31: iload #4
    //   33: invokevirtual Zj : (I)Z
    //   36: ifeq -> 130
    //   39: iinc #2, 1
    //   42: getstatic org/yaml/Z_s.ZV : Lorg/yaml/Z_s;
    //   45: iload #4
    //   47: invokevirtual Zj : (I)Z
    //   50: ifne -> 124
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   59: athrow
    //   60: iload #4
    //   62: bipush #13
    //   64: if_icmpne -> 96
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield Zy : Lorg/yaml/Zlx;
    //   78: iload_2
    //   79: iconst_1
    //   80: iadd
    //   81: invokevirtual Zt : (I)I
    //   84: bipush #10
    //   86: if_icmpeq -> 124
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   95: athrow
    //   96: iload #4
    //   98: ldc 65279
    //   100: if_icmpeq -> 124
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   109: athrow
    //   110: iinc #3, 1
    //   113: iload_1
    //   114: ifeq -> 14
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: iconst_0
    //   125: istore_3
    //   126: iload_1
    //   127: ifeq -> 14
    //   130: aload_0
    //   131: getfield Zy : Lorg/yaml/Zlx;
    //   134: iload_2
    //   135: invokevirtual Zt : (I)I
    //   138: bipush #35
    //   140: if_icmpeq -> 192
    //   143: aload_0
    //   144: getfield Zy : Lorg/yaml/Zlx;
    //   147: iload_2
    //   148: iconst_1
    //   149: iadd
    //   150: invokevirtual Zt : (I)I
    //   153: ifeq -> 192
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   162: athrow
    //   163: aload_0
    //   164: getfield ZF : I
    //   167: ifne -> 198
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   176: athrow
    //   177: iload_3
    //   178: aload_0
    //   179: getfield Zj : I
    //   182: if_icmpge -> 198
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: iconst_1
    //   193: ireturn
    //   194: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   197: athrow
    //   198: aload_0
    //   199: getfield ZF : I
    //   202: ifne -> 292
    //   205: iconst_1
    //   206: istore #5
    //   208: aload_0
    //   209: getfield Zy : Lorg/yaml/Zlx;
    //   212: iload_2
    //   213: iload #5
    //   215: iadd
    //   216: invokevirtual Zt : (I)I
    //   219: dup
    //   220: istore #4
    //   222: ifeq -> 292
    //   225: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   228: iload #4
    //   230: invokevirtual Zj : (I)Z
    //   233: ifne -> 292
    //   236: iload #4
    //   238: bipush #58
    //   240: if_icmpne -> 285
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   253: aload_0
    //   254: getfield Zy : Lorg/yaml/Zlx;
    //   257: iload_2
    //   258: iload #5
    //   260: iadd
    //   261: iconst_1
    //   262: iadd
    //   263: invokevirtual Zt : (I)I
    //   266: invokevirtual Zj : (I)Z
    //   269: ifeq -> 285
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   278: athrow
    //   279: iconst_1
    //   280: ireturn
    //   281: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   284: athrow
    //   285: iinc #5, 1
    //   288: iload_1
    //   289: ifeq -> 208
    //   292: iconst_0
    //   293: ireturn
    // Exception table:
    //   from	to	target	type
    //   28	53	56	java/lang/NullPointerException
    //   39	67	70	java/lang/NullPointerException
    //   60	89	92	java/lang/NullPointerException
    //   74	103	106	java/lang/NullPointerException
    //   96	117	120	java/lang/NullPointerException
    //   130	156	159	java/lang/NullPointerException
    //   143	170	173	java/lang/NullPointerException
    //   163	185	188	java/lang/NullPointerException
    //   177	194	194	java/lang/NullPointerException
    //   225	243	246	java/lang/NullPointerException
    //   236	272	275	java/lang/NullPointerException
    //   250	281	281	java/lang/NullPointerException
  }
  
  private String Ze() {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: iconst_0
    //   4: istore_2
    //   5: istore_1
    //   6: aload_0
    //   7: getfield Zy : Lorg/yaml/Zlx;
    //   10: iload_2
    //   11: invokevirtual Zt : (I)I
    //   14: bipush #32
    //   16: if_icmpeq -> 32
    //   19: aload_0
    //   20: getfield Zy : Lorg/yaml/Zlx;
    //   23: iload_2
    //   24: invokevirtual Zt : (I)I
    //   27: bipush #9
    //   29: if_icmpne -> 46
    //   32: iinc #2, 1
    //   35: iload_1
    //   36: ifne -> 6
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   45: athrow
    //   46: aload_0
    //   47: getfield Zy : Lorg/yaml/Zlx;
    //   50: iload_2
    //   51: invokevirtual Zr : (I)Ljava/lang/String;
    //   54: astore_3
    //   55: aload_0
    //   56: invokespecial ZT : ()Ljava/lang/String;
    //   59: astore #4
    //   61: aload #4
    //   63: invokevirtual length : ()I
    //   66: ifeq -> 380
    //   69: aload_0
    //   70: iconst_1
    //   71: putfield Zu : Z
    //   74: aload_0
    //   75: getfield Zy : Lorg/yaml/Zlx;
    //   78: iconst_3
    //   79: invokevirtual Zl : (I)Ljava/lang/String;
    //   82: astore #5
    //   84: sipush #-26673
    //   87: sipush #-21828
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: aload #5
    //   95: invokevirtual equals : (Ljava/lang/Object;)Z
    //   98: ifne -> 149
    //   101: sipush #-26638
    //   104: sipush #15443
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: aload #5
    //   112: invokevirtual equals : (Ljava/lang/Object;)Z
    //   115: ifeq -> 156
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   128: aload_0
    //   129: getfield Zy : Lorg/yaml/Zlx;
    //   132: iconst_3
    //   133: invokevirtual Zt : (I)I
    //   136: invokevirtual Zj : (I)Z
    //   139: ifeq -> 156
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: ldc ''
    //   151: areturn
    //   152: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   155: athrow
    //   156: aload_0
    //   157: getfield ZU : Z
    //   160: ifeq -> 184
    //   163: aload_0
    //   164: invokespecial Zw : ()Z
    //   167: ifeq -> 184
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   176: athrow
    //   177: ldc ''
    //   179: areturn
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: new java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: astore #6
    //   193: aload_0
    //   194: getfield Zy : Lorg/yaml/Zlx;
    //   197: invokevirtual Zr : ()I
    //   200: bipush #32
    //   202: if_icmpne -> 216
    //   205: aload_0
    //   206: getfield Zy : Lorg/yaml/Zlx;
    //   209: invokevirtual ZK : ()V
    //   212: iload_1
    //   213: ifne -> 193
    //   216: aload_0
    //   217: invokespecial ZT : ()Ljava/lang/String;
    //   220: astore #7
    //   222: aload #7
    //   224: invokevirtual length : ()I
    //   227: ifeq -> 324
    //   230: aload #6
    //   232: aload #7
    //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload_0
    //   239: getfield Zy : Lorg/yaml/Zlx;
    //   242: iconst_3
    //   243: invokevirtual Zl : (I)Ljava/lang/String;
    //   246: astore #5
    //   248: sipush #-26673
    //   251: sipush #-21828
    //   254: invokestatic a : (II)Ljava/lang/String;
    //   257: aload #5
    //   259: invokevirtual equals : (Ljava/lang/Object;)Z
    //   262: ifne -> 313
    //   265: sipush #-26638
    //   268: sipush #15443
    //   271: invokestatic a : (II)Ljava/lang/String;
    //   274: aload #5
    //   276: invokevirtual equals : (Ljava/lang/Object;)Z
    //   279: ifeq -> 320
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   288: athrow
    //   289: getstatic org/yaml/Z_s.Zp : Lorg/yaml/Z_s;
    //   292: aload_0
    //   293: getfield Zy : Lorg/yaml/Zlx;
    //   296: iconst_3
    //   297: invokevirtual Zt : (I)I
    //   300: invokevirtual Zj : (I)Z
    //   303: ifeq -> 320
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   312: athrow
    //   313: ldc ''
    //   315: areturn
    //   316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   319: athrow
    //   320: iload_1
    //   321: ifne -> 193
    //   324: ldc '\\n'
    //   326: aload #4
    //   328: invokevirtual equals : (Ljava/lang/Object;)Z
    //   331: ifne -> 359
    //   334: new java/lang/StringBuilder
    //   337: dup
    //   338: invokespecial <init> : ()V
    //   341: aload #4
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: aload #6
    //   348: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   351: invokevirtual toString : ()Ljava/lang/String;
    //   354: areturn
    //   355: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   358: athrow
    //   359: aload #6
    //   361: invokevirtual length : ()I
    //   364: ifne -> 374
    //   367: ldc ' '
    //   369: areturn
    //   370: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   373: athrow
    //   374: aload #6
    //   376: invokevirtual toString : ()Ljava/lang/String;
    //   379: areturn
    //   380: aload_3
    //   381: areturn
    // Exception table:
    //   from	to	target	type
    //   19	39	42	java/lang/NullPointerException
    //   84	118	121	java/lang/NullPointerException
    //   101	142	145	java/lang/NullPointerException
    //   125	152	152	java/lang/NullPointerException
    //   156	170	173	java/lang/NullPointerException
    //   163	180	180	java/lang/NullPointerException
    //   248	282	285	java/lang/NullPointerException
    //   265	306	309	java/lang/NullPointerException
    //   289	316	316	java/lang/NullPointerException
    //   324	355	355	java/lang/NullPointerException
    //   359	370	370	java/lang/NullPointerException
  }
  
  private String ZO(String paramString, Zt1 paramZt1) {
    int j = this.Zy.Zr();
    int i = Z_s.Zp();
    if (j != 33) {
      String str = String.valueOf(Character.toChars(j));
      throw new Zl1(a(-26688, 7661) + paramString, paramZt1, a(-26625, 5277) + str + "(" + j + ")", this.Zy.ZA());
    } 
    byte b = 1;
    j = this.Zy.Zt(b);
    try {
      if (j != 32) {
        while (Z_s.Zb.Zj(j)) {
          j = this.Zy.Zt(++b);
          if (i != 0)
            break; 
        } 
        if (j != 33) {
          this.Zy.Zj(b);
          String str = String.valueOf(Character.toChars(j));
          throw new Zl1(a(-26626, 26460) + paramString, paramZt1, a(-26630, 3830) + str + "(" + j + ")", this.Zy.ZA());
        } 
        b++;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return this.Zy.Zr(b);
  }
  
  private String Zk(String paramString, Zt1 paramZt1) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic Zp : ()I
    //   12: iconst_0
    //   13: istore #5
    //   15: aload_0
    //   16: getfield Zy : Lorg/yaml/Zlx;
    //   19: iload #5
    //   21: invokevirtual Zt : (I)I
    //   24: istore #6
    //   26: istore_3
    //   27: getstatic org/yaml/Z_s.ZS : Lorg/yaml/Z_s;
    //   30: iload #6
    //   32: invokevirtual Zj : (I)Z
    //   35: ifeq -> 104
    //   38: iload #6
    //   40: bipush #37
    //   42: if_icmpne -> 79
    //   45: aload #4
    //   47: aload_0
    //   48: getfield Zy : Lorg/yaml/Zlx;
    //   51: iload #5
    //   53: invokevirtual Zr : (I)Ljava/lang/String;
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: iconst_0
    //   61: istore #5
    //   63: aload #4
    //   65: aload_0
    //   66: aload_1
    //   67: aload_2
    //   68: invokespecial ZN : (Ljava/lang/String;Lorg/yaml/Zt1;)Ljava/lang/String;
    //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: iload_3
    //   76: ifeq -> 89
    //   79: iinc #5, 1
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload_0
    //   90: getfield Zy : Lorg/yaml/Zlx;
    //   93: iload #5
    //   95: invokevirtual Zt : (I)I
    //   98: istore #6
    //   100: iload_3
    //   101: ifeq -> 27
    //   104: iload #5
    //   106: ifeq -> 131
    //   109: aload #4
    //   111: aload_0
    //   112: getfield Zy : Lorg/yaml/Zlx;
    //   115: iload #5
    //   117: invokevirtual Zr : (I)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: aload #4
    //   133: invokevirtual length : ()I
    //   136: ifne -> 233
    //   139: iload #6
    //   141: invokestatic toChars : (I)[C
    //   144: invokestatic valueOf : ([C)Ljava/lang/String;
    //   147: astore #7
    //   149: new org/yaml/Zl1
    //   152: dup
    //   153: new java/lang/StringBuilder
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: sipush #-26626
    //   163: sipush #26460
    //   166: invokestatic a : (II)Ljava/lang/String;
    //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: aload_1
    //   173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: invokevirtual toString : ()Ljava/lang/String;
    //   179: aload_2
    //   180: new java/lang/StringBuilder
    //   183: dup
    //   184: invokespecial <init> : ()V
    //   187: sipush #-26649
    //   190: sipush #27476
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: aload #7
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: ldc '('
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: iload #6
    //   211: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   214: ldc ')'
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: invokevirtual toString : ()Ljava/lang/String;
    //   222: aload_0
    //   223: getfield Zy : Lorg/yaml/Zlx;
    //   226: invokevirtual ZA : ()Lorg/yaml/Zt1;
    //   229: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   232: athrow
    //   233: aload #4
    //   235: invokevirtual toString : ()Ljava/lang/String;
    //   238: areturn
    // Exception table:
    //   from	to	target	type
    //   63	82	85	java/lang/NullPointerException
    //   104	124	127	java/lang/NullPointerException
  }
  
  private String ZN(String paramString, Zt1 paramZt1) {
    byte b = 1;
    int i = Z_s.Zp();
    while (this.Zy.Zt(b * 3) == 37) {
      b++;
      if (i != 0)
        break; 
    } 
    Zt1 zt1 = this.Zy.ZA();
    ByteBuffer byteBuffer = ByteBuffer.allocate(b);
    while (this.Zy.Zr() == 37) {
      this.Zy.ZK();
      try {
        byte b1 = (byte)Integer.parseInt(this.Zy.Zl(2), 16);
        byteBuffer.put(b1);
      } catch (NumberFormatException numberFormatException) {
        int j = this.Zy.Zr();
        String str1 = String.valueOf(Character.toChars(j));
        int k = this.Zy.Zt(1);
        String str2 = String.valueOf(Character.toChars(k));
        throw new Zl1(a(-26626, 26460) + paramString, paramZt1, a(-26748, 12810) + str1 + "(" + j + a(-26677, 7301) + str2 + "(" + k + ")", this.Zy.ZA());
      } 
      this.Zy.Zj(2);
      if (i != 0)
        break; 
    } 
    byteBuffer.flip();
    try {
      return Zlk.Zb(byteBuffer);
    } catch (CharacterCodingException characterCodingException) {
      throw new Zl1(a(-26626, 26460) + paramString, paramZt1, a(-26723, -2082) + characterCodingException.getMessage(), zt1);
    } 
  }
  
  private String ZT() {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: aload_0
    //   4: getfield Zy : Lorg/yaml/Zlx;
    //   7: invokevirtual Zr : ()I
    //   10: istore_2
    //   11: istore_1
    //   12: iload_2
    //   13: bipush #13
    //   15: if_icmpeq -> 45
    //   18: iload_2
    //   19: bipush #10
    //   21: if_icmpeq -> 45
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   30: athrow
    //   31: iload_2
    //   32: sipush #133
    //   35: if_icmpne -> 114
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   44: athrow
    //   45: iload_2
    //   46: bipush #13
    //   48: if_icmpne -> 97
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   57: athrow
    //   58: bipush #10
    //   60: aload_0
    //   61: getfield Zy : Lorg/yaml/Zlx;
    //   64: iconst_1
    //   65: invokevirtual Zt : (I)I
    //   68: if_icmpne -> 97
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: aload_0
    //   79: getfield Zy : Lorg/yaml/Zlx;
    //   82: iconst_2
    //   83: invokevirtual Zj : (I)V
    //   86: iload_1
    //   87: ifne -> 111
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload_0
    //   98: getfield Zy : Lorg/yaml/Zlx;
    //   101: invokevirtual ZK : ()V
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: ldc '\\n'
    //   113: areturn
    //   114: iload_2
    //   115: sipush #8232
    //   118: if_icmpeq -> 135
    //   121: iload_2
    //   122: sipush #8233
    //   125: if_icmpne -> 154
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: aload_0
    //   136: getfield Zy : Lorg/yaml/Zlx;
    //   139: invokevirtual ZK : ()V
    //   142: iload_2
    //   143: invokestatic toChars : (I)[C
    //   146: invokestatic valueOf : ([C)Ljava/lang/String;
    //   149: areturn
    //   150: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   153: athrow
    //   154: ldc ''
    //   156: areturn
    // Exception table:
    //   from	to	target	type
    //   12	24	27	java/lang/NullPointerException
    //   18	38	41	java/lang/NullPointerException
    //   31	51	54	java/lang/NullPointerException
    //   45	71	74	java/lang/NullPointerException
    //   58	90	93	java/lang/NullPointerException
    //   78	104	107	java/lang/NullPointerException
    //   114	128	131	java/lang/NullPointerException
    //   121	150	150	java/lang/NullPointerException
  }
  
  private List<Z_8> Zf(Z_8... paramVarArgs) {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: istore_2
    //   12: iconst_0
    //   13: istore #4
    //   15: iload #4
    //   17: aload_1
    //   18: arraylength
    //   19: if_icmpge -> 107
    //   22: aload_1
    //   23: iload #4
    //   25: aaload
    //   26: ifnonnull -> 40
    //   29: iload_2
    //   30: ifne -> 100
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   39: athrow
    //   40: aload_0
    //   41: getfield ZU : Z
    //   44: ifne -> 82
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   53: athrow
    //   54: aload_1
    //   55: iload #4
    //   57: aaload
    //   58: instanceof org/yaml/Zg6
    //   61: ifeq -> 82
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iload_2
    //   72: ifne -> 100
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: aload_3
    //   83: aload_1
    //   84: iload #4
    //   86: aaload
    //   87: invokeinterface add : (Ljava/lang/Object;)Z
    //   92: pop
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: iinc #4, 1
    //   103: iload_2
    //   104: ifne -> 15
    //   107: aload_3
    //   108: areturn
    // Exception table:
    //   from	to	target	type
    //   22	33	36	java/lang/NullPointerException
    //   29	47	50	java/lang/NullPointerException
    //   40	64	67	java/lang/NullPointerException
    //   54	75	78	java/lang/NullPointerException
    //   71	93	96	java/lang/NullPointerException
  }
  
  public void Zq() {
    this.Zy.Zo();
  }
  
  static {
    // Byte code:
    //   0: bipush #84
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' ÇÄ!Î|\\b\\boVîÑýÿ÷k(¾xÊ×ð à4q®7UÝüb¾È)ixD¿¥½!åÎ:gGu·è03¸QP$3Ð¹þéÒUz\ ÿMoR×F\\nr¼pÖ:T%¶=;ei[êmÆü\\nÚ}<\\nWÒÕOSûÍ­Ær_Nrýô¼¼&=ë!¿f¡~°¶Ö«ÆÛÄQúiê2ãX3hý-D¬{=\â±ø\\b¥Á!¢cù;^¶gCp%¨ûÌ"&;à`ULc\\tùóIó|þÁµ_Óc[¸i±^jÜ±)ZöÌÞ ³¶uÇË´àjQÀÚ¦\\rø\QG¿akLeÖÈùÁÇOB¯3¾/ºÔ èEô ªåVeàhæ/ßÝúC ú\\b\\bïìÐÞ3\\f<v8)¶øTWä¡V«[ÆÙgD+exõ¼X÷Å<öí¹Ø¿:#EÂ0!v=î æm1¦}×0Åòsk¶röìî­=ÝE5÷± _Û£p/°³:»¦Í×8Ù³f¯³äÏ_(B_´V¸fC¥4VßSÌ©6+Ôhú9Øô dÕÃQ%êÓ}Þª\\r±ÔJzÒxN,üó·\\f»Y)^=ýµ}'é4`ÓÔÒ--·Mw:iÈ¼·ÎÅ2åËðÝm¼½E\\f;Q|±V}`M©ÿq.ÂU|n%\\rýÎpÞ0P$¬áâ0¸G<ÿ#YTj¯ïªêd@äð½*oíc~ÃÑjíåù\\n~NúÓ3>²cw÷ÂAãO¿Ï)CÀknPÎº\\t½D?ýj%m¼D°F{BÐ7Ýa»µ.#£u(àKv«ITý½K#²a_SDtfív|½kLçZ^ý°Ø<~øY.áÈææïèQz [¤7´¢èf(rÉ-XÙ×jwì*ºõd÷!±;V¯~&qº \ØÌôÊ±Þª©M®q3ë:Æ£¸Zadô4À¶R\\b´ªOÀð¹i± 5ÌM^»eÉÛO]¢oaâFO-+è*¹ËôÖÈÌÕ¼ðUè\=¾½»ó\\n-âÌlnñÖf°6ó\\tù®âèËÊGÚ­oqSxFò%u¨FÞ§ ~ôá1jÿwö+¼6'pü©$;éázF±L¡Þ\\r§¸ÞÆ¯nÝM1ê ¸CÏ×º1{åIb©qCkã+åíÉ0£<å\\bA^6Ù&ËwÁ­OïµüâÞ,ÃÞÆy«ìDIå7çÅÐW\ºäÿF*KfµÖÚ¹±NK¬ª:KUÇõ×õPK¿\íçùá`³®±R6ÓÉ:³"G°y¥Ì¦ÔZÃøÂæË¤lÒlãDL:øMØ.\:8¡%å7b¨Sô\,%#Û/¼bÕ«\\t"c!ÿüº´ç;þ\\tKU\\f" ´nþ\\r=y¡"ZaåË%_ïAÆi×àoX\\twm6nn¬#¤:<ÉDÀ:¦ýçõQº/x ÓÚþD¶ÑNÙ®°]×í76MàÒª¬¦ããUèËjQ*ÿô¾âÂ_ý4KXvn¡'«\\f)ÌTrÖ?Ã=d2´jk./Ñ=),CmÖï¥êZ£ ç6Z£Ðªë±~fø=Ñ{Éã\\tIq§qãðEM¦ý\\rg\\tbâãBnæs«SHÀ2YI3¯"/Ï<!ºµ¨å\\r\\nFöQ'ÜÈA©cþZt¿bfÿ~@°Ïù«fÆ*ÛTÜDò\Jv¦Ó=i¹1¦f\\r³fñÌ§ÀGþëÎLØ¶\¿_ãßè*þÔl(2zÈ0_£\\rw°¸VXý+\\rDÙnL#ßDEÞ&È\{îr¥¤Ñ\\f[tYlnBÊX®8¢jÂJ¨³n.z¬Ô¯YÇVß­ kÂq\\trözõühh°ò{h±÷¤EÀz4y~!Ô²aÁ#òûè\\nM/Úv "##£8¥0~àÌ½-_îZgÙcââRÁºk0kW\\t<WYpqU©ª¬\\f&gÇý<edÐ%Â\\fÖBuV¼")þo¶ä¶ÄùD¢+s#*Ô!(z´È£wãÿ§<u v¨@Ö§Äæx,¼=Ô£¼ê\\tUk,9\\rÒsµ·¬äYø7ï\\t»qî`i÷fT÷ËñL$åÀ^z\\tshõÁ}£©Ab2î,Ýg>Éùçná\\b!åfaL\\n]B£º-6d E­@ê>-Ê®àV_Ä:9ÝcEÐÔ$F¨5Mlâ!cc*®=4<¬0«ìTa`_HN±X¹H&ÄHÁºÞTÊïÝ#µRóR¬Kø²¡ ý[u ×hK?¢!¸rd&iÏ\\fkÓåòÏrKñùE?1¾1±71¼Úèr¢1¡r­Ã¶}Ø^7+F}®'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #111
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'Zç~xeÑ1»ðÉ@À^q\<'[ÜñeäfÎ¡æêh\\tLOÙ¤:'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #23
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #93
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic org/yaml/Zju.a : [Ljava/lang/String;
    //   131: bipush #84
    //   133: anewarray java/lang/String
    //   136: putstatic org/yaml/Zju.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #69
    //   214: goto -> 244
    //   217: bipush #112
    //   219: goto -> 244
    //   222: bipush #75
    //   224: goto -> 244
    //   227: bipush #54
    //   229: goto -> 244
    //   232: bipush #120
    //   234: goto -> 244
    //   237: bipush #58
    //   239: goto -> 244
    //   242: bipush #72
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #-26665
    //   303: sipush #-17812
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   312: putstatic org/yaml/Zju.ZT : Ljava/util/regex/Pattern;
    //   315: new java/util/HashMap
    //   318: dup
    //   319: invokespecial <init> : ()V
    //   322: putstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   325: new java/util/HashMap
    //   328: dup
    //   329: invokespecial <init> : ()V
    //   332: putstatic org/yaml/Zju.ZE : Ljava/util/Map;
    //   335: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   338: bipush #48
    //   340: invokestatic valueOf : (C)Ljava/lang/Character;
    //   343: ldc ' '
    //   345: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   350: pop
    //   351: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   354: bipush #97
    //   356: invokestatic valueOf : (C)Ljava/lang/Character;
    //   359: ldc ''
    //   361: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   366: pop
    //   367: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   370: bipush #98
    //   372: invokestatic valueOf : (C)Ljava/lang/Character;
    //   375: ldc '\\b'
    //   377: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   382: pop
    //   383: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   386: bipush #116
    //   388: invokestatic valueOf : (C)Ljava/lang/Character;
    //   391: ldc '\\t'
    //   393: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   398: pop
    //   399: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   402: bipush #110
    //   404: invokestatic valueOf : (C)Ljava/lang/Character;
    //   407: ldc '\\n'
    //   409: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   414: pop
    //   415: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   418: bipush #118
    //   420: invokestatic valueOf : (C)Ljava/lang/Character;
    //   423: ldc ''
    //   425: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   430: pop
    //   431: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   434: bipush #102
    //   436: invokestatic valueOf : (C)Ljava/lang/Character;
    //   439: ldc '\\f'
    //   441: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   446: pop
    //   447: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   450: bipush #114
    //   452: invokestatic valueOf : (C)Ljava/lang/Character;
    //   455: ldc '\\r'
    //   457: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   462: pop
    //   463: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   466: bipush #101
    //   468: invokestatic valueOf : (C)Ljava/lang/Character;
    //   471: ldc ''
    //   473: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   478: pop
    //   479: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   482: bipush #32
    //   484: invokestatic valueOf : (C)Ljava/lang/Character;
    //   487: ldc ' '
    //   489: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   494: pop
    //   495: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   498: bipush #34
    //   500: invokestatic valueOf : (C)Ljava/lang/Character;
    //   503: ldc '"'
    //   505: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   510: pop
    //   511: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   514: bipush #92
    //   516: invokestatic valueOf : (C)Ljava/lang/Character;
    //   519: ldc '\'
    //   521: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   526: pop
    //   527: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   530: bipush #78
    //   532: invokestatic valueOf : (C)Ljava/lang/Character;
    //   535: ldc ''
    //   537: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   542: pop
    //   543: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   546: bipush #95
    //   548: invokestatic valueOf : (C)Ljava/lang/Character;
    //   551: ldc ' '
    //   553: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   558: pop
    //   559: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   562: bipush #76
    //   564: invokestatic valueOf : (C)Ljava/lang/Character;
    //   567: ldc ' '
    //   569: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   574: pop
    //   575: getstatic org/yaml/Zju.Ze : Ljava/util/Map;
    //   578: bipush #80
    //   580: invokestatic valueOf : (C)Ljava/lang/Character;
    //   583: ldc ' '
    //   585: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   590: pop
    //   591: getstatic org/yaml/Zju.ZE : Ljava/util/Map;
    //   594: bipush #120
    //   596: invokestatic valueOf : (C)Ljava/lang/Character;
    //   599: iconst_2
    //   600: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   603: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   608: pop
    //   609: getstatic org/yaml/Zju.ZE : Ljava/util/Map;
    //   612: bipush #117
    //   614: invokestatic valueOf : (C)Ljava/lang/Character;
    //   617: iconst_4
    //   618: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   621: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   626: pop
    //   627: getstatic org/yaml/Zju.ZE : Ljava/util/Map;
    //   630: bipush #85
    //   632: invokestatic valueOf : (C)Ljava/lang/Character;
    //   635: bipush #8
    //   637: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   640: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   645: pop
    //   646: return
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF97CF) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'î';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zju.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */