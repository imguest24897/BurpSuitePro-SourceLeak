package com.fasterxml.Zof;

import burp.Zbqc;
import com.fasterxml.Zb.Zmr;
import com.fasterxml.Zc.Zx9;
import com.fasterxml.Zi.Z_;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class Za {
  protected final Za Zy = null;
  
  protected final AtomicReference<Zc> ZS;
  
  protected final int ZD;
  
  protected final Zx9 Zc;
  
  protected final boolean Zn;
  
  protected int[] Zv;
  
  protected int ZU;
  
  protected int Zo;
  
  protected int ZA;
  
  protected int ZJ;
  
  protected int ZT;
  
  protected String[] Zr;
  
  protected int ZB;
  
  protected int ZI;
  
  protected boolean ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Za(int paramInt1, int paramInt2) {
    this.ZT = 0;
    this.ZR = true;
    this.ZD = paramInt2;
    this.Zc = null;
    this.Zn = true;
    if (paramInt1 < 16) {
      paramInt1 = 16;
    } else if ((paramInt1 & paramInt1 - 1) != 0) {
      int i;
      for (i = 16; i < paramInt1; i += i);
      paramInt1 = i;
    } 
    this.ZS = new AtomicReference<>(Zc.Za(paramInt1));
  }
  
  private Za(Za paramZa, int paramInt, Zc paramZc, boolean paramBoolean1, boolean paramBoolean2) {
    this.ZD = paramInt;
    this.Zc = paramBoolean1 ? Zx9.Ze : null;
    this.Zn = paramBoolean2;
    this.ZS = null;
    this.ZT = paramZc.Zg;
    this.ZU = paramZc.ZV;
    this.Zo = this.ZU << 2;
    this.ZA = this.Zo + (this.Zo >> 1);
    this.ZJ = paramZc.Zd;
    this.Zv = paramZc.Zb;
    this.Zr = paramZc.ZL;
    this.ZB = paramZc.ZS;
    this.ZI = paramZc.ZY;
    this.ZR = true;
  }
  
  public static Za Zt() {
    long l = System.currentTimeMillis();
    int i = (int)l + (int)(l >>> 32L) | 0x1;
    return ZB(i);
  }
  
  protected static Za ZB(int paramInt) {
    return new Za(64, paramInt);
  }
  
  public Za ZE(int paramInt) {
    return new Za(this, this.ZD, this.ZS.get(), Zmr.INTERN_FIELD_NAMES.ZR(paramInt), Zmr.FAIL_ON_SYMBOL_HASH_OVERFLOW.ZR(paramInt));
  }
  
  public void ZK() {
    try {
      if (this.Zy != null)
        try {
          if (Zr()) {
            this.Zy.ZG(new Zc(this));
            this.ZR = true;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private void ZG(Zc paramZc) {
    int i = paramZc.Zg;
    Zc zc = this.ZS.get();
    try {
      if (i == zc.Zg)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (i > 6000)
      paramZc = Zc.Za(64); 
    this.ZS.compareAndSet(zc, paramZc);
  }
  
  public boolean Zr() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !this.ZR;
  }
  
  public int ZM() {
    byte b1 = 0;
    String[] arrayOfString = Zn.ZJ();
    byte b2 = 3;
    int i = this.Zo;
    while (b2 < i) {
      try {
        if (this.Zv[b2] != 0)
          b1++; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      b2 += 4;
      if (arrayOfString == null)
        break; 
    } 
    return b1;
  }
  
  public int Zb() {
    byte b = 0;
    int i = this.Zo + 3;
    String[] arrayOfString = Zn.ZJ();
    int j = this.ZA;
    while (i < j) {
      try {
        if (this.Zv[i] != 0)
          b++; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    return b;
  }
  
  public int Z_() {
    byte b = 0;
    int i = this.ZA + 3;
    String[] arrayOfString = Zn.ZJ();
    int j = i + this.ZU;
    while (i < j) {
      try {
        if (this.Zv[i] != 0)
          b++; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    return b;
  }
  
  public int Zc() {
    return this.ZB - Ze() >> 2;
  }
  
  public int ZE() {
    byte b1 = 0;
    byte b2 = 3;
    int i = this.ZU << 3;
    String[] arrayOfString = Zn.ZJ();
    while (b2 < i) {
      try {
        if (this.Zv[b2] != 0)
          b1++; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      b2 += 4;
      if (arrayOfString == null)
        break; 
    } 
    return b1;
  }
  
  public String toString() {
    int i = ZM();
    int j = Zb();
    int k = Z_();
    String[] arrayOfString = Zn.ZJ();
    int m = Zc();
    int n = ZE();
    try {
      if (arrayOfString == null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return String.format(a(-26552, 373), new Object[] { getClass().getName(), Integer.valueOf(this.ZT), Integer.valueOf(this.ZU), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i + j + k + m), Integer.valueOf(n) });
  }
  
  public String Zk(int paramInt) {
    int i = Zc(ZH(paramInt));
    int[] arrayOfInt = this.Zv;
    int j = arrayOfInt[i + 3];
    try {
      if (j == 1) {
        try {
          if (arrayOfInt[i] == paramInt)
            return this.Zr[i >> 2]; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        try {
          if (j == 0)
            return null; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int k = this.Zo + (i >> 3 << 2);
    j = arrayOfInt[k + 3];
    try {
      if (j == 1) {
        try {
          if (arrayOfInt[k] == paramInt)
            return this.Zr[k >> 2]; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        try {
          if (j == 0)
            return null; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return ZP(i, paramInt);
  }
  
  public String Zf(int paramInt1, int paramInt2) {
    int i = Zc(ZC(paramInt1, paramInt2));
    int[] arrayOfInt = this.Zv;
    int j = arrayOfInt[i + 3];
    try {
      if (j == 2) {
        try {
          if (paramInt1 == arrayOfInt[i])
            try {
              if (paramInt2 == arrayOfInt[i + 1])
                return this.Zr[i >> 2]; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        try {
          if (j == 0)
            return null; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int k = this.Zo + (i >> 3 << 2);
    j = arrayOfInt[k + 3];
    try {
      if (j == 2) {
        try {
          if (paramInt1 == arrayOfInt[k])
            try {
              if (paramInt2 == arrayOfInt[k + 1])
                return this.Zr[k >> 2]; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        try {
          if (j == 0)
            return null; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Zx(i, paramInt1, paramInt2);
  }
  
  public String Zc(int paramInt1, int paramInt2, int paramInt3) {
    int i = Zc(ZY(paramInt1, paramInt2, paramInt3));
    int[] arrayOfInt = this.Zv;
    int j = arrayOfInt[i + 3];
    try {
      if (j == 3) {
        try {
          if (paramInt1 == arrayOfInt[i])
            try {
              if (arrayOfInt[i + 1] == paramInt2)
                try {
                  if (arrayOfInt[i + 2] == paramInt3)
                    return this.Zr[i >> 2]; 
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                }  
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        try {
          if (j == 0)
            return null; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int k = this.Zo + (i >> 3 << 2);
    j = arrayOfInt[k + 3];
    try {
      if (j == 3) {
        try {
          if (paramInt1 == arrayOfInt[k])
            try {
              if (arrayOfInt[k + 1] == paramInt2)
                try {
                  if (arrayOfInt[k + 2] == paramInt3)
                    return this.Zr[k >> 2]; 
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                }  
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
        try {
          if (j == 0)
            return null; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return ZT(i, paramInt1, paramInt2, paramInt3);
  }
  
  public String ZV(int[] paramArrayOfint, int paramInt) {
    try {
      if (paramInt < 4) {
        try {
          switch (paramInt) {
            case 3:
              return Zc(paramArrayOfint[0], paramArrayOfint[1], paramArrayOfint[2]);
            case 2:
              return Zf(paramArrayOfint[0], paramArrayOfint[1]);
            case 1:
              return Zk(paramArrayOfint[0]);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return "";
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int i = ZU(paramArrayOfint, paramInt);
    int j = Zc(i);
    int[] arrayOfInt = this.Zv;
    int k = arrayOfInt[j + 3];
    try {
      if (i == arrayOfInt[j])
        try {
          if (k == paramInt)
            try {
              if (ZE(paramArrayOfint, paramInt, arrayOfInt[j + 1]))
                return this.Zr[j >> 2]; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (k == 0)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int m = this.Zo + (j >> 3 << 2);
    int n = arrayOfInt[m + 3];
    try {
      if (i == arrayOfInt[m])
        try {
          if (n == paramInt)
            try {
              if (ZE(paramArrayOfint, paramInt, arrayOfInt[m + 1]))
                return this.Zr[m >> 2]; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return ZR(j, i, paramArrayOfint, paramInt);
  }
  
  private final int Zc(int paramInt) {
    int i = paramInt & this.ZU - 1;
    return i << 2;
  }
  
  private String ZP(int paramInt1, int paramInt2) {
    int i = this.ZA + (paramInt1 >> this.ZJ + 2 << this.ZJ);
    int[] arrayOfInt = this.Zv;
    String[] arrayOfString = Zn.ZJ();
    int j = 1 << this.ZJ;
    int k = i + j;
    while (i < k) {
      int m = arrayOfInt[i + 3];
      try {
        if (paramInt2 == arrayOfInt[i])
          try {
            if (1 == m)
              return this.Zr[i >> 2]; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (m == 0)
          return null; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    i = Ze();
    while (i < this.ZB) {
      try {
        if (paramInt2 == arrayOfInt[i])
          try {
            if (1 == arrayOfInt[i + 3])
              return this.Zr[i >> 2]; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    return null;
  }
  
  private String Zx(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.ZA + (paramInt1 >> this.ZJ + 2 << this.ZJ);
    String[] arrayOfString = Zn.ZJ();
    int[] arrayOfInt = this.Zv;
    int j = 1 << this.ZJ;
    int k = i + j;
    while (i < k) {
      int m = arrayOfInt[i + 3];
      try {
        if (paramInt2 == arrayOfInt[i])
          try {
            if (paramInt3 == arrayOfInt[i + 1])
              try {
                if (2 == m)
                  return this.Zr[i >> 2]; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (m == 0)
          return null; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    i = Ze();
    while (i < this.ZB) {
      try {
        if (paramInt2 == arrayOfInt[i])
          try {
            if (paramInt3 == arrayOfInt[i + 1])
              try {
                if (2 == arrayOfInt[i + 3])
                  return this.Zr[i >> 2]; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    return null;
  }
  
  private String ZT(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = this.ZA + (paramInt1 >> this.ZJ + 2 << this.ZJ);
    int[] arrayOfInt = this.Zv;
    int j = 1 << this.ZJ;
    String[] arrayOfString = Zn.ZJ();
    int k = i + j;
    while (i < k) {
      int m = arrayOfInt[i + 3];
      try {
        if (paramInt2 == arrayOfInt[i])
          try {
            if (paramInt3 == arrayOfInt[i + 1])
              try {
                if (paramInt4 == arrayOfInt[i + 2])
                  try {
                    if (3 == m)
                      return this.Zr[i >> 2]; 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  }  
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (m == 0)
          return null; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    i = Ze();
    while (i < this.ZB) {
      try {
        if (paramInt2 == arrayOfInt[i])
          try {
            if (paramInt3 == arrayOfInt[i + 1])
              try {
                if (paramInt4 == arrayOfInt[i + 2])
                  try {
                    if (3 == arrayOfInt[i + 3])
                      return this.Zr[i >> 2]; 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  }  
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    return null;
  }
  
  private String ZR(int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    int i = this.ZA + (paramInt1 >> this.ZJ + 2 << this.ZJ);
    String[] arrayOfString = Zn.ZJ();
    int[] arrayOfInt = this.Zv;
    int j = 1 << this.ZJ;
    int k = i + j;
    while (i < k) {
      int m = arrayOfInt[i + 3];
      try {
        if (paramInt2 == arrayOfInt[i])
          try {
            if (paramInt3 == m)
              try {
                if (ZE(paramArrayOfint, paramInt3, arrayOfInt[i + 1]))
                  return this.Zr[i >> 2]; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (m == 0)
          return null; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    i = Ze();
    while (i < this.ZB) {
      try {
        if (paramInt2 == arrayOfInt[i])
          try {
            if (paramInt3 == arrayOfInt[i + 3])
              try {
                if (ZE(paramArrayOfint, paramInt3, arrayOfInt[i + 1]))
                  return this.Zr[i >> 2]; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      i += 4;
      if (arrayOfString == null)
        break; 
    } 
    return null;
  }
  
  private boolean ZE(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int[] arrayOfInt = this.Zv;
    byte b = 0;
    try {
      switch (paramInt1) {
        default:
          return Zb(paramArrayOfint, paramInt1, paramInt2);
        case 8:
          try {
            if (paramArrayOfint[b++] != arrayOfInt[paramInt2++])
              return false; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        case 7:
          try {
            if (paramArrayOfint[b++] != arrayOfInt[paramInt2++])
              return false; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        case 6:
          try {
            if (paramArrayOfint[b++] != arrayOfInt[paramInt2++])
              return false; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        case 5:
          try {
            if (paramArrayOfint[b++] != arrayOfInt[paramInt2++])
              return false; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          break;
        case 4:
          break;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfint[b++] != arrayOfInt[paramInt2++])
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfint[b++] != arrayOfInt[paramInt2++])
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfint[b++] != arrayOfInt[paramInt2++])
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfint[b++] != arrayOfInt[paramInt2++])
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return true;
  }
  
  private boolean Zb(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    byte b = 0;
    while (true) {
      if (paramArrayOfint[b++] != this.Zv[paramInt2++])
        return false; 
      if (b >= paramInt1)
        return true; 
    } 
  }
  
  public String Zj(String paramString, int[] paramArrayOfint, int paramInt) throws Z_ {
    ZJ();
    String[] arrayOfString = Zn.ZJ();
    if (this.Zc != null)
      paramString = this.Zc.Zk(paramString); 
    switch (paramInt) {
      case 1:
        i = ZA(ZH(paramArrayOfint[0]));
        this.Zv[i] = paramArrayOfint[0];
        this.Zv[i + 3] = 1;
        if (arrayOfString == null);
        this.Zr[i >> 2] = paramString;
        this.ZT++;
        return paramString;
      case 2:
        i = ZA(ZC(paramArrayOfint[0], paramArrayOfint[1]));
        this.Zv[i] = paramArrayOfint[0];
        this.Zv[i + 1] = paramArrayOfint[1];
        this.Zv[i + 3] = 2;
        if (arrayOfString == null);
        this.Zr[i >> 2] = paramString;
        this.ZT++;
        return paramString;
      case 3:
        i = ZA(ZY(paramArrayOfint[0], paramArrayOfint[1], paramArrayOfint[2]));
        this.Zv[i] = paramArrayOfint[0];
        this.Zv[i + 1] = paramArrayOfint[1];
        this.Zv[i + 2] = paramArrayOfint[2];
        this.Zv[i + 3] = 3;
        if (arrayOfString == null)
          break; 
        this.Zr[i >> 2] = paramString;
        this.ZT++;
        return paramString;
    } 
    int j = ZU(paramArrayOfint, paramInt);
    int i = ZA(j);
    this.Zv[i] = j;
    int k = ZK(paramArrayOfint, paramInt);
    this.Zv[i + 1] = k;
    this.Zv[i + 3] = paramInt;
    this.Zr[i >> 2] = paramString;
    this.ZT++;
    return paramString;
  }
  
  private void ZJ() {
    try {
      if (this.ZR) {
        try {
          if (this.Zy == null) {
            try {
              if (this.ZT == 0)
                throw new IllegalStateException(a(-26551, 25665)); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            throw new IllegalStateException(a(-26547, 13819));
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        this.Zv = Arrays.copyOf(this.Zv, this.Zv.length);
        this.Zr = Arrays.<String>copyOf(this.Zr, this.Zr.length);
        this.ZR = false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private int ZA(int paramInt) throws Z_ {
    int i = Zc(paramInt);
    String[] arrayOfString = Zn.ZJ();
    int[] arrayOfInt = this.Zv;
    try {
      if (arrayOfInt[i + 3] == 0)
        return i; 
    } catch (Z_ z_) {
      throw a(null);
    } 
    try {
      if (Zo())
        return Zd(paramInt); 
    } catch (Z_ z_) {
      throw a(null);
    } 
    int j = this.Zo + (i >> 3 << 2);
    try {
      if (arrayOfInt[j + 3] == 0)
        return j; 
    } catch (Z_ z_) {
      throw a(null);
    } 
    j = this.ZA + (i >> this.ZJ + 2 << this.ZJ);
    int k = 1 << this.ZJ;
    int m = j + k;
    while (j < m) {
      try {
        if (arrayOfInt[j + 3] == 0)
          return j; 
      } catch (Z_ z_) {
        throw a(null);
      } 
      j += 4;
      if (arrayOfString == null)
        break; 
    } 
    i = this.ZB;
    this.ZB += 4;
    m = this.ZU << 3;
    try {
      if (this.ZB >= m) {
        try {
          if (this.Zn)
            ZD(); 
        } catch (Z_ z_) {
          throw a(null);
        } 
        return Zd(paramInt);
      } 
    } catch (Z_ z_) {
      throw a(null);
    } 
    return i;
  }
  
  private int Zd(int paramInt) throws Z_ {
    ZF();
    String[] arrayOfString = Zn.ZJ();
    int i = Zc(paramInt);
    int[] arrayOfInt = this.Zv;
    try {
      if (arrayOfInt[i + 3] == 0)
        return i; 
    } catch (Z_ z_) {
      throw a(null);
    } 
    int j = this.Zo + (i >> 3 << 2);
    try {
      if (arrayOfInt[j + 3] == 0)
        return j; 
    } catch (Z_ z_) {
      throw a(null);
    } 
    j = this.ZA + (i >> this.ZJ + 2 << this.ZJ);
    int k = 1 << this.ZJ;
    int m = j + k;
    while (j < m) {
      try {
        if (arrayOfInt[j + 3] == 0)
          return j; 
      } catch (Z_ z_) {
        throw a(null);
      } 
      j += 4;
      if (arrayOfString == null)
        break; 
    } 
    i = this.ZB;
    this.ZB += 4;
    return i;
  }
  
  static int Zx(int paramInt) {
    return (int)(paramInt * 3435973837L >>> 32L);
  }
  
  private boolean Zo() {
    if (this.ZT > this.ZU >> 1) {
      int i = this.ZB - Ze() >> 2;
      try {
        if (i <= 1 + this.ZT >> 7) {
          try {
            if (this.ZT > Zx(this.ZU))
              return true; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } else {
          return true;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  private int ZK(int[] paramArrayOfint, int paramInt) {
    int i = this.ZI;
    if (i + paramInt > this.Zv.length) {
      int j = i + paramInt - this.Zv.length;
      int k = Math.min(4096, this.ZU);
      int m = this.Zv.length + Math.max(j, k);
      this.Zv = Arrays.copyOf(this.Zv, m);
    } 
    System.arraycopy(paramArrayOfint, 0, this.Zv, i, paramInt);
    this.ZI += paramInt;
    return i;
  }
  
  public int ZH(int paramInt) {
    int i = paramInt ^ this.ZD;
    i += i >>> 16;
    i ^= i << 3;
    i += i >>> 12;
    return i;
  }
  
  public int ZC(int paramInt1, int paramInt2) {
    int i = paramInt1;
    i += i >>> 15;
    i ^= i >>> 9;
    i += paramInt2 * 33;
    i ^= this.ZD;
    i += i >>> 16;
    i ^= i >>> 4;
    i += i << 3;
    return i;
  }
  
  public int ZY(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 ^ this.ZD;
    i += i >>> 9;
    i *= 31;
    i += paramInt2;
    i *= 33;
    i += i >>> 15;
    i ^= paramInt3;
    i += i >>> 4;
    i += i >>> 15;
    i ^= i << 9;
    return i;
  }
  
  public int ZU(int[] paramArrayOfint, int paramInt) {
    String[] arrayOfString = Zn.ZJ();
    try {
      if (paramInt < 4)
        throw new IllegalArgumentException(a(-26545, 17288)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int i = paramArrayOfint[0] ^ this.ZD;
    i += i >>> 9;
    i += paramArrayOfint[1];
    i += i >>> 15;
    i *= 33;
    i ^= paramArrayOfint[2];
    i += i >>> 4;
    byte b = 3;
    while (b < paramInt) {
      int j = paramArrayOfint[b];
      j ^= j >> 21;
      i += j;
      b++;
      if (arrayOfString == null)
        break; 
    } 
    i *= 65599;
    i += i >>> 19;
    i ^= i << 5;
    try {
      if (Zbqc.Zwu() == null)
        Zn.ZT(new String[4]); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return i;
  }
  
  private void ZF() throws Z_ {
    this.ZR = false;
    int[] arrayOfInt1 = this.Zv;
    String[] arrayOfString2 = this.Zr;
    int i = this.ZU;
    int j = this.ZT;
    String[] arrayOfString1 = Zn.ZJ();
    int k = i + i;
    int m = this.ZB;
    try {
      if (k > 65536) {
        Zy(true);
        return;
      } 
    } catch (Z_ z_) {
      throw a(null);
    } 
    this.Zv = new int[arrayOfInt1.length + (i << 3)];
    this.ZU = k;
    this.Zo = k << 2;
    this.ZA = this.Zo + (this.Zo >> 1);
    this.ZJ = Zm(k);
    this.Zr = new String[arrayOfString2.length << 1];
    Zy(false);
    byte b1 = 0;
    int[] arrayOfInt2 = new int[16];
    byte b2 = 0;
    int n = m;
    while (b2 < n) {
      int i1 = arrayOfInt1[b2 + 3];
      try {
        if (i1 != 0 || arrayOfString1 == null) {
          b1++;
          String str = arrayOfString2[b2 >> 2];
          try {
            int i2;
            switch (i1) {
              case 1:
              
              case 2:
              
              case 3:
              
              default:
                if (i1 > arrayOfInt2.length)
                  arrayOfInt2 = new int[i1]; 
                i2 = arrayOfInt1[b2 + 1];
                System.arraycopy(arrayOfInt1, i2, arrayOfInt2, 0, i1);
                Zj(str, arrayOfInt2, i1);
                break;
            } 
          } catch (Z_ z_) {
            throw a(null);
          } 
        } 
      } catch (Z_ z_) {
        throw a(null);
      } 
      b2 += 4;
      continue;
      if (arrayOfString1 == null)
        break; 
    } 
    try {
      if (b1 != j)
        throw new IllegalStateException(a(-26559, -23827) + j + a(-26549, 20534) + b1); 
    } catch (Z_ z_) {
      throw a(null);
    } 
  }
  
  private void Zy(boolean paramBoolean) {
    try {
      this.ZT = 0;
      this.ZB = Ze();
      this.ZI = this.ZU << 3;
      if (paramBoolean) {
        Arrays.fill(this.Zv, 0);
        Arrays.fill((Object[])this.Zr, (Object)null);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private final int Ze() {
    int i = this.ZU;
    return (i << 3) - i;
  }
  
  protected void ZD() throws Z_ {
    try {
      if (this.ZU <= 1024)
        return; 
    } catch (Z_ z_) {
      throw a(null);
    } 
    throw new Z_(a(-26550, -31639) + this.ZT + a(-26548, 27441) + this.ZU + a(-26546, 16442) + (this.ZU >> 3) + a(-26560, 22254));
  }
  
  static int Zm(int paramInt) {
    int i = paramInt >> 2;
    try {
      if (i < 64)
        return 4; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (i <= 256)
        return 5; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (i <= 1024)
        return 6; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return 7;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ç¨ùì.(ÚÊÊ0{G1@#ë¸LËNmGÒXEËõÂÅrm¡4y@£Æ!öªIõf¢#¥ygHSÑ»Ét#Yzx~±6÷ò$ÂÔ@BìQ#Qß´úÒXYMkõä×qú½ÝËªXi`s½3å²\\f_"40`ï!ÔÌc\\tk&qÆi¾³9'ø2É[,Î2¯¸6Rú&\\nêu)öÌêV<LF1 M­r$'¦¥û¨Éåõ¨0j¶@§pÉI+r¯*¨A¶ôim®)h,b^üNÊçmÞ:ÅØ9R (ÝÙ¿ÚsyÇÔÊÈM)»X`{Ô(îÚñKÝ5ÙØÏX,ZSPÅýHæÃ,f³Å'K×Í&>Þ×²02ç7°4Ð4õam¤õOë¸êÃ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #53
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #31
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc ']ZüäØ fÆª&©¼¿F¸KÁÓíuÕM8§§Õ<2»¯¯¶ÉÍc\\fð÷÷l<§jÊ°§P J[Di³²¾·»ûýfÑó3ºE:'D´MèÆÿ1H;ìÒV!,}èSMN-íñÜüK½ laLæÍ·ýÈ]²ð|+«äñjþ·±H/W´\\fó9É©È+å.¹UuúÙÍ°_Êáö'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #43
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #102
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic com/fasterxml/Zof/Za.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zof/Za.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #13
    //   214: goto -> 244
    //   217: bipush #102
    //   219: goto -> 244
    //   222: bipush #72
    //   224: goto -> 244
    //   227: bipush #15
    //   229: goto -> 244
    //   232: bipush #108
    //   234: goto -> 244
    //   237: bipush #15
    //   239: goto -> 244
    //   242: bipush #97
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9849) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 89;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zof\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */