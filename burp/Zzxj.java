package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zfu;
import net.portswigger.Zk_;
import net.portswigger.Zrme;
import net.portswigger.Zsu;

public class Zzxj {
  private final Zbnt Zb;
  
  private final Zr_4 Za;
  
  public final List<Zmy8> Zm = new ArrayList<>();
  
  public final List<Zmy8> Zy = new ArrayList<>();
  
  public List<String> ZJ;
  
  public List<String> Zl;
  
  private Zxly Zk;
  
  private Zxly Z_;
  
  private boolean Zt;
  
  public boolean Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzxj(Zbnt paramZbnt, Zr_4 paramZr_4) {
    this.Zb = paramZbnt;
    this.Za = paramZr_4;
  }
  
  public void ZD(Zsu paramZsu, List<String> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: new java/util/ArrayList
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #5
    //   18: invokestatic ZV : ()I
    //   21: new java/util/ArrayList
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #6
    //   30: new java/util/ArrayList
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: astore #7
    //   39: istore_3
    //   40: aload_1
    //   41: ifnull -> 78
    //   44: aload_1
    //   45: new burp/Zkai
    //   48: dup
    //   49: aload_0
    //   50: aload #4
    //   52: aload_2
    //   53: aload #5
    //   55: aload #6
    //   57: aload #7
    //   59: invokespecial <init> : (Lburp/Zzxj;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    //   62: invokeinterface ZB : (Lnet/portswigger/Zko;)V
    //   67: iload_3
    //   68: ifne -> 97
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   77: athrow
    //   78: aload #4
    //   80: aload_2
    //   81: invokestatic Zv : (Ljava/util/List;)Ljava/util/List;
    //   84: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   89: pop
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload_0
    //   98: aload #4
    //   100: aload #5
    //   102: aload #6
    //   104: aload #7
    //   106: aload #6
    //   108: invokeinterface isEmpty : ()Z
    //   113: invokevirtual Zy : (Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V
    //   116: aload_0
    //   117: getfield Zk : Lburp/Zxly;
    //   120: invokevirtual ZU : ()Z
    //   123: ifeq -> 153
    //   126: new net/portswigger/Zrme
    //   129: dup
    //   130: sipush #1001
    //   133: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   136: sipush #-6148
    //   139: sipush #-4396
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokespecial <init> : (Ljava/lang/Integer;Ljava/lang/String;)V
    //   148: athrow
    //   149: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   152: athrow
    //   153: aload_0
    //   154: getfield Z_ : Lburp/Zxly;
    //   157: invokevirtual ZU : ()Z
    //   160: ifeq -> 190
    //   163: new net/portswigger/Zrme
    //   166: dup
    //   167: sipush #1001
    //   170: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   173: sipush #-6153
    //   176: sipush #4405
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: invokespecial <init> : (Ljava/lang/Integer;Ljava/lang/String;)V
    //   185: athrow
    //   186: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   189: athrow
    //   190: return
    // Exception table:
    //   from	to	target	type
    //   40	71	74	net/portswigger/Zrme
    //   44	90	93	net/portswigger/Zrme
    //   97	149	149	net/portswigger/Zrme
    //   153	186	186	net/portswigger/Zrme
  }
  
  private int Zx(Zfu paramZfu) {
    try {
      switch (Zz07.ZW[paramZfu.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return 2;
  }
  
  public void ZU(Zl34 paramZl341, Zl34 paramZl342) {
    Zy(Zu(paramZl341), Zu(paramZl342), Zr(paramZl341), Zr(paramZl342), paramZl341.ZjZ());
  }
  
  public void ZP(List<String> paramList) {
    Zy(paramList, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), true);
  }
  
  private void Zy(List<String> paramList1, List<String> paramList2, List<Zmy8> paramList3, List<Zmy8> paramList4, boolean paramBoolean) {
    ZW(paramList1, paramList2);
    this.Zm.addAll(paramList3);
    this.Zy.addAll(paramList4);
    this.Zq = paramBoolean;
  }
  
  private static List<String> Zu(Zl34 paramZl34) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Zd : ()I
    //   11: aload_0
    //   12: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   17: dup
    //   18: astore_3
    //   19: monitorenter
    //   20: istore_1
    //   21: aload_0
    //   22: invokeinterface Zjg : ()Lburp/Zefg;
    //   27: invokeinterface iterator : ()Ljava/util/Iterator;
    //   32: astore #4
    //   34: aload #4
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 91
    //   44: aload #4
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast burp/Zg55
    //   54: astore #5
    //   56: aload #5
    //   58: invokeinterface ZaS : ()Z
    //   63: ifeq -> 87
    //   66: aload_2
    //   67: aload #5
    //   69: invokeinterface ZaD : ()Ljava/lang/String;
    //   74: invokeinterface add : (Ljava/lang/Object;)Z
    //   79: pop
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   86: athrow
    //   87: iload_1
    //   88: ifeq -> 34
    //   91: aload_3
    //   92: monitorexit
    //   93: goto -> 103
    //   96: astore #6
    //   98: aload_3
    //   99: monitorexit
    //   100: aload #6
    //   102: athrow
    //   103: aload_2
    //   104: areturn
    // Exception table:
    //   from	to	target	type
    //   21	93	96	finally
    //   56	80	83	net/portswigger/Zrme
    //   96	100	96	finally
  }
  
  private static List<Zmy8> Zr(Zl34 paramZl34) {
    synchronized (paramZl34.Zz6()) {
      return new ArrayList<>(paramZl34.ZjM());
    } 
  }
  
  public void Zt(boolean paramBoolean) {
    this.Zt = paramBoolean;
  }
  
  public String ZW(List<String> paramList1, List<String> paramList2) {
    try {
      Zh(paramList1);
      ZI(paramList2);
      if (this.Zk.ZU())
        return this.Zk.ZV; 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return this.Z_.ZV;
  }
  
  private void Zh(List<String> paramList) {
    this.Zk = ZB(paramList);
    this.ZJ = this.Zk.Zi;
  }
  
  private void ZI(List<String> paramList) {
    this.Z_ = ZB(paramList);
    this.Zl = this.Z_.Zi;
  }
  
  private Zxly ZB(List<String> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZV : ()I
    //   11: ldc ''
    //   13: astore #4
    //   15: istore_2
    //   16: aload_1
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore #5
    //   24: aload #5
    //   26: invokeinterface hasNext : ()Z
    //   31: ifeq -> 225
    //   34: aload #5
    //   36: invokeinterface next : ()Ljava/lang/Object;
    //   41: checkcast java/lang/String
    //   44: astore #6
    //   46: aload #6
    //   48: invokevirtual trim : ()Ljava/lang/String;
    //   51: astore #6
    //   53: aload #6
    //   55: invokevirtual isEmpty : ()Z
    //   58: ifeq -> 68
    //   61: goto -> 24
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: aload #6
    //   70: sipush #-6157
    //   73: sipush #-21743
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   82: ifeq -> 104
    //   85: aload #6
    //   87: sipush #-6147
    //   90: sipush #-13930
    //   93: invokestatic a : (II)Ljava/lang/String;
    //   96: invokevirtual length : ()I
    //   99: invokevirtual substring : (I)Ljava/lang/String;
    //   102: astore #6
    //   104: new burp/Zm5t
    //   107: dup
    //   108: aload #6
    //   110: aload_0
    //   111: getfield Zb : Lburp/Zbnt;
    //   114: invokespecial <init> : (Ljava/lang/String;Lburp/Zbnt;)V
    //   117: astore #7
    //   119: aload #7
    //   121: invokevirtual ZK : ()Z
    //   124: ifeq -> 150
    //   127: aload_3
    //   128: aload #7
    //   130: invokevirtual ZW : ()Ljava/lang/String;
    //   133: invokeinterface add : (Ljava/lang/Object;)Z
    //   138: pop
    //   139: iload_2
    //   140: ifne -> 221
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: aload_3
    //   151: aload #7
    //   153: invokevirtual ZW : ()Ljava/lang/String;
    //   156: sipush #-6147
    //   159: sipush #-13930
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: swap
    //   166: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   171: invokeinterface add : (Ljava/lang/Object;)Z
    //   176: pop
    //   177: aload #7
    //   179: invokevirtual ZB : ()Z
    //   182: ifeq -> 209
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: getstatic burp/Zrgs.INVALID_URL_PREFIX_INCLUDING_REGEX : Lburp/Zrgs;
    //   195: iconst_0
    //   196: anewarray java/lang/Object
    //   199: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   202: goto -> 219
    //   205: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   208: athrow
    //   209: getstatic burp/Zrgs.INVALID_URL_PREFIX : Lburp/Zrgs;
    //   212: iconst_0
    //   213: anewarray java/lang/Object
    //   216: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   219: astore #4
    //   221: iload_2
    //   222: ifne -> 24
    //   225: new burp/Zxly
    //   228: dup
    //   229: aload_3
    //   230: aload #4
    //   232: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;)V
    //   235: areturn
    // Exception table:
    //   from	to	target	type
    //   53	64	64	net/portswigger/Zrme
    //   119	143	146	net/portswigger/Zrme
    //   127	185	188	net/portswigger/Zrme
    //   150	205	205	net/portswigger/Zrme
  }
  
  public void Zb(Zmy8 paramZmy8) {
    this.Zm.add(paramZmy8);
  }
  
  public void Zr(int paramInt, Zmy8 paramZmy8) {
    this.Zm.set(paramInt, paramZmy8);
  }
  
  public void ZA(int paramInt) {
    this.Zm.remove(paramInt);
  }
  
  public void ZK(Zmy8 paramZmy8) {
    this.Zy.add(paramZmy8);
  }
  
  public void Zv(int paramInt, Zmy8 paramZmy8) {
    this.Zy.set(paramInt, paramZmy8);
  }
  
  public void ZG(int paramInt) {
    this.Zy.remove(paramInt);
  }
  
  public String Zk() {
    try {
      if (this.Zk.ZU())
        return this.Zk.ZV; 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    try {
      if (this.Z_.ZU())
        return this.Z_.ZV; 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return "";
  }
  
  public void ZI(Zmf_ paramZmf_) {
    boolean bool1 = paramZmf_.Zh(a(-6151, 28286));
    boolean bool2 = paramZmf_.ZC(a(-6145, 23034), false);
    bool1 |= ZR(paramZmf_, a(-6158, -10568), bool2, true);
    bool1 |= ZR(paramZmf_, a(-6169, 25012), bool2, false);
    try {
      if (bool1) {
        try {
        
        } catch (Zrme zrme) {
          throw a(null);
        } 
        this.Zq = !bool2;
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
  }
  
  private boolean ZR(Zmf_ paramZmf_, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    int i = Zbiv.ZV();
    Zlwx zlwx = paramZmf_.Zp(paramString);
    try {
      if (zlwx.ZN()) {
        try {
          if (paramBoolean1) {
            try {
              ZQ(zlwx, paramBoolean2);
              if (i == 0) {
                ZF(zlwx, paramBoolean2);
                return true;
              } 
            } catch (Zrme zrme) {
              throw a(null);
            } 
            return true;
          } 
        } catch (Zrme zrme) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    ZF(zlwx, paramBoolean2);
    return true;
  }
  
  private void ZF(Zlwx paramZlwx, boolean paramBoolean) {
    int i = Zbiv.Zd();
    List<String> list = ZR(paramZlwx.ZO());
    try {
      if (paramBoolean) {
        try {
          Zh(list);
          if (i != 0) {
            ZI(list);
            return;
          } 
        } catch (Zrme zrme) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    ZI(list);
  }
  
  private List<String> ZR(List<Zlwx> paramList) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<Zlwx> iterator = paramList.iterator();
    int i = Zbiv.ZV();
    while (iterator.hasNext()) {
      Zlwx zlwx = iterator.next();
      try {
        if (zlwx.Zq()) {
          Zg55 zg55 = Zsl2.ZN(zlwx.Zf(), this.Za);
          try {
            if (zg55 != null)
              try {
                if (zg55.ZaS())
                  arrayList.add(zg55.ZaD()); 
              } catch (UnsupportedOperationException unsupportedOperationException) {
                throw a(null);
              }  
          } catch (UnsupportedOperationException unsupportedOperationException) {
            throw a(null);
          } 
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        Zah.Zl(unsupportedOperationException, Zk_.USER_ERROR);
      } 
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  private void ZQ(Zlwx paramZlwx, boolean paramBoolean) {
    int i = Zbiv.Zd();
    List<Zmy8> list = Zw(paramZlwx.ZO());
    try {
      if (paramBoolean) {
        try {
          this.Zm.clear();
          this.Zm.addAll(list);
          if (i != 0) {
            this.Zy.clear();
            this.Zy.addAll(list);
            return;
          } 
        } catch (Zrme zrme) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    this.Zy.clear();
    this.Zy.addAll(list);
  }
  
  private List<Zmy8> Zw(List<Zlwx> paramList) {
    ArrayList<Zmy8> arrayList = new ArrayList();
    Iterator<Zlwx> iterator = paramList.iterator();
    int i = Zbiv.Zd();
    while (iterator.hasNext()) {
      Zlwx zlwx = iterator.next();
      try {
        if (zlwx.Zq()) {
          Zmy8 zmy8 = Zxxp.ZD(zlwx.Zf(), this.Za);
          try {
            if (zmy8 != null)
              arrayList.add(zmy8); 
          } catch (UnsupportedOperationException unsupportedOperationException) {
            throw a(null);
          } 
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        Zah.Zl(unsupportedOperationException, Zk_.USER_ERROR);
      } 
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  public String toString() {
    // Byte code:
    //   0: invokestatic ZV : ()I
    //   3: istore_1
    //   4: new java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_2
    //   12: aload_0
    //   13: getfield Zq : Z
    //   16: ifeq -> 181
    //   19: aload_2
    //   20: sipush #-6155
    //   23: sipush #10748
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_2
    //   34: sipush #-6146
    //   37: sipush #-19197
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_0
    //   48: getfield ZJ : Ljava/util/List;
    //   51: invokeinterface iterator : ()Ljava/util/Iterator;
    //   56: astore_3
    //   57: aload_3
    //   58: invokeinterface hasNext : ()Z
    //   63: ifeq -> 105
    //   66: aload_3
    //   67: invokeinterface next : ()Ljava/lang/Object;
    //   72: checkcast java/lang/String
    //   75: astore #4
    //   77: aload_2
    //   78: sipush #-6150
    //   81: sipush #-476
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload #4
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: ldc '\\n'
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: iload_1
    //   102: ifne -> 57
    //   105: aload_2
    //   106: sipush #-6170
    //   109: sipush #-7445
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload_0
    //   120: getfield Zl : Ljava/util/List;
    //   123: invokeinterface iterator : ()Ljava/util/Iterator;
    //   128: astore_3
    //   129: aload_3
    //   130: invokeinterface hasNext : ()Z
    //   135: ifeq -> 177
    //   138: aload_3
    //   139: invokeinterface next : ()Ljava/lang/Object;
    //   144: checkcast java/lang/String
    //   147: astore #4
    //   149: aload_2
    //   150: sipush #-6160
    //   153: sipush #22527
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload #4
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: ldc '\\n'
    //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: pop
    //   173: iload_1
    //   174: ifne -> 129
    //   177: iload_1
    //   178: ifne -> 347
    //   181: aload_2
    //   182: sipush #-6159
    //   185: sipush #-27547
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload_2
    //   196: sipush #-6152
    //   199: sipush #31976
    //   202: invokestatic a : (II)Ljava/lang/String;
    //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload_0
    //   210: getfield Zm : Ljava/util/List;
    //   213: invokeinterface iterator : ()Ljava/util/Iterator;
    //   218: astore_3
    //   219: aload_3
    //   220: invokeinterface hasNext : ()Z
    //   225: ifeq -> 271
    //   228: aload_3
    //   229: invokeinterface next : ()Ljava/lang/Object;
    //   234: checkcast burp/Zmy8
    //   237: astore #4
    //   239: aload_2
    //   240: sipush #-6160
    //   243: sipush #22527
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: aload_0
    //   253: aload #4
    //   255: invokevirtual ZH : (Lburp/Zmy8;)Ljava/lang/String;
    //   258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: ldc '\\n'
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: iload_1
    //   268: ifne -> 219
    //   271: aload_2
    //   272: sipush #-6171
    //   275: sipush #-11744
    //   278: invokestatic a : (II)Ljava/lang/String;
    //   281: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   284: pop
    //   285: aload_0
    //   286: getfield Zy : Ljava/util/List;
    //   289: invokeinterface iterator : ()Ljava/util/Iterator;
    //   294: astore_3
    //   295: aload_3
    //   296: invokeinterface hasNext : ()Z
    //   301: ifeq -> 347
    //   304: aload_3
    //   305: invokeinterface next : ()Ljava/lang/Object;
    //   310: checkcast burp/Zmy8
    //   313: astore #4
    //   315: aload_2
    //   316: sipush #-6160
    //   319: sipush #22527
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: aload_0
    //   329: aload #4
    //   331: invokevirtual ZH : (Lburp/Zmy8;)Ljava/lang/String;
    //   334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: ldc '\\n'
    //   339: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: pop
    //   343: iload_1
    //   344: ifne -> 295
    //   347: aload_2
    //   348: invokevirtual toString : ()Ljava/lang/String;
    //   351: areturn
  }
  
  private String ZH(Zmy8 paramZmy8) {
    try {
    
    } catch (Zrme zrme) {
      throw a(null);
    } 
    try {
    
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return (paramZmy8.ZlM() ? a(-6154, 13775) : a(-6176, -18485)) + (paramZmy8.ZlM() ? a(-6154, 13775) : a(-6176, -18485)) + ((paramZmy8.Zl5() == 1) ? a(-6156, -20016) : a(-6175, 14665)) + ":" + paramZmy8.Zlg() + paramZmy8.ZlU();
  }
  
  public Zlor Ze(Zl34 paramZl341, Zl34 paramZl342, Zr_4 paramZr_4) {
    return Zm(paramZl341, paramZl342, paramZr_4, null);
  }
  
  public Zlor Zm(Zl34 paramZl341, Zl34 paramZl342, Zr_4 paramZr_4, Zr1j paramZr1j) {
    ZO(paramZl341, paramZl342, paramZr_4);
    return new Zlor(paramZl341, paramZl342, this.Za, paramZr_4, paramZr1j);
  }
  
  public void ZY(Zl34 paramZl341, Zl34 paramZl342, Zr_4 paramZr_4) {
    synchronized (paramZl341.Zz6()) {
      Ze(paramZl341, paramZl342);
      ZO(paramZl341, paramZl342, paramZr_4);
    } 
  }
  
  public void Ze(Zl34 paramZl341, Zl34 paramZl342) {
    synchronized (paramZl341.Zz6()) {
      paramZl341.Zjg().clear();
      paramZl341.ZjM().clear();
      paramZl342.Zjg().clear();
      paramZl342.ZjM().clear();
      paramZl341.ZOt(true);
      paramZl342.ZOt(true);
    } 
  }
  
  public void ZO(Zl34 paramZl341, Zl34 paramZl342, Zr_4 paramZr_4) {
    paramZl341.ZOt(this.Zq);
    paramZl342.ZOt(this.Zq);
    int i = Zbiv.Zd();
    try {
      if (this.Zq) {
        try {
          Objects.requireNonNull(paramZl341.Zjg());
          this.ZJ.stream().map(this::lambda$updateIncludeExcludeData$0).distinct().map(paramZr_4::lambda$updateIncludeExcludeData$1).forEach(paramZl341.Zjg()::add);
          Objects.requireNonNull(paramZl342.Zjg());
          this.Zl.stream().map(this::lambda$updateIncludeExcludeData$0).distinct().map(paramZr_4::lambda$updateIncludeExcludeData$1).forEach(paramZl342.Zjg()::add);
          if (i != 0) {
            Objects.requireNonNull(paramZl341.ZjM());
            this.Zm.stream().map(paramZr_4::lambda$updateIncludeExcludeData$4).forEach(paramZl341.ZjM()::add);
            Objects.requireNonNull(paramZl342.ZjM());
            this.Zy.stream().map(paramZr_4::lambda$updateIncludeExcludeData$4).forEach(paramZl342.ZjM()::add);
            return;
          } 
        } catch (Zrme zrme) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    Objects.requireNonNull(paramZl341.ZjM());
    this.Zm.stream().map(paramZr_4::lambda$updateIncludeExcludeData$4).forEach(paramZl341.ZjM()::add);
    Objects.requireNonNull(paramZl342.ZjM());
    this.Zy.stream().map(paramZr_4::lambda$updateIncludeExcludeData$4).forEach(paramZl342.ZjM()::add);
  }
  
  private static String Zb(String paramString) {
    try {
      if (paramString.startsWith(a(-6172, -14191)))
        return paramString.substring(a(-6172, -14191).length()); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    try {
      if (paramString.startsWith(a(-6149, 536)))
        return paramString.substring(a(-6149, 536).length()); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return paramString;
  }
  
  private static Zmy8 lambda$updateIncludeExcludeData$4(Zr_4 paramZr_4, Zmy8 paramZmy8) {
    return paramZmy8.ZC(paramZr_4);
  }
  
  private static Zg55 lambda$updateIncludeExcludeData$1(Zr_4 paramZr_4, String paramString) {
    return paramZr_4.<Zg55>ZH(new Zlkh(true, paramString, false));
  }
  
  private String lambda$updateIncludeExcludeData$0(String paramString) {
    try {
    
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return this.Zt ? Zb(paramString) : paramString;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'äÍ`z#Ýv\]+t½[®t@W÷±Z¨5[TC õyar!\\b\\bG®Ä¡[cù\\b¼§ü#.Îâ.3~/}G8f<]%\\rl>+U×r÷_ðÎöîLqQ«]a²%ÌV±à«qÎ`'/ÀCÚ^*¥x¿Éõé±t»ò |;t\\fbºoZl--7Ò>_ÜÆ£?²å³ÄðkÉOäÑÀÔ'XþU\\\bOm,ÊY´tgi<¾U§À¨öcùvaMÈ»ÜÛ>\\r´×0h´Õ½\\rx6ßð¢¶ î\\tÎ}5-Pª"*ñx'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #18
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #50
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '©¾r&á\\tÎ÷ÿ_¼+Ö'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #115
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zzxj.a : [Ljava/lang/String;
    //   132: bipush #22
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzxj.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #14
    //   214: goto -> 244
    //   217: bipush #46
    //   219: goto -> 244
    //   222: bipush #97
    //   224: goto -> 244
    //   227: bipush #92
    //   229: goto -> 244
    //   232: bipush #13
    //   234: goto -> 244
    //   237: bipush #119
    //   239: goto -> 244
    //   242: bipush #120
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE7F5) & 0xFFFF;
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
      char c = 'ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzxj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */