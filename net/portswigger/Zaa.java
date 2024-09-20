package net.portswigger;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.Random;

public class Zaa implements Znn {
  private final Random ZY = new Random();
  
  private final Zog ZV;
  
  private final boolean Zb;
  
  private final Socket Zk;
  
  private boolean ZX = false;
  
  private final List<Zhb> Zu;
  
  public Zaa(Socket paramSocket, boolean paramBoolean, List<Zhb> paramList, Zod paramZod) throws IOException {
    this.Zk = paramSocket;
    this.ZV = new Zog(paramZod, paramSocket.getOutputStream());
    this.Zb = paramBoolean;
    this.Zu = paramList;
  }
  
  private synchronized void Zt(Zrz_ paramZrz_) throws IOException {
    this.ZV.Zy(paramZrz_);
  }
  
  private void Ze(Zc_ paramZc_, byte[] paramArrayOfbyte) throws Zrmv {
    Zm(paramZc_, paramArrayOfbyte, paramArrayOfbyte.length, new Zo(), true);
  }
  
  private void Zm(Zc_ paramZc_, byte[] paramArrayOfbyte, int paramInt, Zo paramZo, boolean paramBoolean) throws Zrmv {
    try {
      ZY(paramZc_, paramArrayOfbyte, paramInt, paramZo, paramBoolean);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      Zn();
      throw new Zrmv(iOException);
    } 
  }
  
  private void ZY(Zc_ paramZc_, byte[] paramArrayOfbyte, int paramInt, Zo paramZo, boolean paramBoolean) throws IOException {
    int[] arrayOfInt = Zus.Zk();
    if (this.Zb) {
      byte[] arrayOfByte = new byte[4];
      try {
        this.ZY.nextBytes(arrayOfByte);
        Zt(new Zrz_(paramBoolean, paramZo, ZD(paramZc_), true, arrayOfByte, paramArrayOfbyte, paramInt));
        if (arrayOfInt != null) {
          Zt(new Zrz_(paramBoolean, paramZo, ZD(paramZc_), false, null, paramArrayOfbyte, paramInt));
          return;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return;
    } 
    Zt(new Zrz_(paramBoolean, paramZo, ZD(paramZc_), false, null, paramArrayOfbyte, paramInt));
  }
  
  public void Zn() {
    try {
      if (this.ZX)
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZX = true;
    try {
      ZY(Zc_.CLOSE, new byte[0], 0, new Zo(), true);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } finally {
      Zv_.ZI(this.Zk);
    } 
  }
  
  public boolean Zz() {
    return !this.ZX;
  }
  
  private Za9 Ze(byte[] paramArrayOfbyte, int paramInt) {
    Zo zo = new Zo();
    int i = paramInt;
    int[] arrayOfInt = Zus.Zk();
    for (Zhb zhb : this.Zu) {
      Zto<byte[], Zo> zto = zhb.Z_(paramArrayOfbyte);
      paramArrayOfbyte = (byte[])zto.Zq;
      i = ((byte[])zto.Zq).length;
      zo = zo.ZD((Zo)zto.Zo);
      if (arrayOfInt != null)
        break; 
    } 
    return new Za9(paramArrayOfbyte, i, zo);
  }
  
  public void ZH(String paramString) throws Zrmv {
    byte[] arrayOfByte = Zny.Zv(paramString);
    ZB(arrayOfByte, arrayOfByte.length, false);
  }
  
  void ZB(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) throws Zrmv {
    Za9 za9 = Ze(paramArrayOfbyte, paramInt);
    try {
    
    } catch (Zrmv zrmv) {
      throw a(null);
    } 
    Zm(paramBoolean ? Zc_.BINARY : Zc_.TEXT, za9.Zl, za9.Zc, za9.Zq, true);
  }
  
  private Zau Zu(byte[] paramArrayOfbyte, int paramInt, Zc_ paramZc_, Zo paramZo) {
    // Byte code:
    //   0: iload_2
    //   1: aload_1
    //   2: arraylength
    //   3: if_icmplt -> 32
    //   6: aload_0
    //   7: aload_3
    //   8: aload_1
    //   9: aload_1
    //   10: arraylength
    //   11: aload #4
    //   13: iconst_1
    //   14: invokevirtual Zm : (Lnet/portswigger/Zc_;[BILnet/portswigger/Zo;Z)V
    //   17: goto -> 30
    //   20: astore #5
    //   22: aload #5
    //   24: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   27: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   30: aconst_null
    //   31: areturn
    //   32: aload_0
    //   33: aload_3
    //   34: aload_1
    //   35: iload_2
    //   36: aload #4
    //   38: iconst_0
    //   39: invokevirtual Zm : (Lnet/portswigger/Zc_;[BILnet/portswigger/Zo;Z)V
    //   42: goto -> 55
    //   45: astore #5
    //   47: aload #5
    //   49: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   52: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   55: aload_1
    //   56: iload_2
    //   57: aload_1
    //   58: arraylength
    //   59: invokestatic copyOfRange : ([BII)[B
    //   62: astore #5
    //   64: aload_0
    //   65: aload #5
    //   67: aload #4
    //   69: <illegal opcode> ZJ : (Lnet/portswigger/Zaa;[BLnet/portswigger/Zo;)Lnet/portswigger/Zau;
    //   74: areturn
    // Exception table:
    //   from	to	target	type
    //   6	17	20	net/portswigger/Zrmv
    //   32	42	45	net/portswigger/Zrmv
  }
  
  private static byte ZD(Zc_ paramZc_) {
    switch (Zmj.Zw[paramZc_.ordinal()]) {
      case 1:
        return 0;
      case 2:
        return 1;
      case 3:
        return 2;
      case 4:
        return 8;
      case 5:
        return 9;
      case 6:
        return 10;
    } 
    Zuh.Zb(false, Zqf.Zs);
    return -1;
  }
  
  private Zau lambda$sendContinuation$0(byte[] paramArrayOfbyte, Zo paramZo, int paramInt) {
    return Zu(paramArrayOfbyte, paramInt, Zc_.CONTINUATION, paramZo);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zaa.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */