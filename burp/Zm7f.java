package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.event.PopupMenuListener;
import net.portswigger.Zm2;

public class Zm7f extends MouseAdapter implements Zzyl {
  private final PopupMenuListener ZR;
  
  private final Ztwv ZH;
  
  private final Zs0g ZC;
  
  private final Zbws Zg;
  
  private final Zmut ZE;
  
  private final Zg0s ZX;
  
  private final Zgso Zl;
  
  private final Zz1m<Zt1_> Zu;
  
  private final Zzpo ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zm7f(PopupMenuListener paramPopupMenuListener, Ztwv paramZtwv, Zs0g paramZs0g, Zbws paramZbws, Zmut paramZmut, Zg0s paramZg0s, Zgso paramZgso, Zz1m<Zt1_> paramZz1m, Zzpo paramZzpo) {
    this.ZR = paramPopupMenuListener;
    this.ZH = paramZtwv;
    this.ZC = paramZs0g;
    this.Zg = paramZbws;
    this.ZE = paramZmut;
    this.ZX = paramZg0s;
    this.Zl = paramZgso;
    this.Zu = paramZz1m;
    this.ZL = paramZzpo;
    paramZbws.addMouseListener(this);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    String str;
    List<Zb2e> list = ZA();
    switch (paramInt) {
      case 135680:
        Zm2.ZC(Zrrh.SCANNER_ISSUE_ACTIVITY_ADD_COMMENT);
        str = Zz5n.ZS((List)list, this.Zg);
        if (str == null)
          return true; 
        ZY(str, list);
        return true;
      case 524544:
      case 524545:
      case 524546:
      case 524547:
      case 524548:
      case 524549:
      case 524550:
      case 524551:
      case 524552:
      case 524553:
        Zz5n.ZY(paramInt);
        ZH(list);
        Zm2.Zi(Zv8r.SCANNER_ISSUE_ACTIVITY_HIGHLIGHT, Zlxk.ZS);
        return true;
      case 135936:
        Zm2.Zi(Zv8r.SCANNER_ISSUE_ACTIVITY_HIGHLIGHT, Zlxk.ZS);
        ZH(list);
        return true;
      case 530688:
        this.ZC.Zu(Zz(list));
        return true;
      case 531200:
        Zo(list, (byte)4);
        return true;
      case 531216:
        Zo(list, (byte)3);
        return true;
      case 531232:
        Zo(list, (byte)2);
        return true;
      case 531248:
        Zo(list, (byte)1);
        return true;
      case 531264:
        Zo(list, (byte)-1);
        return true;
      case 531280:
        Zo(list, (byte)0);
        return true;
      case 531296:
        ZX(list);
        return true;
      case 531456:
        Zv(list, (byte)3);
        return true;
      case 531472:
        Zv(list, (byte)2);
        return true;
      case 531488:
        Zv(list, (byte)1);
        return true;
      case 531504:
        Zv(list, (byte)0);
        return true;
      case 531520:
        ZN(list);
        return true;
      case 530944:
        if (this.ZL.ZJ()) {
          ZU(list);
          return true;
        } 
        return false;
    } 
    return false;
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    Zk(paramMouseEvent);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    Zk(paramMouseEvent);
  }
  
  private void Zk(MouseEvent paramMouseEvent) {
    if (!paramMouseEvent.isPopupTrigger())
      return; 
    List<Zb2e> list = Zn(paramMouseEvent.getPoint());
    if (list.isEmpty())
      return; 
    Zkj9 zkj9 = ZO(list, this, this.ZR, this.ZL.ZJ());
    ZO(zkj9, list, paramMouseEvent);
    zkj9.show(paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
  }
  
  private List<Zb2e> ZA() {
    return Zn(null);
  }
  
  private List<Zb2e> Zn(Point paramPoint) {
    synchronized (this.ZX) {
      return Zl(this.Zg.ZS(paramPoint));
    } 
  }
  
  private List<Zb2e> Zl(int[] paramArrayOfint) {
    return (List<Zb2e>)Arrays.stream(paramArrayOfint).mapToObj(this::Zp).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private Zb2e Zp(int paramInt) {
    if (paramInt < 0 || paramInt >= this.ZE.getRowCount())
      return null; 
    int i = this.Zg.convertRowIndexToModel(paramInt);
    return this.ZE.ZW(i);
  }
  
  private Zkj9 ZO(List<Zb2e> paramList, Zm7f paramZm7f, PopupMenuListener paramPopupMenuListener, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic Zb : (Ljava/util/List;)Lburp/Zkj9;
    //   4: astore #5
    //   6: aload_1
    //   7: invokeinterface size : ()I
    //   12: iconst_1
    //   13: if_icmpne -> 64
    //   16: aload_0
    //   17: getfield ZL : Lburp/Zzpo;
    //   20: invokevirtual Zn : ()Ljava/util/function/Consumer;
    //   23: ifnull -> 64
    //   26: new burp/Zepe
    //   29: dup
    //   30: sipush #-27119
    //   33: sipush #-16524
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: invokespecial <init> : (Ljava/lang/String;)V
    //   42: astore #6
    //   44: aload #6
    //   46: aload_0
    //   47: aload_1
    //   48: <illegal opcode> actionPerformed : (Lburp/Zm7f;Ljava/util/List;)Ljava/awt/event/ActionListener;
    //   53: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   56: aload #5
    //   58: aload #6
    //   60: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   63: pop
    //   64: aload_1
    //   65: invokeinterface isEmpty : ()Z
    //   70: ifne -> 108
    //   73: aload_1
    //   74: iconst_0
    //   75: invokeinterface get : (I)Ljava/lang/Object;
    //   80: checkcast burp/Zb2e
    //   83: invokeinterface ZBf : ()Lburp/Zrdb;
    //   88: invokeinterface ZaB : ()Lburp/Zmzk;
    //   93: aload #5
    //   95: aload_2
    //   96: sipush #-27111
    //   99: sipush #-13637
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: invokestatic Zn : (Lburp/Zmzk;Lburp/Zkj9;Lburp/Zzyl;Ljava/lang/String;)V
    //   108: aload #5
    //   110: aload_3
    //   111: invokevirtual addPopupMenuListener : (Ljavax/swing/event/PopupMenuListener;)V
    //   114: aload #5
    //   116: aload_2
    //   117: iload #4
    //   119: aload_1
    //   120: invokestatic Zi : (Lburp/Zkj9;Lburp/Zm7f;ZLjava/util/List;)V
    //   123: aload #5
    //   125: areturn
  }
  
  private static Zkj9 Zb(List<Zb2e> paramList) {
    Zb2e zb2e = paramList.get(0);
    if (paramList.size() > 1)
      return Zsn5.ZA(paramList.size()); 
    String str = Zrf1.Za.ZK(zb2e.ZBf()).ZZV();
    ImageIcon imageIcon = Ztvx.ZO(zb2e.ZBf().ZaJ(), zb2e.ZBf().Zac(), false);
    return Zsn5.Zy(str, imageIcon);
  }
  
  private static void Zi(Zkj9 paramZkj9, Zm7f paramZm7f, boolean paramBoolean, List<Zb2e> paramList) {
    boolean bool1 = (paramList.size() > 1) ? true : false;
    paramZkj9.add(new JSeparator());
    Zztv zztv1 = new Zztv(a(-27115, -4919));
    Zl(zztv1, 531200, (byte)4, paramZm7f);
    Zl(zztv1, 531216, (byte)3, paramZm7f);
    Zl(zztv1, 531232, (byte)2, paramZm7f);
    Zl(zztv1, 531248, (byte)1, paramZm7f);
    Zl(zztv1, 531264, (byte)-1, paramZm7f);
    zztv1.add(new JSeparator());
    zztv1.add(Ztsr.ZW(paramZm7f, 531280));
    paramZkj9.add(zztv1);
    Zztv zztv2 = new Zztv(a(-27110, 11875));
    boolean bool2 = bool1 ? true : ((Zb2e)paramList.get(0)).ZBf().ZaJ();
    ZX(zztv2, 531456, bool2, (byte)3, paramZm7f);
    ZX(zztv2, 531472, bool2, (byte)2, paramZm7f);
    ZX(zztv2, 531488, bool2, (byte)1, paramZm7f);
    zztv2.add(new JSeparator());
    zztv2.add(Ztsr.ZW(paramZm7f, 531504));
    paramZkj9.add(zztv2);
    String str = bool1 ? a(-27116, 5320) : a(-27117, -28304);
    if (paramBoolean)
      paramZkj9.add(Ztsr.Zx(paramZm7f, 530944, a(-27114, 6347) + a(-27114, 6347))); 
    paramZkj9.add(Ztsr.Zx(paramZm7f, 530688, a(-27113, 14742) + a(-27113, 14742)));
  }
  
  private static void Zl(Zztv paramZztv, int paramInt, byte paramByte, Zm7f paramZm7f) {
    ZS(paramZztv, paramInt, paramByte, (byte)3, paramZm7f);
  }
  
  private static void ZX(Zztv paramZztv, int paramInt, byte paramByte1, byte paramByte2, Zm7f paramZm7f) {
    ZS(paramZztv, paramInt, paramByte1, paramByte2, paramZm7f);
  }
  
  private static void ZS(Zztv paramZztv, int paramInt, byte paramByte1, byte paramByte2, Zm7f paramZm7f) {
    Zepk zepk = Ztsr.ZW(paramZm7f, paramInt);
    zepk.setIcon(Ztvx.ZO(paramByte1, paramByte2, false));
    paramZztv.add(zepk);
  }
  
  private void ZO(Zkj9 paramZkj9, List<Zb2e> paramList, MouseEvent paramMouseEvent) {
    Zrdb[] arrayOfZrdb = (Zrdb[])paramList.stream().map(Zb2e::ZBf).toArray(Zm7f::lambda$addContextMenuItemsFromExtensions$1);
    List<Component> list = this.Zl.ZZ(Zrpb.CONTEXT_SCANNER_RESULTS, paramMouseEvent, arrayOfZrdb);
    Objects.requireNonNull(paramZkj9);
    list.forEach(paramZkj9::add);
  }
  
  private void Zo(List<Zb2e> paramList, byte paramByte) {
    ZQ(paramList, true, paramByte);
  }
  
  private void ZX(List<Zb2e> paramList) {
    String[] arrayOfString = Zg0s.ZW();
    for (Zb2e zb2e : paramList) {
      Zo(Collections.singletonList(zb2e), Zls9.Zh(zb2e.ZBf().ZaJ()));
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void ZN(List<Zb2e> paramList) {
    String[] arrayOfString = Zg0s.ZW();
    for (Zb2e zb2e : paramList) {
      Zv(Collections.singletonList(zb2e), Zewc.Z_(zb2e.ZBf().Zac()));
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private void ZU(List<Zb2e> paramList) {
    // Byte code:
    //   0: invokestatic ZW : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   10: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   15: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   20: invokeinterface toList : ()Ljava/util/List;
    //   25: astore #4
    //   27: aload #4
    //   29: invokeinterface size : ()I
    //   34: iconst_1
    //   35: if_icmple -> 52
    //   38: sipush #-27120
    //   41: sipush #26955
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: astore_3
    //   48: aload_2
    //   49: ifnull -> 100
    //   52: getstatic burp/Zrf1.Za : Lburp/Zzb4;
    //   55: aload #4
    //   57: iconst_0
    //   58: invokeinterface get : (I)Ljava/lang/Object;
    //   63: checkcast burp/Zrdb
    //   66: invokeinterface ZK : (Lburp/Zrdb;)Lburp/Zree;
    //   71: invokeinterface ZZV : ()Ljava/lang/String;
    //   76: astore #5
    //   78: sipush #-27118
    //   81: sipush #8453
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: iconst_1
    //   88: anewarray java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: aload #5
    //   95: aastore
    //   96: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   99: astore_3
    //   100: aload_0
    //   101: getfield Zg : Lburp/Zbws;
    //   104: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   107: sipush #-27109
    //   110: sipush #-4374
    //   113: invokestatic a : (II)Ljava/lang/String;
    //   116: iconst_1
    //   117: anewarray java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_3
    //   123: aastore
    //   124: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   127: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   130: ifne -> 134
    //   133: return
    //   134: getstatic burp/Zrrh.SCANNER_ISSUES_DELETE : Lburp/Zrrh;
    //   137: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   140: aload_0
    //   141: getfield Zu : Lburp/Zz1m;
    //   144: aload #4
    //   146: invokestatic ZP : (Ljava/util/Collection;)Lburp/Zxr8;
    //   149: invokeinterface ZD : (Lburp/Zxr8;)V
    //   154: return
  }
  
  private List<Zrdb> Zz(List<Zb2e> paramList) {
    ArrayList<Zrdb> arrayList = new ArrayList();
    Iterator<Zb2e> iterator = paramList.iterator();
    String[] arrayOfString = Zg0s.ZW();
    while (iterator.hasNext()) {
      Zb2e zb2e = iterator.next();
      arrayList.add(zb2e.ZBf());
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private void Zv(List<Zb2e> paramList, byte paramByte) {
    ZQ(paramList, false, paramByte);
  }
  
  private void ZQ(List<Zb2e> paramList, boolean paramBoolean, byte paramByte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZH : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: iload_2
    //   7: iload_3
    //   8: <illegal opcode> run : (Lburp/Zm7f;Ljava/util/List;ZB)Ljava/lang/Runnable;
    //   13: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   18: pop
    //   19: return
  }
  
  private void ZY(String paramString, List<Zb2e> paramList) {
    String[] arrayOfString = Zg0s.ZW();
    synchronized (this.ZX) {
      for (Zb2e zb2e : paramList) {
        zb2e.Zxg(paramString);
        int i = this.ZE.Zj(zb2e);
        if (i == -1)
          continue; 
        Zh(i, i);
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  private void ZH(List<Zb2e> paramList) {
    String[] arrayOfString = Zg0s.ZW();
    synchronized (this.ZX) {
      for (Zb2e zb2e : paramList) {
        zb2e.ZB((byte)Zlxk.ZS);
        int i = this.ZE.Zj(zb2e);
        if (i == -1)
          continue; 
        Zh(i, i);
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  private void Zh(int paramInt1, int paramInt2) {
    this.ZE.fireTableRowsUpdated(paramInt1, paramInt2);
  }
  
  private void lambda$setScreenSignificance$2(List paramList, boolean paramBoolean, byte paramByte) {
    // Byte code:
    //   0: new java/util/HashSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic ZW : ()[Ljava/lang/String;
    //   12: aload_1
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #6
    //   20: astore #4
    //   22: aload #6
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 206
    //   32: aload #6
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast burp/Zb2e
    //   42: astore #7
    //   44: aload #7
    //   46: invokeinterface ZBf : ()Lburp/Zrdb;
    //   51: astore #8
    //   53: iload_2
    //   54: ifeq -> 121
    //   57: iload_3
    //   58: ifne -> 71
    //   61: aload #8
    //   63: invokeinterface Zaw : ()B
    //   68: goto -> 72
    //   71: iload_3
    //   72: istore #9
    //   74: aload #8
    //   76: invokeinterface ZaJ : ()B
    //   81: iload #9
    //   83: if_icmpne -> 89
    //   86: goto -> 22
    //   89: aload #8
    //   91: iload #9
    //   93: invokeinterface ZT : (B)V
    //   98: iload #9
    //   100: iconst_m1
    //   101: if_icmpne -> 110
    //   104: getstatic burp/Zrrh.SCANNER_ISSUES_SET_SEVERITY_FALSE_POSITIVE : Lburp/Zrrh;
    //   107: goto -> 113
    //   110: getstatic burp/Zrrh.SCANNER_ISSUES_SET_SEVERITY : Lburp/Zrrh;
    //   113: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   116: aload #4
    //   118: ifnull -> 168
    //   121: iload_3
    //   122: ifne -> 135
    //   125: aload #8
    //   127: invokeinterface Zak : ()B
    //   132: goto -> 136
    //   135: iload_3
    //   136: istore #9
    //   138: aload #8
    //   140: invokeinterface Zac : ()B
    //   145: iload #9
    //   147: if_icmpne -> 153
    //   150: goto -> 22
    //   153: aload #8
    //   155: iload #9
    //   157: invokeinterface Zx : (B)V
    //   162: getstatic burp/Zrrh.SCANNER_ISSUES_SET_CONFIDENCE : Lburp/Zrrh;
    //   165: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   168: aload #5
    //   170: aload #8
    //   172: invokeinterface add : (Ljava/lang/Object;)Z
    //   177: pop
    //   178: aload_0
    //   179: getfield ZX : Lburp/Zg0s;
    //   182: aload #7
    //   184: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   187: istore #9
    //   189: aload_0
    //   190: getfield ZX : Lburp/Zg0s;
    //   193: iload #9
    //   195: aload #7
    //   197: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   200: pop
    //   201: aload #4
    //   203: ifnull -> 22
    //   206: aload #5
    //   208: invokeinterface isEmpty : ()Z
    //   213: ifne -> 230
    //   216: aload_0
    //   217: getfield Zu : Lburp/Zz1m;
    //   220: aload #5
    //   222: invokestatic ZX : (Ljava/util/Collection;)Lburp/Zxr8;
    //   225: invokeinterface ZD : (Lburp/Zxr8;)V
    //   230: return
  }
  
  private static Zrdb[] lambda$addContextMenuItemsFromExtensions$1(int paramInt) {
    return new Zrdb[paramInt];
  }
  
  private void lambda$contextMenuFromActivities$0(List<Zb2e> paramList, ActionEvent paramActionEvent) {
    this.ZL.Zn().accept(paramList.get(0));
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '×Éé4, æ¦cV®zØë^ËfpØ8Fn5r¡=+#T¸áà´¶Çõ3Ë7¨äÿé\\bê/ñ\\fû ²ªHÁ^¡ØK'M¬^Uô¶ß¢CXá­K#ä©'Ç-­Øs$×,ar+;*;VKª2&NQHÜX'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #28
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
    //   67: ldc 'a°hækûfI12+5aÕY+ÛÂ­'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #14
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #71
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
    //   128: putstatic burp/Zm7f.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zm7f.b : [Ljava/lang/String;
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
    //   212: bipush #71
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #78
    //   224: goto -> 244
    //   227: bipush #41
    //   229: goto -> 244
    //   232: bipush #20
    //   234: goto -> 244
    //   237: bipush #56
    //   239: goto -> 244
    //   242: bipush #107
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9613) & 0xFFFF;
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
      byte b1 = 108;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm7f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */