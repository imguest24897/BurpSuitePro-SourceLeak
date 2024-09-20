package burp;

import java.awt.Component;
import java.util.List;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class Zk2_ implements Zeq, PopupMenuListener, Zbof {
  private final Zg0s ZN;
  
  private final Ztos<Zt1_> ZW;
  
  private final Zbup Zj;
  
  private final Zbws ZU;
  
  private final Zmut Zr;
  
  private final Zm7f Zc;
  
  private int Zg;
  
  private static final String a;
  
  public Zk2_(Ztwv paramZtwv, Zs0g paramZs0g, Zgso paramZgso, Zg0s paramZg0s, Ztos<Zt1_> paramZtos, Zzpo paramZzpo, Zrny paramZrny) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield Zg : I
    //   9: aload_0
    //   10: aload #4
    //   12: putfield ZN : Lburp/Zg0s;
    //   15: aload_0
    //   16: aload #5
    //   18: putfield ZW : Lburp/Ztos;
    //   21: invokestatic ZW : ()[Ljava/lang/String;
    //   24: aload_0
    //   25: aload_0
    //   26: aload #6
    //   28: invokevirtual ZA : (Lburp/Zzpo;)Lburp/Zbws;
    //   31: putfield ZU : Lburp/Zbws;
    //   34: aload_0
    //   35: new burp/Zbup
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: putfield Zj : Lburp/Zbup;
    //   45: aload_0
    //   46: getfield Zj : Lburp/Zbup;
    //   49: aload_0
    //   50: getfield ZU : Lburp/Zbws;
    //   53: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   56: aload #5
    //   58: getstatic burp/Zt1_.ZB : Lburp/Zlnb;
    //   61: aload_0
    //   62: <illegal opcode> accept : (Lburp/Zk2_;)Ljava/util/function/Consumer;
    //   67: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   70: pop
    //   71: aload #5
    //   73: getstatic burp/Zt1_.Zz : Lburp/Zlnb;
    //   76: aload #7
    //   78: <illegal opcode> accept : (Lburp/Zrny;)Ljava/util/function/Consumer;
    //   83: aload_1
    //   84: invokevirtual Zb : (Lburp/Zlnb;Ljava/util/function/Consumer;Ljava/util/concurrent/Executor;)Lburp/Zgrn;
    //   87: pop
    //   88: astore #8
    //   90: aload #5
    //   92: getstatic burp/Zt1_.ZW : Lburp/Zlnb;
    //   95: aload #7
    //   97: <illegal opcode> accept : (Lburp/Zrny;)Ljava/util/function/Consumer;
    //   102: aload_1
    //   103: invokevirtual Zb : (Lburp/Zlnb;Ljava/util/function/Consumer;Ljava/util/concurrent/Executor;)Lburp/Zgrn;
    //   106: pop
    //   107: aload #6
    //   109: invokevirtual Zc : ()Ljava/util/Comparator;
    //   112: ifnonnull -> 120
    //   115: aload #4
    //   117: goto -> 130
    //   120: aload #4
    //   122: aload #6
    //   124: invokevirtual Zc : ()Ljava/util/Comparator;
    //   127: invokevirtual sorted : (Ljava/util/Comparator;)Ljavafx/collections/transformation/SortedList;
    //   130: astore #9
    //   132: aload #6
    //   134: invokevirtual Zk : ()I
    //   137: ifne -> 153
    //   140: aload_0
    //   141: getfield ZU : Lburp/Zbws;
    //   144: iconst_1
    //   145: invokevirtual ZF : (Z)V
    //   148: aload #8
    //   150: ifnull -> 165
    //   153: aload_0
    //   154: getfield ZU : Lburp/Zbws;
    //   157: aload #6
    //   159: invokevirtual Zk : ()I
    //   162: invokevirtual setAutoResizeMode : (I)V
    //   165: aload_0
    //   166: new burp/Zmut
    //   169: dup
    //   170: aload #9
    //   172: aload #6
    //   174: invokespecial <init> : (Ljavafx/collections/ObservableList;Lburp/Zzpo;)V
    //   177: putfield Zr : Lburp/Zmut;
    //   180: aload_0
    //   181: getfield ZU : Lburp/Zbws;
    //   184: aload_0
    //   185: getfield Zr : Lburp/Zmut;
    //   188: invokevirtual ZL : (Lburp/Zztu;)V
    //   191: aload_0
    //   192: getfield ZU : Lburp/Zbws;
    //   195: iconst_1
    //   196: invokevirtual setAutoCreateRowSorter : (Z)V
    //   199: aload_0
    //   200: getfield ZU : Lburp/Zbws;
    //   203: aload_0
    //   204: invokevirtual Zc : (Lburp/Zeq;)V
    //   207: aload #6
    //   209: invokevirtual Zn : ()Ljava/util/function/Consumer;
    //   212: ifnull -> 252
    //   215: aload_0
    //   216: getfield ZU : Lburp/Zbws;
    //   219: iconst_0
    //   220: invokevirtual setRowSelectionAllowed : (Z)V
    //   223: aload_0
    //   224: getfield ZU : Lburp/Zbws;
    //   227: bipush #12
    //   229: invokestatic getPredefinedCursor : (I)Ljava/awt/Cursor;
    //   232: invokevirtual setCursor : (Ljava/awt/Cursor;)V
    //   235: aload_0
    //   236: getfield ZU : Lburp/Zbws;
    //   239: new burp/Zrav
    //   242: dup
    //   243: aload_0
    //   244: aload #6
    //   246: invokespecial <init> : (Lburp/Zk2_;Lburp/Zzpo;)V
    //   249: invokevirtual Zk : (Lburp/Zky2;)V
    //   252: aload_0
    //   253: getfield Zj : Lburp/Zbup;
    //   256: invokevirtual getViewport : ()Ljavax/swing/JViewport;
    //   259: aload #6
    //   261: invokevirtual ZB : ()Z
    //   264: invokevirtual setFocusable : (Z)V
    //   267: aload_0
    //   268: getfield ZU : Lburp/Zbws;
    //   271: aload #6
    //   273: invokevirtual ZB : ()Z
    //   276: invokevirtual setFocusable : (Z)V
    //   279: aload_0
    //   280: new burp/Zm7f
    //   283: dup
    //   284: aload_0
    //   285: aload_1
    //   286: aload_2
    //   287: aload_0
    //   288: getfield ZU : Lburp/Zbws;
    //   291: aload_0
    //   292: getfield Zr : Lburp/Zmut;
    //   295: aload #4
    //   297: aload_3
    //   298: aload #5
    //   300: aload #6
    //   302: invokespecial <init> : (Ljavax/swing/event/PopupMenuListener;Lburp/Ztwv;Lburp/Zs0g;Lburp/Zbws;Lburp/Zmut;Lburp/Zg0s;Lburp/Zgso;Lburp/Zz1m;Lburp/Zzpo;)V
    //   305: putfield Zc : Lburp/Zm7f;
    //   308: aload_0
    //   309: getfield ZU : Lburp/Zbws;
    //   312: aload_0
    //   313: getfield Zc : Lburp/Zm7f;
    //   316: invokevirtual ZP : (Lburp/Zzyl;)V
    //   319: invokestatic Zwu : ()[Lburp/Zbqc;
    //   322: ifnonnull -> 332
    //   325: iconst_3
    //   326: anewarray java/lang/String
    //   329: invokestatic Zm : ([Ljava/lang/String;)V
    //   332: return
  }
  
  private Zbws ZA(Zzpo paramZzpo) {
    Zbwu zbwu = new Zbwu(this, paramZzpo);
    if (paramZzpo.ZX() != null)
      zbwu.ZL(paramZzpo.ZX()); 
    if (paramZzpo.ZN() != null) {
      zbwu.ZN(paramZzpo.ZN());
      zbwu.setShowGrid(false);
    } 
    zbwu.setName(a);
    zbwu.getTableHeader().setReorderingAllowed(true);
    if (paramZzpo.Zq())
      zbwu.setRowHeight(Zre7.Zu(zbwu).ZQ() + 4); 
    return zbwu;
  }
  
  public Component ZE() {
    return this.Zj;
  }
  
  public void Zi(Zzbt paramZzbt) {
    this.Zr.Zp(paramZzbt);
  }
  
  public Zzbt Zo() {
    return this.Zr.ZS();
  }
  
  public void Zh(List<Zrdb> paramList) {
    synchronized (this.ZN) {
      if (this.Zg != -1) {
        Zb2e zb2e = this.Zr.ZN(this.Zg);
        if (paramList.contains(zb2e.ZBf()))
          this.ZW.ZD(Zt1_.Ze(zb2e.ZBf())); 
      } 
    } 
    this.Zr.Zg(paramList);
    Z_();
  }
  
  public void ZV(List<Zrdb> paramList) {
    this.Zr.Zg(paramList);
    Z_();
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    synchronized (this.ZN) {
      if (paramInt1 < 0 || paramInt1 >= this.Zr.getRowCount())
        return; 
      int i = this.ZU.convertRowIndexToModel(paramInt1);
      if (i == -1)
        return; 
      this.Zg = i;
      this.ZW.ZD(Zt1_.Ze(this.Zr.ZN(i).ZBf()));
    } 
  }
  
  public void Zx(Zb2e paramZb2e) {
    this.Zg = this.Zr.Zj(paramZb2e);
    if (this.Zg != -1) {
      int i = this.ZU.convertRowIndexToView(this.Zg);
      this.ZU.setRowSelectionInterval(i, i);
      this.ZU.scrollRectToVisible(this.ZU.getCellRect(i, 0, true));
      this.ZW.ZD(Zt1_.Ze(paramZb2e.ZBf()));
    } 
  }
  
  void Zh() {
    this.Zg = -1;
  }
  
  public void ZP(Zrdb paramZrdb, Zb9y paramZb9y, int paramInt) {}
  
  public void Zl(List<Zb2e> paramList, int paramInt1, int paramInt2) {}
  
  public void Zq() {
    this.Zr.Zc();
    Z_();
  }
  
  private void Z_() {
    synchronized (this.ZN) {
      if (this.ZU.getSelectedRow() == -1)
        this.ZW.ZD(Zt1_.Zv()); 
    } 
  }
  
  public void popupMenuWillBecomeVisible(PopupMenuEvent paramPopupMenuEvent) {}
  
  public void popupMenuWillBecomeInvisible(PopupMenuEvent paramPopupMenuEvent) {}
  
  public void popupMenuCanceled(PopupMenuEvent paramPopupMenuEvent) {}
  
  public Zbws Zf() {
    return this.ZU;
  }
  
  public void Zn(Zb4f paramZb4f) {
    this.Zr.Zo(paramZb4f);
  }
  
  private static void lambda$new$5(Zrny paramZrny, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZrny::lambda$new$4);
  }
  
  private static void lambda$new$4(Zrny paramZrny, Zgp5 paramZgp5) {
    paramZrny.ZP(paramZgp5.ZYI());
  }
  
  private static void lambda$new$3(Zrny paramZrny, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZrny::lambda$new$2);
  }
  
  private static void lambda$new$2(Zrny paramZrny, Zgp5 paramZgp5) {
    paramZrny.Zq(paramZgp5.ZYI());
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$0);
  }
  
  private void lambda$new$0(Zrxu paramZrxu) {
    if (paramZrxu.Zt_() == null)
      Zh(); 
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: ldc '\\n\+-\\bn ;\\rV  7C&'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zk2_.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #107
    //   82: goto -> 112
    //   85: bipush #124
    //   87: goto -> 112
    //   90: bipush #42
    //   92: goto -> 112
    //   95: bipush #70
    //   97: goto -> 112
    //   100: bipush #74
    //   102: goto -> 112
    //   105: bipush #98
    //   107: goto -> 112
    //   110: bipush #102
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */