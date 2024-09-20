package org.bouncycastle.jcajce.provider.drbg;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

public class DRBG {
  private static final String PREFIX = DRBG.class.getName();
  
  private static final String[][] initialEntropySourceNames = new String[][] { { "sun.security.provider.Sun", "sun.security.provider.SecureRandom" }, { "org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl" }, { "com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom" }, { "org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom" } };
  
  private static EntropyDaemon entropyDaemon = null;
  
  private static Thread entropyThread = null;
  
  private static final Object[] findSource() {
    byte b = 0;
    while (b < initialEntropySourceNames.length) {
      String[] arrayOfString = initialEntropySourceNames[b];
      try {
        return new Object[] { Class.forName(arrayOfString[0]).newInstance(), Class.forName(arrayOfString[1]).newInstance() };
      } catch (Throwable throwable) {
        b++;
      } 
    } 
    return null;
  }
  
  private static SecureRandom createBaseRandom(boolean paramBoolean) {
    if (Properties.getPropertyValue("org.bouncycastle.drbg.entropysource") != null) {
      EntropySourceProvider entropySourceProvider = createEntropySource();
      EntropySource entropySource = entropySourceProvider.get(128);
      byte[] arrayOfByte1 = paramBoolean ? generateDefaultPersonalizationString(entropySource.getEntropy()) : generateNonceIVPersonalizationString(entropySource.getEntropy());
      return (SecureRandom)(new SP800SecureRandomBuilder(entropySourceProvider)).setPersonalizationString(arrayOfByte1).buildHash((Digest)new SHA512Digest(), entropySource.getEntropy(), paramBoolean);
    } 
    if (Properties.isOverrideSet("org.bouncycastle.drbg.entropy_thread")) {
      synchronized (entropyDaemon) {
        if (entropyThread == null) {
          entropyThread = new Thread(entropyDaemon, "BC Entropy Daemon");
          entropyThread.setDaemon(true);
          entropyThread.start();
        } 
      } 
      HybridEntropySource hybridEntropySource = new HybridEntropySource(entropyDaemon, 256);
      byte[] arrayOfByte1 = paramBoolean ? generateDefaultPersonalizationString(hybridEntropySource.getEntropy()) : generateNonceIVPersonalizationString(hybridEntropySource.getEntropy());
      return (SecureRandom)(new SP800SecureRandomBuilder(new EntropySourceProvider() {
            public EntropySource get(int param1Int) {
              return new DRBG.HybridEntropySource(DRBG.entropyDaemon, param1Int);
            }
          })).setPersonalizationString(arrayOfByte1).buildHash((Digest)new SHA512Digest(), hybridEntropySource.getEntropy(), paramBoolean);
    } 
    OneShotHybridEntropySource oneShotHybridEntropySource = new OneShotHybridEntropySource(256);
    byte[] arrayOfByte = paramBoolean ? generateDefaultPersonalizationString(oneShotHybridEntropySource.getEntropy()) : generateNonceIVPersonalizationString(oneShotHybridEntropySource.getEntropy());
    return (SecureRandom)(new SP800SecureRandomBuilder(new EntropySourceProvider() {
          public EntropySource get(int param1Int) {
            return new DRBG.OneShotHybridEntropySource(param1Int);
          }
        })).setPersonalizationString(arrayOfByte).buildHash((Digest)new SHA512Digest(), oneShotHybridEntropySource.getEntropy(), paramBoolean);
  }
  
  private static EntropySourceProvider createInitialEntropySource() {
    boolean bool = ((Boolean)AccessController.<Boolean>doPrivileged(new PrivilegedAction<Boolean>() {
          public Boolean run() {
            try {
              Class<SecureRandom> clazz = SecureRandom.class;
              return Boolean.valueOf((clazz.getMethod("getInstanceStrong", new Class[0]) != null));
            } catch (Exception exception) {
              return Boolean.valueOf(false);
            } 
          }
        })).booleanValue();
    if (bool) {
      SecureRandom secureRandom = AccessController.<SecureRandom>doPrivileged(new PrivilegedAction<SecureRandom>() {
            public SecureRandom run() {
              try {
                return (SecureRandom)SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
              } catch (Exception exception) {
                return new DRBG.CoreSecureRandom(DRBG.findSource());
              } 
            }
          });
      return new IncrementalEntropySourceProvider(secureRandom, true);
    } 
    return new IncrementalEntropySourceProvider(new CoreSecureRandom(findSource()), true);
  }
  
  private static EntropySourceProvider createCoreEntropySourceProvider() {
    String str = AccessController.<String>doPrivileged(new PrivilegedAction<String>() {
          public String run() {
            return Security.getProperty("securerandom.source");
          }
        });
    if (str == null)
      return createInitialEntropySource(); 
    try {
      return new URLSeededEntropySourceProvider(new URL(str));
    } catch (Exception exception) {
      return createInitialEntropySource();
    } 
  }
  
  private static EntropySourceProvider createEntropySource() {
    final String sourceClass = Properties.getPropertyValue("org.bouncycastle.drbg.entropysource");
    return AccessController.<EntropySourceProvider>doPrivileged(new PrivilegedAction<EntropySourceProvider>() {
          public EntropySourceProvider run() {
            try {
              Class<EntropySourceProvider> clazz = ClassUtil.loadClass(DRBG.class, sourceClass);
              return clazz.newInstance();
            } catch (Exception exception) {
              throw new IllegalStateException("entropy source " + sourceClass + " not created: " + exception.getMessage(), exception);
            } 
          }
        });
  }
  
  private static byte[] generateDefaultPersonalizationString(byte[] paramArrayOfbyte) {
    return Arrays.concatenate(Strings.toByteArray("Default"), paramArrayOfbyte, Pack.longToBigEndian(Thread.currentThread().getId()), Pack.longToBigEndian(System.currentTimeMillis()));
  }
  
  private static byte[] generateNonceIVPersonalizationString(byte[] paramArrayOfbyte) {
    return Arrays.concatenate(Strings.toByteArray("Nonce"), paramArrayOfbyte, Pack.longToLittleEndian(Thread.currentThread().getId()), Pack.longToLittleEndian(System.currentTimeMillis()));
  }
  
  private static void sleep(long paramLong) throws InterruptedException {
    if (paramLong != 0L)
      Thread.sleep(paramLong); 
  }
  
  static {
    entropyDaemon = new EntropyDaemon();
  }
  
  private static class CoreSecureRandom extends SecureRandom {
    CoreSecureRandom(Object[] param1ArrayOfObject) {
      super((SecureRandomSpi)param1ArrayOfObject[1], (Provider)param1ArrayOfObject[0]);
    }
  }
  
  public static class Default extends SecureRandomSpi {
    private static final SecureRandom random = DRBG.createBaseRandom(true);
    
    protected void engineSetSeed(byte[] param1ArrayOfbyte) {
      random.setSeed(param1ArrayOfbyte);
    }
    
    protected void engineNextBytes(byte[] param1ArrayOfbyte) {
      random.nextBytes(param1ArrayOfbyte);
    }
    
    protected byte[] engineGenerateSeed(int param1Int) {
      return random.generateSeed(param1Int);
    }
  }
  
  private static class HybridEntropySource implements EntropySource {
    private final AtomicBoolean seedAvailable = new AtomicBoolean(false);
    
    private final AtomicInteger samples = new AtomicInteger(0);
    
    private final SP800SecureRandom drbg;
    
    private final SignallingEntropySource entropySource;
    
    private final int bytesRequired;
    
    private final byte[] additionalInput = Pack.longToBigEndian(System.currentTimeMillis());
    
    HybridEntropySource(EntropyDaemon param1EntropyDaemon, int param1Int) {
      EntropySourceProvider entropySourceProvider = DRBG.createCoreEntropySourceProvider();
      this.bytesRequired = (param1Int + 7) / 8;
      this.entropySource = new SignallingEntropySource(param1EntropyDaemon, this.seedAvailable, entropySourceProvider, 256);
      this.drbg = (new SP800SecureRandomBuilder(new EntropySourceProvider() {
            public EntropySource get(int param2Int) {
              return DRBG.HybridEntropySource.this.entropySource;
            }
          })).setPersonalizationString(Strings.toByteArray("Bouncy Castle Hybrid Entropy Source")).buildHMAC((Mac)new HMac((Digest)new SHA512Digest()), this.entropySource.getEntropy(), false);
    }
    
    public boolean isPredictionResistant() {
      return true;
    }
    
    public byte[] getEntropy() {
      byte[] arrayOfByte = new byte[this.bytesRequired];
      if (this.samples.getAndIncrement() > 128)
        if (this.seedAvailable.getAndSet(false)) {
          this.samples.set(0);
          this.drbg.reseed(this.additionalInput);
        } else {
          this.entropySource.schedule();
        }  
      this.drbg.nextBytes(arrayOfByte);
      return arrayOfByte;
    }
    
    public int entropySize() {
      return this.bytesRequired * 8;
    }
    
    private static class SignallingEntropySource implements IncrementalEntropySource {
      private final EntropyDaemon entropyDaemon;
      
      private final AtomicBoolean seedAvailable;
      
      private final IncrementalEntropySource entropySource;
      
      private final int byteLength;
      
      private final AtomicReference entropy = new AtomicReference();
      
      private final AtomicBoolean scheduled = new AtomicBoolean(false);
      
      SignallingEntropySource(EntropyDaemon param2EntropyDaemon, AtomicBoolean param2AtomicBoolean, EntropySourceProvider param2EntropySourceProvider, int param2Int) {
        this.entropyDaemon = param2EntropyDaemon;
        this.seedAvailable = param2AtomicBoolean;
        this.entropySource = (IncrementalEntropySource)param2EntropySourceProvider.get(param2Int);
        this.byteLength = (param2Int + 7) / 8;
      }
      
      public boolean isPredictionResistant() {
        return true;
      }
      
      public byte[] getEntropy() {
        try {
          return getEntropy(0L);
        } catch (InterruptedException interruptedException) {
          Thread.currentThread().interrupt();
          throw new IllegalStateException("initial entropy fetch interrupted");
        } 
      }
      
      public byte[] getEntropy(long param2Long) throws InterruptedException {
        byte[] arrayOfByte = this.entropy.getAndSet(null);
        if (arrayOfByte == null || arrayOfByte.length != this.byteLength) {
          arrayOfByte = this.entropySource.getEntropy(param2Long);
        } else {
          this.scheduled.set(false);
        } 
        return arrayOfByte;
      }
      
      void schedule() {
        if (!this.scheduled.getAndSet(true))
          this.entropyDaemon.addTask(new EntropyGatherer(this.entropySource, this.seedAvailable, this.entropy)); 
      }
      
      public int entropySize() {
        return this.byteLength * 8;
      }
    }
  }
  
  public static class Mappings extends AsymmetricAlgorithmProvider {
    public void configure(ConfigurableProvider param1ConfigurableProvider) {
      param1ConfigurableProvider.addAlgorithm("SecureRandom.DEFAULT", DRBG.PREFIX + "$Default");
      param1ConfigurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.PREFIX + "$NonceAndIV");
    }
  }
  
  public static class NonceAndIV extends SecureRandomSpi {
    private static final SecureRandom random = DRBG.createBaseRandom(false);
    
    protected void engineSetSeed(byte[] param1ArrayOfbyte) {
      random.setSeed(param1ArrayOfbyte);
    }
    
    protected void engineNextBytes(byte[] param1ArrayOfbyte) {
      random.nextBytes(param1ArrayOfbyte);
    }
    
    protected byte[] engineGenerateSeed(int param1Int) {
      return random.generateSeed(param1Int);
    }
  }
  
  private static class OneShotHybridEntropySource implements EntropySource {
    private final AtomicBoolean seedAvailable = new AtomicBoolean(false);
    
    private final AtomicInteger samples = new AtomicInteger(0);
    
    private final SP800SecureRandom drbg;
    
    private final OneShotSignallingEntropySource entropySource;
    
    private final int bytesRequired;
    
    private final byte[] additionalInput = Pack.longToBigEndian(System.currentTimeMillis());
    
    OneShotHybridEntropySource(int param1Int) {
      EntropySourceProvider entropySourceProvider = DRBG.createCoreEntropySourceProvider();
      this.bytesRequired = (param1Int + 7) / 8;
      this.entropySource = new OneShotSignallingEntropySource(this.seedAvailable, entropySourceProvider, 256);
      this.drbg = (new SP800SecureRandomBuilder(new EntropySourceProvider() {
            public EntropySource get(int param2Int) {
              return DRBG.OneShotHybridEntropySource.this.entropySource;
            }
          })).setPersonalizationString(Strings.toByteArray("Bouncy Castle Hybrid Entropy Source")).buildHMAC((Mac)new HMac((Digest)new SHA512Digest()), this.entropySource.getEntropy(), false);
    }
    
    public boolean isPredictionResistant() {
      return true;
    }
    
    public byte[] getEntropy() {
      byte[] arrayOfByte = new byte[this.bytesRequired];
      if (this.samples.getAndIncrement() > 1024)
        if (this.seedAvailable.getAndSet(false)) {
          this.samples.set(0);
          this.drbg.reseed(this.additionalInput);
        } else {
          this.entropySource.schedule();
        }  
      this.drbg.nextBytes(arrayOfByte);
      return arrayOfByte;
    }
    
    public int entropySize() {
      return this.bytesRequired * 8;
    }
    
    private static class OneShotSignallingEntropySource implements IncrementalEntropySource {
      private final AtomicBoolean seedAvailable;
      
      private final IncrementalEntropySource entropySource;
      
      private final int byteLength;
      
      private final AtomicReference entropy = new AtomicReference();
      
      private final AtomicBoolean scheduled = new AtomicBoolean(false);
      
      OneShotSignallingEntropySource(AtomicBoolean param2AtomicBoolean, EntropySourceProvider param2EntropySourceProvider, int param2Int) {
        this.seedAvailable = param2AtomicBoolean;
        this.entropySource = (IncrementalEntropySource)param2EntropySourceProvider.get(param2Int);
        this.byteLength = (param2Int + 7) / 8;
      }
      
      public boolean isPredictionResistant() {
        return true;
      }
      
      public byte[] getEntropy() {
        try {
          return getEntropy(0L);
        } catch (InterruptedException interruptedException) {
          Thread.currentThread().interrupt();
          throw new IllegalStateException("initial entropy fetch interrupted");
        } 
      }
      
      public byte[] getEntropy(long param2Long) throws InterruptedException {
        byte[] arrayOfByte = this.entropy.getAndSet(null);
        if (arrayOfByte == null || arrayOfByte.length != this.byteLength) {
          arrayOfByte = this.entropySource.getEntropy(param2Long);
        } else {
          this.scheduled.set(false);
        } 
        return arrayOfByte;
      }
      
      void schedule() {
        if (!this.scheduled.getAndSet(true)) {
          Thread thread = new Thread(new EntropyGatherer(this.entropySource, this.seedAvailable, this.entropy));
          thread.setDaemon(true);
          thread.start();
        } 
      }
      
      public int entropySize() {
        return this.byteLength * 8;
      }
    }
  }
  
  private static class URLSeededEntropySourceProvider implements EntropySourceProvider {
    private final InputStream seedStream = AccessController.<InputStream>doPrivileged(new PrivilegedAction<InputStream>() {
          public InputStream run() {
            try {
              return url.openStream();
            } catch (IOException iOException) {
              throw new IllegalStateException("unable to open random source");
            } 
          }
        });
    
    URLSeededEntropySourceProvider(final URL url) {}
    
    private int privilegedRead(final byte[] data, final int off, final int len) {
      return ((Integer)AccessController.<Integer>doPrivileged(new PrivilegedAction<Integer>() {
            public Integer run() {
              try {
                return Integer.valueOf(DRBG.URLSeededEntropySourceProvider.this.seedStream.read(data, off, len));
              } catch (IOException iOException) {
                throw new InternalError("unable to read random source");
              } 
            }
          })).intValue();
    }
    
    public EntropySource get(final int bitsRequired) {
      return new IncrementalEntropySource() {
          private final int numBytes = (bitsRequired + 7) / 8;
          
          public boolean isPredictionResistant() {
            return true;
          }
          
          public byte[] getEntropy() {
            try {
              return getEntropy(0L);
            } catch (InterruptedException interruptedException) {
              Thread.currentThread().interrupt();
              throw new IllegalStateException("initial entropy fetch interrupted");
            } 
          }
          
          public byte[] getEntropy(long param2Long) throws InterruptedException {
            byte[] arrayOfByte = new byte[this.numBytes];
            int i = 0;
            int j;
            while (i != arrayOfByte.length && (j = DRBG.URLSeededEntropySourceProvider.this.privilegedRead(arrayOfByte, i, arrayOfByte.length - i)) > -1) {
              i += j;
              DRBG.sleep(param2Long);
            } 
            if (i != arrayOfByte.length)
              throw new InternalError("unable to fully read random source"); 
            return arrayOfByte;
          }
          
          public int entropySize() {
            return bitsRequired;
          }
        };
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\drbg\DRBG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */