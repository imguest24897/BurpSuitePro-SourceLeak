package burp;

import java.util.concurrent.atomic.AtomicReference;

public class Zqf {
  private final Zt0e Zv;
  
  private final Zse4 Zh;
  
  private final byte[] Zs;
  
  private final int ZV;
  
  private final int Zg;
  
  private final int ZH;
  
  public Zqf(Ze4y paramZe4y, int paramInt, Zt0e paramZt0e) {
    this.Zv = paramZt0e;
    this.Zh = new Zse4(paramZe4y);
    int i = this.Zh.Zt();
    int j = i * paramInt;
    this.ZV = Zeeq.ZB(paramInt);
    this.Zg = i * this.ZV;
    this.Zs = new byte[j * this.ZV];
    this.ZH = Zeeq.ZW(this.ZV);
  }
  
  public Zqf ZN(int paramInt1, Ztx4 paramZtx4, Zb84 paramZb84, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore #5
    //   5: aload_0
    //   6: getfield Zh : Lburp/Zse4;
    //   9: aload_2
    //   10: invokevirtual Zo : (Lburp/Ztx4;)I
    //   13: istore #6
    //   15: aload_3
    //   16: invokevirtual ordinal : ()I
    //   19: tableswitch default -> 201, 0 -> 48, 1 -> 87, 2 -> 167, 3 -> 131
    //   48: iload #6
    //   50: aload_0
    //   51: getfield Zh : Lburp/Zse4;
    //   54: invokevirtual ZE : ()I
    //   57: if_icmpge -> 64
    //   60: iconst_1
    //   61: goto -> 65
    //   64: iconst_0
    //   65: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   68: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   71: aload_0
    //   72: iload_1
    //   73: iload #6
    //   75: iload #4
    //   77: iconst_1
    //   78: iadd
    //   79: invokevirtual Zo : (III)V
    //   82: iload #5
    //   84: ifne -> 201
    //   87: iload #6
    //   89: aload_0
    //   90: getfield Zh : Lburp/Zse4;
    //   93: invokevirtual ZE : ()I
    //   96: if_icmpge -> 103
    //   99: iconst_1
    //   100: goto -> 104
    //   103: iconst_0
    //   104: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   107: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   110: aload_0
    //   111: iload_1
    //   112: iload #6
    //   114: aload_0
    //   115: getfield ZH : I
    //   118: iload #4
    //   120: iconst_1
    //   121: iadd
    //   122: ior
    //   123: invokevirtual Zo : (III)V
    //   126: iload #5
    //   128: ifne -> 201
    //   131: iload #6
    //   133: aload_0
    //   134: getfield Zh : Lburp/Zse4;
    //   137: invokevirtual ZE : ()I
    //   140: if_icmpge -> 147
    //   143: iconst_1
    //   144: goto -> 148
    //   147: iconst_0
    //   148: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   151: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   154: aload_0
    //   155: iload_1
    //   156: iload #6
    //   158: iconst_m1
    //   159: invokevirtual Zo : (III)V
    //   162: iload #5
    //   164: ifne -> 201
    //   167: iload #6
    //   169: aload_0
    //   170: getfield Zh : Lburp/Zse4;
    //   173: invokevirtual ZE : ()I
    //   176: if_icmplt -> 183
    //   179: iconst_1
    //   180: goto -> 184
    //   183: iconst_0
    //   184: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   187: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   190: aload_0
    //   191: iload_1
    //   192: iload #6
    //   194: iload #4
    //   196: iconst_1
    //   197: iadd
    //   198: invokevirtual Zo : (III)V
    //   201: aload_0
    //   202: areturn
  }
  
  public Zb84 Zc(int paramInt, Ztx4 paramZtx4) {
    Zeeq zeeq = ZT();
    AtomicReference<Zb84> atomicReference = new AtomicReference(null);
    zeeq.ZK(paramInt, paramZtx4, new Zb6o(this, atomicReference));
    return atomicReference.get();
  }
  
  public int Zp(int paramInt, Ztx4 paramZtx4) {
    Zeeq zeeq = ZT();
    AtomicReference<Integer> atomicReference = new AtomicReference<>(Integer.valueOf(-1));
    zeeq.ZK(paramInt, paramZtx4, new Ze2d(this, atomicReference));
    return ((Integer)atomicReference.get()).intValue();
  }
  
  public Zeeq ZT() {
    return new Zeeq(this.Zh, this.Zs, this.Zv);
  }
  
  private void Zo(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 * this.Zg + paramInt2 * this.ZV;
    byte b = 0;
    boolean bool = Zse4.Zj();
    while (b < this.ZV) {
      this.Zs[i + b] = (byte)(paramInt3 >> b * 8);
      b++;
      if (bool)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zqf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */