package burp;

import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zrz9;
import net.portswigger.Zto;

public class Zldc implements Zmgv {
  private final Zsh8 ZG;
  
  private final List<Zbdf> ZR = new ArrayList<>();
  
  private final Ztyg Zg;
  
  private final Zey9 Zt;
  
  private final Zsg_ Zq;
  
  private final Zlte ZJ;
  
  private List<Integer> ZY;
  
  private Zgxp ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zldc(Zsh8 paramZsh8, Ztyg paramZtyg, Zey9 paramZey9, Zxco paramZxco) {
    this.ZG = paramZsh8;
    this.Zg = paramZtyg;
    this.Zt = paramZey9;
    this.Zq = new Zsg_(paramZxco);
    this.ZJ = Zrxv.Zp().Zs().ZI().ZW();
    this.ZJ.setName(a(21998, 6609));
  }
  
  public Component Zx() {
    return this.ZJ.ZO();
  }
  
  public void Zd(Zgxp paramZgxp) {
    if (Zewd.ZI(paramZgxp, this.ZE))
      ZE(paramZgxp); 
  }
  
  public void ZE(Zgxp paramZgxp) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield ZE : Lburp/Zgxp;
    //   5: invokestatic ZK : ()I
    //   8: iconst_0
    //   9: istore_3
    //   10: aload_0
    //   11: new java/util/ArrayList
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: putfield ZY : Ljava/util/List;
    //   21: istore_2
    //   22: new java/util/ArrayList
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #4
    //   31: aload_1
    //   32: invokeinterface Zo3 : ()Lburp/Zbr;
    //   37: astore #5
    //   39: aload #5
    //   41: ifnull -> 148
    //   44: aload #5
    //   46: invokevirtual Zd : ()Z
    //   49: ifne -> 148
    //   52: aload_1
    //   53: invokeinterface Ze8 : ()B
    //   58: ifne -> 73
    //   61: sipush #21995
    //   64: sipush #-22941
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: goto -> 82
    //   73: sipush #21988
    //   76: sipush #29229
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: astore #6
    //   84: aload #5
    //   86: aload_1
    //   87: invokeinterface Zod : ()Lburp/Zmzk;
    //   92: aload_0
    //   93: getfield Zt : Lburp/Zey9;
    //   96: invokevirtual ZP : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zefx;
    //   99: astore #7
    //   101: aload_0
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: aload #7
    //   108: aload_1
    //   109: invokeinterface Zoe : ()Lburp/Zgsq;
    //   114: invokevirtual Zi : (ILburp/Zefx;Lburp/Zgsq;)Lburp/Zbdf;
    //   117: astore #8
    //   119: aload #4
    //   121: aload #6
    //   123: aload #8
    //   125: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: aload_0
    //   135: getfield ZY : Ljava/util/List;
    //   138: iconst_0
    //   139: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   142: invokeinterface add : (Ljava/lang/Object;)Z
    //   147: pop
    //   148: aload_1
    //   149: invokeinterface ZeB : ()Lburp/Zxo;
    //   154: astore #6
    //   156: iconst_0
    //   157: istore #7
    //   159: iload #7
    //   161: aload_1
    //   162: invokeinterface Ze8 : ()B
    //   167: if_icmpge -> 339
    //   170: aload #6
    //   172: iload #7
    //   174: invokeinterface ZJQ : (I)Lburp/Zstu;
    //   179: astore #8
    //   181: aload #6
    //   183: iload #7
    //   185: invokeinterface ZJb : (I)Lburp/Zstu;
    //   190: astore #9
    //   192: aload #9
    //   194: ifnull -> 261
    //   197: iload #7
    //   199: iconst_1
    //   200: iadd
    //   201: sipush #21996
    //   204: sipush #14173
    //   207: invokestatic a : (II)Ljava/lang/String;
    //   210: swap
    //   211: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   216: astore #10
    //   218: aload_0
    //   219: iload_3
    //   220: iinc #3, 1
    //   223: aload #9
    //   225: iconst_0
    //   226: invokevirtual Zt : (ILburp/Zstu;Z)Lburp/Zbdf;
    //   229: astore #11
    //   231: aload #4
    //   233: aload #10
    //   235: aload #11
    //   237: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   240: invokeinterface add : (Ljava/lang/Object;)Z
    //   245: pop
    //   246: aload_0
    //   247: getfield ZY : Ljava/util/List;
    //   250: iload #7
    //   252: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   255: invokeinterface add : (Ljava/lang/Object;)Z
    //   260: pop
    //   261: aload #8
    //   263: ifnull -> 332
    //   266: iload #7
    //   268: iconst_2
    //   269: iadd
    //   270: sipush #21989
    //   273: sipush #-4091
    //   276: invokestatic a : (II)Ljava/lang/String;
    //   279: swap
    //   280: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   285: astore #10
    //   287: aload_0
    //   288: iload_3
    //   289: iinc #3, 1
    //   292: aload #8
    //   294: iconst_1
    //   295: invokevirtual Zt : (ILburp/Zstu;Z)Lburp/Zbdf;
    //   298: astore #11
    //   300: aload #4
    //   302: aload #10
    //   304: aload #11
    //   306: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   309: invokeinterface add : (Ljava/lang/Object;)Z
    //   314: pop
    //   315: aload_0
    //   316: getfield ZY : Ljava/util/List;
    //   319: iload #7
    //   321: iconst_1
    //   322: iadd
    //   323: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   326: invokeinterface add : (Ljava/lang/Object;)Z
    //   331: pop
    //   332: iinc #7, 1
    //   335: iload_2
    //   336: ifeq -> 159
    //   339: aload_1
    //   340: invokeinterface ZoO : ()Lburp/Zstu;
    //   345: astore #7
    //   347: aload #7
    //   349: ifnull -> 445
    //   352: aload_1
    //   353: invokeinterface Ze8 : ()B
    //   358: ifne -> 373
    //   361: sipush #21999
    //   364: sipush #-22812
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: goto -> 396
    //   373: aload_1
    //   374: invokeinterface Ze8 : ()B
    //   379: iconst_1
    //   380: iadd
    //   381: sipush #21997
    //   384: sipush #-22516
    //   387: invokestatic a : (II)Ljava/lang/String;
    //   390: swap
    //   391: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   396: astore #8
    //   398: aload_0
    //   399: iload_3
    //   400: iinc #3, 1
    //   403: aload #7
    //   405: iconst_0
    //   406: invokevirtual Zt : (ILburp/Zstu;Z)Lburp/Zbdf;
    //   409: astore #9
    //   411: aload #4
    //   413: aload #8
    //   415: aload #9
    //   417: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   420: invokeinterface add : (Ljava/lang/Object;)Z
    //   425: pop
    //   426: aload_0
    //   427: getfield ZY : Ljava/util/List;
    //   430: aload_1
    //   431: invokeinterface Ze8 : ()B
    //   436: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   439: invokeinterface add : (Ljava/lang/Object;)Z
    //   444: pop
    //   445: aload_0
    //   446: getfield ZR : Ljava/util/List;
    //   449: invokeinterface size : ()I
    //   454: iload_3
    //   455: if_icmple -> 472
    //   458: aload_0
    //   459: getfield ZR : Ljava/util/List;
    //   462: invokeinterface removeLast : ()Ljava/lang/Object;
    //   467: pop
    //   468: iload_2
    //   469: ifeq -> 445
    //   472: aload_1
    //   473: invokeinterface Zed : ()Lburp/Zefg;
    //   478: astore #8
    //   480: aload #4
    //   482: aload_0
    //   483: aload #8
    //   485: invokevirtual Ze : (Lburp/Zefg;)Ljava/util/List;
    //   488: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   493: pop
    //   494: aload_0
    //   495: aload #4
    //   497: <illegal opcode> run : (Lburp/Zldc;Ljava/util/List;)Ljava/lang/Runnable;
    //   502: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   505: invokestatic Zwu : ()[Lburp/Zbqc;
    //   508: ifnonnull -> 518
    //   511: iinc #2, 1
    //   514: iload_2
    //   515: invokestatic ZF : (I)V
    //   518: return
  }
  
  private Zbdf Zi(int paramInt, Zefx paramZefx, Zgsq paramZgsq) {
    Zbdf zbdf = ZL(paramInt);
    zbdf.ZA(paramZefx, paramZgsq);
    return zbdf;
  }
  
  private Zbdf Zt(int paramInt, Zstu paramZstu, boolean paramBoolean) {
    Zbdf zbdf = ZL(paramInt);
    zbdf.ZE(paramZstu, paramBoolean ? Zgu3.HTTP_REQUEST : Zgu3.HTTP_RESPONSE);
    return zbdf;
  }
  
  private Zbdf ZL(int paramInt) {
    int i = Zmuy.ZK();
    if (paramInt < this.ZR.size()) {
      Zbdf zbdf1 = this.ZR.get(paramInt);
      if (i != 0) {
        zbdf1 = this.Zg.Zz(this, Zeew.INTRUDER, false, Zbdf.ZR, Zb9b.Zx);
        this.ZR.add(zbdf1);
        return zbdf1;
      } 
      return zbdf1;
    } 
    Zbdf zbdf = this.Zg.Zz(this, Zeew.INTRUDER, false, Zbdf.ZR, Zb9b.Zx);
    this.ZR.add(zbdf);
    return zbdf;
  }
  
  private List<Zto<String, Component>> Ze(Zefg<Ztkk> paramZefg) {
    this.Zq.ZN();
    Zew9 zew9 = new Zew9(this.Zq);
    Map<Zrz9, Boolean> map = ZH(paramZefg);
    HashMap<Object, Object> hashMap = new HashMap<>();
    ArrayList<Zto> arrayList = new ArrayList();
    int i = Zmuy.ZK();
    for (Ztkk ztkk : paramZefg) {
      ztkk.ZC(zew9);
      String str = Zm(ztkk, ((Boolean)map.get(ztkk.Zu())).booleanValue(), (Map)hashMap);
      arrayList.add(Zto.ZM(str, zew9.Zh()));
      if (i != 0)
        break; 
    } 
    return (List)arrayList;
  }
  
  private static String Zm(Ztkk paramZtkk, boolean paramBoolean, Map<Zrz9, AtomicInteger> paramMap) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(21992, -31074)).append(paramZtkk.Zu()).append(a(21993, -15181));
    if (paramBoolean) {
      int i = ((AtomicInteger)paramMap.computeIfAbsent(paramZtkk.Zu(), Zldc::lambda$buildTabName$2)).getAndIncrement();
      stringBuilder.append(" ").append(i);
    } 
    return stringBuilder.toString();
  }
  
  private static Map<Zrz9, Boolean> ZH(Zefg<Ztkk> paramZefg) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Zp : ()I
    //   11: aload_0
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore_3
    //   18: istore_1
    //   19: aload_3
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 106
    //   28: aload_3
    //   29: invokeinterface next : ()Ljava/lang/Object;
    //   34: checkcast burp/Ztkk
    //   37: astore #4
    //   39: aload_2
    //   40: aload #4
    //   42: invokeinterface Zu : ()Lnet/portswigger/Zrz9;
    //   47: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   52: checkcast java/lang/Boolean
    //   55: astore #5
    //   57: aload #5
    //   59: ifnonnull -> 84
    //   62: aload_2
    //   63: aload #4
    //   65: invokeinterface Zu : ()Lnet/portswigger/Zrz9;
    //   70: iconst_0
    //   71: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   74: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   79: pop
    //   80: iload_1
    //   81: ifne -> 102
    //   84: aload_2
    //   85: aload #4
    //   87: invokeinterface Zu : ()Lnet/portswigger/Zrz9;
    //   92: iconst_1
    //   93: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   96: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   101: pop
    //   102: iload_1
    //   103: ifne -> 19
    //   106: aload_2
    //   107: areturn
  }
  
  private int Zm() {
    int i = this.ZJ.getSelectedIndex();
    return (i >= 0 && i < this.ZY.size()) ? ((Integer)this.ZY.get(i)).intValue() : -1;
  }
  
  public Zmzk Zod() {
    int i = Zm();
    return (i == -1) ? Zz96.Zm(this.ZG.ZPE().ZwZ()) : ((i == 0) ? this.ZE.Zod() : this.ZE.ZeV().ZdF(i - 1));
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return new Zepa(a(21994, -5169), Zk97.DESKTOP_TOOLS_INTRUDER_ATTACKS_ATTACK_RESULTS, Zt2m.ZF(this.ZJ.ZO()));
  }
  
  public Zstu Zos() {
    int i = Zm();
    return (i == -1) ? this.ZE.Zos() : ((i == 0) ? this.ZE.Zos() : this.ZE.ZeB().ZJQ(i - 1));
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public Zstu ZoO() {
    int i = Zm();
    return (i == -1) ? this.ZE.ZoO() : ((i == this.ZE.Ze8()) ? this.ZE.ZoO() : this.ZE.ZeB().ZJb(i));
  }
  
  public long ZoB() {
    return this.ZE.Zef();
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  private static AtomicInteger lambda$buildTabName$2(Zrz9 paramZrz9) {
    return new AtomicInteger(1);
  }
  
  private void lambda$showResultItem$1(List paramList) {
    int i = this.ZJ.getSelectedIndex();
    this.ZJ.removeAll();
    paramList.forEach(this::lambda$showResultItem$0);
    if (i != -1)
      this.ZJ.setSelectedIndex(Math.min(i, this.ZJ.getTabCount() - 1)); 
  }
  
  private void lambda$showResultItem$0(Zto paramZto) {
    this.ZJ.addTab((String)paramZto.Zq, (Component)paramZto.Zo);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'm ø·ávô\\tÃáø\\bã0#4\\n]ªoä1á¬¥2VUidj®kÏg(O¡hïz\\b 'l`s\\r1tí_ªÆOÎJvOø\\fµ~rªRòSçJXïîAþ/z)\\r¯H8¦ÂË ]_îÛaÿü^ÛIJu'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
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
    //   68: ldc '­¬uæX¢ûm\\bvO7-'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #48
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
    //   129: putstatic burp/Zldc.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zldc.b : [Ljava/lang/String;
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
    //   212: bipush #94
    //   214: goto -> 244
    //   217: bipush #47
    //   219: goto -> 244
    //   222: bipush #84
    //   224: goto -> 244
    //   227: bipush #28
    //   229: goto -> 244
    //   232: bipush #112
    //   234: goto -> 244
    //   237: bipush #99
    //   239: goto -> 244
    //   242: bipush #117
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
    int i = (paramInt1 ^ 0x55EC) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */