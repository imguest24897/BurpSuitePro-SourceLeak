/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ObservableDoubleValue;
/*     */ import javafx.beans.value.ObservableNumberValue;
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
/*     */ 
/*     */ public abstract class DoubleExpression
/*     */   extends NumberExpressionBase
/*     */   implements ObservableDoubleValue
/*     */ {
/*     */   public int intValue() {
/*  55 */     return (int)get();
/*     */   }
/*     */ 
/*     */   
/*     */   public long longValue() {
/*  60 */     return (long)get();
/*     */   }
/*     */ 
/*     */   
/*     */   public float floatValue() {
/*  65 */     return (float)get();
/*     */   }
/*     */ 
/*     */   
/*     */   public double doubleValue() {
/*  70 */     return get();
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getValue() {
/*  75 */     return Double.valueOf(get());
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
/*     */   public static DoubleExpression doubleExpression(final ObservableDoubleValue value) {
/*  95 */     if (value == null) {
/*  96 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/*  98 */     return (value instanceof DoubleExpression) ? (DoubleExpression)value : 
/*  99 */       new DoubleBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 106 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected double computeValue() {
/* 111 */           return value.get();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableDoubleValue> getDependencies() {
/* 116 */           return FXCollections.singletonObservableList(value);
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
/*     */   public static <T extends Number> DoubleExpression doubleExpression(final ObservableValue<T> value) {
/* 152 */     if (value == null) {
/* 153 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/* 155 */     return (value instanceof DoubleExpression) ? (DoubleExpression)value : 
/* 156 */       new DoubleBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 163 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected double computeValue() {
/* 168 */           Number number = (Number)value.getValue();
/* 169 */           return (number == null) ? 0.0D : number.doubleValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<T>> getDependencies() {
/* 174 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding negate() {
/* 181 */     return (DoubleBinding)Bindings.negate(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding add(ObservableNumberValue paramObservableNumberValue) {
/* 186 */     return (DoubleBinding)Bindings.add(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding add(double paramDouble) {
/* 191 */     return Bindings.add(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding add(float paramFloat) {
/* 196 */     return (DoubleBinding)Bindings.add(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding add(long paramLong) {
/* 201 */     return (DoubleBinding)Bindings.add(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding add(int paramInt) {
/* 206 */     return (DoubleBinding)Bindings.add(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding subtract(ObservableNumberValue paramObservableNumberValue) {
/* 211 */     return (DoubleBinding)Bindings.subtract(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding subtract(double paramDouble) {
/* 216 */     return Bindings.subtract(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding subtract(float paramFloat) {
/* 221 */     return (DoubleBinding)Bindings.subtract(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding subtract(long paramLong) {
/* 226 */     return (DoubleBinding)Bindings.subtract(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding subtract(int paramInt) {
/* 231 */     return (DoubleBinding)Bindings.subtract(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding multiply(ObservableNumberValue paramObservableNumberValue) {
/* 236 */     return (DoubleBinding)Bindings.multiply(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding multiply(double paramDouble) {
/* 241 */     return Bindings.multiply(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding multiply(float paramFloat) {
/* 246 */     return (DoubleBinding)Bindings.multiply(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding multiply(long paramLong) {
/* 251 */     return (DoubleBinding)Bindings.multiply(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding multiply(int paramInt) {
/* 256 */     return (DoubleBinding)Bindings.multiply(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding divide(ObservableNumberValue paramObservableNumberValue) {
/* 261 */     return (DoubleBinding)Bindings.divide(this, paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding divide(double paramDouble) {
/* 266 */     return Bindings.divide(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding divide(float paramFloat) {
/* 271 */     return (DoubleBinding)Bindings.divide(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding divide(long paramLong) {
/* 276 */     return (DoubleBinding)Bindings.divide(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding divide(int paramInt) {
/* 281 */     return (DoubleBinding)Bindings.divide(this, paramInt);
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
/*     */   public ObjectExpression<Double> asObject() {
/* 294 */     return new ObjectBinding<Double>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 301 */           unbind(new Observable[] { (Observable)this.this$0 });
/*     */         }
/*     */ 
/*     */         
/*     */         protected Double computeValue() {
/* 306 */           return DoubleExpression.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\DoubleExpression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */