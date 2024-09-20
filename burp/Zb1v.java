package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.portswigger.Zm2;

class Zb1v implements ActionListener {
  final Zzk6 Zb;
  
  Zb1v(Zzk6 paramZzk6) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getSource : ()Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_3
    //   10: aload_0
    //   11: getfield Zb : Lburp/Zzk6;
    //   14: getfield ZY : Lburp/Zsuy;
    //   17: if_acmpne -> 46
    //   20: aload_0
    //   21: getfield Zb : Lburp/Zzk6;
    //   24: getfield ZA : Lburp/Zrtw;
    //   27: aload_0
    //   28: getfield Zb : Lburp/Zzk6;
    //   31: getfield ZY : Lburp/Zsuy;
    //   34: invokevirtual isSelected : ()Z
    //   37: invokeinterface ZAA : (Z)V
    //   42: aload_2
    //   43: ifnull -> 360
    //   46: aload_3
    //   47: aload_0
    //   48: getfield Zb : Lburp/Zzk6;
    //   51: getfield Zw : Lburp/Zsuy;
    //   54: if_acmpne -> 83
    //   57: aload_0
    //   58: getfield Zb : Lburp/Zzk6;
    //   61: getfield ZA : Lburp/Zrtw;
    //   64: aload_0
    //   65: getfield Zb : Lburp/Zzk6;
    //   68: getfield Zw : Lburp/Zsuy;
    //   71: invokevirtual isSelected : ()Z
    //   74: invokeinterface ZAE : (Z)V
    //   79: aload_2
    //   80: ifnull -> 360
    //   83: aload_3
    //   84: aload_0
    //   85: getfield Zb : Lburp/Zzk6;
    //   88: getfield ZP : Lburp/Ze7h;
    //   91: if_acmpne -> 111
    //   94: aload_0
    //   95: getfield Zb : Lburp/Zzk6;
    //   98: getfield ZA : Lburp/Zrtw;
    //   101: iconst_0
    //   102: invokeinterface Zis : (I)V
    //   107: aload_2
    //   108: ifnull -> 360
    //   111: aload_3
    //   112: aload_0
    //   113: getfield Zb : Lburp/Zzk6;
    //   116: getfield Zy : Lburp/Ze7h;
    //   119: if_acmpne -> 139
    //   122: aload_0
    //   123: getfield Zb : Lburp/Zzk6;
    //   126: getfield ZA : Lburp/Zrtw;
    //   129: iconst_1
    //   130: invokeinterface Zis : (I)V
    //   135: aload_2
    //   136: ifnull -> 360
    //   139: aload_3
    //   140: aload_0
    //   141: getfield Zb : Lburp/Zzk6;
    //   144: getfield Zr : Lburp/Ze7h;
    //   147: if_acmpne -> 167
    //   150: aload_0
    //   151: getfield Zb : Lburp/Zzk6;
    //   154: getfield ZA : Lburp/Zrtw;
    //   157: iconst_2
    //   158: invokeinterface Zis : (I)V
    //   163: aload_2
    //   164: ifnull -> 360
    //   167: aload_3
    //   168: aload_0
    //   169: getfield Zb : Lburp/Zzk6;
    //   172: getfield Zm : Lburp/Ze7h;
    //   175: if_acmpne -> 195
    //   178: aload_0
    //   179: getfield Zb : Lburp/Zzk6;
    //   182: getfield ZA : Lburp/Zrtw;
    //   185: iconst_3
    //   186: invokeinterface Zis : (I)V
    //   191: aload_2
    //   192: ifnull -> 360
    //   195: aload_3
    //   196: aload_0
    //   197: getfield Zb : Lburp/Zzk6;
    //   200: getfield Zf : Lburp/Zsuy;
    //   203: if_acmpne -> 214
    //   206: aload_0
    //   207: invokevirtual Zd : ()V
    //   210: aload_2
    //   211: ifnull -> 360
    //   214: aload_3
    //   215: aload_0
    //   216: getfield Zb : Lburp/Zzk6;
    //   219: getfield Zh : Lburp/Zsuy;
    //   222: if_acmpne -> 251
    //   225: aload_0
    //   226: getfield Zb : Lburp/Zzk6;
    //   229: getfield ZA : Lburp/Zrtw;
    //   232: aload_0
    //   233: getfield Zb : Lburp/Zzk6;
    //   236: getfield Zh : Lburp/Zsuy;
    //   239: invokevirtual isSelected : ()Z
    //   242: invokeinterface ZYF : (Z)V
    //   247: aload_2
    //   248: ifnull -> 360
    //   251: aload_3
    //   252: aload_0
    //   253: getfield Zb : Lburp/Zzk6;
    //   256: getfield Zj : Lburp/Zsuy;
    //   259: if_acmpne -> 288
    //   262: aload_0
    //   263: getfield Zb : Lburp/Zzk6;
    //   266: getfield ZA : Lburp/Zrtw;
    //   269: aload_0
    //   270: getfield Zb : Lburp/Zzk6;
    //   273: getfield Zj : Lburp/Zsuy;
    //   276: invokevirtual isSelected : ()Z
    //   279: invokeinterface ZAe : (Z)V
    //   284: aload_2
    //   285: ifnull -> 360
    //   288: aload_3
    //   289: aload_0
    //   290: getfield Zb : Lburp/Zzk6;
    //   293: getfield ZS : Lburp/Zsuy;
    //   296: if_acmpne -> 307
    //   299: aload_0
    //   300: invokevirtual ZA : ()V
    //   303: aload_2
    //   304: ifnull -> 360
    //   307: aload_3
    //   308: aload_0
    //   309: getfield Zb : Lburp/Zzk6;
    //   312: getfield Zc : Lburp/Zsuy;
    //   315: if_acmpne -> 326
    //   318: aload_0
    //   319: invokevirtual Zu : ()V
    //   322: aload_2
    //   323: ifnull -> 360
    //   326: aload_3
    //   327: aload_0
    //   328: getfield Zb : Lburp/Zzk6;
    //   331: getfield Zn : Lburp/Zsuy;
    //   334: if_acmpne -> 345
    //   337: aload_0
    //   338: invokevirtual Zl : ()V
    //   341: aload_2
    //   342: ifnull -> 360
    //   345: aload_3
    //   346: aload_0
    //   347: getfield Zb : Lburp/Zzk6;
    //   350: getfield ZU : Lburp/Zsuy;
    //   353: if_acmpne -> 360
    //   356: aload_0
    //   357: invokevirtual Zk : ()V
    //   360: return
  }
  
  private void Zd() {
    boolean bool = this.Zb.Zf.isSelected();
    Zm2.ZC(bool ? Zrrh.REPEATER_OPTIONS_ENFORCE_PROTOCOL_CHOICE_ON_CROSS_DOMAIN_REDIRECTIONS_ENABLED : Zrrh.REPEATER_OPTIONS_ENFORCE_PROTOCOL_CHOICE_ON_CROSS_DOMAIN_REDIRECTIONS_DISABLED);
    this.Zb.ZA.ZYk(bool);
  }
  
  private void ZA() {
    boolean bool = this.Zb.ZS.isSelected();
    Zm2.ZC(bool ? Zrrh.REPEATER_OPTIONS_ENABLE_HTTP1_KEEP_ALIVE_ENABLED : Zrrh.REPEATER_OPTIONS_ENABLE_HTTP1_KEEP_ALIVE_DISABLED);
    this.Zb.ZA.Zej(bool);
  }
  
  private void Zu() {
    boolean bool = this.Zb.Zc.isSelected();
    Zm2.ZC(bool ? Zrrh.REPEATER_OPTIONS_ENABLE_HTTP2_CONNECTION_REUSE_ENABLED : Zrrh.REPEATER_OPTIONS_ENABLE_HTTP2_CONNECTION_REUSE_DISABLED);
    this.Zb.ZA.Zef(bool);
  }
  
  private void Zl() {
    boolean bool = this.Zb.Zn.isSelected();
    Zm2.ZC(bool ? Zrrh.REPEATER_OPTIONS_STRIP_CONNECTION_HEADER_OVER_HTTP2_ENABLED : Zrrh.REPEATER_OPTIONS_STRIP_CONNECTION_HEADER_OVER_HTTP2_DISABLED);
    this.Zb.ZA.ZAl(bool);
  }
  
  private void Zk() {
    boolean bool = this.Zb.ZU.isSelected();
    Zm2.ZC(bool ? Zrrh.REPEATER_OPTIONS_FORCE_HTTP2_ENABLED : Zrrh.REPEATER_OPTIONS_FORCE_HTTP2_DISABLED);
    this.Zb.ZA.ZeE(bool);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */