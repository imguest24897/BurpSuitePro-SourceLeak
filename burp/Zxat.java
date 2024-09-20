package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zxat {
  private final Map<String, List<Ztbr>> Zl = new HashMap<>();
  
  private Zkky Zj;
  
  void ZZ(Zkky paramZkky) {
    this.Zj = paramZkky;
  }
  
  public void Zf(List<Ztbr> paramList, Zmzk paramZmzk, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface iterator : ()Ljava/util/Iterator;
    //   6: astore #5
    //   8: invokestatic Zs : ()[Lburp/Zbqc;
    //   11: aconst_null
    //   12: astore #6
    //   14: aconst_null
    //   15: astore #7
    //   17: astore #4
    //   19: aload #5
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 625
    //   29: aload #5
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: checkcast burp/Ztbr
    //   39: astore #8
    //   41: aload #8
    //   43: invokeinterface ZqJ : ()Ljava/lang/String;
    //   48: ifnonnull -> 63
    //   51: iconst_0
    //   52: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   55: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   58: aload #4
    //   60: ifnonnull -> 19
    //   63: iload_3
    //   64: ifeq -> 287
    //   67: aload #8
    //   69: invokeinterface ZqD : ()Ljava/lang/String;
    //   74: ifnull -> 96
    //   77: aload #8
    //   79: invokeinterface ZqJ : ()Ljava/lang/String;
    //   84: aload_2
    //   85: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   90: invokevirtual equals : (Ljava/lang/Object;)Z
    //   93: ifne -> 287
    //   96: aload_0
    //   97: getfield Zl : Ljava/util/Map;
    //   100: dup
    //   101: astore #9
    //   103: monitorenter
    //   104: aload_0
    //   105: getfield Zl : Ljava/util/Map;
    //   108: aload_2
    //   109: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   114: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   119: checkcast java/util/List
    //   122: astore #10
    //   124: aload #10
    //   126: ifnull -> 273
    //   129: aload #10
    //   131: dup
    //   132: astore #11
    //   134: monitorenter
    //   135: aload #10
    //   137: invokeinterface iterator : ()Ljava/util/Iterator;
    //   142: astore #12
    //   144: aload #12
    //   146: invokeinterface hasNext : ()Z
    //   151: ifeq -> 259
    //   154: aload #12
    //   156: invokeinterface next : ()Ljava/lang/Object;
    //   161: checkcast burp/Ztbr
    //   164: astore #13
    //   166: aload #8
    //   168: invokeinterface Zqy : ()Ljava/lang/String;
    //   173: aload #13
    //   175: invokeinterface Zqy : ()Ljava/lang/String;
    //   180: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   183: ifne -> 189
    //   186: goto -> 144
    //   189: aload #8
    //   191: invokeinterface Zq0 : ()Ljava/lang/String;
    //   196: aload #13
    //   198: invokeinterface Zq0 : ()Ljava/lang/String;
    //   203: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   206: ifeq -> 220
    //   209: aload #11
    //   211: monitorexit
    //   212: aload #9
    //   214: monitorexit
    //   215: aload #4
    //   217: ifnonnull -> 19
    //   220: new burp/Zce
    //   223: dup
    //   224: aload #8
    //   226: invokeinterface Zqk : ()Ljava/lang/String;
    //   231: aload_2
    //   232: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   237: aload #8
    //   239: invokeinterface Zqy : ()Ljava/lang/String;
    //   244: aload #8
    //   246: invokeinterface Zq0 : ()Ljava/lang/String;
    //   251: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   254: astore #8
    //   256: goto -> 259
    //   259: aload #11
    //   261: monitorexit
    //   262: goto -> 273
    //   265: astore #14
    //   267: aload #11
    //   269: monitorexit
    //   270: aload #14
    //   272: athrow
    //   273: aload #9
    //   275: monitorexit
    //   276: goto -> 287
    //   279: astore #15
    //   281: aload #9
    //   283: monitorexit
    //   284: aload #15
    //   286: athrow
    //   287: aload #8
    //   289: invokeinterface ZqJ : ()Ljava/lang/String;
    //   294: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   297: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   300: astore #9
    //   302: aload #9
    //   304: aload #6
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 321
    //   312: aload #7
    //   314: astore #10
    //   316: aload #4
    //   318: ifnonnull -> 372
    //   321: aload_0
    //   322: getfield Zl : Ljava/util/Map;
    //   325: dup
    //   326: astore #11
    //   328: monitorenter
    //   329: aload_0
    //   330: getfield Zl : Ljava/util/Map;
    //   333: aload #9
    //   335: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   340: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   345: checkcast java/util/List
    //   348: astore #10
    //   350: aload #11
    //   352: monitorexit
    //   353: goto -> 364
    //   356: astore #16
    //   358: aload #11
    //   360: monitorexit
    //   361: aload #16
    //   363: athrow
    //   364: aload #9
    //   366: astore #6
    //   368: aload #10
    //   370: astore #7
    //   372: aload_0
    //   373: getfield Zl : Ljava/util/Map;
    //   376: dup
    //   377: astore #11
    //   379: monitorenter
    //   380: aload #10
    //   382: dup
    //   383: astore #12
    //   385: monitorenter
    //   386: aload #10
    //   388: invokeinterface iterator : ()Ljava/util/Iterator;
    //   393: astore #13
    //   395: iconst_1
    //   396: istore #14
    //   398: iconst_0
    //   399: istore #15
    //   401: aload #13
    //   403: invokeinterface hasNext : ()Z
    //   408: ifeq -> 538
    //   411: aload #13
    //   413: invokeinterface next : ()Ljava/lang/Object;
    //   418: checkcast burp/Ztbr
    //   421: astore #16
    //   423: aload #16
    //   425: invokeinterface Zqy : ()Ljava/lang/String;
    //   430: aload #8
    //   432: invokeinterface Zqy : ()Ljava/lang/String;
    //   437: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   440: ifeq -> 533
    //   443: aload #16
    //   445: invokeinterface ZqD : ()Ljava/lang/String;
    //   450: aload #8
    //   452: invokeinterface ZqD : ()Ljava/lang/String;
    //   457: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   460: ifeq -> 533
    //   463: aload #16
    //   465: invokeinterface Zq0 : ()Ljava/lang/String;
    //   470: aload #8
    //   472: invokeinterface Zq0 : ()Ljava/lang/String;
    //   477: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   480: ifeq -> 491
    //   483: iconst_0
    //   484: istore #14
    //   486: aload #4
    //   488: ifnonnull -> 514
    //   491: aload #13
    //   493: invokeinterface remove : ()V
    //   498: iconst_1
    //   499: istore #15
    //   501: aload #8
    //   503: invokeinterface Zq0 : ()Ljava/lang/String;
    //   508: ifnonnull -> 514
    //   511: iconst_0
    //   512: istore #14
    //   514: aload_0
    //   515: aload #16
    //   517: invokeinterface ZqJ : ()Ljava/lang/String;
    //   522: aload #16
    //   524: invokeinterface Zqy : ()Ljava/lang/String;
    //   529: iconst_0
    //   530: invokevirtual ZL : (Ljava/lang/String;Ljava/lang/String;Z)V
    //   533: aload #4
    //   535: ifnonnull -> 401
    //   538: iload #14
    //   540: ifeq -> 592
    //   543: aload #10
    //   545: aload #8
    //   547: invokeinterface add : (Ljava/lang/Object;)Z
    //   552: pop
    //   553: aload_0
    //   554: getfield Zj : Lburp/Zkky;
    //   557: ifnull -> 592
    //   560: iload #15
    //   562: ifeq -> 581
    //   565: aload_0
    //   566: getfield Zj : Lburp/Zkky;
    //   569: aload #8
    //   571: invokeinterface ZD : (Lburp/Ztbr;)V
    //   576: aload #4
    //   578: ifnonnull -> 592
    //   581: aload_0
    //   582: getfield Zj : Lburp/Zkky;
    //   585: aload #8
    //   587: invokeinterface ZP : (Lburp/Ztbr;)V
    //   592: aload #12
    //   594: monitorexit
    //   595: goto -> 606
    //   598: astore #17
    //   600: aload #12
    //   602: monitorexit
    //   603: aload #17
    //   605: athrow
    //   606: aload #11
    //   608: monitorexit
    //   609: goto -> 620
    //   612: astore #18
    //   614: aload #11
    //   616: monitorexit
    //   617: aload #18
    //   619: athrow
    //   620: aload #4
    //   622: ifnonnull -> 19
    //   625: return
    // Exception table:
    //   from	to	target	type
    //   104	215	279	finally
    //   135	212	265	finally
    //   220	262	265	finally
    //   220	276	279	finally
    //   265	270	265	finally
    //   279	284	279	finally
    //   329	353	356	finally
    //   356	361	356	finally
    //   380	609	612	finally
    //   386	595	598	finally
    //   598	603	598	finally
    //   612	617	612	finally
  }
  
  public List<Ztbr> ZW(Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    ArrayList<Ztbr> arrayList = new ArrayList();
    if (paramZmzk != null)
      Z_(arrayList, paramZmzk.ZJ1(), paramZmzk.ZJZ(), paramArrayOfbyte); 
    return arrayList;
  }
  
  private void ZL(String paramString1, String paramString2, boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = Zxzh.Zs();
    if (paramBoolean)
      synchronized (this.Zl) {
        List list = this.Zl.get(paramString1);
        if (list != null)
          synchronized (list) {
            Iterator<Ztbr> iterator = list.iterator();
            while (iterator.hasNext()) {
              Ztbr ztbr = iterator.next();
              if (ztbr.Zqy().equals(paramString2)) {
                iterator.remove();
                if (this.Zj != null) {
                  this.Zj.ZE(ztbr);
                  if (arrayOfZbqc == null)
                    continue; 
                } 
                break;
              } 
              continue;
              if (arrayOfZbqc == null)
                break; 
            } 
          }  
      }  
    int i = paramString1.indexOf(".");
    if (i > 0)
      ZL(paramString1.substring(i + 1), paramString2, true); 
  }
  
  private void Z_(List<Ztbr> paramList, String paramString, boolean paramBoolean, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic Zs : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield Zl : Ljava/util/Map;
    //   9: dup
    //   10: astore #7
    //   12: monitorenter
    //   13: aload_0
    //   14: getfield Zl : Ljava/util/Map;
    //   17: aload_2
    //   18: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast java/util/List
    //   26: astore #6
    //   28: aload #6
    //   30: ifnull -> 200
    //   33: aload #6
    //   35: dup
    //   36: astore #8
    //   38: monitorenter
    //   39: aload #6
    //   41: invokeinterface iterator : ()Ljava/util/Iterator;
    //   46: astore #9
    //   48: aload #9
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 186
    //   58: aload #9
    //   60: invokeinterface next : ()Ljava/lang/Object;
    //   65: checkcast burp/Ztbr
    //   68: astore #10
    //   70: aload #10
    //   72: invokeinterface Zqj : ()Z
    //   77: ifeq -> 87
    //   80: iload_3
    //   81: ifne -> 87
    //   84: goto -> 48
    //   87: aload #10
    //   89: invokeinterface ZqD : ()Ljava/lang/String;
    //   94: ifnull -> 130
    //   97: aload #4
    //   99: invokestatic ZG : ([B)Ljava/lang/String;
    //   102: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   105: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   108: aload #10
    //   110: invokeinterface ZqD : ()Ljava/lang/String;
    //   115: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   118: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   121: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   124: ifne -> 130
    //   127: goto -> 48
    //   130: aload_1
    //   131: aload #10
    //   133: invokeinterface contains : (Ljava/lang/Object;)Z
    //   138: ifeq -> 172
    //   141: aload_1
    //   142: aload #10
    //   144: invokestatic Zb : (Ljava/util/List;Lburp/Ztbr;)Lburp/Ztbr;
    //   147: astore #11
    //   149: aload #10
    //   151: aload #11
    //   153: invokestatic ZG : (Lburp/Ztbr;Lburp/Ztbr;)Z
    //   156: ifeq -> 48
    //   159: aload_1
    //   160: aload #10
    //   162: aload #11
    //   164: invokestatic ZH : (Ljava/util/List;Lburp/Ztbr;Lburp/Ztbr;)V
    //   167: aload #5
    //   169: ifnonnull -> 48
    //   172: aload_1
    //   173: aload #10
    //   175: invokeinterface add : (Ljava/lang/Object;)Z
    //   180: pop
    //   181: aload #5
    //   183: ifnonnull -> 48
    //   186: aload #8
    //   188: monitorexit
    //   189: goto -> 200
    //   192: astore #12
    //   194: aload #8
    //   196: monitorexit
    //   197: aload #12
    //   199: athrow
    //   200: aload #7
    //   202: monitorexit
    //   203: goto -> 214
    //   206: astore #13
    //   208: aload #7
    //   210: monitorexit
    //   211: aload #13
    //   213: athrow
    //   214: aload_2
    //   215: ldc '.'
    //   217: invokevirtual indexOf : (Ljava/lang/String;)I
    //   220: istore #7
    //   222: iload #7
    //   224: ifle -> 243
    //   227: aload_0
    //   228: aload_1
    //   229: aload_2
    //   230: iload #7
    //   232: iconst_1
    //   233: iadd
    //   234: invokevirtual substring : (I)Ljava/lang/String;
    //   237: iload_3
    //   238: aload #4
    //   240: invokevirtual Z_ : (Ljava/util/List;Ljava/lang/String;Z[B)V
    //   243: return
    // Exception table:
    //   from	to	target	type
    //   13	203	206	finally
    //   39	189	192	finally
    //   192	197	192	finally
    //   206	211	206	finally
  }
  
  public List<Ztbr> Zi() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Zs : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: getfield Zl : Ljava/util/Map;
    //   15: dup
    //   16: astore_3
    //   17: monitorenter
    //   18: astore_1
    //   19: new java/util/TreeSet
    //   22: dup
    //   23: aload_0
    //   24: getfield Zl : Ljava/util/Map;
    //   27: invokeinterface keySet : ()Ljava/util/Set;
    //   32: invokespecial <init> : (Ljava/util/Collection;)V
    //   35: astore #4
    //   37: aload #4
    //   39: invokeinterface iterator : ()Ljava/util/Iterator;
    //   44: astore #5
    //   46: aload #5
    //   48: invokeinterface hasNext : ()Z
    //   53: ifeq -> 110
    //   56: aload_0
    //   57: getfield Zl : Ljava/util/Map;
    //   60: aload #5
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   72: checkcast java/util/List
    //   75: astore #6
    //   77: aload #6
    //   79: dup
    //   80: astore #7
    //   82: monitorenter
    //   83: aload_2
    //   84: aload #6
    //   86: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   91: pop
    //   92: aload #7
    //   94: monitorexit
    //   95: goto -> 106
    //   98: astore #8
    //   100: aload #7
    //   102: monitorexit
    //   103: aload #8
    //   105: athrow
    //   106: aload_1
    //   107: ifnonnull -> 46
    //   110: aload_3
    //   111: monitorexit
    //   112: goto -> 122
    //   115: astore #9
    //   117: aload_3
    //   118: monitorexit
    //   119: aload #9
    //   121: athrow
    //   122: aload_2
    //   123: areturn
    // Exception table:
    //   from	to	target	type
    //   19	112	115	finally
    //   83	95	98	finally
    //   98	103	98	finally
    //   115	119	115	finally
  }
  
  void Zg(Ztbr paramZtbr) {
    synchronized (this.Zl) {
      List list = this.Zl.get(paramZtbr.ZqJ());
      if (list != null) {
        boolean bool;
        synchronized (list) {
          bool = list.remove(paramZtbr);
        } 
        Zuh.Zb(bool, Zqf.ZH);
      } 
    } 
  }
  
  public void ZH() {
    synchronized (this.Zl) {
      this.Zl.clear();
    } 
  }
  
  void ZX(Ztbr paramZtbr1, Ztbr paramZtbr2) {
    Zg(paramZtbr1);
    String str = paramZtbr2.ZqJ().toLowerCase(Locale.ENGLISH);
    Zbqc[] arrayOfZbqc = Zxzh.Zs();
    synchronized (this.Zl) {
      List<Ztbr> list = this.Zl.computeIfAbsent(str, Zxat::lambda$updateCookies$0);
      synchronized (list) {
        Iterator<Ztbr> iterator = list.iterator();
        while (iterator.hasNext()) {
          Ztbr ztbr = iterator.next();
          if (ztbr.Zqy().equals(paramZtbr2.Zqy())) {
            iterator.remove();
            if (arrayOfZbqc == null)
              continue; 
            break;
          } 
          continue;
          if (arrayOfZbqc == null)
            break; 
        } 
        list.add(paramZtbr2);
      } 
    } 
  }
  
  private static void ZH(List<Ztbr> paramList, Ztbr paramZtbr1, Ztbr paramZtbr2) {
    // Byte code:
    //   0: invokestatic Zs : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_2
    //   5: invokeinterface ZqD : ()Ljava/lang/String;
    //   10: ifnull -> 63
    //   13: aload_1
    //   14: invokeinterface ZqD : ()Ljava/lang/String;
    //   19: ifnull -> 63
    //   22: aload_1
    //   23: invokeinterface ZqD : ()Ljava/lang/String;
    //   28: invokevirtual length : ()I
    //   31: aload_2
    //   32: invokeinterface ZqD : ()Ljava/lang/String;
    //   37: invokevirtual length : ()I
    //   40: if_icmple -> 97
    //   43: aload_0
    //   44: aload_2
    //   45: invokeinterface remove : (Ljava/lang/Object;)Z
    //   50: pop
    //   51: aload_0
    //   52: aload_1
    //   53: invokeinterface add : (Ljava/lang/Object;)Z
    //   58: pop
    //   59: aload_3
    //   60: ifnonnull -> 97
    //   63: aload_2
    //   64: invokeinterface ZqD : ()Ljava/lang/String;
    //   69: ifnonnull -> 97
    //   72: aload_1
    //   73: invokeinterface ZqD : ()Ljava/lang/String;
    //   78: ifnull -> 97
    //   81: aload_0
    //   82: aload_2
    //   83: invokeinterface remove : (Ljava/lang/Object;)Z
    //   88: pop
    //   89: aload_0
    //   90: aload_1
    //   91: invokeinterface add : (Ljava/lang/Object;)Z
    //   96: pop
    //   97: return
  }
  
  private static boolean ZG(Ztbr paramZtbr1, Ztbr paramZtbr2) {
    return (paramZtbr2 != null && paramZtbr1.ZqJ().equals(paramZtbr2.ZqJ()));
  }
  
  private static Ztbr Zb(List<Ztbr> paramList, Ztbr paramZtbr) {
    Zbqc[] arrayOfZbqc = Zxzh.Zs();
    for (Ztbr ztbr : paramList) {
      if (paramZtbr.equals(ztbr))
        return ztbr; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
  
  private static List lambda$updateCookies$0(String paramString) {
    return new ArrayList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxat.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */