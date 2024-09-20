/*     */ package javafx.util;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javafx.beans.NamedArg;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pair<K, V>
/*     */   implements Serializable
/*     */ {
/*     */   private K key;
/*     */   private V value;
/*     */   
/*     */   public K getKey() {
/*  46 */     return this.key;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public V getValue() {
/*  57 */     return this.value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Pair(@NamedArg("key") K paramK, @NamedArg("value") V paramV) {
/*  65 */     this.key = paramK;
/*  66 */     this.value = paramV;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  79 */     return String.valueOf(this.key) + "=" + String.valueOf(this.key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  92 */     int i = 7;
/*  93 */     i = 31 * i + ((this.key != null) ? this.key.hashCode() : 0);
/*  94 */     i = 31 * i + ((this.value != null) ? this.value.hashCode() : 0);
/*  95 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 116 */     if (this == paramObject) return true; 
/* 117 */     if (paramObject instanceof Pair) {
/* 118 */       Pair pair = (Pair)paramObject;
/* 119 */       if ((this.key != null) ? !this.key.equals(pair.key) : (pair.key != null)) return false; 
/* 120 */       if ((this.value != null) ? !this.value.equals(pair.value) : (pair.value != null)) return false; 
/* 121 */       return true;
/*     */     } 
/* 123 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\Pair.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */