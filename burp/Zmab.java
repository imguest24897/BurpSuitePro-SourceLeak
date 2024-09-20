package burp;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Set;
import java.util.TreeSet;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmab {
  private static final String a;
  
  public static byte[] ZT(String paramString) {
    int i = Zkh7.ZP();
    try {
      if (paramString.length() == 0)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    byte[] arrayOfByte = new byte[4];
    String[] arrayOfString = paramString.split(a, -1);
    try {
      long l;
      byte b;
      switch (arrayOfString.length) {
        case 1:
          l = Long.parseLong(arrayOfString[0]);
          try {
            if (l < 0L || l > 4294967295L)
              return null; 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          arrayOfByte[0] = (byte)(int)(l >> 24L & 0xFFL);
          arrayOfByte[1] = (byte)(int)((l & 0xFFFFFFL) >> 16L & 0xFFL);
          arrayOfByte[2] = (byte)(int)((l & 0xFFFFL) >> 8L & 0xFFL);
          arrayOfByte[3] = (byte)(int)(l & 0xFFL);
          if (i == 0);
          return arrayOfByte;
        case 2:
          l = Integer.parseInt(arrayOfString[0]);
          try {
            if (l < 0L || l > 255L)
              return null; 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          arrayOfByte[0] = (byte)(int)(l & 0xFFL);
          l = Integer.parseInt(arrayOfString[1]);
          try {
            if (l < 0L || l > 16777215L)
              return null; 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          arrayOfByte[1] = (byte)(int)(l >> 16L & 0xFFL);
          arrayOfByte[2] = (byte)(int)((l & 0xFFFFL) >> 8L & 0xFFL);
          arrayOfByte[3] = (byte)(int)(l & 0xFFL);
          if (i == 0);
          return arrayOfByte;
        case 3:
          b = 0;
          while (b < 2) {
            l = Integer.parseInt(arrayOfString[b]);
            try {
              if (l < 0L || l > 255L)
                return null; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            arrayOfByte[b] = (byte)(int)(l & 0xFFL);
            b++;
            if (i == 0)
              break; 
          } 
          l = Integer.parseInt(arrayOfString[2]);
          try {
            if (l < 0L || l > 65535L)
              return null; 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          arrayOfByte[2] = (byte)(int)(l >> 8L & 0xFFL);
          arrayOfByte[3] = (byte)(int)(l & 0xFFL);
          if (i == 0);
          return arrayOfByte;
        case 4:
          b = 0;
          while (b < 4) {
            l = Integer.parseInt(arrayOfString[b]);
            try {
              if (l < 0L || l > 255L)
                return null; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            arrayOfByte[b] = (byte)(int)(l & 0xFFL);
            b++;
            if (i == 0)
              break; 
          } 
          if (i == 0)
            break; 
          return arrayOfByte;
      } 
      return null;
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return null;
    } 
  }
  
  public static byte[] ZD(String paramString) {
    int i = Zkh7.ZP();
    try {
      if (paramString.length() < 2)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    char[] arrayOfChar = paramString.toCharArray();
    byte[] arrayOfByte1 = new byte[16];
    int j = arrayOfChar.length;
    int k = paramString.indexOf("%");
    try {
      if (k == j - 1)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    if (k != -1)
      j = k; 
    byte b = -1;
    byte b1 = 0;
    byte b2 = 0;
    try {
      if (arrayOfChar[b1] == ':')
        try {
          if (arrayOfChar[++b1] != ':')
            return null; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    byte b3 = b1;
    boolean bool1 = false;
    boolean bool2 = false;
    while (true) {
      while (true)
        break; 
      if (i == 0) {
        try {
          if (SYNTHETIC_LOCAL_VARIABLE_3 == 46 && b2 + 4 <= 16) {
            String str = paramString.substring(b3, j);
            byte b4 = 0;
            int m = 0;
            while ((m = str.indexOf('.', m)) != -1) {
              b4++;
              m++;
              if (i == 0)
                break; 
            } 
            try {
              if (b4 != 3)
                return null; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            byte[] arrayOfByte = ZT(str);
            try {
              if (arrayOfByte == null)
                return null; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            byte b5 = 0;
            while (b5 < 4) {
              arrayOfByte1[b2++] = arrayOfByte[b5];
              b5++;
              if (i == 0)
                break; 
            } 
            bool1 = false;
            try {
              if (i == 0)
                return null; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            break;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return null;
      } 
    } 
    try {
      if (bool1) {
        try {
          if (b2 + 2 > 16)
            return null; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        arrayOfByte1[b2++] = (byte)(bool2 >> 8 & 0xFF);
        arrayOfByte1[b2++] = (byte)(bool2 & 0xFF);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    if (b != -1) {
      int m = b2 - b;
      try {
        if (b2 == 16)
          return null; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      b1 = 1;
      while (b1 <= m) {
        arrayOfByte1[16 - b1] = arrayOfByte1[b + m - b1];
        arrayOfByte1[b + m - b1] = 0;
        b1++;
        if (i == 0)
          break; 
      } 
      b2 = 16;
    } 
    try {
      if (b2 != 16)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    byte[] arrayOfByte2 = ZS(arrayOfByte1);
    try {
      if (arrayOfByte2 != null)
        return arrayOfByte2; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return arrayOfByte1;
  }
  
  public static boolean ZC(String paramString) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (ZT(paramString) != null);
  }
  
  public static boolean ZE(String paramString) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (ZD(paramString) != null);
  }
  
  public static byte[] ZS(byte[] paramArrayOfbyte) {
    if (ZP(paramArrayOfbyte)) {
      byte[] arrayOfByte = new byte[4];
      System.arraycopy(paramArrayOfbyte, 12, arrayOfByte, 0, 4);
      return arrayOfByte;
    } 
    return null;
  }
  
  private static boolean ZP(byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte.length < 16)
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte[0] == 0)
        try {
          if (paramArrayOfbyte[1] == 0)
            try {
              if (paramArrayOfbyte[2] == 0)
                try {
                  if (paramArrayOfbyte[3] == 0)
                    try {
                      if (paramArrayOfbyte[4] == 0)
                        try {
                          if (paramArrayOfbyte[5] == 0)
                            try {
                              if (paramArrayOfbyte[6] == 0)
                                try {
                                  if (paramArrayOfbyte[7] == 0)
                                    try {
                                      if (paramArrayOfbyte[8] == 0)
                                        try {
                                          if (paramArrayOfbyte[9] == 0)
                                            try {
                                              if (paramArrayOfbyte[10] == -1)
                                                try {
                                                  if (paramArrayOfbyte[11] == -1)
                                                    return true; 
                                                } catch (NumberFormatException numberFormatException) {
                                                  throw a(null);
                                                }  
                                            } catch (NumberFormatException numberFormatException) {
                                              throw a(null);
                                            }  
                                        } catch (NumberFormatException numberFormatException) {
                                          throw a(null);
                                        }  
                                    } catch (NumberFormatException numberFormatException) {
                                      throw a(null);
                                    }  
                                } catch (NumberFormatException numberFormatException) {
                                  throw a(null);
                                }  
                            } catch (NumberFormatException numberFormatException) {
                              throw a(null);
                            }  
                        } catch (NumberFormatException numberFormatException) {
                          throw a(null);
                        }  
                    } catch (NumberFormatException numberFormatException) {
                      throw a(null);
                    }  
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                }  
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  public static Set<String> Zc() {
    int i = Zkh7.ZD();
    TreeSet<String> treeSet = new TreeSet();
    try {
      Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
      while (enumeration.hasMoreElements()) {
        Enumeration<InetAddress> enumeration1 = ((NetworkInterface)enumeration.nextElement()).getInetAddresses();
        while (enumeration1.hasMoreElements()) {
          String str = ((InetAddress)enumeration1.nextElement()).toString();
          int j = str.indexOf('/');
          if (j >= 0)
            str = str.substring(j + 1); 
          treeSet.add(str);
          if (i != 0)
            break; 
        } 
        if (i != 0)
          break; 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return treeSet;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #89
    //   2: ldc 'a'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmab.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #100
    //   82: goto -> 112
    //   85: bipush #101
    //   87: goto -> 112
    //   90: bipush #122
    //   92: goto -> 112
    //   95: bipush #87
    //   97: goto -> 112
    //   100: bipush #106
    //   102: goto -> 112
    //   105: bipush #42
    //   107: goto -> 112
    //   110: bipush #15
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmab.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */