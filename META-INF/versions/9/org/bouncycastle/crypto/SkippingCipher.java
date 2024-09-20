package META-INF.versions.9.org.bouncycastle.crypto;

public interface SkippingCipher {
  long skip(long paramLong);
  
  long seekTo(long paramLong);
  
  long getPosition();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\SkippingCipher.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */