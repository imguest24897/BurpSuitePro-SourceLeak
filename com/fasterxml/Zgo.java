package com.fasterxml;

import com.fasterxml.Zor.Zyd;
import java.util.HashMap;

public class Zgo {
  protected static final HashMap<String, Zyd<?>> Zk = new HashMap<>();
  
  public static Zyd<?> Zg(Class<?> paramClass) {
    return Zk.get(paramClass.getName());
  }
  
  static {
    Zk.put(boolean[].class.getName(), new Zzt());
    Zk.put(byte[].class.getName(), new Zzl());
    Zk.put(char[].class.getName(), new Zz8());
    Zk.put(short[].class.getName(), new Zz2());
    Zk.put(int[].class.getName(), new Zzr());
    Zk.put(long[].class.getName(), new Zzm());
    Zk.put(float[].class.getName(), new Zz4());
    Zk.put(double[].class.getName(), new Zzk());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */