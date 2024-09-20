package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ztav {
  private Zgrn ZS;
  
  private Zgrn ZX;
  
  final Zm82 Zn;
  
  private Ztav(Zm82 paramZm82) {}
  
  private void Zc(Zez3 paramZez3) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zn : Lburp/Zm82;
    //   4: getfield ZA : B
    //   7: iconst_3
    //   8: if_icmpne -> 12
    //   11: return
    //   12: aload_0
    //   13: getfield Zn : Lburp/Zm82;
    //   16: getfield ZM : Lburp/Zzv5;
    //   19: invokeinterface Zi : ()Z
    //   24: ifne -> 28
    //   27: return
    //   28: aload_0
    //   29: getfield Zn : Lburp/Zm82;
    //   32: getfield ZM : Lburp/Zzv5;
    //   35: aload_1
    //   36: invokeinterface ZlL : ()Lburp/Zlit;
    //   41: iconst_0
    //   42: invokeinterface ZQ : (Lburp/Zlit;S)Z
    //   47: ifne -> 51
    //   50: return
    //   51: aload_1
    //   52: invokestatic Zh : (Lburp/Zez3;)Z
    //   55: ifne -> 59
    //   58: return
    //   59: aload_0
    //   60: getfield Zn : Lburp/Zm82;
    //   63: aload_0
    //   64: aload_1
    //   65: <illegal opcode> run : (Lburp/Ztav;Lburp/Zez3;)Ljava/lang/Runnable;
    //   70: invokevirtual Zr : (Ljava/lang/Runnable;)V
    //   73: return
  }
  
  private Zez3 Zj(Zez3 paramZez3) {
    Zez3 zez3 = this.Zn.Zj.Zq(paramZez3.ZlL(), (short)0);
    Zs73 zs73 = (new Ztgc(paramZez3)).ZE();
    Zrf_ zrf_ = (new Zb4h(paramZez3)).ZU();
    (new Zsir()).Zp(zrf_.Z__(), zrf_.Z_O()).ZV(zrf_.Z_B(), zrf_.Z_z(), zrf_.Z_V(), zrf_.Z_F(), zrf_.Z_I(), zrf_.Z_a()).ZG(zs73.ZTU(), zs73.ZTI(), zs73.ZTF(), zs73.ZTR()).Zd(zez3);
    this.Zn.Zj.ZR(zez3);
    return zez3;
  }
  
  void ZB(Zlli<Zt10> paramZlli) {
    this.ZS = paramZlli.ZE(Zt10.ZA, this::lambda$subscribeTo$1);
    this.ZX = paramZlli.ZE(Zt10.Zo, this::lambda$subscribeTo$3);
  }
  
  void ZO() {
    this.ZS.ZZ();
    this.ZX.ZZ();
  }
  
  private void lambda$subscribeTo$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeTo$2);
  }
  
  private void lambda$subscribeTo$2(Zzze paramZzze) {
    Zc(paramZzze.Zs());
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zc);
  }
  
  private void lambda$mapItemUpdated$0(Zez3 paramZez3) {
    Zez3 zez31;
    Zrf_ zrf_;
    Zez3 zez32;
    Zbqc[] arrayOfZbqc = Zm82.Zb();
    if (this.Zn.Zj.Zf(paramZez3.ZlL()) != null)
      return; 
    Zs73 zs73 = (new Ztgc(paramZez3)).ZE();
    switch (zs73.ZTI()) {
      case 1:
        zez31 = Zj(paramZez3);
        this.Zn.Zb(zez31);
        return;
      case 0:
        zrf_ = (new Zb4h(paramZez3)).ZU();
        if (zrf_.Z_B() != null) {
          this.Zn.ZI.Zq().ZP(new Zzig(paramZez3.Zod(), zrf_.Z__(), zrf_.Z_B(), (short)0, this.Zn.ZM.ZA()));
          if (arrayOfZbqc == null) {
            Zez3 zez3 = this.Zn.Zj.Zq(paramZez3.ZlL(), (short)0);
            this.Zn.Zj.ZR(zez3);
            this.Zn.ZI.Zh(zez3);
          } 
        } 
        zez32 = this.Zn.Zj.Zq(paramZez3.ZlL(), (short)0);
        this.Zn.Zj.ZR(zez32);
        this.Zn.ZI.Zh(zez32);
      case 2:
      case 3:
        return;
    } 
    Zuh.Zv(false, Zqf.Zk, zs73.ZTI());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztav.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */