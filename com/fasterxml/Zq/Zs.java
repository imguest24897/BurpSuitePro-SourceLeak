package com.fasterxml.Zq;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zm0;
import java.util.HashSet;

public class Zs {
  protected final Object ZQ;
  
  protected String ZM;
  
  protected String ZX;
  
  protected HashSet<String> ZO;
  
  private Zs(Object paramObject) {
    this.ZQ = paramObject;
  }
  
  public static Zs Zd(Zg paramZg) {
    return new Zs(paramZg);
  }
  
  public static Zs Zd(Zf paramZf) {
    return new Zs(paramZf);
  }
  
  public Zs Zw() {
    return new Zs(this.ZQ);
  }
  
  public void Zh() {
    this.ZM = null;
    this.ZX = null;
    this.ZO = null;
  }
  
  public Object ZD() {
    return this.ZQ;
  }
  
  public boolean ZH(String paramString) throws Zm0 {
    try {
      if (this.ZM == null) {
        this.ZM = paramString;
        return false;
      } 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    try {
      if (paramString.equals(this.ZM))
        return true; 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    try {
      if (this.ZX == null) {
        this.ZX = paramString;
        return false;
      } 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    try {
      if (paramString.equals(this.ZX))
        return true; 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    try {
      if (this.ZO == null) {
        this.ZO = new HashSet<>(16);
        this.ZO.add(this.ZM);
        this.ZO.add(this.ZX);
      } 
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    try {
    
    } catch (Zm0 zm0) {
      throw a(null);
    } 
    return !this.ZO.add(paramString);
  }
  
  private static Zm0 a(Zm0 paramZm0) {
    return paramZm0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */