package org.bouncycastle.pqc.crypto.gemss;

abstract class Rem_GF2n {
  protected long mask;
  
  protected int ki;
  
  protected int ki64;
  
  public abstract void rem_gf2n(long[] paramArrayOflong1, int paramInt, long[] paramArrayOflong2);
  
  public abstract void rem_gf2n_xor(long[] paramArrayOflong1, int paramInt, long[] paramArrayOflong2);
  
  public static class REM192_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {
    private final int k3;
    
    private final int k364;
    
    private final int ki_k3;
    
    REM192_SPECIALIZED_TRINOMIAL_GF2X(int param1Int1, int param1Int2, int param1Int3, int param1Int4, long param1Long) {
      this.k3 = param1Int1;
      this.ki = param1Int2;
      this.ki64 = param1Int3;
      this.k364 = param1Int4;
      this.mask = param1Long;
      this.ki_k3 = param1Int2 - param1Int1;
    }
    
    public void rem_gf2n(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[2] >>> this.ki ^ param1ArrayOflong2[3] << this.ki64;
      long l2 = param1ArrayOflong2[3] >>> this.ki ^ param1ArrayOflong2[4] << this.ki64;
      long l3 = param1ArrayOflong2[4] >>> this.ki ^ param1ArrayOflong2[5] << this.ki64;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong2[1] ^ l2 ^ l1 >>> this.k364 ^ l2 << this.k3;
      param1ArrayOflong1[param1Int + 2] = (param1ArrayOflong2[2] ^ l3 ^ l2 >>> this.k364 ^ l3 << this.k3) & this.mask;
      l1 ^= l3 >>> this.ki_k3;
      param1ArrayOflong1[param1Int] = param1ArrayOflong2[0] ^ l1 ^ l1 << this.k3;
    }
    
    public void rem_gf2n_xor(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[2] >>> this.ki ^ param1ArrayOflong2[3] << this.ki64;
      long l2 = param1ArrayOflong2[3] >>> this.ki ^ param1ArrayOflong2[4] << this.ki64;
      long l3 = param1ArrayOflong2[4] >>> this.ki ^ param1ArrayOflong2[5] << this.ki64;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong1[param1Int + 1] ^ param1ArrayOflong2[1] ^ l2 ^ l1 >>> this.k364 ^ l2 << this.k3;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong1[param1Int + 2] ^ (param1ArrayOflong2[2] ^ l3 ^ l2 >>> this.k364 ^ l3 << this.k3) & this.mask;
      l1 ^= l3 >>> this.ki_k3;
      param1ArrayOflong1[param1Int] = param1ArrayOflong1[param1Int] ^ param1ArrayOflong2[0] ^ l1 ^ l1 << this.k3;
    }
  }
  
  public static class REM288_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {
    private final int k3;
    
    private final int k364;
    
    private final int k364ki;
    
    private final int k3_ki;
    
    public REM288_SPECIALIZED_TRINOMIAL_GF2X(int param1Int1, int param1Int2, int param1Int3, int param1Int4, long param1Long) {
      this.k3 = param1Int1;
      this.ki = param1Int2;
      this.ki64 = param1Int3;
      this.k364 = param1Int4;
      this.mask = param1Long;
      this.k364ki = param1Int4 + param1Int2;
      this.k3_ki = param1Int1 - param1Int2;
    }
    
    public void rem_gf2n(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[5] >>> this.ki ^ param1ArrayOflong2[6] << this.ki64;
      long l2 = param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong2[2] ^ l2 ^ l1 >>> this.k364 ^ l2 << this.k3;
      long l3 = param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong2[3] ^ l3 ^ l2 >>> this.k364 ^ l3 << this.k3;
      long l4 = param1ArrayOflong2[8] >>> this.ki;
      l2 = param1ArrayOflong2[4] >>> this.ki ^ param1ArrayOflong2[5] << this.ki64 ^ l3 >>> this.k364ki ^ l4 << this.k3_ki;
      param1ArrayOflong1[param1Int + 4] = (param1ArrayOflong2[4] ^ l4 ^ l3 >>> this.k364 ^ l4 << this.k3) & this.mask;
      param1ArrayOflong1[param1Int] = param1ArrayOflong2[0] ^ l2 ^ l2 << this.k3;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong2[1] ^ l1 ^ l1 << this.k3 ^ l2 >>> this.k364;
    }
    
    public void rem_gf2n_xor(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[5] >>> this.ki ^ param1ArrayOflong2[6] << this.ki64;
      long l2 = param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong1[param1Int + 2] ^ param1ArrayOflong2[2] ^ l2 ^ l1 >>> this.k364 ^ l2 << this.k3;
      long l3 = param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong1[param1Int + 3] ^ param1ArrayOflong2[3] ^ l3 ^ l2 >>> this.k364 ^ l3 << this.k3;
      l2 = param1ArrayOflong2[8] >>> this.ki;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong1[param1Int + 4] ^ (param1ArrayOflong2[4] ^ l2 ^ l3 >>> this.k364 ^ l2 << this.k3) & this.mask;
      l3 = param1ArrayOflong2[4] >>> this.ki ^ param1ArrayOflong2[5] << this.ki64 ^ l3 >>> this.k364ki ^ l2 << this.k3_ki;
      param1ArrayOflong1[param1Int] = param1ArrayOflong1[param1Int] ^ param1ArrayOflong2[0] ^ l3 ^ l3 << this.k3;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong1[param1Int + 1] ^ param1ArrayOflong2[1] ^ l1 ^ l1 << this.k3 ^ l3 >>> this.k364;
    }
  }
  
  public static class REM384_SPECIALIZED358_TRINOMIAL_GF2X extends Rem_GF2n {
    private final int k3;
    
    private final int k364;
    
    private final int k364ki;
    
    private final int k3_ki;
    
    public REM384_SPECIALIZED358_TRINOMIAL_GF2X(int param1Int1, int param1Int2, int param1Int3, int param1Int4, long param1Long) {
      this.k3 = param1Int1;
      this.ki = param1Int2;
      this.ki64 = param1Int3;
      this.k364 = param1Int4;
      this.mask = param1Long;
      this.k364ki = param1Int4 + param1Int2;
      this.k3_ki = param1Int1 - param1Int2;
    }
    
    public void rem_gf2n(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64;
      long l2 = param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong2[2] ^ l2 ^ l1 >>> this.k364 ^ l2 << this.k3;
      long l3 = param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong2[3] ^ l3 ^ l2 >>> this.k364 ^ l3 << this.k3;
      l2 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong2[4] ^ l2 ^ l3 >>> this.k364 ^ l2 << this.k3;
      l3 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      long l4 = param1ArrayOflong2[5] >>> this.ki ^ param1ArrayOflong2[6] << this.ki64 ^ l2 >>> this.k364ki ^ l3 << this.k3_ki;
      param1ArrayOflong1[param1Int + 5] = (param1ArrayOflong2[5] ^ l3 ^ l2 >>> this.k364) & this.mask;
      param1ArrayOflong1[param1Int] = param1ArrayOflong2[0] ^ l4 ^ l4 << this.k3;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong2[1] ^ l1 ^ l4 >>> this.k364 ^ l1 << this.k3;
    }
    
    public void rem_gf2n_xor(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64;
      long l2 = param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong1[param1Int + 2] ^ param1ArrayOflong2[2] ^ l2 ^ l1 >>> this.k364 ^ l2 << this.k3;
      long l3 = param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong1[param1Int + 3] ^ param1ArrayOflong2[3] ^ l3 ^ l2 >>> this.k364 ^ l3 << this.k3;
      l2 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong1[param1Int + 4] ^ param1ArrayOflong2[4] ^ l2 ^ l3 >>> this.k364 ^ l2 << this.k3;
      l3 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      param1ArrayOflong1[param1Int + 5] = param1ArrayOflong1[param1Int + 5] ^ (param1ArrayOflong2[5] ^ l3 ^ l2 >>> this.k364) & this.mask;
      l2 = param1ArrayOflong2[5] >>> this.ki ^ param1ArrayOflong2[6] << this.ki64 ^ l2 >>> this.k364ki ^ l3 << this.k3_ki;
      param1ArrayOflong1[param1Int] = param1ArrayOflong1[param1Int] ^ param1ArrayOflong2[0] ^ l2 ^ l2 << this.k3;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong1[param1Int + 1] ^ param1ArrayOflong2[1] ^ l1 ^ l2 >>> this.k364 ^ l1 << this.k3;
    }
  }
  
  public static class REM384_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {
    private final int k3;
    
    private final int k364;
    
    private final int k364ki;
    
    private final int k3_ki;
    
    public REM384_SPECIALIZED_TRINOMIAL_GF2X(int param1Int1, int param1Int2, int param1Int3, int param1Int4, long param1Long) {
      this.k3 = param1Int1;
      this.ki = param1Int2;
      this.ki64 = param1Int3;
      this.k364 = param1Int4;
      this.mask = param1Long;
      this.k364ki = param1Int4 + param1Int2;
      this.k3_ki = param1Int1 - param1Int2;
    }
    
    public void rem_gf2n(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      long l2 = param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      long l3 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      long l4 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      long l5 = param1ArrayOflong2[5] >>> this.ki ^ param1ArrayOflong2[6] << this.ki64 ^ l2 >>> this.k364ki ^ l3 << this.k3_ki;
      long l6 = param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64 ^ l3 >>> this.k364ki ^ l4 << this.k3_ki;
      param1ArrayOflong1[param1Int] = param1ArrayOflong2[0] ^ l5;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong2[1] ^ l6 ^ l5 << this.k3;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong2[2] ^ l1 ^ l5 >>> this.k364 ^ l6 << this.k3;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong2[3] ^ l2 ^ l6 >>> this.k364 ^ l1 << this.k3;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong2[4] ^ l3 ^ l1 >>> this.k364 ^ l2 << this.k3;
      param1ArrayOflong1[param1Int + 5] = (param1ArrayOflong2[5] ^ l4 ^ l2 >>> this.k364) & this.mask;
    }
    
    public void rem_gf2n_xor(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      long l2 = param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      long l3 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      long l4 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      long l5 = param1ArrayOflong2[5] >>> this.ki ^ param1ArrayOflong2[6] << this.ki64 ^ l2 >>> this.k364ki ^ l3 << this.k3_ki;
      long l6 = param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64 ^ l3 >>> this.k364ki ^ l4 << this.k3_ki;
      param1ArrayOflong1[param1Int] = param1ArrayOflong1[param1Int] ^ param1ArrayOflong2[0] ^ l5;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong1[param1Int + 1] ^ param1ArrayOflong2[1] ^ l6 ^ l5 << this.k3;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong1[param1Int + 2] ^ param1ArrayOflong2[2] ^ l1 ^ l5 >>> this.k364 ^ l6 << this.k3;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong1[param1Int + 3] ^ param1ArrayOflong2[3] ^ l2 ^ l6 >>> this.k364 ^ l1 << this.k3;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong1[param1Int + 4] ^ param1ArrayOflong2[4] ^ l3 ^ l1 >>> this.k364 ^ l2 << this.k3;
      param1ArrayOflong1[param1Int + 5] = param1ArrayOflong1[param1Int + 5] ^ (param1ArrayOflong2[5] ^ l4 ^ l2 >>> this.k364) & this.mask;
    }
  }
  
  public static class REM384_TRINOMIAL_GF2X extends Rem_GF2n {
    private final int k3;
    
    private final int k364;
    
    private final int ki_k3;
    
    public REM384_TRINOMIAL_GF2X(int param1Int1, int param1Int2, int param1Int3, int param1Int4, long param1Long) {
      this.k3 = param1Int1;
      this.ki = param1Int2;
      this.ki64 = param1Int3;
      this.k364 = param1Int4;
      this.mask = param1Long;
      this.ki_k3 = param1Int2 - param1Int1;
    }
    
    public void rem_gf2n(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[5] >>> this.ki ^ param1ArrayOflong2[6] << this.ki64;
      long l2 = param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64;
      long l3 = param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      long l4 = param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      long l5 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      long l6 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      long l7 = l1 ^ l6 >>> this.ki_k3;
      param1ArrayOflong1[param1Int] = param1ArrayOflong2[0] ^ l7 ^ l7 << this.k3;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong2[1] ^ l2 ^ l1 >>> this.k364 ^ l2 << this.k3;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong2[2] ^ l3 ^ l2 >>> this.k364 ^ l3 << this.k3;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong2[3] ^ l4 ^ l3 >>> this.k364 ^ l4 << this.k3;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong2[4] ^ l5 ^ l4 >>> this.k364 ^ l5 << this.k3;
      param1ArrayOflong1[param1Int + 5] = (param1ArrayOflong2[5] ^ l6 ^ l5 >>> this.k364 ^ l6 << this.k3) & this.mask;
    }
    
    public void rem_gf2n_xor(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[5] >>> this.ki ^ param1ArrayOflong2[6] << this.ki64;
      long l2 = param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64;
      long l3 = param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      long l4 = param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      long l5 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      long l6 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      long l7 = l1 ^ l6 >>> this.ki_k3;
      param1ArrayOflong1[param1Int] = param1ArrayOflong1[param1Int] ^ param1ArrayOflong2[0] ^ l7 ^ l7 << this.k3;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong1[param1Int + 1] ^ param1ArrayOflong2[1] ^ l2 ^ l1 >>> this.k364 ^ l2 << this.k3;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong1[param1Int + 2] ^ param1ArrayOflong2[2] ^ l3 ^ l2 >>> this.k364 ^ l3 << this.k3;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong1[param1Int + 3] ^ param1ArrayOflong2[3] ^ l4 ^ l3 >>> this.k364 ^ l4 << this.k3;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong1[param1Int + 4] ^ param1ArrayOflong2[4] ^ l5 ^ l4 >>> this.k364 ^ l5 << this.k3;
      param1ArrayOflong1[param1Int + 5] = param1ArrayOflong1[param1Int + 5] ^ (param1ArrayOflong2[5] ^ l6 ^ l5 >>> this.k364 ^ l6 << this.k3) & this.mask;
    }
  }
  
  public static class REM402_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {
    private final int k3;
    
    private final int k364;
    
    public REM402_SPECIALIZED_TRINOMIAL_GF2X(int param1Int1, int param1Int2, int param1Int3, int param1Int4, long param1Long) {
      this.k3 = param1Int1;
      this.ki = param1Int2;
      this.ki64 = param1Int3;
      this.k364 = param1Int4;
      this.mask = param1Long;
    }
    
    public void rem_gf2n(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      long l2 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      long l3 = param1ArrayOflong2[11] >>> this.ki ^ param1ArrayOflong2[12] << this.ki64;
      long l4 = param1ArrayOflong2[12] >>> this.ki;
      long l5 = l1 >>> 39L ^ l2 << 25L ^ param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64;
      long l6 = l2 >>> 39L ^ l3 << 25L ^ param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      long l7 = l3 >>> 39L ^ l4 << 25L ^ param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      param1ArrayOflong1[param1Int] = param1ArrayOflong2[0] ^ l5;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong2[1] ^ l6;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong2[2] ^ l7 ^ l5 << this.k3;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong2[3] ^ l1 ^ l5 >>> this.k364 ^ l6 << this.k3;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong2[4] ^ l2 ^ l6 >>> this.k364 ^ l7 << this.k3;
      param1ArrayOflong1[param1Int + 5] = param1ArrayOflong2[5] ^ l3 ^ l7 >>> this.k364 ^ l1 << this.k3;
      param1ArrayOflong1[param1Int + 6] = (param1ArrayOflong2[6] ^ l4 ^ l1 >>> this.k364) & this.mask;
    }
    
    public void rem_gf2n_xor(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      long l2 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      long l3 = param1ArrayOflong2[11] >>> this.ki ^ param1ArrayOflong2[12] << this.ki64;
      long l4 = param1ArrayOflong2[12] >>> this.ki;
      long l5 = l1 >>> 39L ^ l2 << 25L ^ param1ArrayOflong2[6] >>> this.ki ^ param1ArrayOflong2[7] << this.ki64;
      long l6 = l2 >>> 39L ^ l3 << 25L ^ param1ArrayOflong2[7] >>> this.ki ^ param1ArrayOflong2[8] << this.ki64;
      long l7 = l3 >>> 39L ^ l4 << 25L ^ param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      param1ArrayOflong1[param1Int] = param1ArrayOflong1[param1Int] ^ param1ArrayOflong2[0] ^ l5;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong1[param1Int + 1] ^ param1ArrayOflong2[1] ^ l6;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong1[param1Int + 2] ^ param1ArrayOflong2[2] ^ l7 ^ l5 << this.k3;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong1[param1Int + 3] ^ param1ArrayOflong2[3] ^ l1 ^ l5 >>> this.k364 ^ l6 << this.k3;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong1[param1Int + 4] ^ param1ArrayOflong2[4] ^ l2 ^ l6 >>> this.k364 ^ l7 << this.k3;
      param1ArrayOflong1[param1Int + 5] = param1ArrayOflong1[param1Int + 5] ^ param1ArrayOflong2[5] ^ l3 ^ l7 >>> this.k364 ^ l1 << this.k3;
      param1ArrayOflong1[param1Int + 6] = param1ArrayOflong1[param1Int + 6] ^ (param1ArrayOflong2[6] ^ l4 ^ l1 >>> this.k364) & this.mask;
    }
  }
  
  public static class REM544_PENTANOMIAL_GF2X extends Rem_GF2n {
    private final int k1;
    
    private final int k2;
    
    private final int k3;
    
    private final int k164;
    
    private final int k264;
    
    private final int k364;
    
    private final int ki_k3;
    
    private final int ki_k2;
    
    private final int ki_k1;
    
    public REM544_PENTANOMIAL_GF2X(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8, long param1Long) {
      this.k1 = param1Int1;
      this.k2 = param1Int2;
      this.k3 = param1Int3;
      this.ki = param1Int4;
      this.ki64 = param1Int5;
      this.k164 = param1Int6;
      this.k264 = param1Int7;
      this.k364 = param1Int8;
      this.mask = param1Long;
      this.ki_k3 = param1Int4 - param1Int3;
      this.ki_k2 = param1Int4 - param1Int2;
      this.ki_k1 = param1Int4 - param1Int1;
    }
    
    public void rem_gf2n(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[16] >>> this.ki;
      long l2 = param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      long l3 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong2[1] ^ l3 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2 ^ l2 >>> this.k364 ^ l3 << this.k3;
      l2 ^= l1 >>> this.ki_k3 ^ l1 >>> this.ki_k2 ^ l1 >>> this.ki_k1;
      param1ArrayOflong1[param1Int] = param1ArrayOflong2[0] ^ l2 ^ l2 << this.k1 ^ l2 << this.k2 ^ l2 << this.k3;
      l2 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong2[2] ^ l2 ^ l3 >>> this.k164 ^ l2 << this.k1 ^ l3 >>> this.k264 ^ l2 << this.k2 ^ l3 >>> this.k364 ^ l2 << this.k3;
      l3 = param1ArrayOflong2[11] >>> this.ki ^ param1ArrayOflong2[12] << this.ki64;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong2[3] ^ l3 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2 ^ l2 >>> this.k364 ^ l3 << this.k3;
      l2 = param1ArrayOflong2[12] >>> this.ki ^ param1ArrayOflong2[13] << this.ki64;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong2[4] ^ l2 ^ l3 >>> this.k164 ^ l2 << this.k1 ^ l3 >>> this.k264 ^ l2 << this.k2 ^ l3 >>> this.k364 ^ l2 << this.k3;
      l3 = param1ArrayOflong2[13] >>> this.ki ^ param1ArrayOflong2[14] << this.ki64;
      param1ArrayOflong1[param1Int + 5] = param1ArrayOflong2[5] ^ l3 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2 ^ l2 >>> this.k364 ^ l3 << this.k3;
      l2 = param1ArrayOflong2[14] >>> this.ki ^ param1ArrayOflong2[15] << this.ki64;
      param1ArrayOflong1[param1Int + 6] = param1ArrayOflong2[6] ^ l2 ^ l3 >>> this.k164 ^ l2 << this.k1 ^ l3 >>> this.k264 ^ l2 << this.k2 ^ l3 >>> this.k364 ^ l2 << this.k3;
      l3 = param1ArrayOflong2[15] >>> this.ki ^ param1ArrayOflong2[16] << this.ki64;
      param1ArrayOflong1[param1Int + 7] = param1ArrayOflong2[7] ^ l3 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2 ^ l2 >>> this.k364 ^ l3 << this.k3;
      param1ArrayOflong1[param1Int + 8] = (param1ArrayOflong2[8] ^ l1 ^ l3 >>> this.k164 ^ l1 << this.k1 ^ l3 >>> this.k264 ^ l1 << this.k2 ^ l3 >>> this.k364 ^ l1 << this.k3) & this.mask;
    }
    
    public void rem_gf2n_xor(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[16] >>> this.ki;
      long l2 = param1ArrayOflong2[8] >>> this.ki ^ param1ArrayOflong2[9] << this.ki64;
      long l3 = param1ArrayOflong2[9] >>> this.ki ^ param1ArrayOflong2[10] << this.ki64;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong1[param1Int + 1] ^ param1ArrayOflong2[1] ^ l3 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2 ^ l2 >>> this.k364 ^ l3 << this.k3;
      l2 ^= l1 >>> this.ki_k3 ^ l1 >>> this.ki_k2 ^ l1 >>> this.ki_k1;
      param1ArrayOflong1[param1Int] = param1ArrayOflong1[param1Int] ^ param1ArrayOflong2[0] ^ l2 ^ l2 << this.k1 ^ l2 << this.k2 ^ l2 << this.k3;
      l2 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong1[param1Int + 2] ^ param1ArrayOflong2[2] ^ l2 ^ l3 >>> this.k164 ^ l2 << this.k1 ^ l3 >>> this.k264 ^ l2 << this.k2 ^ l3 >>> this.k364 ^ l2 << this.k3;
      l3 = param1ArrayOflong2[11] >>> this.ki ^ param1ArrayOflong2[12] << this.ki64;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong1[param1Int + 3] ^ param1ArrayOflong2[3] ^ l3 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2 ^ l2 >>> this.k364 ^ l3 << this.k3;
      l2 = param1ArrayOflong2[12] >>> this.ki ^ param1ArrayOflong2[13] << this.ki64;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong1[param1Int + 4] ^ param1ArrayOflong2[4] ^ l2 ^ l3 >>> this.k164 ^ l2 << this.k1 ^ l3 >>> this.k264 ^ l2 << this.k2 ^ l3 >>> this.k364 ^ l2 << this.k3;
      l3 = param1ArrayOflong2[13] >>> this.ki ^ param1ArrayOflong2[14] << this.ki64;
      param1ArrayOflong1[param1Int + 5] = param1ArrayOflong1[param1Int + 5] ^ param1ArrayOflong2[5] ^ l3 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2 ^ l2 >>> this.k364 ^ l3 << this.k3;
      l2 = param1ArrayOflong2[14] >>> this.ki ^ param1ArrayOflong2[15] << this.ki64;
      param1ArrayOflong1[param1Int + 6] = param1ArrayOflong1[param1Int + 6] ^ param1ArrayOflong2[6] ^ l2 ^ l3 >>> this.k164 ^ l2 << this.k1 ^ l3 >>> this.k264 ^ l2 << this.k2 ^ l3 >>> this.k364 ^ l2 << this.k3;
      l3 = param1ArrayOflong2[15] >>> this.ki ^ param1ArrayOflong2[16] << this.ki64;
      param1ArrayOflong1[param1Int + 7] = param1ArrayOflong1[param1Int + 7] ^ param1ArrayOflong2[7] ^ l3 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2 ^ l2 >>> this.k364 ^ l3 << this.k3;
      param1ArrayOflong1[param1Int + 8] = param1ArrayOflong1[param1Int + 8] ^ (param1ArrayOflong2[8] ^ l1 ^ l3 >>> this.k164 ^ l1 << this.k1 ^ l3 >>> this.k264 ^ l1 << this.k2 ^ l3 >>> this.k364 ^ l1 << this.k3) & this.mask;
    }
  }
  
  public static class REM544_PENTANOMIAL_K3_IS_128_GF2X extends Rem_GF2n {
    private final int k1;
    
    private final int k2;
    
    private final int k164;
    
    private final int k264;
    
    public REM544_PENTANOMIAL_K3_IS_128_GF2X(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, long param1Long) {
      this.k1 = param1Int1;
      this.k2 = param1Int2;
      this.ki = param1Int3;
      this.ki64 = param1Int4;
      this.k164 = param1Int5;
      this.k264 = param1Int6;
      this.mask = param1Long;
    }
    
    public void rem_gf2n(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      long l2 = param1ArrayOflong2[11] >>> this.ki ^ param1ArrayOflong2[12] << this.ki64;
      long l3 = param1ArrayOflong2[12] >>> this.ki ^ param1ArrayOflong2[13] << this.ki64;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong2[4] ^ l3 ^ l1 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2;
      long l4 = param1ArrayOflong2[13] >>> this.ki ^ param1ArrayOflong2[14] << this.ki64;
      param1ArrayOflong1[param1Int + 5] = param1ArrayOflong2[5] ^ l4 ^ l2 ^ l3 >>> this.k164 ^ l4 << this.k1 ^ l3 >>> this.k264 ^ l4 << this.k2;
      long l5 = param1ArrayOflong2[14] >>> this.ki ^ param1ArrayOflong2[15] << this.ki64;
      param1ArrayOflong1[param1Int + 6] = param1ArrayOflong2[6] ^ l5 ^ l3 ^ l4 >>> this.k164 ^ l5 << this.k1 ^ l4 >>> this.k264 ^ l5 << this.k2;
      l3 = param1ArrayOflong2[15] >>> this.ki ^ param1ArrayOflong2[16] << this.ki64;
      param1ArrayOflong1[param1Int + 7] = param1ArrayOflong2[7] ^ l3 ^ l4 ^ l5 >>> this.k164 ^ l3 << this.k1 ^ l5 >>> this.k264 ^ l3 << this.k2;
      l4 = param1ArrayOflong2[16] >>> this.ki;
      param1ArrayOflong1[param1Int + 8] = (param1ArrayOflong2[8] ^ l4 ^ l5 ^ l3 >>> this.k164 ^ l4 << this.k1 ^ l3 >>> this.k264 ^ l4 << this.k2) & this.mask;
      l5 = (param1ArrayOflong2[8] ^ l5) >>> this.ki ^ (param1ArrayOflong2[9] ^ l3) << this.ki64 ^ param1ArrayOflong2[16] >>> this.k264;
      l3 = (param1ArrayOflong2[9] ^ l3) >>> this.ki ^ (param1ArrayOflong2[10] ^ l4) << this.ki64;
      param1ArrayOflong1[param1Int] = param1ArrayOflong2[0] ^ l5 ^ l5 << this.k1 ^ l5 << this.k2;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong2[1] ^ l3 ^ l5 >>> this.k164 ^ l3 << this.k1 ^ l5 >>> this.k264 ^ l3 << this.k2;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong2[2] ^ l1 ^ l5 ^ l3 >>> this.k164 ^ l1 << this.k1 ^ l3 >>> this.k264 ^ l1 << this.k2;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong2[3] ^ l2 ^ l3 ^ l1 >>> this.k164 ^ l2 << this.k1 ^ l1 >>> this.k264 ^ l2 << this.k2;
    }
    
    public void rem_gf2n_xor(long[] param1ArrayOflong1, int param1Int, long[] param1ArrayOflong2) {
      long l1 = param1ArrayOflong2[10] >>> this.ki ^ param1ArrayOflong2[11] << this.ki64;
      long l2 = param1ArrayOflong2[11] >>> this.ki ^ param1ArrayOflong2[12] << this.ki64;
      long l3 = param1ArrayOflong2[12] >>> this.ki ^ param1ArrayOflong2[13] << this.ki64;
      param1ArrayOflong1[param1Int + 4] = param1ArrayOflong1[param1Int + 4] ^ param1ArrayOflong2[4] ^ l3 ^ l1 ^ l2 >>> this.k164 ^ l3 << this.k1 ^ l2 >>> this.k264 ^ l3 << this.k2;
      long l4 = param1ArrayOflong2[13] >>> this.ki ^ param1ArrayOflong2[14] << this.ki64;
      param1ArrayOflong1[param1Int + 5] = param1ArrayOflong1[param1Int + 5] ^ param1ArrayOflong2[5] ^ l4 ^ l2 ^ l3 >>> this.k164 ^ l4 << this.k1 ^ l3 >>> this.k264 ^ l4 << this.k2;
      long l5 = param1ArrayOflong2[14] >>> this.ki ^ param1ArrayOflong2[15] << this.ki64;
      param1ArrayOflong1[param1Int + 6] = param1ArrayOflong1[param1Int + 6] ^ param1ArrayOflong2[6] ^ l5 ^ l3 ^ l4 >>> this.k164 ^ l5 << this.k1 ^ l4 >>> this.k264 ^ l5 << this.k2;
      l3 = param1ArrayOflong2[15] >>> this.ki ^ param1ArrayOflong2[16] << this.ki64;
      param1ArrayOflong1[param1Int + 7] = param1ArrayOflong1[param1Int + 7] ^ param1ArrayOflong2[7] ^ l3 ^ l4 ^ l5 >>> this.k164 ^ l3 << this.k1 ^ l5 >>> this.k264 ^ l3 << this.k2;
      l4 = param1ArrayOflong2[16] >>> this.ki;
      param1ArrayOflong1[param1Int + 8] = param1ArrayOflong1[param1Int + 8] ^ (param1ArrayOflong2[8] ^ l4 ^ l5 ^ l3 >>> this.k164 ^ l4 << this.k1 ^ l3 >>> this.k264 ^ l4 << this.k2) & this.mask;
      l5 = (param1ArrayOflong2[8] ^ l5) >>> this.ki ^ (param1ArrayOflong2[9] ^ l3) << this.ki64 ^ param1ArrayOflong2[16] >>> this.k264;
      l3 = (param1ArrayOflong2[9] ^ l3) >>> this.ki ^ (param1ArrayOflong2[10] ^ l4) << this.ki64;
      param1ArrayOflong1[param1Int] = param1ArrayOflong1[param1Int] ^ param1ArrayOflong2[0] ^ l5 ^ l5 << this.k1 ^ l5 << this.k2;
      param1ArrayOflong1[param1Int + 1] = param1ArrayOflong1[param1Int + 1] ^ param1ArrayOflong2[1] ^ l3 ^ l5 >>> this.k164 ^ l3 << this.k1 ^ l5 >>> this.k264 ^ l3 << this.k2;
      param1ArrayOflong1[param1Int + 2] = param1ArrayOflong1[param1Int + 2] ^ param1ArrayOflong2[2] ^ l1 ^ l5 ^ l3 >>> this.k164 ^ l1 << this.k1 ^ l3 >>> this.k264 ^ l1 << this.k2;
      param1ArrayOflong1[param1Int + 3] = param1ArrayOflong1[param1Int + 3] ^ param1ArrayOflong2[3] ^ l2 ^ l3 ^ l1 >>> this.k164 ^ l2 << this.k1 ^ l1 >>> this.k264 ^ l2 << this.k2;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\gemss\Rem_GF2n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */