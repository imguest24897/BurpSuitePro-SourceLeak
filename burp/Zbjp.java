package burp;

class Zbjp implements Zg7k {
  final Zg7k Z_;
  
  final Zb4o ZS;
  
  final Zbdx ZA;
  
  Zbjp(Zbdx paramZbdx, Zg7k paramZg7k, Zb4o paramZb4o) {}
  
  public void ZJ(int paramInt) {
    // Byte code:
    //   0: invokestatic ZA : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Z_ : Lburp/Zg7k;
    //   8: iload_1
    //   9: invokeinterface ZJ : (I)V
    //   14: aload_0
    //   15: getfield ZA : Lburp/Zbdx;
    //   18: getfield Zu : Z
    //   21: ifeq -> 61
    //   24: aload_0
    //   25: getfield ZA : Lburp/Zbdx;
    //   28: getfield ZJ : Lburp/Zr2e;
    //   31: aload_0
    //   32: getfield ZA : Lburp/Zbdx;
    //   35: getfield Zk : Ljava/util/List;
    //   38: iload_1
    //   39: invokeinterface get : (I)Ljava/lang/Object;
    //   44: checkcast burp/Zgib
    //   47: invokeinterface ZK : ()Lburp/Zzxp;
    //   52: invokeinterface ZC : (Lburp/Zzxp;)V
    //   57: aload_2
    //   58: ifnull -> 94
    //   61: aload_0
    //   62: getfield ZA : Lburp/Zbdx;
    //   65: getfield ZJ : Lburp/Zr2e;
    //   68: aload_0
    //   69: getfield ZA : Lburp/Zbdx;
    //   72: getfield Zk : Ljava/util/List;
    //   75: iload_1
    //   76: invokeinterface get : (I)Ljava/lang/Object;
    //   81: checkcast burp/Zgib
    //   84: invokeinterface ZK : ()Lburp/Zzxp;
    //   89: invokeinterface ZU : (Lburp/Zzxp;)V
    //   94: aload_0
    //   95: getfield ZS : Lburp/Zb4o;
    //   98: iload_1
    //   99: invokevirtual Zj : (I)V
    //   102: return
  }
  
  public void ZW(int paramInt) {
    this.Z_.ZW(paramInt);
    this.ZA.ZJ.Zd(((Zgib)this.ZA.Zq.get(paramInt)).ZK());
    this.ZS.Zi(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbjp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */