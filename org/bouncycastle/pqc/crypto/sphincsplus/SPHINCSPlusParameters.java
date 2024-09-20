package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

public class SPHINCSPlusParameters {
  public static final SPHINCSPlusParameters sha2_128f_robust = new SPHINCSPlusParameters(Integers.valueOf(65793), "sha2-128f-robust", new Sha2EngineProvider(true, 16, 16, 22, 6, 33, 66));
  
  public static final SPHINCSPlusParameters sha2_128s_robust = new SPHINCSPlusParameters(Integers.valueOf(65794), "sha2-128s-robust", new Sha2EngineProvider(true, 16, 16, 7, 12, 14, 63));
  
  public static final SPHINCSPlusParameters sha2_192f_robust = new SPHINCSPlusParameters(Integers.valueOf(65795), "sha2-192f-robust", new Sha2EngineProvider(true, 24, 16, 22, 8, 33, 66));
  
  public static final SPHINCSPlusParameters sha2_192s_robust = new SPHINCSPlusParameters(Integers.valueOf(65796), "sha2-192s-robust", new Sha2EngineProvider(true, 24, 16, 7, 14, 17, 63));
  
  public static final SPHINCSPlusParameters sha2_256f_robust = new SPHINCSPlusParameters(Integers.valueOf(65797), "sha2-256f-robust", new Sha2EngineProvider(true, 32, 16, 17, 9, 35, 68));
  
  public static final SPHINCSPlusParameters sha2_256s_robust = new SPHINCSPlusParameters(Integers.valueOf(65798), "sha2-256s-robust", new Sha2EngineProvider(true, 32, 16, 8, 14, 22, 64));
  
  public static final SPHINCSPlusParameters sha2_128f = new SPHINCSPlusParameters(Integers.valueOf(66049), "sha2-128f", new Sha2EngineProvider(false, 16, 16, 22, 6, 33, 66));
  
  public static final SPHINCSPlusParameters sha2_128s = new SPHINCSPlusParameters(Integers.valueOf(66050), "sha2-128s", new Sha2EngineProvider(false, 16, 16, 7, 12, 14, 63));
  
  public static final SPHINCSPlusParameters sha2_192f = new SPHINCSPlusParameters(Integers.valueOf(66051), "sha2-192f", new Sha2EngineProvider(false, 24, 16, 22, 8, 33, 66));
  
  public static final SPHINCSPlusParameters sha2_192s = new SPHINCSPlusParameters(Integers.valueOf(66052), "sha2-192s", new Sha2EngineProvider(false, 24, 16, 7, 14, 17, 63));
  
  public static final SPHINCSPlusParameters sha2_256f = new SPHINCSPlusParameters(Integers.valueOf(66053), "sha2-256f", new Sha2EngineProvider(false, 32, 16, 17, 9, 35, 68));
  
  public static final SPHINCSPlusParameters sha2_256s = new SPHINCSPlusParameters(Integers.valueOf(66054), "sha2-256s", new Sha2EngineProvider(false, 32, 16, 8, 14, 22, 64));
  
  public static final SPHINCSPlusParameters shake_128f_robust = new SPHINCSPlusParameters(Integers.valueOf(131329), "shake-128f-robust", new Shake256EngineProvider(true, 16, 16, 22, 6, 33, 66));
  
  public static final SPHINCSPlusParameters shake_128s_robust = new SPHINCSPlusParameters(Integers.valueOf(131330), "shake-128s-robust", new Shake256EngineProvider(true, 16, 16, 7, 12, 14, 63));
  
  public static final SPHINCSPlusParameters shake_192f_robust = new SPHINCSPlusParameters(Integers.valueOf(131331), "shake-192f-robust", new Shake256EngineProvider(true, 24, 16, 22, 8, 33, 66));
  
  public static final SPHINCSPlusParameters shake_192s_robust = new SPHINCSPlusParameters(Integers.valueOf(131332), "shake-192s-robust", new Shake256EngineProvider(true, 24, 16, 7, 14, 17, 63));
  
  public static final SPHINCSPlusParameters shake_256f_robust = new SPHINCSPlusParameters(Integers.valueOf(131333), "shake-256f-robust", new Shake256EngineProvider(true, 32, 16, 17, 9, 35, 68));
  
  public static final SPHINCSPlusParameters shake_256s_robust = new SPHINCSPlusParameters(Integers.valueOf(131334), "shake-256s-robust", new Shake256EngineProvider(true, 32, 16, 8, 14, 22, 64));
  
  public static final SPHINCSPlusParameters shake_128f = new SPHINCSPlusParameters(Integers.valueOf(131585), "shake-128f", new Shake256EngineProvider(false, 16, 16, 22, 6, 33, 66));
  
  public static final SPHINCSPlusParameters shake_128s = new SPHINCSPlusParameters(Integers.valueOf(131586), "shake-128s", new Shake256EngineProvider(false, 16, 16, 7, 12, 14, 63));
  
  public static final SPHINCSPlusParameters shake_192f = new SPHINCSPlusParameters(Integers.valueOf(131587), "shake-192f", new Shake256EngineProvider(false, 24, 16, 22, 8, 33, 66));
  
  public static final SPHINCSPlusParameters shake_192s = new SPHINCSPlusParameters(Integers.valueOf(131588), "shake-192s", new Shake256EngineProvider(false, 24, 16, 7, 14, 17, 63));
  
  public static final SPHINCSPlusParameters shake_256f = new SPHINCSPlusParameters(Integers.valueOf(131589), "shake-256f", new Shake256EngineProvider(false, 32, 16, 17, 9, 35, 68));
  
  public static final SPHINCSPlusParameters shake_256s = new SPHINCSPlusParameters(Integers.valueOf(131590), "shake-256s", new Shake256EngineProvider(false, 32, 16, 8, 14, 22, 64));
  
  @Deprecated
  public static final SPHINCSPlusParameters haraka_128f = new SPHINCSPlusParameters(Integers.valueOf(196865), "haraka-128f-robust", new HarakaSEngineProvider(true, 16, 16, 22, 6, 33, 66));
  
  @Deprecated
  public static final SPHINCSPlusParameters haraka_128s = new SPHINCSPlusParameters(Integers.valueOf(196866), "haraka-128s-robust", new HarakaSEngineProvider(true, 16, 16, 7, 12, 14, 63));
  
  @Deprecated
  public static final SPHINCSPlusParameters haraka_192f = new SPHINCSPlusParameters(Integers.valueOf(196867), "haraka-192f-robust", new HarakaSEngineProvider(true, 24, 16, 22, 8, 33, 66));
  
  @Deprecated
  public static final SPHINCSPlusParameters haraka_192s = new SPHINCSPlusParameters(Integers.valueOf(196868), "haraka-192s-robust", new HarakaSEngineProvider(true, 24, 16, 7, 14, 17, 63));
  
  @Deprecated
  public static final SPHINCSPlusParameters haraka_256f = new SPHINCSPlusParameters(Integers.valueOf(196869), "haraka-256f-robust", new HarakaSEngineProvider(true, 32, 16, 17, 9, 35, 68));
  
  @Deprecated
  public static final SPHINCSPlusParameters haraka_256s = new SPHINCSPlusParameters(Integers.valueOf(196870), "haraka-256s-robust", new HarakaSEngineProvider(true, 32, 16, 8, 14, 22, 64));
  
  public static final SPHINCSPlusParameters haraka_128f_simple = new SPHINCSPlusParameters(Integers.valueOf(197121), "haraka-128f-simple", new HarakaSEngineProvider(false, 16, 16, 22, 6, 33, 66));
  
  public static final SPHINCSPlusParameters haraka_128s_simple = new SPHINCSPlusParameters(Integers.valueOf(197122), "haraka-128s-simple", new HarakaSEngineProvider(false, 16, 16, 7, 12, 14, 63));
  
  public static final SPHINCSPlusParameters haraka_192f_simple = new SPHINCSPlusParameters(Integers.valueOf(197123), "haraka-192f-simple", new HarakaSEngineProvider(false, 24, 16, 22, 8, 33, 66));
  
  public static final SPHINCSPlusParameters haraka_192s_simple = new SPHINCSPlusParameters(Integers.valueOf(197124), "haraka-192s-simple", new HarakaSEngineProvider(false, 24, 16, 7, 14, 17, 63));
  
  public static final SPHINCSPlusParameters haraka_256f_simple = new SPHINCSPlusParameters(Integers.valueOf(197125), "haraka-256f-simple", new HarakaSEngineProvider(false, 32, 16, 17, 9, 35, 68));
  
  public static final SPHINCSPlusParameters haraka_256s_simple = new SPHINCSPlusParameters(Integers.valueOf(197126), "haraka-256s-simple", new HarakaSEngineProvider(false, 32, 16, 8, 14, 22, 64));
  
  private static final Map<Integer, SPHINCSPlusParameters> ID_TO_PARAMS = new HashMap<>();
  
  private final Integer id;
  
  private final String name;
  
  private final SPHINCSPlusEngineProvider engineProvider;
  
  private SPHINCSPlusParameters(Integer paramInteger, String paramString, SPHINCSPlusEngineProvider paramSPHINCSPlusEngineProvider) {
    this.id = paramInteger;
    this.name = paramString;
    this.engineProvider = paramSPHINCSPlusEngineProvider;
  }
  
  public Integer getID() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  int getN() {
    return this.engineProvider.getN();
  }
  
  SPHINCSPlusEngine getEngine() {
    return this.engineProvider.get();
  }
  
  public static SPHINCSPlusParameters getParams(Integer paramInteger) {
    return ID_TO_PARAMS.get(paramInteger);
  }
  
  public static Integer getID(SPHINCSPlusParameters paramSPHINCSPlusParameters) {
    return paramSPHINCSPlusParameters.getID();
  }
  
  public byte[] getEncoded() {
    return Pack.intToBigEndian(getID().intValue());
  }
  
  static {
    SPHINCSPlusParameters[] arrayOfSPHINCSPlusParameters = { 
        sha2_128f_robust, sha2_128s_robust, sha2_192f_robust, sha2_192s_robust, sha2_256f_robust, sha2_256s_robust, sha2_128f, sha2_128s, sha2_192f, sha2_192s, 
        sha2_256f, sha2_256s, shake_128f_robust, shake_128s_robust, shake_192f_robust, shake_192s_robust, shake_256f_robust, shake_256s_robust, shake_128f, shake_128s, 
        shake_192f, shake_192s, shake_256f, shake_256s, haraka_128f, haraka_128s, haraka_192f, haraka_192s, haraka_256f, haraka_256s, 
        haraka_128f_simple, haraka_128s_simple, haraka_192f_simple, haraka_192s_simple, haraka_256f_simple, haraka_256s_simple };
    for (byte b = 0; b < arrayOfSPHINCSPlusParameters.length; b++) {
      SPHINCSPlusParameters sPHINCSPlusParameters = arrayOfSPHINCSPlusParameters[b];
      ID_TO_PARAMS.put(sPHINCSPlusParameters.getID(), sPHINCSPlusParameters);
    } 
  }
  
  private static class HarakaSEngineProvider implements SPHINCSPlusEngineProvider {
    private final boolean robust;
    
    private final int n;
    
    private final int w;
    
    private final int d;
    
    private final int a;
    
    private final int k;
    
    private final int h;
    
    public HarakaSEngineProvider(boolean param1Boolean, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.robust = param1Boolean;
      this.n = param1Int1;
      this.w = param1Int2;
      this.d = param1Int3;
      this.a = param1Int4;
      this.k = param1Int5;
      this.h = param1Int6;
    }
    
    public int getN() {
      return this.n;
    }
    
    public SPHINCSPlusEngine get() {
      return new SPHINCSPlusEngine.HarakaSEngine(this.robust, this.n, this.w, this.d, this.a, this.k, this.h);
    }
  }
  
  private static class Sha2EngineProvider implements SPHINCSPlusEngineProvider {
    private final boolean robust;
    
    private final int n;
    
    private final int w;
    
    private final int d;
    
    private final int a;
    
    private final int k;
    
    private final int h;
    
    public Sha2EngineProvider(boolean param1Boolean, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.robust = param1Boolean;
      this.n = param1Int1;
      this.w = param1Int2;
      this.d = param1Int3;
      this.a = param1Int4;
      this.k = param1Int5;
      this.h = param1Int6;
    }
    
    public int getN() {
      return this.n;
    }
    
    public SPHINCSPlusEngine get() {
      return new SPHINCSPlusEngine.Sha2Engine(this.robust, this.n, this.w, this.d, this.a, this.k, this.h);
    }
  }
  
  private static class Shake256EngineProvider implements SPHINCSPlusEngineProvider {
    private final boolean robust;
    
    private final int n;
    
    private final int w;
    
    private final int d;
    
    private final int a;
    
    private final int k;
    
    private final int h;
    
    public Shake256EngineProvider(boolean param1Boolean, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.robust = param1Boolean;
      this.n = param1Int1;
      this.w = param1Int2;
      this.d = param1Int3;
      this.a = param1Int4;
      this.k = param1Int5;
      this.h = param1Int6;
    }
    
    public int getN() {
      return this.n;
    }
    
    public SPHINCSPlusEngine get() {
      return new SPHINCSPlusEngine.Shake256Engine(this.robust, this.n, this.w, this.d, this.a, this.k, this.h);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\SPHINCSPlusParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */