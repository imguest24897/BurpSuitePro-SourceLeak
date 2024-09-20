/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakInvalidationListener;
/*     */ import javafx.beans.binding.FloatExpression;
/*     */ import javafx.beans.binding.ObjectExpression;
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
/*     */ 
/*     */ 
/*     */ public abstract class ReadOnlyFloatProperty
/*     */   extends FloatExpression
/*     */   implements ReadOnlyProperty<Number>
/*     */ {
/*     */   public String toString() {
/*  56 */     Object object = getBean();
/*  57 */     String str = getName();
/*  58 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlyFloatProperty [");
/*     */     
/*  60 */     if (object != null) {
/*  61 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/*  63 */     if (str != null && !str.equals("")) {
/*  64 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/*  66 */     stringBuilder.append("value: ").append(get()).append("]");
/*  67 */     return stringBuilder.toString();
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
/*     */   public static <T extends Number> ReadOnlyFloatProperty readOnlyFloatProperty(final ReadOnlyProperty<T> property) {
/*  90 */     if (property == null) {
/*  91 */       throw new NullPointerException("Property cannot be null");
/*     */     }
/*     */     
/*  94 */     return (property instanceof ReadOnlyFloatProperty) ? (ReadOnlyFloatProperty)property : 
/*  95 */       new ReadOnlyFloatPropertyBase()
/*     */       {
/*     */         private boolean valid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         private final InvalidationListener listener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public float get() {
/* 110 */           this.valid = true;
/* 111 */           Number number = (Number)property.getValue();
/* 112 */           return (number == null) ? 0.0F : number.floatValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public Object getBean() {
/* 117 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 122 */           return property.getName();
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
/*     */   public ReadOnlyObjectProperty<Float> asObject() {
/* 138 */     return new ReadOnlyObjectPropertyBase<Float>()
/*     */       {
/*     */         private boolean valid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         private final InvalidationListener listener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean() {
/* 154 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 159 */           return ReadOnlyFloatProperty.this.getName();
/*     */         }
/*     */ 
/*     */         
/*     */         public Float get() {
/* 164 */           this.valid = true;
/* 165 */           return ReadOnlyFloatProperty.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyFloatProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */