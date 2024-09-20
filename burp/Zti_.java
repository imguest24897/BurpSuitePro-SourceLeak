package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class Zti_ {
  public List<Zsje> Zr(String paramString, List<Zko7> paramList) {
    ArrayList<Zsje> arrayList = new ArrayList();
    Iterator<Zko7> iterator = paramList.iterator();
    int i = Zmd3.Zj();
    while (iterator.hasNext()) {
      Zko7 zko7 = iterator.next();
      if (zko7.Zl() != null)
        for (String str1 : zko7.Zl()) {
          String str2 = Zbw0.ZC(Pattern.compile(str1), paramString);
          if (str2 != null) {
            arrayList.addAll(Zb(zko7, str2));
            if (i != 0)
              continue; 
            break;
          } 
          continue;
          if (i != 0)
            break; 
        }  
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  public List<Zsje> ZJ(String paramString, List<Zko7> paramList) {
    ArrayList<Zsje> arrayList = new ArrayList();
    Iterator<Zko7> iterator = paramList.iterator();
    int i = Zmd3.Zd();
    while (iterator.hasNext()) {
      Zko7 zko7 = iterator.next();
      if (zko7.Zd() != null)
        for (String str1 : zko7.Zd()) {
          String str2 = Zbw0.ZC(Pattern.compile(str1), paramString);
          if (str2 != null) {
            arrayList.addAll(Zb(zko7, str2));
            if (i == 0)
              continue; 
            break;
          } 
          continue;
          if (i == 0)
            break; 
        }  
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  public List<Zsje> Zm(String paramString1, String paramString2, List<Zko7> paramList) {
    ArrayList<Zsje> arrayList = new ArrayList();
    Iterator<Zko7> iterator = paramList.iterator();
    int i = Zmd3.Zd();
    while (iterator.hasNext()) {
      Zko7 zko7 = iterator.next();
      if (zko7.ZJ().equals(paramString1) && paramString2 != null)
        arrayList.addAll(Zb(zko7, paramString2)); 
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  protected Zgy8 ZL(String paramString1, String paramString2, Zm7d paramZm7d, Ztwv paramZtwv) {
    return Zbw0.ZS(Pattern.compile(paramString1), paramString2, paramZtwv, paramZm7d);
  }
  
  public List<Ztba> ZK(String paramString1, String paramString2, List<Zko7> paramList, Ztwv paramZtwv, int paramInt) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #7
    //   9: iconst_1
    //   10: istore #8
    //   12: invokestatic Zd : ()I
    //   15: aload_3
    //   16: invokeinterface iterator : ()Ljava/util/Iterator;
    //   21: astore #9
    //   23: istore #6
    //   25: aload #9
    //   27: invokeinterface hasNext : ()Z
    //   32: ifeq -> 204
    //   35: aload #9
    //   37: invokeinterface next : ()Ljava/lang/Object;
    //   42: checkcast burp/Zko7
    //   45: astore #10
    //   47: aload #10
    //   49: invokevirtual Zf : ()Ljava/util/List;
    //   52: ifnull -> 196
    //   55: iconst_0
    //   56: istore #11
    //   58: aload #10
    //   60: invokevirtual Zf : ()Ljava/util/List;
    //   63: invokeinterface iterator : ()Ljava/util/Iterator;
    //   68: astore #12
    //   70: aload #12
    //   72: invokeinterface hasNext : ()Z
    //   77: ifeq -> 196
    //   80: aload #12
    //   82: invokeinterface next : ()Ljava/lang/Object;
    //   87: checkcast java/lang/String
    //   90: astore #13
    //   92: new burp/Zm7d
    //   95: dup
    //   96: aload #10
    //   98: invokevirtual ZJ : ()Ljava/lang/String;
    //   101: aload #13
    //   103: aload_2
    //   104: iload #5
    //   106: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   109: astore #14
    //   111: aload_0
    //   112: aload #13
    //   114: aload_1
    //   115: aload #14
    //   117: aload #4
    //   119: invokevirtual ZL : (Ljava/lang/String;Ljava/lang/String;Lburp/Zm7d;Lburp/Ztwv;)Lburp/Zgy8;
    //   122: astore #15
    //   124: aload #15
    //   126: ifnull -> 188
    //   129: aload_0
    //   130: aload #10
    //   132: aload #15
    //   134: invokevirtual ZB : ()Ljava/lang/String;
    //   137: invokevirtual Zb : (Lburp/Zko7;Ljava/lang/String;)Ljava/util/List;
    //   140: astore #16
    //   142: aload #16
    //   144: invokeinterface size : ()I
    //   149: ifle -> 196
    //   152: new burp/Ztba
    //   155: dup
    //   156: aload #16
    //   158: aload #15
    //   160: invokevirtual ZT : ()I
    //   163: aload #15
    //   165: invokevirtual ZZ : ()I
    //   168: invokespecial <init> : (Ljava/util/List;II)V
    //   171: astore #17
    //   173: aload #7
    //   175: aload #17
    //   177: invokeinterface add : (Ljava/lang/Object;)Z
    //   182: pop
    //   183: iload #6
    //   185: ifne -> 196
    //   188: iinc #11, 1
    //   191: iload #6
    //   193: ifne -> 70
    //   196: iinc #8, 1
    //   199: iload #6
    //   201: ifne -> 25
    //   204: aload #7
    //   206: areturn
  }
  
  private List<Zsje> Zb(Zko7 paramZko7, String paramString) {
    ArrayList<Zsje> arrayList = new ArrayList();
    Iterator<Zmd3> iterator = paramZko7.Zy().iterator();
    int i = Zmd3.Zj();
    while (iterator.hasNext()) {
      Zmd3 zmd3 = iterator.next();
      if (Zg2h.Zy(paramString, zmd3.ZL()) && Zg2h.Zx(paramString, zmd3.Zu()))
        arrayList.add(new Zsje(paramZko7, zmd3, paramString)); 
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zti_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */