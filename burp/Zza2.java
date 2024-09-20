package burp;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zza2 {
  private final Zkrw ZY;
  
  private final Zbw_<?> Zq;
  
  private final Zgjf ZQ;
  
  private final Zlb7 ZI;
  
  private final Ztpu ZN;
  
  private final Zkl6 Zb;
  
  private final Ztwv ZX;
  
  private final Zr_4 ZC;
  
  public Zza2(Zkrw paramZkrw, Zbw_<?> paramZbw_, Zgjf paramZgjf, Zlb7 paramZlb7, Ztpu paramZtpu, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_4) {
    this.ZY = paramZkrw;
    this.Zq = paramZbw_;
    this.ZQ = paramZgjf;
    this.ZI = paramZlb7;
    this.ZN = paramZtpu;
    this.Zb = paramZkl6;
    this.ZX = paramZtwv;
    this.ZC = paramZr_4;
  }
  
  Optional<Zs9s> ZB(Zl04 paramZl04) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Za : ()Ljava/util/Optional;
    //   4: aload_0
    //   5: <illegal opcode> get : (Lburp/Zza2;)Ljava/util/function/Supplier;
    //   10: invokevirtual or : (Ljava/util/function/Supplier;)Ljava/util/Optional;
    //   13: aload_0
    //   14: aload_1
    //   15: <illegal opcode> get : (Lburp/Zza2;Lburp/Zl04;)Ljava/util/function/Supplier;
    //   20: invokevirtual or : (Ljava/util/function/Supplier;)Ljava/util/Optional;
    //   23: areturn
  }
  
  private Optional<Zs9s> Za() {
    int i = Zguu.Zb();
    if (this.ZQ.Zd()) {
      byte b = 0;
      while (b < this.ZQ.Zz()) {
        Zs9s zs9s = this.ZQ.ZQ(b);
        if (zs9s.Zc() && zs9s.ZY() == 1)
          return Optional.of(zs9s); 
        b++;
        if (i == 0)
          break; 
      } 
    } 
    return Optional.empty();
  }
  
  private Optional<Zs9s> ZW() {
    int i = Zguu.ZI();
    byte b = 0;
    while (b < this.ZQ.Zz()) {
      Zs9s zs9s = this.ZQ.ZQ(b);
      if (zs9s.ZY() == 1 && this.Zq.ZR(b, null))
        return Optional.of(zs9s); 
      b++;
      if (i != 0)
        break; 
    } 
    return Optional.empty();
  }
  
  private Optional<Zs9s> Zh(Zl04 paramZl04) {
    // Byte code:
    //   0: invokestatic Zb : ()I
    //   3: istore_2
    //   4: sipush #8080
    //   7: istore_3
    //   8: iload_3
    //   9: ldc 65535
    //   11: if_icmpge -> 106
    //   14: iload_3
    //   15: invokestatic ZO : (I)Z
    //   18: ifeq -> 99
    //   21: aload_0
    //   22: aload_1
    //   23: iload_3
    //   24: invokevirtual ZC : (Lburp/Zl04;I)Lburp/Zs9s;
    //   27: astore #4
    //   29: iconst_0
    //   30: istore #5
    //   32: iload #5
    //   34: aload_0
    //   35: getfield ZQ : Lburp/Zgjf;
    //   38: invokevirtual Zz : ()I
    //   41: if_icmpge -> 99
    //   44: aload_0
    //   45: getfield ZQ : Lburp/Zgjf;
    //   48: iload #5
    //   50: invokevirtual ZQ : (I)Lburp/Zs9s;
    //   53: aload #4
    //   55: if_acmpne -> 92
    //   58: aload_0
    //   59: getfield Zq : Lburp/Zbw_;
    //   62: iload #5
    //   64: aconst_null
    //   65: invokeinterface ZR : (ILjava/awt/Window;)Z
    //   70: ifeq -> 79
    //   73: aload #4
    //   75: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   78: areturn
    //   79: aload_0
    //   80: getfield ZQ : Lburp/Zgjf;
    //   83: iload #5
    //   85: invokevirtual Zk : (I)V
    //   88: iload_2
    //   89: ifne -> 99
    //   92: iinc #5, 1
    //   95: iload_2
    //   96: ifne -> 32
    //   99: iinc #3, 1
    //   102: iload_2
    //   103: ifne -> 8
    //   106: invokestatic empty : ()Ljava/util/Optional;
    //   109: areturn
  }
  
  private Zs9s ZC(Zl04 paramZl04, int paramInt) {
    CountDownLatch countDownLatch = new CountDownLatch(1);
    Zs9s zs9s = Zq(paramZl04, paramInt, countDownLatch);
    this.ZQ.ZU(zs9s, null, true);
    try {
      countDownLatch.await();
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } 
    return zs9s;
  }
  
  private Zs9s Zq(Zl04 paramZl04, int paramInt, CountDownLatch paramCountDownLatch) {
    Zrk4 zrk4 = (new Zrk4()).ZX(paramInt).ZD((byte)1).ZU((byte)1);
    return new Zb2x(this, this.ZC.<Zg5n>ZH(zrk4), this.Zb, this.ZX, this.ZI, this.ZY.ZY4(), this.ZN, new Zryw(this.ZY), paramZl04, paramCountDownLatch);
  }
  
  private static boolean ZO(int paramInt) {
    try {
      ServerSocket serverSocket = new ServerSocket(paramInt);
      try {
        DatagramSocket datagramSocket = new DatagramSocket(paramInt);
        try {
          serverSocket.setReuseAddress(true);
          datagramSocket.setReuseAddress(true);
          boolean bool = true;
          datagramSocket.close();
          serverSocket.close();
          return bool;
        } catch (Throwable throwable) {
          try {
            datagramSocket.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          } 
          throw throwable;
        } 
      } catch (Throwable throwable) {
        try {
          serverSocket.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        } 
        throw throwable;
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
      return false;
    } 
  }
  
  private Optional lambda$findRunningListener$0(Zl04 paramZl04) {
    return Zh(paramZl04);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zza2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */