package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zlse {
  static double ZS(byte paramByte) {
    switch (paramByte) {
      case 11:
        return 1.0E-4D;
      case 12:
        return 1.0E-4D;
      case 14:
        return 2.98E-4D;
      case 13:
        return 1.8E-5D;
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return 0.0D;
  }
  
  static boolean ZY(byte paramByte, int paramInt1, int paramInt2, double paramDouble) {
    return Zk(paramByte, -1, paramInt1, paramInt2, paramDouble);
  }
  
  static boolean Zk(byte paramByte, int paramInt1, int paramInt2, int paramInt3, double paramDouble) {
    switch (paramByte) {
      case 11:
        return (paramInt2 == 20000) ? ((paramInt3 > 9725 && paramInt3 < 10275)) : ((paramDouble > ZS(paramByte)));
      case 13:
        switch (paramInt1) {
          case 1:
            return (paramInt2 == 20000) ? ((paramInt3 >= 2315 && paramInt3 <= 2685)) : ((paramDouble > ZS(paramByte)));
          case 2:
            return (paramInt2 == 20000) ? ((paramInt3 >= 1114 && paramInt3 <= 1386)) : ((paramDouble > ZS(paramByte)));
          case 3:
            return (paramInt2 == 20000) ? ((paramInt3 >= 527 && paramInt3 <= 723)) : ((paramDouble > ZS(paramByte)));
          case 4:
            return (paramInt2 == 20000) ? ((paramInt3 >= 240 && paramInt3 <= 384)) : ((paramDouble > ZS(paramByte)));
          case 5:
            return (paramInt2 == 20000) ? ((paramInt3 >= 103 && paramInt3 <= 209)) : ((paramDouble > ZS(paramByte)));
          case 6:
            return (paramInt2 == 20000) ? ((paramInt3 >= 103 && paramInt3 <= 209)) : ((paramDouble > ZS(paramByte)));
        } 
        Zuh.Zv(false, Zqf.Zk, paramInt1);
        return true;
      case 14:
        return (paramInt3 < 12) ? true : ((paramInt2 == 20000) ? ((paramInt3 < 26)) : ((paramDouble > ZS(paramByte))));
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return true;
  }
  
  static boolean ZH(byte paramByte, int paramInt, double paramDouble1, double paramDouble2) {
    switch (paramByte) {
      case 12:
        return (paramInt == 20000) ? ((paramDouble1 > 2.16D && paramDouble1 < 46.17D)) : ((paramDouble2 > ZS(paramByte)));
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlse.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */