package burp;

import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb3i {
  public static int Zw(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    byte b1 = paramZrdb1.Zaw();
    byte b2 = paramZrdb1.Zak();
    byte b3 = paramZrdb2.Zaw();
    byte b4 = paramZrdb2.Zak();
    return ZS(paramZrdb1, b1, b2, paramZrdb2, b3, b4);
  }
  
  public static int ZZ(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    byte b1 = paramZrdb1.ZaJ();
    byte b2 = paramZrdb1.Zac();
    byte b3 = paramZrdb2.ZaJ();
    String[] arrayOfString = Zrlp.Zi();
    byte b4 = paramZrdb2.Zac();
    if (Zbqc.Zwu() == null)
      Zrlp.ZB(new String[4]); 
    return ZS(paramZrdb1, b1, b2, paramZrdb2, b3, b4);
  }
  
  public static int ZS(Zrdb paramZrdb1, byte paramByte1, byte paramByte2, Zrdb paramZrdb2, byte paramByte3, byte paramByte4) {
    String[] arrayOfString = Zrlp.Zi();
    Zuh.Zi((paramByte1 != 0 && paramByte2 != 0), Zqf.Zk, paramByte1, paramByte2, paramZrdb1.Za6().ZS());
    Zuh.Zi((paramByte3 != 0 && paramByte4 != 0), Zqf.Zk, paramByte3, paramByte4, paramZrdb2.Za6().ZS());
    int i = ZE(paramByte1, paramByte2);
    int j = ZE(paramByte3, paramByte4);
    if (i == j)
      return 0; 
    if (i < j)
      return -1; 
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[3]); 
    return 1;
  }
  
  public static int ZE(byte paramByte1, byte paramByte2) {
    // Byte code:
    //   0: invokestatic Zi : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: iload_0
    //   5: tableswitch default -> 204, -1 -> 201, 0 -> 204, 1 -> 161, 2 -> 119, 3 -> 82, 4 -> 44
    //   44: iload_1
    //   45: tableswitch default -> 78, 1 -> 76, 2 -> 74, 3 -> 72
    //   72: iconst_1
    //   73: ireturn
    //   74: iconst_2
    //   75: ireturn
    //   76: iconst_4
    //   77: ireturn
    //   78: aload_2
    //   79: ifnonnull -> 204
    //   82: iload_1
    //   83: tableswitch default -> 115, 1 -> 112, 2 -> 110, 3 -> 108
    //   108: iconst_3
    //   109: ireturn
    //   110: iconst_5
    //   111: ireturn
    //   112: bipush #7
    //   114: ireturn
    //   115: aload_2
    //   116: ifnonnull -> 204
    //   119: iload_1
    //   120: tableswitch default -> 157, 1 -> 154, 2 -> 151, 3 -> 148
    //   148: bipush #6
    //   150: ireturn
    //   151: bipush #8
    //   153: ireturn
    //   154: bipush #9
    //   156: ireturn
    //   157: aload_2
    //   158: ifnonnull -> 204
    //   161: iload_1
    //   162: tableswitch default -> 197, 1 -> 194, 2 -> 191, 3 -> 188
    //   188: bipush #10
    //   190: ireturn
    //   191: bipush #11
    //   193: ireturn
    //   194: bipush #12
    //   196: ireturn
    //   197: aload_2
    //   198: ifnonnull -> 204
    //   201: bipush #13
    //   203: ireturn
    //   204: iconst_0
    //   205: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   208: iload_0
    //   209: i2l
    //   210: iload_1
    //   211: i2l
    //   212: invokestatic ZC : (ZLnet/portswigger/Zqf;JJ)V
    //   215: sipush #9999
    //   218: ireturn
  }
  
  public static Zrdb Zs(List<Zrdb> paramList, boolean paramBoolean) {
    String[] arrayOfString = Zrlp.Zi();
    if (paramList.size() == 0)
      return null; 
    Zrdb zrdb = paramList.get(0);
    byte b = 1;
    while (b < paramList.size()) {
      Zrdb zrdb1 = paramList.get(b);
      int i = paramBoolean ? ZZ(zrdb, zrdb1) : Zw(zrdb, zrdb1);
      if (i > 0)
        zrdb = zrdb1; 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return zrdb;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */