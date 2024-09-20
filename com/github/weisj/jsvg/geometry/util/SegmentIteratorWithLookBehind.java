/*     */ package com.github.weisj.jsvg.geometry.util;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import java.awt.geom.PathIterator;
/*     */ import java.util.ArrayList;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ public final class SegmentIteratorWithLookBehind
/*     */ {
/*     */   @NotNull
/*     */   private final PathIterator pathIterator;
/*     */   private float maxLookBehindLength;
/*  35 */   private float currentLookBehindLength = 0.0F;
/*     */   
/*  37 */   private final ArrayList<Segment> lookBehind = new ArrayList<>();
/*     */   
/*     */   private Segment currentSegment;
/*  40 */   private final float[] cords = new float[2];
/*     */   
/*     */   private float moveToX;
/*     */   private float moveToY;
/*  44 */   private int lookBehindCursor = -1;
/*     */ 
/*     */   
/*     */   public SegmentIteratorWithLookBehind(@NotNull PathIterator pathIterator, float maxLookBehindLength) {
/*  48 */     this.pathIterator = pathIterator;
/*  49 */     this.maxLookBehindLength = maxLookBehindLength;
/*  50 */     prepareFirstSegment();
/*     */   }
/*     */   
/*     */   private void prepareFirstSegment() {
/*  54 */     this.currentSegment = new Segment(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
/*     */ 
/*     */     
/*  57 */     moveToNext();
/*  58 */     if (Length.isUnspecified(this.currentSegment.xStart) || Length.isUnspecified(this.currentSegment.yStart)) {
/*  59 */       throw new IllegalStateException("Path iterator did not establish starting position");
/*     */     }
/*     */   }
/*     */   
/*     */   public void setMaxLookBehindLength(float maxLookBehindLength) {
/*  64 */     this.maxLookBehindLength = maxLookBehindLength;
/*  65 */     trimLookBehindIfNecessary();
/*     */   }
/*     */   
/*     */   public float maxLookBehindLength() {
/*  69 */     return this.maxLookBehindLength;
/*     */   }
/*     */   
/*     */   public boolean hasNext() {
/*  73 */     return (this.lookBehindCursor >= 0 || !this.pathIterator.isDone());
/*     */   }
/*     */   
/*     */   public boolean isDone() {
/*  77 */     return !hasNext();
/*     */   }
/*     */   
/*     */   public boolean hasPrevious() {
/*  81 */     return (this.lookBehindCursor < this.lookBehind.size() - 1);
/*     */   }
/*     */   @NotNull
/*     */   public Segment currentSegment() {
/*  85 */     if (this.lookBehindCursor >= 0) {
/*  86 */       return this.lookBehind.get(this.lookBehind.size() - 1 - this.lookBehindCursor);
/*     */     }
/*  88 */     return this.currentSegment;
/*     */   }
/*     */ 
/*     */   
/*     */   public void moveToPrevious() {
/*  93 */     if (!hasPrevious()) {
/*  94 */       throw new IllegalStateException("Can't move back anymore. Maximum capacity is " + this.maxLookBehindLength);
/*     */     }
/*  96 */     this.lookBehindCursor++;
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
/*     */   public void moveToNext() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield lookBehindCursor : I
/*     */     //   4: iflt -> 18
/*     */     //   7: aload_0
/*     */     //   8: dup
/*     */     //   9: getfield lookBehindCursor : I
/*     */     //   12: iconst_1
/*     */     //   13: isub
/*     */     //   14: putfield lookBehindCursor : I
/*     */     //   17: return
/*     */     //   18: new com/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind$Segment
/*     */     //   21: dup
/*     */     //   22: aload_0
/*     */     //   23: getfield currentSegment : Lcom/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind$Segment;
/*     */     //   26: getfield xEnd : F
/*     */     //   29: aload_0
/*     */     //   30: getfield currentSegment : Lcom/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind$Segment;
/*     */     //   33: getfield yEnd : F
/*     */     //   36: ldc NaN
/*     */     //   38: ldc NaN
/*     */     //   40: aconst_null
/*     */     //   41: invokespecial <init> : (FFFFLcom/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind$1;)V
/*     */     //   44: astore_1
/*     */     //   45: aload_0
/*     */     //   46: getfield pathIterator : Ljava/awt/geom/PathIterator;
/*     */     //   49: invokeinterface isDone : ()Z
/*     */     //   54: ifne -> 221
/*     */     //   57: aload_0
/*     */     //   58: getfield pathIterator : Ljava/awt/geom/PathIterator;
/*     */     //   61: aload_0
/*     */     //   62: getfield cords : [F
/*     */     //   65: invokeinterface currentSegment : ([F)I
/*     */     //   70: tableswitch default -> 211, 0 -> 104, 1 -> 179, 2 -> 211, 3 -> 211, 4 -> 151
/*     */     //   104: aload_1
/*     */     //   105: aload_0
/*     */     //   106: aload_0
/*     */     //   107: getfield cords : [F
/*     */     //   110: iconst_0
/*     */     //   111: faload
/*     */     //   112: dup_x1
/*     */     //   113: putfield moveToX : F
/*     */     //   116: putfield xStart : F
/*     */     //   119: aload_1
/*     */     //   120: aload_0
/*     */     //   121: aload_0
/*     */     //   122: getfield cords : [F
/*     */     //   125: iconst_1
/*     */     //   126: faload
/*     */     //   127: dup_x1
/*     */     //   128: putfield moveToY : F
/*     */     //   131: putfield yStart : F
/*     */     //   134: aload_1
/*     */     //   135: iconst_1
/*     */     //   136: putfield moveHappened : Z
/*     */     //   139: aload_0
/*     */     //   140: getfield pathIterator : Ljava/awt/geom/PathIterator;
/*     */     //   143: invokeinterface next : ()V
/*     */     //   148: goto -> 45
/*     */     //   151: aload_1
/*     */     //   152: aload_0
/*     */     //   153: getfield moveToX : F
/*     */     //   156: putfield xEnd : F
/*     */     //   159: aload_1
/*     */     //   160: aload_0
/*     */     //   161: getfield moveToY : F
/*     */     //   164: putfield yEnd : F
/*     */     //   167: aload_0
/*     */     //   168: getfield pathIterator : Ljava/awt/geom/PathIterator;
/*     */     //   171: invokeinterface next : ()V
/*     */     //   176: goto -> 221
/*     */     //   179: aload_1
/*     */     //   180: aload_0
/*     */     //   181: getfield cords : [F
/*     */     //   184: iconst_0
/*     */     //   185: faload
/*     */     //   186: putfield xEnd : F
/*     */     //   189: aload_1
/*     */     //   190: aload_0
/*     */     //   191: getfield cords : [F
/*     */     //   194: iconst_1
/*     */     //   195: faload
/*     */     //   196: putfield yEnd : F
/*     */     //   199: aload_0
/*     */     //   200: getfield pathIterator : Ljava/awt/geom/PathIterator;
/*     */     //   203: invokeinterface next : ()V
/*     */     //   208: goto -> 221
/*     */     //   211: new java/lang/IllegalStateException
/*     */     //   214: dup
/*     */     //   215: ldc 'Unsupported segment type'
/*     */     //   217: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   220: athrow
/*     */     //   221: aload_1
/*     */     //   222: getfield xEnd : F
/*     */     //   225: invokestatic isNaN : (F)Z
/*     */     //   228: ifne -> 241
/*     */     //   231: aload_1
/*     */     //   232: getfield yEnd : F
/*     */     //   235: invokestatic isNaN : (F)Z
/*     */     //   238: ifeq -> 257
/*     */     //   241: aload_1
/*     */     //   242: aload_1
/*     */     //   243: getfield xStart : F
/*     */     //   246: putfield xEnd : F
/*     */     //   249: aload_1
/*     */     //   250: aload_1
/*     */     //   251: getfield yStart : F
/*     */     //   254: putfield yEnd : F
/*     */     //   257: aload_0
/*     */     //   258: getfield maxLookBehindLength : F
/*     */     //   261: fconst_0
/*     */     //   262: fcmpl
/*     */     //   263: ifle -> 299
/*     */     //   266: aload_0
/*     */     //   267: getfield lookBehind : Ljava/util/ArrayList;
/*     */     //   270: aload_0
/*     */     //   271: getfield currentSegment : Lcom/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind$Segment;
/*     */     //   274: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   277: pop
/*     */     //   278: aload_0
/*     */     //   279: dup
/*     */     //   280: getfield currentLookBehindLength : F
/*     */     //   283: aload_0
/*     */     //   284: getfield currentSegment : Lcom/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind$Segment;
/*     */     //   287: invokevirtual length : ()D
/*     */     //   290: d2f
/*     */     //   291: fadd
/*     */     //   292: putfield currentLookBehindLength : F
/*     */     //   295: aload_0
/*     */     //   296: invokespecial trimLookBehindIfNecessary : ()V
/*     */     //   299: aload_0
/*     */     //   300: aload_1
/*     */     //   301: putfield currentSegment : Lcom/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind$Segment;
/*     */     //   304: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #100	-> 0
/*     */     //   #101	-> 7
/*     */     //   #102	-> 17
/*     */     //   #104	-> 18
/*     */     //   #108	-> 45
/*     */     //   #109	-> 57
/*     */     //   #111	-> 104
/*     */     //   #112	-> 119
/*     */     //   #113	-> 134
/*     */     //   #114	-> 139
/*     */     //   #115	-> 148
/*     */     //   #117	-> 151
/*     */     //   #118	-> 159
/*     */     //   #119	-> 167
/*     */     //   #120	-> 176
/*     */     //   #122	-> 179
/*     */     //   #123	-> 189
/*     */     //   #124	-> 199
/*     */     //   #125	-> 208
/*     */     //   #127	-> 211
/*     */     //   #130	-> 221
/*     */     //   #131	-> 241
/*     */     //   #132	-> 249
/*     */     //   #135	-> 257
/*     */     //   #136	-> 266
/*     */     //   #137	-> 278
/*     */     //   #139	-> 295
/*     */     //   #141	-> 299
/*     */     //   #142	-> 304
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	305	0	this	Lcom/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind;
/*     */     //   45	260	1	nextSegment	Lcom/github/weisj/jsvg/geometry/util/SegmentIteratorWithLookBehind$Segment;
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
/*     */   private void trimLookBehindIfNecessary() {
/* 145 */     while (GeometryUtil.notablyGreater(this.currentLookBehindLength, this.maxLookBehindLength)) {
/* 146 */       Segment segment = this.lookBehind.get(0);
/* 147 */       double segmentLength = segment.length();
/* 148 */       if (this.currentLookBehindLength - segmentLength < this.maxLookBehindLength)
/* 149 */         break;  this.currentLookBehindLength -= (float)segmentLength;
/* 150 */       this.lookBehind.remove(0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static final class Segment
/*     */   {
/*     */     public float xStart;
/*     */     public float yStart;
/*     */     public float xEnd;
/*     */     public float yEnd;
/*     */     public boolean moveHappened;
/*     */     
/*     */     private Segment(float xStart, float yStart, float xEnd, float yEnd) {
/* 163 */       this.xStart = xStart;
/* 164 */       this.yStart = yStart;
/* 165 */       this.xEnd = xEnd;
/* 166 */       this.yEnd = yEnd;
/*     */     }
/*     */     
/*     */     public double length() {
/* 170 */       return GeometryUtil.lineLength(this.xStart, this.yStart, this.xEnd, this.yEnd);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 175 */       return String.format("[%.2f,%.2f] -> [%.2f,%.2f] (moved: %b)", new Object[] { Float.valueOf(this.xStart), Float.valueOf(this.yStart), Float.valueOf(this.xEnd), Float.valueOf(this.yEnd), Boolean.valueOf(this.moveHappened) });
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometr\\util\SegmentIteratorWithLookBehind.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */