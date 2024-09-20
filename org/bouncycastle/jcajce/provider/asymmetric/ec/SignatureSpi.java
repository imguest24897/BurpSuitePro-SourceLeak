package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSAEncoding;
import org.bouncycastle.crypto.signers.DSAKCalculator;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.ECNRSigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;
import org.bouncycastle.crypto.signers.PlainDSAEncoding;
import org.bouncycastle.crypto.signers.StandardDSAEncoding;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;

public class SignatureSpi extends DSABase {
  SignatureSpi(Digest paramDigest, DSAExt paramDSAExt, DSAEncoding paramDSAEncoding) {
    super(paramDigest, paramDSAExt, paramDSAEncoding);
  }
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    AsymmetricKeyParameter asymmetricKeyParameter = ECUtils.generatePublicKeyParameter(paramPublicKey);
    this.digest.reset();
    this.signer.init(false, (CipherParameters)asymmetricKeyParameter);
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    AsymmetricKeyParameter asymmetricKeyParameter = ECUtils.generatePrivateKeyParameter(paramPrivateKey);
    this.digest.reset();
    if (this.appRandom != null) {
      this.signer.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)asymmetricKeyParameter, this.appRandom));
    } else {
      this.signer.init(true, (CipherParameters)asymmetricKeyParameter);
    } 
  }
  
  protected AlgorithmParameters engineGetParameters() {
    return null;
  }
  
  public static class ecCVCDSA extends SignatureSpi {
    public ecCVCDSA() {
      super(DigestFactory.createSHA1(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecCVCDSA224 extends SignatureSpi {
    public ecCVCDSA224() {
      super(DigestFactory.createSHA224(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecCVCDSA256 extends SignatureSpi {
    public ecCVCDSA256() {
      super(DigestFactory.createSHA256(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecCVCDSA384 extends SignatureSpi {
    public ecCVCDSA384() {
      super(DigestFactory.createSHA384(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecCVCDSA3_224 extends SignatureSpi {
    public ecCVCDSA3_224() {
      super(DigestFactory.createSHA3_224(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecCVCDSA3_256 extends SignatureSpi {
    public ecCVCDSA3_256() {
      super(DigestFactory.createSHA3_256(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecCVCDSA3_384 extends SignatureSpi {
    public ecCVCDSA3_384() {
      super(DigestFactory.createSHA3_384(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecCVCDSA3_512 extends SignatureSpi {
    public ecCVCDSA3_512() {
      super(DigestFactory.createSHA3_512(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecCVCDSA512 extends SignatureSpi {
    public ecCVCDSA512() {
      super(DigestFactory.createSHA512(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSA extends SignatureSpi {
    public ecDSA() {
      super(DigestFactory.createSHA1(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSA224 extends SignatureSpi {
    public ecDSA224() {
      super(DigestFactory.createSHA224(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSA256 extends SignatureSpi {
    public ecDSA256() {
      super(DigestFactory.createSHA256(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSA384 extends SignatureSpi {
    public ecDSA384() {
      super(DigestFactory.createSHA384(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSA512 extends SignatureSpi {
    public ecDSA512() {
      super(DigestFactory.createSHA512(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSARipeMD160 extends SignatureSpi {
    public ecDSARipeMD160() {
      super((Digest)new RIPEMD160Digest(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSASha3_224 extends SignatureSpi {
    public ecDSASha3_224() {
      super(DigestFactory.createSHA3_224(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSASha3_256 extends SignatureSpi {
    public ecDSASha3_256() {
      super(DigestFactory.createSHA3_256(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSASha3_384 extends SignatureSpi {
    public ecDSASha3_384() {
      super(DigestFactory.createSHA3_384(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSASha3_512 extends SignatureSpi {
    public ecDSASha3_512() {
      super(DigestFactory.createSHA3_512(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSAShake128 extends SignatureSpi {
    public ecDSAShake128() {
      super((Digest)new SHAKEDigest(128), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator((Digest)new SHAKEDigest(128))), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSAShake256 extends SignatureSpi {
    public ecDSAShake256() {
      super((Digest)new SHAKEDigest(256), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator((Digest)new SHAKEDigest(256))), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDSAnone extends SignatureSpi {
    public ecDSAnone() {
      super((Digest)new NullDigest(), (DSAExt)new ECDSASigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDetDSA extends SignatureSpi {
    public ecDetDSA() {
      super(DigestFactory.createSHA1(), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(DigestFactory.createSHA1())), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDetDSA224 extends SignatureSpi {
    public ecDetDSA224() {
      super(DigestFactory.createSHA224(), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(DigestFactory.createSHA224())), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDetDSA256 extends SignatureSpi {
    public ecDetDSA256() {
      super(DigestFactory.createSHA256(), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(DigestFactory.createSHA256())), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDetDSA384 extends SignatureSpi {
    public ecDetDSA384() {
      super(DigestFactory.createSHA384(), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(DigestFactory.createSHA384())), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDetDSA512 extends SignatureSpi {
    public ecDetDSA512() {
      super(DigestFactory.createSHA512(), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(DigestFactory.createSHA512())), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDetDSASha3_224 extends SignatureSpi {
    public ecDetDSASha3_224() {
      super(DigestFactory.createSHA3_224(), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(DigestFactory.createSHA3_224())), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDetDSASha3_256 extends SignatureSpi {
    public ecDetDSASha3_256() {
      super(DigestFactory.createSHA3_256(), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(DigestFactory.createSHA3_256())), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDetDSASha3_384 extends SignatureSpi {
    public ecDetDSASha3_384() {
      super(DigestFactory.createSHA3_384(), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(DigestFactory.createSHA3_384())), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecDetDSASha3_512 extends SignatureSpi {
    public ecDetDSASha3_512() {
      super(DigestFactory.createSHA3_512(), (DSAExt)new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(DigestFactory.createSHA3_512())), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecNR extends SignatureSpi {
    public ecNR() {
      super(DigestFactory.createSHA1(), (DSAExt)new ECNRSigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecNR224 extends SignatureSpi {
    public ecNR224() {
      super(DigestFactory.createSHA224(), (DSAExt)new ECNRSigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecNR256 extends SignatureSpi {
    public ecNR256() {
      super(DigestFactory.createSHA256(), (DSAExt)new ECNRSigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecNR384 extends SignatureSpi {
    public ecNR384() {
      super(DigestFactory.createSHA384(), (DSAExt)new ECNRSigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecNR512 extends SignatureSpi {
    public ecNR512() {
      super(DigestFactory.createSHA512(), (DSAExt)new ECNRSigner(), (DSAEncoding)StandardDSAEncoding.INSTANCE);
    }
  }
  
  public static class ecPlainDSARP160 extends SignatureSpi {
    public ecPlainDSARP160() {
      super((Digest)new RIPEMD160Digest(), (DSAExt)new ECDSASigner(), (DSAEncoding)PlainDSAEncoding.INSTANCE);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\ec\SignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */