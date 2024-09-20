package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zzjk implements Zmdl {
  private final Map<Zro0, List<Zmaj>> Z_;
  
  private final List<Zlp9> Zw;
  
  public Zzjk(List<Zlp9> paramList) {
    this.Zw = paramList;
    this.Z_ = new HashMap<>();
  }
  
  public Iterator<Map.Entry<Zro0, List<Zmaj>>> iterator() {
    return this.Z_.entrySet().iterator();
  }
  
  public void Zr(Zmaj paramZmaj) {
    // Byte code:
    //   0: invokestatic ZD : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: getfield ZO : Lburp/Zer0;
    //   8: invokeinterface ZA : ()Lburp/Zb25;
    //   13: getstatic burp/Zb25.SMTP : Lburp/Zb25;
    //   16: if_acmpeq -> 34
    //   19: aload_1
    //   20: getfield ZO : Lburp/Zer0;
    //   23: invokeinterface ZA : ()Lburp/Zb25;
    //   28: getstatic burp/Zb25.SMTPS : Lburp/Zb25;
    //   31: if_acmpne -> 35
    //   34: return
    //   35: aload_1
    //   36: getfield Zy : Lburp/Ztt6;
    //   39: invokevirtual Zk : ()Lburp/Zro0;
    //   42: astore_3
    //   43: aload_0
    //   44: getfield Z_ : Ljava/util/Map;
    //   47: aload_3
    //   48: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   53: checkcast java/util/List
    //   56: astore #4
    //   58: aload #4
    //   60: ifnonnull -> 95
    //   63: new java/util/ArrayList
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: astore #4
    //   72: aload #4
    //   74: aload_1
    //   75: invokeinterface add : (Ljava/lang/Object;)Z
    //   80: pop
    //   81: aload_0
    //   82: getfield Z_ : Ljava/util/Map;
    //   85: aload_3
    //   86: aload #4
    //   88: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   93: pop
    //   94: return
    //   95: aload_1
    //   96: getfield Zy : Lburp/Ztt6;
    //   99: invokevirtual ZN : ()Lburp/Zlp9;
    //   102: astore #5
    //   104: aload_1
    //   105: getfield ZO : Lburp/Zer0;
    //   108: invokeinterface ZA : ()Lburp/Zb25;
    //   113: astore #6
    //   115: iconst_0
    //   116: istore #7
    //   118: iload #7
    //   120: aload #4
    //   122: invokeinterface size : ()I
    //   127: if_icmpge -> 227
    //   130: aload #4
    //   132: iload #7
    //   134: invokeinterface get : (I)Ljava/lang/Object;
    //   139: checkcast burp/Zmaj
    //   142: astore #8
    //   144: aload #8
    //   146: getfield Zy : Lburp/Ztt6;
    //   149: invokevirtual ZN : ()Lburp/Zlp9;
    //   152: astore #9
    //   154: aload #5
    //   156: aload #9
    //   158: aload_0
    //   159: getfield Zw : Ljava/util/List;
    //   162: invokestatic Zi : (Lburp/Zlp9;Lburp/Zlp9;Ljava/util/List;)Z
    //   165: ifeq -> 189
    //   168: aload_0
    //   169: aload #4
    //   171: aload #9
    //   173: invokevirtual ZT : (Ljava/util/List;Lburp/Zlp9;)V
    //   176: aload #4
    //   178: aload_1
    //   179: invokeinterface add : (Ljava/lang/Object;)Z
    //   184: pop
    //   185: aload_2
    //   186: ifnull -> 227
    //   189: aload #5
    //   191: aload #9
    //   193: if_acmpne -> 220
    //   196: aload_0
    //   197: aload #4
    //   199: aload #6
    //   201: invokevirtual ZC : (Ljava/util/List;Lburp/Zb25;)Z
    //   204: ifeq -> 227
    //   207: aload #4
    //   209: aload_1
    //   210: invokeinterface add : (Ljava/lang/Object;)Z
    //   215: pop
    //   216: aload_2
    //   217: ifnull -> 227
    //   220: iinc #7, 1
    //   223: aload_2
    //   224: ifnull -> 118
    //   227: return
  }
  
  private boolean ZC(List<Zmaj> paramList, Zb25 paramZb25) {
    String[] arrayOfString = Zgi2.ZD();
    for (Zmaj zmaj : paramList) {
      if (paramZb25.ZJ(zmaj.ZO.ZA()))
        return false; 
      if (arrayOfString != null)
        break; 
    } 
    return true;
  }
  
  private void ZT(List<Zmaj> paramList, Zlp9 paramZlp9) {
    String[] arrayOfString = Zgi2.ZD();
    Iterator<Zmaj> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      if (((Zmaj)iterator.next()).Zy.ZN() == paramZlp9) {
        iterator.remove();
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzjk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */