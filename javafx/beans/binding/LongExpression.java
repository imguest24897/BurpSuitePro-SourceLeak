/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ObservableLongValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ObservableList;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class LongExpression
/*     */   extends NumberExpressionBase
/*     */   implements ObservableLongValue
/*     */ {
/*     */   public int intValue() {
/*  53 */     return (int)get();
/*     */   }
/*     */ 
/*     */   
/*     */   public long longValue() {
/*  58 */     return get();
/*     */   }
/*     */ 
/*     */   
/*     */   public float floatValue() {
/*  63 */     return (float)get();
/*     */   }
/*     */ 
/*     */   
/*     */   public double doubleValue() {
/*  68 */     return get();
/*     */   }
/*     */ 
/*     */   
/*     */   public Long getValue() {
/*  73 */     return Long.valueOf(get());
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
/*     */   public static LongExpression longExpression(final ObservableLongValue value) {
/*  91 */     if (value == null) {
/*  92 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/*  94 */     return (value instanceof LongExpression) ? (LongExpression)value : 
/*  95 */       new LongBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 102 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected long computeValue() {
/* 107 */           return value.get();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableLongValue> getDependencies() {
/* 112 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
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
/*     */   public static <T extends Number> LongExpression longExpression(final ObservableValue<T> value) {
/* 148 */     if (value == null) {
/* 149 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/* 151 */     return (value instanceof LongExpression) ? (LongExpression)value : 
/* 152 */       new LongBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 159 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected long computeValue() {
/* 164 */           Number number = (Number)value.getValue();
/* 165 */           return (number == null) ? 0L : number.longValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<T>> getDependencies() {
/* 170 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public LongBinding negate() {
/* 178 */     return (LongBinding)Bindings.negate(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding add(double paramDouble) {
/* 183 */     return Bindings.add(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding add(float paramFloat) {
/* 188 */     return (FloatBinding)Bindings.add(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding add(long paramLong) {
/* 193 */     return (LongBinding)Bindings.add(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding add(int paramInt) {
/* 198 */     return (LongBinding)Bindings.add(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding subtract(double paramDouble) {
/* 203 */     return Bindings.subtract(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding subtract(float paramFloat) {
/* 208 */     return (FloatBinding)Bindings.subtract(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding subtract(long paramLong) {
/* 213 */     return (LongBinding)Bindings.subtract(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding subtract(int paramInt) {
/* 218 */     return (LongBinding)Bindings.subtract(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding multiply(double paramDouble) {
/* 223 */     return Bindings.multiply(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding multiply(float paramFloat) {
/* 228 */     return (FloatBinding)Bindings.multiply(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding multiply(long paramLong) {
/* 233 */     return (LongBinding)Bindings.multiply(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding multiply(int paramInt) {
/* 238 */     return (LongBinding)Bindings.multiply(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding divide(double paramDouble) {
/* 243 */     return Bindings.divide(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding divide(float paramFloat) {
/* 248 */     return (FloatBinding)Bindings.divide(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding divide(long paramLong) {
/* 253 */     return (LongBinding)Bindings.divide(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding divide(int paramInt) {
/* 258 */     return (LongBinding)Bindings.divide(this, paramInt);
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
/*     */   public ObjectExpression<Long> asObject() {
/* 271 */     return new ObjectBinding<Long>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 278 */           unbind(new Observable[] { (Observable)this.this$0 });
/*     */         }
/*     */ 
/*     */         
/*     */         protected Long computeValue() {
/* 283 */           return LongExpression.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\LongExpression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */