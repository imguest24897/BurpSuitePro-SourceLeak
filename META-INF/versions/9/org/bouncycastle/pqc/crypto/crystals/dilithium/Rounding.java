package META-INF.versions.9.org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

class Rounding {
  public static int[] power2Round(int paramInt) {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = paramInt + 4096 - 1 >> 13;
    arrayOfInt[1] = paramInt - (arrayOfInt[0] << 13);
    return arrayOfInt;
  }
  
  public static int[] decompose(int paramInt1, int paramInt2) {
    int i = paramInt1 + 127 >> 7;
    if (paramInt2 == 261888) {
      i = i * 1025 + 2097152 >> 22;
      i &= 0xF;
    } else if (paramInt2 == 95232) {
      i = i * 11275 + 8388608 >> 24;
      i ^= 43 - i >> 31 & i;
    } else {
      throw new RuntimeException("Wrong Gamma2!");
    } 
    int j = paramInt1 - i * 2 * paramInt2;
    j -= 4190208 - j >> 31 & 0x7FE001;
    return new int[] { j, i };
  }
  
  public static int makeHint(int paramInt1, int paramInt2, DilithiumEngine paramDilithiumEngine) {
    int i = paramDilithiumEngine.getDilithiumGamma2();
    int j = 8380417;
    return (paramInt1 <= i || paramInt1 > j - i || (paramInt1 == j - i && paramInt2 == 0)) ? 0 : 1;
  }
  
  public static int useHint(int paramInt1, int paramInt2, int paramInt3) {
    int[] arrayOfInt = decompose(paramInt1, paramInt3);
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    if (paramInt2 == 0)
      return j; 
    if (paramInt3 == 261888)
      return (i > 0) ? (j + 1 & 0xF) : (j - 1 & 0xF); 
    if (paramInt3 == 95232)
      return (i > 0) ? ((j == 43) ? 0 : (j + 1)) : ((j == 0) ? 43 : (j - 1)); 
    throw new RuntimeException("Wrong Gamma2!");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\crystals\dilithium\Rounding.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */