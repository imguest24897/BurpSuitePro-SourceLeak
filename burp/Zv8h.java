package burp;

import java.util.Collections;

class Zv8h extends Zv84 {
  private final Zxf2 ZK;
  
  private final Zzs_ ZY;
  
  private final Zx6j Zd;
  
  Zv8h(Zxf2 paramZxf2, Zzs_ paramZzs_, Zx6j paramZx6j) {
    this.ZK = paramZxf2;
    this.ZY = paramZzs_;
    String[] arrayOfString = Zv87.Zg();
    this.Zd = paramZx6j;
    if (Zbqc.Zwu() == null)
      Zv87.ZI(new String[4]); 
  }
  
  public Zvb Zb(Zvb paramZvb) {
    // Byte code:
    //   0: invokestatic Zg : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: instanceof burp/Zx60
    //   8: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   11: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   14: aload_1
    //   15: instanceof burp/Zx60
    //   18: ifeq -> 168
    //   21: aload_1
    //   22: checkcast burp/Zx60
    //   25: astore_3
    //   26: aload_3
    //   27: invokevirtual Zl : ()Lburp/Zb0_;
    //   30: astore #4
    //   32: aload #4
    //   34: invokevirtual ZR : ()Lburp/Zlru;
    //   37: astore #5
    //   39: aload #4
    //   41: invokevirtual Zv : ()Lburp/Zszw;
    //   44: astore #6
    //   46: aload #4
    //   48: invokevirtual ZG : ()Lburp/Zszw;
    //   51: astore #7
    //   53: aload_0
    //   54: getfield Zd : Lburp/Zx6j;
    //   57: invokevirtual Zl : ()Lburp/Zb0_;
    //   60: invokevirtual Zo : ()Lburp/Zrp0;
    //   63: astore #8
    //   65: aload #8
    //   67: instanceof burp/Zm5e
    //   70: ifeq -> 157
    //   73: aload #8
    //   75: checkcast burp/Zm5e
    //   78: astore #9
    //   80: aload_0
    //   81: getfield ZY : Lburp/Zzs_;
    //   84: aload #9
    //   86: invokeinterface ZFy : ()Lburp/Zski;
    //   91: invokeinterface ZyR : ()Lburp/Zlit;
    //   96: aload_3
    //   97: invokevirtual ZT : ()Lburp/Zm0f;
    //   100: invokevirtual ZY : (Lburp/Zlit;Lburp/Zm0f;)V
    //   103: aload_3
    //   104: invokevirtual ZN : ()Lburp/Zzcs;
    //   107: astore #10
    //   109: aload_0
    //   110: getfield ZY : Lburp/Zzs_;
    //   113: aload #10
    //   115: invokevirtual Zs : (Lburp/Zzcs;)Z
    //   118: ifeq -> 149
    //   121: aload_0
    //   122: getfield ZK : Lburp/Zxf2;
    //   125: aload #10
    //   127: aload #6
    //   129: aload #7
    //   131: aload #9
    //   133: aload #5
    //   135: aload_0
    //   136: getfield ZK : Lburp/Zxf2;
    //   139: invokevirtual Zx : ()Lburp/Zgd4;
    //   142: invokevirtual Zy : (Lburp/Zzcs;Lburp/Zszw;Lburp/Zszw;Lburp/Zrp0;Lburp/Zlru;Lburp/Zeu9;)V
    //   145: aload_2
    //   146: ifnull -> 153
    //   149: aload_0
    //   150: invokevirtual Zq : ()V
    //   153: aload_2
    //   154: ifnull -> 164
    //   157: iconst_0
    //   158: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   161: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   164: invokestatic ZI : ()Lburp/Ze79;
    //   167: areturn
    //   168: aconst_null
    //   169: areturn
  }
  
  private void Zq() {
    Zzcs zzcs = this.Zd.Zg();
    Zb0_ zb0_ = this.Zd.Zl();
    Zszw zszw1 = zb0_.Zv();
    Zszw zszw2 = zb0_.ZG();
    Zrp0 zrp0 = zb0_.Zo();
    Zlru zlru = zb0_.ZR();
    Zeu9 zeu9 = this.ZK.ZM(zzcs, Collections.emptyList());
    this.ZK.Zy(zzcs, zszw1, zszw2, zrp0, zlru, zeu9);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */