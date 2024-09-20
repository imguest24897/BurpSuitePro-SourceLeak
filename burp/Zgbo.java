package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Zgbo {
  private final Zgc7 ZE;
  
  private final Ztyn Zt;
  
  private final Zgbo Zf;
  
  private final Zkr1<Zsnt> ZG;
  
  private int Zb;
  
  private final Zxpd Zz;
  
  public Zgbo(Zgc7 paramZgc7, Ztyn paramZtyn, Zgbo paramZgbo, int paramInt, Zxpd paramZxpd) {
    this.ZE = paramZgc7;
    this.Zt = paramZtyn;
    this.Zf = paramZgbo;
    this.Zb = paramInt;
    Zbqc[] arrayOfZbqc = Ztmm.Zx();
    this.Zz = paramZxpd;
    this.ZG = new Zkr1<>();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zgc7 Zf() {
    return this.ZE;
  }
  
  public Zgbo Zp() {
    return this.Zf;
  }
  
  public boolean Zk() {
    // Byte code:
    //   0: invokestatic Zx : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZG : Lburp/Zkr1;
    //   8: new burp/Zsnt
    //   11: dup
    //   12: aload_0
    //   13: getfield ZE : Lburp/Zgc7;
    //   16: invokespecial <init> : (Lburp/Zb3t;)V
    //   19: invokevirtual Zy : (Ljava/lang/Object;)V
    //   22: aload_0
    //   23: getfield ZG : Lburp/Zkr1;
    //   26: invokevirtual ZP : ()Ljava/lang/Object;
    //   29: ifnull -> 249
    //   32: aload_0
    //   33: getfield ZG : Lburp/Zkr1;
    //   36: invokevirtual ZP : ()Ljava/lang/Object;
    //   39: checkcast burp/Zsnt
    //   42: astore_2
    //   43: aload_2
    //   44: invokevirtual Zn : ()Lburp/Zb3t;
    //   47: astore_3
    //   48: aload_3
    //   49: ifnull -> 60
    //   52: aload_0
    //   53: aload_3
    //   54: invokevirtual Zq : (Lburp/Zb3t;)Z
    //   57: ifne -> 43
    //   60: aload_3
    //   61: ifnonnull -> 92
    //   64: aload_2
    //   65: invokevirtual ZX : ()Lburp/Zb3t;
    //   68: getstatic burp/Zxc6.ModifiesCS : Lburp/Zxc6;
    //   71: iconst_1
    //   72: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   75: invokeinterface Zm : (Lburp/Zxc6;Ljava/lang/Object;)V
    //   80: aload_0
    //   81: getfield ZG : Lburp/Zkr1;
    //   84: invokevirtual Zc : ()Ljava/lang/Object;
    //   87: pop
    //   88: aload_1
    //   89: ifnull -> 22
    //   92: aload_3
    //   93: invokestatic ZR : (Lburp/Zb3t;)Z
    //   96: ifeq -> 106
    //   99: aload_0
    //   100: iconst_0
    //   101: invokevirtual Zg : (Z)V
    //   104: iconst_1
    //   105: ireturn
    //   106: aload_3
    //   107: getstatic burp/Zxc6.ModifiesCS : Lburp/Zxc6;
    //   110: invokeinterface ZO : (Lburp/Zxc6;)Ljava/lang/Object;
    //   115: ifnull -> 121
    //   118: goto -> 22
    //   121: aload_0
    //   122: aload_3
    //   123: invokevirtual Zy : (Lburp/Zb3t;)Z
    //   126: ifeq -> 149
    //   129: aload_2
    //   130: invokevirtual ZX : ()Lburp/Zb3t;
    //   133: getstatic burp/Zxc6.ModifiesCS : Lburp/Zxc6;
    //   136: iconst_1
    //   137: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   140: invokeinterface Zm : (Lburp/Zxc6;Ljava/lang/Object;)V
    //   145: aload_1
    //   146: ifnull -> 22
    //   149: aload_3
    //   150: getstatic burp/Zxc6.FunctionCalls : Lburp/Zxc6;
    //   153: invokeinterface ZO : (Lburp/Zxc6;)Ljava/lang/Object;
    //   158: checkcast java/util/List
    //   161: astore #4
    //   163: aload #4
    //   165: ifnull -> 230
    //   168: aload_0
    //   169: dup
    //   170: getfield Zb : I
    //   173: iconst_1
    //   174: iadd
    //   175: putfield Zb : I
    //   178: new burp/Ztmm
    //   181: dup
    //   182: aload #4
    //   184: aload_0
    //   185: getfield Zt : Lburp/Ztyn;
    //   188: aload_0
    //   189: aload_0
    //   190: getfield Zb : I
    //   193: aload_0
    //   194: getfield Zz : Lburp/Zxpd;
    //   197: invokespecial <init> : (Ljava/util/List;Lburp/Ztyn;Lburp/Zgbo;ILburp/Zxpd;)V
    //   200: astore #5
    //   202: aload #5
    //   204: invokevirtual ZL : ()Z
    //   207: ifne -> 230
    //   210: aload_2
    //   211: invokevirtual ZX : ()Lburp/Zb3t;
    //   214: getstatic burp/Zxc6.ModifiesCS : Lburp/Zxc6;
    //   217: iconst_1
    //   218: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   221: invokeinterface Zm : (Lburp/Zxc6;Ljava/lang/Object;)V
    //   226: aload_1
    //   227: ifnull -> 22
    //   230: aload_0
    //   231: getfield ZG : Lburp/Zkr1;
    //   234: new burp/Zsnt
    //   237: dup
    //   238: aload_3
    //   239: invokespecial <init> : (Lburp/Zb3t;)V
    //   242: invokevirtual Zy : (Ljava/lang/Object;)V
    //   245: aload_1
    //   246: ifnull -> 22
    //   249: aload_0
    //   250: iconst_1
    //   251: invokevirtual Zg : (Z)V
    //   254: iconst_0
    //   255: invokestatic Zwu : ()[Lburp/Zbqc;
    //   258: ifnonnull -> 268
    //   261: iconst_1
    //   262: anewarray burp/Zbqc
    //   265: invokestatic ZS : ([Lburp/Zbqc;)V
    //   268: ireturn
  }
  
  private boolean Zq(Zb3t paramZb3t) {
    Zbqc[] arrayOfZbqc = Ztmm.Zx();
    for (Zsnt zsnt : this.ZG) {
      if (zsnt.ZX() == paramZb3t)
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private boolean Zy(Zb3t paramZb3t) {
    Zz61 zz61 = new Zz61(paramZb3t);
    Iterator<Zb3t> iterator = zz61.iterator();
    Zbqc[] arrayOfZbqc = Ztmm.Zx();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      if (Zl19.Zf(zb3t)) {
        Zgcn zgcn = (Zgcn)zb3t;
        Zgcc zgcc = (Zgcc)zgcn.ZC().get(1);
        if ((zgcc.ZK()).ZE == Zgho.PLUS_EQUALS)
          return false; 
        if (Zf(zgcn.ZU()))
          return true; 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private boolean Zf(Zgc0 paramZgc0) {
    Zz61 zz61 = new Zz61(paramZgc0);
    Iterator<Zb3t> iterator = zz61.iterator();
    Zbqc[] arrayOfZbqc = Ztmm.Zx();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      if (Zl19.ZM(zb3t) && ((Zgcu)zb3t).Zd() == this.Zt)
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private void Zg(boolean paramBoolean) {
    Map<Object, Object> map = this.ZE.<Map>ZO(Zxc6.ModifiesSymbols);
    if (map == null) {
      map = new HashMap<>();
      this.ZE.Zm(Zxc6.ModifiesSymbols, map);
    } 
    map.put(this.Zt, Boolean.valueOf(paramBoolean));
    ZJ();
  }
  
  private void ZJ() {
    Zz61 zz61 = new Zz61(this.ZE);
    Iterator<Zb3t> iterator = zz61.iterator();
    Zbqc[] arrayOfZbqc = Ztmm.Zx();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      zb3t.Zw(Zxc6.ModifiesCS);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */