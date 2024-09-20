package org.bouncycastle.pqc.crypto.falcon;

class FalconKeyGen {
  FPREngine fpr = new FPREngine();
  
  FalconSmallPrimeList primes = new FalconSmallPrimeList();
  
  FalconFFT fft = new FalconFFT();
  
  FalconCodec codec = new FalconCodec();
  
  FalconVrfy vrfy = new FalconVrfy();
  
  private short[] REV10 = new short[] { 
      0, 512, 256, 768, 128, 640, 384, 896, 64, 576, 
      320, 832, 192, 704, 448, 960, 32, 544, 288, 800, 
      160, 672, 416, 928, 96, 608, 352, 864, 224, 736, 
      480, 992, 16, 528, 272, 784, 144, 656, 400, 912, 
      80, 592, 336, 848, 208, 720, 464, 976, 48, 560, 
      304, 816, 176, 688, 432, 944, 112, 624, 368, 880, 
      240, 752, 496, 1008, 8, 520, 264, 776, 136, 648, 
      392, 904, 72, 584, 328, 840, 200, 712, 456, 968, 
      40, 552, 296, 808, 168, 680, 424, 936, 104, 616, 
      360, 872, 232, 744, 488, 1000, 24, 536, 280, 792, 
      152, 664, 408, 920, 88, 600, 344, 856, 216, 728, 
      472, 984, 56, 568, 312, 824, 184, 696, 440, 952, 
      120, 632, 376, 888, 248, 760, 504, 1016, 4, 516, 
      260, 772, 132, 644, 388, 900, 68, 580, 324, 836, 
      196, 708, 452, 964, 36, 548, 292, 804, 164, 676, 
      420, 932, 100, 612, 356, 868, 228, 740, 484, 996, 
      20, 532, 276, 788, 148, 660, 404, 916, 84, 596, 
      340, 852, 212, 724, 468, 980, 52, 564, 308, 820, 
      180, 692, 436, 948, 116, 628, 372, 884, 244, 756, 
      500, 1012, 12, 524, 268, 780, 140, 652, 396, 908, 
      76, 588, 332, 844, 204, 716, 460, 972, 44, 556, 
      300, 812, 172, 684, 428, 940, 108, 620, 364, 876, 
      236, 748, 492, 1004, 28, 540, 284, 796, 156, 668, 
      412, 924, 92, 604, 348, 860, 220, 732, 476, 988, 
      60, 572, 316, 828, 188, 700, 444, 956, 124, 636, 
      380, 892, 252, 764, 508, 1020, 2, 514, 258, 770, 
      130, 642, 386, 898, 66, 578, 322, 834, 194, 706, 
      450, 962, 34, 546, 290, 802, 162, 674, 418, 930, 
      98, 610, 354, 866, 226, 738, 482, 994, 18, 530, 
      274, 786, 146, 658, 402, 914, 82, 594, 338, 850, 
      210, 722, 466, 978, 50, 562, 306, 818, 178, 690, 
      434, 946, 114, 626, 370, 882, 242, 754, 498, 1010, 
      10, 522, 266, 778, 138, 650, 394, 906, 74, 586, 
      330, 842, 202, 714, 458, 970, 42, 554, 298, 810, 
      170, 682, 426, 938, 106, 618, 362, 874, 234, 746, 
      490, 1002, 26, 538, 282, 794, 154, 666, 410, 922, 
      90, 602, 346, 858, 218, 730, 474, 986, 58, 570, 
      314, 826, 186, 698, 442, 954, 122, 634, 378, 890, 
      250, 762, 506, 1018, 6, 518, 262, 774, 134, 646, 
      390, 902, 70, 582, 326, 838, 198, 710, 454, 966, 
      38, 550, 294, 806, 166, 678, 422, 934, 102, 614, 
      358, 870, 230, 742, 486, 998, 22, 534, 278, 790, 
      150, 662, 406, 918, 86, 598, 342, 854, 214, 726, 
      470, 982, 54, 566, 310, 822, 182, 694, 438, 950, 
      118, 630, 374, 886, 246, 758, 502, 1014, 14, 526, 
      270, 782, 142, 654, 398, 910, 78, 590, 334, 846, 
      206, 718, 462, 974, 46, 558, 302, 814, 174, 686, 
      430, 942, 110, 622, 366, 878, 238, 750, 494, 1006, 
      30, 542, 286, 798, 158, 670, 414, 926, 94, 606, 
      350, 862, 222, 734, 478, 990, 62, 574, 318, 830, 
      190, 702, 446, 958, 126, 638, 382, 894, 254, 766, 
      510, 1022, 1, 513, 257, 769, 129, 641, 385, 897, 
      65, 577, 321, 833, 193, 705, 449, 961, 33, 545, 
      289, 801, 161, 673, 417, 929, 97, 609, 353, 865, 
      225, 737, 481, 993, 17, 529, 273, 785, 145, 657, 
      401, 913, 81, 593, 337, 849, 209, 721, 465, 977, 
      49, 561, 305, 817, 177, 689, 433, 945, 113, 625, 
      369, 881, 241, 753, 497, 1009, 9, 521, 265, 777, 
      137, 649, 393, 905, 73, 585, 329, 841, 201, 713, 
      457, 969, 41, 553, 297, 809, 169, 681, 425, 937, 
      105, 617, 361, 873, 233, 745, 489, 1001, 25, 537, 
      281, 793, 153, 665, 409, 921, 89, 601, 345, 857, 
      217, 729, 473, 985, 57, 569, 313, 825, 185, 697, 
      441, 953, 121, 633, 377, 889, 249, 761, 505, 1017, 
      5, 517, 261, 773, 133, 645, 389, 901, 69, 581, 
      325, 837, 197, 709, 453, 965, 37, 549, 293, 805, 
      165, 677, 421, 933, 101, 613, 357, 869, 229, 741, 
      485, 997, 21, 533, 277, 789, 149, 661, 405, 917, 
      85, 597, 341, 853, 213, 725, 469, 981, 53, 565, 
      309, 821, 181, 693, 437, 949, 117, 629, 373, 885, 
      245, 757, 501, 1013, 13, 525, 269, 781, 141, 653, 
      397, 909, 77, 589, 333, 845, 205, 717, 461, 973, 
      45, 557, 301, 813, 173, 685, 429, 941, 109, 621, 
      365, 877, 237, 749, 493, 1005, 29, 541, 285, 797, 
      157, 669, 413, 925, 93, 605, 349, 861, 221, 733, 
      477, 989, 61, 573, 317, 829, 189, 701, 445, 957, 
      125, 637, 381, 893, 253, 765, 509, 1021, 3, 515, 
      259, 771, 131, 643, 387, 899, 67, 579, 323, 835, 
      195, 707, 451, 963, 35, 547, 291, 803, 163, 675, 
      419, 931, 99, 611, 355, 867, 227, 739, 483, 995, 
      19, 531, 275, 787, 147, 659, 403, 915, 83, 595, 
      339, 851, 211, 723, 467, 979, 51, 563, 307, 819, 
      179, 691, 435, 947, 115, 627, 371, 883, 243, 755, 
      499, 1011, 11, 523, 267, 779, 139, 651, 395, 907, 
      75, 587, 331, 843, 203, 715, 459, 971, 43, 555, 
      299, 811, 171, 683, 427, 939, 107, 619, 363, 875, 
      235, 747, 491, 1003, 27, 539, 283, 795, 155, 667, 
      411, 923, 91, 603, 347, 859, 219, 731, 475, 987, 
      59, 571, 315, 827, 187, 699, 443, 955, 123, 635, 
      379, 891, 251, 763, 507, 1019, 7, 519, 263, 775, 
      135, 647, 391, 903, 71, 583, 327, 839, 199, 711, 
      455, 967, 39, 551, 295, 807, 167, 679, 423, 935, 
      103, 615, 359, 871, 231, 743, 487, 999, 23, 535, 
      279, 791, 151, 663, 407, 919, 87, 599, 343, 855, 
      215, 727, 471, 983, 55, 567, 311, 823, 183, 695, 
      439, 951, 119, 631, 375, 887, 247, 759, 503, 1015, 
      15, 527, 271, 783, 143, 655, 399, 911, 79, 591, 
      335, 847, 207, 719, 463, 975, 47, 559, 303, 815, 
      175, 687, 431, 943, 111, 623, 367, 879, 239, 751, 
      495, 1007, 31, 543, 287, 799, 159, 671, 415, 927, 
      95, 607, 351, 863, 223, 735, 479, 991, 63, 575, 
      319, 831, 191, 703, 447, 959, 127, 639, 383, 895, 
      255, 767, 511, 1023 };
  
  final long[] gauss_1024_12289 = new long[] { 
      1283868770400643928L, 6416574995475331444L, 4078260278032692663L, 2353523259288686585L, 1227179971273316331L, 575931623374121527L, 242543240509105209L, 91437049221049666L, 30799446349977173L, 9255276791179340L, 
      2478152334826140L, 590642893610164L, 125206034929641L, 23590435911403L, 3948334035941L, 586753615614L, 77391054539L, 9056793210L, 940121950L, 86539696L, 
      7062824L, 510971L, 32764L, 1862L, 94L, 4L, 0L };
  
  final int[] MAX_BL_SMALL = new int[] { 
      1, 1, 2, 2, 4, 7, 14, 27, 53, 106, 
      209 };
  
  final int[] MAX_BL_LARGE = new int[] { 2, 2, 5, 7, 12, 21, 40, 78, 157, 308 };
  
  final int[] bitlength_avg = new int[] { 
      4, 11, 24, 50, 102, 202, 401, 794, 1577, 3138, 
      6308 };
  
  final int[] bitlength_std = new int[] { 
      0, 1, 1, 1, 1, 2, 4, 5, 8, 13, 
      25 };
  
  final int DEPTH_INT_FG = 4;
  
  private static int mkn(int paramInt) {
    return 1 << paramInt;
  }
  
  int modp_set(int paramInt1, int paramInt2) {
    int i = paramInt1;
    i += paramInt2 & -(i >>> 31);
    return i;
  }
  
  int modp_norm(int paramInt1, int paramInt2) {
    return paramInt1 - (paramInt2 & (paramInt1 - (paramInt2 + 1 >>> 1) >>> 31) - 1);
  }
  
  int modp_ninv31(int paramInt) {
    int i = 2 - paramInt;
    i *= 2 - paramInt * i;
    i *= 2 - paramInt * i;
    i *= 2 - paramInt * i;
    i *= 2 - paramInt * i;
    return Integer.MAX_VALUE & -i;
  }
  
  int modp_R(int paramInt) {
    return Integer.MIN_VALUE - paramInt;
  }
  
  int modp_add(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 + paramInt2 - paramInt3;
    i += paramInt3 & -(i >>> 31);
    return i;
  }
  
  int modp_sub(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1 - paramInt2;
    i += paramInt3 & -(i >>> 31);
    return i;
  }
  
  int modp_montymul(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    long l1 = toUnsignedLong(paramInt1) * toUnsignedLong(paramInt2);
    long l2 = (l1 * paramInt4 & toUnsignedLong(2147483647)) * paramInt3;
    int i = (int)(l1 + l2 >>> 31L) - paramInt3;
    i += paramInt3 & -(i >>> 31);
    return i;
  }
  
  int modp_R2(int paramInt1, int paramInt2) {
    null = modp_R(paramInt1);
    null = modp_add(null, null, paramInt1);
    null = modp_montymul(null, null, paramInt1, paramInt2);
    null = modp_montymul(null, null, paramInt1, paramInt2);
    null = modp_montymul(null, null, paramInt1, paramInt2);
    null = modp_montymul(null, null, paramInt1, paramInt2);
    null = modp_montymul(null, null, paramInt1, paramInt2);
    return null + (paramInt1 & -(null & 0x1)) >>> 1;
  }
  
  int modp_Rx(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1--;
    int i = paramInt4;
    int j = modp_R(paramInt2);
    for (byte b = 0; 1 << b <= paramInt1; b++) {
      if ((paramInt1 & 1 << b) != 0)
        j = modp_montymul(j, i, paramInt2, paramInt3); 
      i = modp_montymul(i, i, paramInt2, paramInt3);
    } 
    return j;
  }
  
  int modp_div(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int j = paramInt3 - 2;
    int i = paramInt5;
    for (byte b = 30; b >= 0; b--) {
      i = modp_montymul(i, i, paramInt3, paramInt4);
      int k = modp_montymul(i, paramInt2, paramInt3, paramInt4);
      i ^= (i ^ k) & -(j >>> b & 0x1);
    } 
    i = modp_montymul(i, 1, paramInt3, paramInt4);
    return modp_montymul(paramInt1, i, paramInt3, paramInt4);
  }
  
  void modp_mkgm2(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i = mkn(paramInt3);
    int i1 = modp_R2(paramInt5, paramInt6);
    paramInt4 = modp_montymul(paramInt4, i1, paramInt5, paramInt6);
    int j;
    for (j = paramInt3; j < 10; j++)
      paramInt4 = modp_montymul(paramInt4, paramInt4, paramInt5, paramInt6); 
    int k = modp_div(i1, paramInt4, paramInt5, paramInt6, modp_R(paramInt5));
    j = 10 - paramInt3;
    int n = modp_R(paramInt5);
    int m = n;
    for (byte b = 0; b < i; b++) {
      short s = this.REV10[b << j];
      paramArrayOfint1[paramInt1 + s] = m;
      paramArrayOfint2[paramInt2 + s] = n;
      m = modp_montymul(m, paramInt4, paramInt5, paramInt6);
      n = modp_montymul(n, k, paramInt5, paramInt6);
    } 
  }
  
  void modp_NTT2_ext(int[] paramArrayOfint1, int paramInt1, int paramInt2, int[] paramArrayOfint2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt4 == 0)
      return; 
    int k = mkn(paramInt4);
    int i = k;
    int j;
    for (j = 1; j < k; j <<= 1) {
      int m = i >> 1;
      byte b = 0;
      int n;
      for (n = 0; b < j; n += i) {
        int i1 = paramArrayOfint2[paramInt3 + j + b];
        int i2 = paramInt1 + n * paramInt2;
        int i3 = i2 + m * paramInt2;
        byte b1 = 0;
        while (b1 < m) {
          int i4 = paramArrayOfint1[i2];
          int i5 = modp_montymul(paramArrayOfint1[i3], i1, paramInt5, paramInt6);
          paramArrayOfint1[i2] = modp_add(i4, i5, paramInt5);
          paramArrayOfint1[i3] = modp_sub(i4, i5, paramInt5);
          b1++;
          i2 += paramInt2;
          i3 += paramInt2;
        } 
        b++;
      } 
      i = m;
    } 
  }
  
  void modp_iNTT2_ext(int[] paramArrayOfint1, int paramInt1, int paramInt2, int[] paramArrayOfint2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt4 == 0)
      return; 
    int k = mkn(paramInt4);
    int i = 1;
    int j;
    for (j = k; j > 1; j >>= 1) {
      int i1 = j >> 1;
      int i2 = i << 1;
      byte b1 = 0;
      int i3;
      for (i3 = 0; b1 < i1; i3 += i2) {
        int i4 = paramArrayOfint2[paramInt3 + i1 + b1];
        int i5 = paramInt1 + i3 * paramInt2;
        int i6 = i5 + i * paramInt2;
        byte b2 = 0;
        while (b2 < i) {
          int i7 = paramArrayOfint1[i5];
          int i8 = paramArrayOfint1[i6];
          paramArrayOfint1[i5] = modp_add(i7, i8, paramInt5);
          paramArrayOfint1[i6] = modp_montymul(modp_sub(i7, i8, paramInt5), i4, paramInt5, paramInt6);
          b2++;
          i5 += paramInt2;
          i6 += paramInt2;
        } 
        b1++;
      } 
      i = i2;
    } 
    int m = 1 << 31 - paramInt4;
    byte b = 0;
    int n;
    for (n = paramInt1; b < k; n += paramInt2) {
      paramArrayOfint1[n] = modp_montymul(paramArrayOfint1[n], m, paramInt5, paramInt6);
      b++;
    } 
  }
  
  void modp_NTT2(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    modp_NTT2_ext(paramArrayOfint1, paramInt1, 1, paramArrayOfint2, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  void modp_iNTT2(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    modp_iNTT2_ext(paramArrayOfint1, paramInt1, 1, paramArrayOfint2, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  void modp_poly_rec_res(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = 1 << paramInt2 - 1;
    for (byte b = 0; b < i; b++) {
      int j = paramArrayOfint[paramInt1 + (b << 1) + 0];
      int k = paramArrayOfint[paramInt1 + (b << 1) + 1];
      paramArrayOfint[paramInt1 + b] = modp_montymul(modp_montymul(j, k, paramInt3, paramInt4), paramInt5, paramInt3, paramInt4);
    } 
  }
  
  int zint_sub(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int paramInt3, int paramInt4) {
    int i = 0;
    int j = -paramInt4;
    for (byte b = 0; b < paramInt3; b++) {
      int k = paramArrayOfint1[paramInt1 + b];
      int m = k - paramArrayOfint2[paramInt2 + b] - i;
      i = m >>> 31;
      k ^= (m & Integer.MAX_VALUE ^ k) & j;
      paramArrayOfint1[paramInt1 + b] = k;
    } 
    return i;
  }
  
  int zint_mul_small(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    for (byte b = 0; b < paramInt2; b++) {
      long l = toUnsignedLong(paramArrayOfint[paramInt1 + b]) * toUnsignedLong(paramInt3) + i;
      paramArrayOfint[paramInt1 + b] = (int)l & Integer.MAX_VALUE;
      i = (int)(l >> 31L);
    } 
    return i;
  }
  
  int zint_mod_small_unsigned(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = 0;
    int j = paramInt2;
    while (j-- > 0) {
      i = modp_montymul(i, paramInt5, paramInt3, paramInt4);
      int k = paramArrayOfint[paramInt1 + j] - paramInt3;
      k += paramInt3 & -(k >>> 31);
      i = modp_add(i, k, paramInt3);
    } 
    return i;
  }
  
  int zint_mod_small_signed(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt2 == 0)
      return 0; 
    null = zint_mod_small_unsigned(paramArrayOfint, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    return modp_sub(null, paramInt6 & -(paramArrayOfint[paramInt1 + paramInt2 - 1] >>> 30), paramInt3);
  }
  
  void zint_add_mul_small(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int paramInt3, int paramInt4) {
    int i = 0;
    for (byte b = 0; b < paramInt3; b++) {
      int j = paramArrayOfint1[paramInt1 + b];
      int k = paramArrayOfint2[paramInt2 + b];
      long l = toUnsignedLong(k) * toUnsignedLong(paramInt4) + toUnsignedLong(j) + toUnsignedLong(i);
      paramArrayOfint1[paramInt1 + b] = (int)l & Integer.MAX_VALUE;
      i = (int)(l >>> 31L);
    } 
    paramArrayOfint1[paramInt1 + paramInt3] = i;
  }
  
  void zint_norm_zero(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int paramInt3) {
    int j = 0;
    int k = 0;
    int i = paramInt3;
    while (i-- > 0) {
      int m = paramArrayOfint1[paramInt1 + i];
      int n = paramArrayOfint2[paramInt2 + i] >>> 1 | k << 30;
      k = paramArrayOfint2[paramInt2 + i] & 0x1;
      int i1 = n - m;
      i1 = -i1 >>> 31 | -(i1 >>> 31);
      j |= i1 & (j & 0x1) - 1;
    } 
    zint_sub(paramArrayOfint1, paramInt1, paramArrayOfint2, paramInt2, paramInt3, j >>> 31);
  }
  
  void zint_rebuild_CRT(int[] paramArrayOfint1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, FalconSmallPrime[] paramArrayOfFalconSmallPrime, int paramInt5, int[] paramArrayOfint2, int paramInt6) {
    paramArrayOfint2[paramInt6 + 0] = (paramArrayOfFalconSmallPrime[0]).p;
    byte b;
    for (b = 1; b < paramInt2; b++) {
      int j = (paramArrayOfFalconSmallPrime[b]).p;
      int m = (paramArrayOfFalconSmallPrime[b]).s;
      int k = modp_ninv31(j);
      int n = modp_R2(j, k);
      byte b1 = 0;
      int i;
      for (i = paramInt1; b1 < paramInt4; i += paramInt3) {
        int i1 = paramArrayOfint1[i + b];
        int i2 = zint_mod_small_unsigned(paramArrayOfint1, i, b, j, k, n);
        int i3 = modp_montymul(m, modp_sub(i1, i2, j), j, k);
        zint_add_mul_small(paramArrayOfint1, i, paramArrayOfint2, paramInt6, b, i3);
        b1++;
      } 
      paramArrayOfint2[paramInt6 + b] = zint_mul_small(paramArrayOfint2, paramInt6, b, j);
    } 
    if (paramInt5 != 0) {
      b = 0;
      int i;
      for (i = paramInt1; b < paramInt4; i += paramInt3) {
        zint_norm_zero(paramArrayOfint1, i, paramArrayOfint2, paramInt6, paramInt2);
        b++;
      } 
    } 
  }
  
  void zint_negate(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt3;
    int j = -paramInt3 >>> 1;
    for (byte b = 0; b < paramInt2; b++) {
      int k = paramArrayOfint[paramInt1 + b];
      k = (k ^ j) + i;
      paramArrayOfint[paramInt1 + b] = k & Integer.MAX_VALUE;
      i = k >>> 31;
    } 
  }
  
  int zint_co_reduce(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int paramInt3, long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
    long l1 = 0L;
    long l2 = 0L;
    for (byte b = 0; b < paramInt3; b++) {
      int k = paramArrayOfint1[paramInt1 + b];
      int m = paramArrayOfint2[paramInt2 + b];
      long l3 = k * paramLong1 + m * paramLong2 + l1;
      long l4 = k * paramLong3 + m * paramLong4 + l2;
      if (b > 0) {
        paramArrayOfint1[paramInt1 + b - 1] = (int)l3 & Integer.MAX_VALUE;
        paramArrayOfint2[paramInt2 + b - 1] = (int)l4 & Integer.MAX_VALUE;
      } 
      l1 = l3 >> 31L;
      l2 = l4 >> 31L;
    } 
    paramArrayOfint1[paramInt1 + paramInt3 - 1] = (int)l1;
    paramArrayOfint2[paramInt2 + paramInt3 - 1] = (int)l2;
    int i = (int)(l1 >>> 63L);
    int j = (int)(l2 >>> 63L);
    zint_negate(paramArrayOfint1, paramInt1, paramInt3, i);
    zint_negate(paramArrayOfint2, paramInt2, paramInt3, j);
    return i | j << 1;
  }
  
  void zint_finish_mod(int[] paramArrayOfint1, int paramInt1, int paramInt2, int[] paramArrayOfint2, int paramInt3, int paramInt4) {
    int i = 0;
    byte b;
    for (b = 0; b < paramInt2; b++)
      i = paramArrayOfint1[paramInt1 + b] - paramArrayOfint2[paramInt3 + b] - i >>> 31; 
    int j = -paramInt4 >>> 1;
    int k = -(paramInt4 | 1 - i);
    i = paramInt4;
    for (b = 0; b < paramInt2; b++) {
      int m = paramArrayOfint1[paramInt1 + b];
      int n = (paramArrayOfint2[paramInt3 + b] ^ j) & k;
      m = m - n - i;
      paramArrayOfint1[paramInt1 + b] = m & Integer.MAX_VALUE;
      i = m >>> 31;
    } 
  }
  
  void zint_co_reduce_mod(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int[] paramArrayOfint3, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2, long paramLong3, long paramLong4) {
    long l1 = 0L;
    long l2 = 0L;
    int i = (paramArrayOfint1[paramInt1 + 0] * (int)paramLong1 + paramArrayOfint2[paramInt2 + 0] * (int)paramLong2) * paramInt5 & Integer.MAX_VALUE;
    int j = (paramArrayOfint1[paramInt1 + 0] * (int)paramLong3 + paramArrayOfint2[paramInt2 + 0] * (int)paramLong4) * paramInt5 & Integer.MAX_VALUE;
    for (byte b = 0; b < paramInt4; b++) {
      int k = paramArrayOfint1[paramInt1 + b];
      int m = paramArrayOfint2[paramInt2 + b];
      long l3 = k * paramLong1 + m * paramLong2 + paramArrayOfint3[paramInt3 + b] * toUnsignedLong(i) + l1;
      long l4 = k * paramLong3 + m * paramLong4 + paramArrayOfint3[paramInt3 + b] * toUnsignedLong(j) + l2;
      if (b > 0) {
        paramArrayOfint1[paramInt1 + b - 1] = (int)l3 & Integer.MAX_VALUE;
        paramArrayOfint2[paramInt2 + b - 1] = (int)l4 & Integer.MAX_VALUE;
      } 
      l1 = l3 >> 31L;
      l2 = l4 >> 31L;
    } 
    paramArrayOfint1[paramInt1 + paramInt4 - 1] = (int)l1;
    paramArrayOfint2[paramInt2 + paramInt4 - 1] = (int)l2;
    zint_finish_mod(paramArrayOfint1, paramInt1, paramInt4, paramArrayOfint3, paramInt3, (int)(l1 >>> 63L));
    zint_finish_mod(paramArrayOfint2, paramInt2, paramInt4, paramArrayOfint3, paramInt3, (int)(l2 >>> 63L));
  }
  
  int zint_bezout(int[] paramArrayOfint1, int paramInt1, int[] paramArrayOfint2, int paramInt2, int[] paramArrayOfint3, int paramInt3, int[] paramArrayOfint4, int paramInt4, int paramInt5, int[] paramArrayOfint5, int paramInt6) {
    if (paramInt5 == 0)
      return 0; 
    int i = paramInt1;
    int k = paramInt2;
    int j = paramInt6;
    int m = j + paramInt5;
    int n = m + paramInt5;
    int i1 = n + paramInt5;
    int i2 = modp_ninv31(paramArrayOfint3[paramInt3 + 0]);
    int i3 = modp_ninv31(paramArrayOfint4[paramInt4 + 0]);
    System.arraycopy(paramArrayOfint3, paramInt3, paramArrayOfint5, n, paramInt5);
    System.arraycopy(paramArrayOfint4, paramInt4, paramArrayOfint5, i1, paramInt5);
    paramArrayOfint1[i + 0] = 1;
    paramArrayOfint2[k + 0] = 0;
    int i6;
    for (i6 = 1; i6 < paramInt5; i6++) {
      paramArrayOfint1[i + i6] = 0;
      paramArrayOfint2[k + i6] = 0;
    } 
    System.arraycopy(paramArrayOfint4, paramInt4, paramArrayOfint5, j, paramInt5);
    System.arraycopy(paramArrayOfint3, paramInt3, paramArrayOfint5, m, paramInt5);
    paramArrayOfint5[m + 0] = paramArrayOfint5[m + 0] - 1;
    for (int i4 = 62 * paramInt5 + 30; i4 >= 30; i4 -= 30) {
      i6 = -1;
      int i8 = -1;
      int i9 = 0;
      int i10 = 0;
      int i11 = 0;
      int i12 = 0;
      int i7 = paramInt5;
      while (i7-- > 0) {
        int i16 = paramArrayOfint5[n + i7];
        int i17 = paramArrayOfint5[i1 + i7];
        i9 ^= (i9 ^ i16) & i6;
        i10 ^= (i10 ^ i16) & i8;
        i11 ^= (i11 ^ i17) & i6;
        i12 ^= (i12 ^ i17) & i8;
        i8 = i6;
        i6 &= ((i16 | i17) + Integer.MAX_VALUE >>> 31) - 1;
      } 
      i10 |= i9 & i8;
      i9 &= i8 ^ 0xFFFFFFFF;
      i12 |= i11 & i8;
      i11 &= i8 ^ 0xFFFFFFFF;
      long l1 = (toUnsignedLong(i9) << 31L) + toUnsignedLong(i10);
      long l2 = (toUnsignedLong(i11) << 31L) + toUnsignedLong(i12);
      int i13 = paramArrayOfint5[n + 0];
      int i14 = paramArrayOfint5[i1 + 0];
      long l3 = 1L;
      long l4 = 0L;
      long l5 = 0L;
      long l6 = 1L;
      for (byte b1 = 0; b1 < 31; b1++) {
        long l = l2 - l1;
        int i16 = (int)((l ^ (l1 ^ l2) & (l1 ^ l)) >>> 63L);
        int i17 = i13 >> b1 & 0x1;
        int i18 = i14 >> b1 & 0x1;
        int i19 = i17 & i18 & i16;
        int i20 = i17 & i18 & (i16 ^ 0xFFFFFFFF);
        int i21 = i19 | i17 ^ 0x1;
        i13 -= i14 & -i19;
        l1 -= l2 & -toUnsignedLong(i19);
        l3 -= l5 & -(i19);
        l4 -= l6 & -(i19);
        i14 -= i13 & -i20;
        l2 -= l1 & -toUnsignedLong(i20);
        l5 -= l3 & -(i20);
        l6 -= l4 & -(i20);
        i13 += i13 & i21 - 1;
        l3 += l3 & i21 - 1L;
        l4 += l4 & i21 - 1L;
        l1 ^= (l1 ^ l1 >> 1L) & -toUnsignedLong(i21);
        i14 += i14 & -i21;
        l5 += l5 & -(i21);
        l6 += l6 & -(i21);
        l2 ^= (l2 ^ l2 >> 1L) & toUnsignedLong(i21) - 1L;
      } 
      int i15 = zint_co_reduce(paramArrayOfint5, n, paramArrayOfint5, i1, paramInt5, l3, l4, l5, l6);
      l3 -= l3 + l3 & -((i15 & 0x1));
      l4 -= l4 + l4 & -((i15 & 0x1));
      l5 -= l5 + l5 & -((i15 >>> 1));
      l6 -= l6 + l6 & -((i15 >>> 1));
      zint_co_reduce_mod(paramArrayOfint1, i, paramArrayOfint5, j, paramArrayOfint4, paramInt4, paramInt5, i3, l3, l4, l5, l6);
      zint_co_reduce_mod(paramArrayOfint2, k, paramArrayOfint5, m, paramArrayOfint3, paramInt3, paramInt5, i2, l3, l4, l5, l6);
    } 
    int i5 = paramArrayOfint5[n + 0] ^ 0x1;
    for (byte b = 1; b < paramInt5; b++)
      i5 |= paramArrayOfint5[n + b]; 
    return 1 - ((i5 | -i5) >>> 31) & paramArrayOfint3[paramInt3 + 0] & paramArrayOfint4[paramInt4 + 0];
  }
  
  void zint_add_scaled_mul_small(int[] paramArrayOfint1, int paramInt1, int paramInt2, int[] paramArrayOfint2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    if (paramInt4 == 0)
      return; 
    int j = -(paramArrayOfint2[paramInt3 + paramInt4 - 1] >>> 30) >>> 1;
    int k = 0;
    int m = 0;
    for (int i = paramInt6; i < paramInt2; i++) {
      int n = i - paramInt6;
      int i1 = (n < paramInt4) ? paramArrayOfint2[paramInt3 + n] : j;
      int i2 = i1 << paramInt7 & Integer.MAX_VALUE | k;
      k = i1 >>> 31 - paramInt7;
      long l = toUnsignedLong(i2) * paramInt5 + toUnsignedLong(paramArrayOfint1[paramInt1 + i]) + m;
      paramArrayOfint1[paramInt1 + i] = (int)l & Integer.MAX_VALUE;
      int i3 = (int)(l >>> 31L);
      m = i3;
    } 
  }
  
  void zint_sub_scaled(int[] paramArrayOfint1, int paramInt1, int paramInt2, int[] paramArrayOfint2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    if (paramInt4 == 0)
      return; 
    int j = -(paramArrayOfint2[paramInt3 + paramInt4 - 1] >>> 30) >>> 1;
    int k = 0;
    int m = 0;
    for (int i = paramInt5; i < paramInt2; i++) {
      int n = i - paramInt5;
      int i2 = (n < paramInt4) ? paramArrayOfint2[paramInt3 + n] : j;
      int i3 = i2 << paramInt6 & Integer.MAX_VALUE | k;
      k = i2 >>> 31 - paramInt6;
      int i1 = paramArrayOfint1[paramInt1 + i] - i3 - m;
      paramArrayOfint1[paramInt1 + i] = i1 & Integer.MAX_VALUE;
      m = i1 >>> 31;
    } 
  }
  
  int zint_one_to_plain(int[] paramArrayOfint, int paramInt) {
    int i = paramArrayOfint[paramInt + 0];
    i |= (i & 0x40000000) << 1;
    return i;
  }
  
  void poly_big_to_fp(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = mkn(paramInt5);
    if (paramInt3 == 0) {
      for (byte b1 = 0; b1 < i; b1++)
        paramArrayOfFalconFPR[paramInt1 + b1] = this.fpr.fpr_zero; 
      return;
    } 
    byte b = 0;
    while (b < i) {
      int j = -(paramArrayOfint[paramInt2 + paramInt3 - 1] >>> 30);
      int m = j >>> 1;
      int k = j & 0x1;
      FalconFPR falconFPR1 = this.fpr.fpr_zero;
      FalconFPR falconFPR2 = this.fpr.fpr_one;
      byte b1 = 0;
      while (b1 < paramInt3) {
        int n = (paramArrayOfint[paramInt2 + b1] ^ m) + k;
        k = n >>> 31;
        n &= Integer.MAX_VALUE;
        n -= n << 1 & j;
        falconFPR1 = this.fpr.fpr_add(falconFPR1, this.fpr.fpr_mul(this.fpr.fpr_of(n), falconFPR2));
        b1++;
        falconFPR2 = this.fpr.fpr_mul(falconFPR2, this.fpr.fpr_ptwo31);
      } 
      paramArrayOfFalconFPR[paramInt1 + b] = falconFPR1;
      b++;
      paramInt2 += paramInt4;
    } 
  }
  
  int poly_big_to_small(byte[] paramArrayOfbyte, int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3, int paramInt4) {
    int i = mkn(paramInt4);
    for (byte b = 0; b < i; b++) {
      int j = zint_one_to_plain(paramArrayOfint, paramInt2 + b);
      if (j < -paramInt3 || j > paramInt3)
        return 0; 
      paramArrayOfbyte[paramInt1 + b] = (byte)j;
    } 
    return 1;
  }
  
  void poly_sub_scaled(int[] paramArrayOfint1, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint2, int paramInt4, int paramInt5, int paramInt6, int[] paramArrayOfint3, int paramInt7, int paramInt8, int paramInt9, int paramInt10) {
    int i = mkn(paramInt10);
    for (byte b = 0; b < i; b++) {
      int j = -paramArrayOfint3[paramInt7 + b];
      int k = paramInt1 + b * paramInt3;
      int m = paramInt4;
      for (byte b1 = 0; b1 < i; b1++) {
        zint_add_scaled_mul_small(paramArrayOfint1, k, paramInt2, paramArrayOfint2, m, paramInt5, j, paramInt8, paramInt9);
        if (b + b1 == i - 1) {
          k = paramInt1;
          j = -j;
        } else {
          k += paramInt3;
        } 
        m += paramInt6;
      } 
    } 
  }
  
  void poly_sub_scaled_ntt(int[] paramArrayOfint1, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint2, int paramInt4, int paramInt5, int paramInt6, int[] paramArrayOfint3, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int[] paramArrayOfint4, int paramInt11) {
    int i2 = mkn(paramInt10);
    int i3 = paramInt5 + 1;
    int i = paramInt11;
    int j = i + mkn(paramInt10);
    int k = j + mkn(paramInt10);
    int m = k + i2 * i3;
    FalconSmallPrime[] arrayOfFalconSmallPrime = FalconSmallPrimeList.PRIMES;
    byte b;
    for (b = 0; b < i3; b++) {
      int i6 = (arrayOfFalconSmallPrime[b]).p;
      int i7 = modp_ninv31(i6);
      int i8 = modp_R2(i6, i7);
      int i9 = modp_Rx(paramInt5, i6, i7, i8);
      modp_mkgm2(paramArrayOfint4, i, paramArrayOfint4, j, paramInt10, (arrayOfFalconSmallPrime[b]).g, i6, i7);
      byte b1;
      for (b1 = 0; b1 < i2; b1++)
        paramArrayOfint4[m + b1] = modp_set(paramArrayOfint3[paramInt7 + b1], i6); 
      modp_NTT2(paramArrayOfint4, m, paramArrayOfint4, i, paramInt10, i6, i7);
      b1 = 0;
      int i5 = paramInt4;
      int i4;
      for (i4 = k + b; b1 < i2; i4 += i3) {
        paramArrayOfint4[i4] = zint_mod_small_signed(paramArrayOfint2, i5, paramInt5, i6, i7, i8, i9);
        b1++;
        i5 += paramInt6;
      } 
      modp_NTT2_ext(paramArrayOfint4, k + b, i3, paramArrayOfint4, i, paramInt10, i6, i7);
      b1 = 0;
      for (i4 = k + b; b1 < i2; i4 += i3) {
        paramArrayOfint4[i4] = modp_montymul(modp_montymul(paramArrayOfint4[m + b1], paramArrayOfint4[i4], i6, i7), i8, i6, i7);
        b1++;
      } 
      modp_iNTT2_ext(paramArrayOfint4, k + b, i3, paramArrayOfint4, j, paramInt10, i6, i7);
    } 
    zint_rebuild_CRT(paramArrayOfint4, k, i3, i3, i2, arrayOfFalconSmallPrime, 1, paramArrayOfint4, m);
    b = 0;
    int n = paramInt1;
    int i1;
    for (i1 = k; b < i2; i1 += i3) {
      zint_sub_scaled(paramArrayOfint1, n, paramInt2, paramArrayOfint4, i1, i3, paramInt8, paramInt9);
      b++;
      n += paramInt3;
    } 
  }
  
  long get_rng_u64(SHAKE256 paramSHAKE256) {
    byte[] arrayOfByte = new byte[8];
    paramSHAKE256.inner_shake256_extract(arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte[0] & 0xFFL | (arrayOfByte[1] & 0xFFL) << 8L | (arrayOfByte[2] & 0xFFL) << 16L | (arrayOfByte[3] & 0xFFL) << 24L | (arrayOfByte[4] & 0xFFL) << 32L | (arrayOfByte[5] & 0xFFL) << 40L | (arrayOfByte[6] & 0xFFL) << 48L | (arrayOfByte[7] & 0xFFL) << 56L;
  }
  
  int mkgauss(SHAKE256 paramSHAKE256, int paramInt) {
    int i = 1 << 10 - paramInt;
    int j = 0;
    for (byte b = 0; b < i; b++) {
      long l = get_rng_u64(paramSHAKE256);
      int n = (int)(l >>> 63L);
      l &= Long.MAX_VALUE;
      int k = (int)(l - this.gauss_1024_12289[0] >>> 63L);
      int m = 0;
      l = get_rng_u64(paramSHAKE256);
      l &= Long.MAX_VALUE;
      for (byte b1 = 1; b1 < this.gauss_1024_12289.length; b1++) {
        int i1 = (int)(l - this.gauss_1024_12289[b1] >>> 63L) ^ 0x1;
        m |= b1 & -(i1 & (k ^ 0x1));
        k |= i1;
      } 
      m = (m ^ -n) + n;
      j += m;
    } 
    return j;
  }
  
  int poly_small_sqnorm(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = mkn(paramInt2);
    int j = 0;
    int k = 0;
    for (byte b = 0; b < i; b++) {
      byte b1 = paramArrayOfbyte[paramInt1 + b];
      j += b1 * b1;
      k |= j;
    } 
    return j | -(k >>> 31);
  }
  
  void poly_small_to_fp(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    int i = mkn(paramInt3);
    for (byte b = 0; b < i; b++)
      paramArrayOfFalconFPR[paramInt1 + b] = this.fpr.fpr_of(paramArrayOfbyte[paramInt2 + b]); 
  }
  
  void make_fg_step(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int i = 1 << paramInt2;
    int j = i >> 1;
    int m = this.MAX_BL_SMALL[paramInt3];
    int n = this.MAX_BL_SMALL[paramInt3 + 1];
    FalconSmallPrime[] arrayOfFalconSmallPrime = FalconSmallPrimeList.PRIMES;
    int i1 = paramInt1;
    int i2 = i1 + j * n;
    int i3 = i2 + j * n;
    int i4 = i3 + i * m;
    int i5 = i4 + i * m;
    int i6 = i5 + i;
    int i7 = i6 + i;
    System.arraycopy(paramArrayOfint, paramInt1, paramArrayOfint, i3, 2 * i * m);
    int k;
    for (k = 0; k < m; k++) {
      int i8 = (arrayOfFalconSmallPrime[k]).p;
      int i9 = modp_ninv31(i8);
      int i10 = modp_R2(i8, i9);
      modp_mkgm2(paramArrayOfint, i5, paramArrayOfint, i6, paramInt2, (arrayOfFalconSmallPrime[k]).g, i8, i9);
      byte b = 0;
      int i11;
      for (i11 = i3 + k; b < i; i11 += m) {
        paramArrayOfint[i7 + b] = paramArrayOfint[i11];
        b++;
      } 
      if (paramInt4 == 0)
        modp_NTT2(paramArrayOfint, i7, paramArrayOfint, i5, paramInt2, i8, i9); 
      b = 0;
      for (i11 = i1 + k; b < j; i11 += n) {
        int i12 = paramArrayOfint[i7 + (b << 1) + 0];
        int i13 = paramArrayOfint[i7 + (b << 1) + 1];
        paramArrayOfint[i11] = modp_montymul(modp_montymul(i12, i13, i8, i9), i10, i8, i9);
        b++;
      } 
      if (paramInt4 != 0)
        modp_iNTT2_ext(paramArrayOfint, i3 + k, m, paramArrayOfint, i6, paramInt2, i8, i9); 
      b = 0;
      for (i11 = i4 + k; b < i; i11 += m) {
        paramArrayOfint[i7 + b] = paramArrayOfint[i11];
        b++;
      } 
      if (paramInt4 == 0)
        modp_NTT2(paramArrayOfint, i7, paramArrayOfint, i5, paramInt2, i8, i9); 
      b = 0;
      for (i11 = i2 + k; b < j; i11 += n) {
        int i12 = paramArrayOfint[i7 + (b << 1) + 0];
        int i13 = paramArrayOfint[i7 + (b << 1) + 1];
        paramArrayOfint[i11] = modp_montymul(modp_montymul(i12, i13, i8, i9), i10, i8, i9);
        b++;
      } 
      if (paramInt4 != 0)
        modp_iNTT2_ext(paramArrayOfint, i4 + k, m, paramArrayOfint, i6, paramInt2, i8, i9); 
      if (paramInt5 == 0) {
        modp_iNTT2_ext(paramArrayOfint, i1 + k, n, paramArrayOfint, i6, paramInt2 - 1, i8, i9);
        modp_iNTT2_ext(paramArrayOfint, i2 + k, n, paramArrayOfint, i6, paramInt2 - 1, i8, i9);
      } 
    } 
    zint_rebuild_CRT(paramArrayOfint, i3, m, m, i, arrayOfFalconSmallPrime, 1, paramArrayOfint, i5);
    zint_rebuild_CRT(paramArrayOfint, i4, m, m, i, arrayOfFalconSmallPrime, 1, paramArrayOfint, i5);
    for (k = m; k < n; k++) {
      int i8 = (arrayOfFalconSmallPrime[k]).p;
      int i9 = modp_ninv31(i8);
      int i10 = modp_R2(i8, i9);
      int i11 = modp_Rx(m, i8, i9, i10);
      modp_mkgm2(paramArrayOfint, i5, paramArrayOfint, i6, paramInt2, (arrayOfFalconSmallPrime[k]).g, i8, i9);
      byte b = 0;
      int i12;
      for (i12 = i3; b < i; i12 += m) {
        paramArrayOfint[i7 + b] = zint_mod_small_signed(paramArrayOfint, i12, m, i8, i9, i10, i11);
        b++;
      } 
      modp_NTT2(paramArrayOfint, i7, paramArrayOfint, i5, paramInt2, i8, i9);
      b = 0;
      for (i12 = i1 + k; b < j; i12 += n) {
        int i13 = paramArrayOfint[i7 + (b << 1) + 0];
        int i14 = paramArrayOfint[i7 + (b << 1) + 1];
        paramArrayOfint[i12] = modp_montymul(modp_montymul(i13, i14, i8, i9), i10, i8, i9);
        b++;
      } 
      b = 0;
      for (i12 = i4; b < i; i12 += m) {
        paramArrayOfint[i7 + b] = zint_mod_small_signed(paramArrayOfint, i12, m, i8, i9, i10, i11);
        b++;
      } 
      modp_NTT2(paramArrayOfint, i7, paramArrayOfint, i5, paramInt2, i8, i9);
      b = 0;
      for (i12 = i2 + k; b < j; i12 += n) {
        int i13 = paramArrayOfint[i7 + (b << 1) + 0];
        int i14 = paramArrayOfint[i7 + (b << 1) + 1];
        paramArrayOfint[i12] = modp_montymul(modp_montymul(i13, i14, i8, i9), i10, i8, i9);
        b++;
      } 
      if (paramInt5 == 0) {
        modp_iNTT2_ext(paramArrayOfint, i1 + k, n, paramArrayOfint, i6, paramInt2 - 1, i8, i9);
        modp_iNTT2_ext(paramArrayOfint, i2 + k, n, paramArrayOfint, i6, paramInt2 - 1, i8, i9);
      } 
    } 
  }
  
  void make_fg(int[] paramArrayOfint, int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i = mkn(paramInt4);
    int j = paramInt1;
    int k = j + i;
    FalconSmallPrime[] arrayOfFalconSmallPrime = FalconSmallPrimeList.PRIMES;
    int m = (arrayOfFalconSmallPrime[0]).p;
    for (byte b1 = 0; b1 < i; b1++) {
      paramArrayOfint[j + b1] = modp_set(paramArrayOfbyte1[paramInt2 + b1], m);
      paramArrayOfint[k + b1] = modp_set(paramArrayOfbyte2[paramInt3 + b1], m);
    } 
    if (paramInt5 == 0 && paramInt6 != 0) {
      int i2 = (arrayOfFalconSmallPrime[0]).p;
      int i3 = modp_ninv31(i2);
      int n = k + i;
      int i1 = n + i;
      modp_mkgm2(paramArrayOfint, n, paramArrayOfint, i1, paramInt4, (arrayOfFalconSmallPrime[0]).g, i2, i3);
      modp_NTT2(paramArrayOfint, j, paramArrayOfint, n, paramInt4, i2, i3);
      modp_NTT2(paramArrayOfint, k, paramArrayOfint, n, paramInt4, i2, i3);
      return;
    } 
    for (byte b2 = 0; b2 < paramInt5; b2++)
      make_fg_step(paramArrayOfint, paramInt1, paramInt4 - b2, b2, (b2 != 0) ? 1 : 0, (b2 + 1 < paramInt5 || paramInt6 != 0) ? 1 : 0); 
  }
  
  int solve_NTRU_deepest(int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int[] paramArrayOfint, int paramInt4) {
    int i = this.MAX_BL_SMALL[paramInt1];
    FalconSmallPrime[] arrayOfFalconSmallPrime = FalconSmallPrimeList.PRIMES;
    int j = paramInt4;
    int k = j + i;
    int m = k + i;
    int n = m + i;
    int i1 = n + i;
    make_fg(paramArrayOfint, m, paramArrayOfbyte1, paramInt2, paramArrayOfbyte2, paramInt3, paramInt1, paramInt1, 0);
    zint_rebuild_CRT(paramArrayOfint, m, i, i, 2, arrayOfFalconSmallPrime, 0, paramArrayOfint, i1);
    if (zint_bezout(paramArrayOfint, k, paramArrayOfint, j, paramArrayOfint, m, paramArrayOfint, n, i, paramArrayOfint, i1) == 0)
      return 0; 
    char c = '、';
    return (zint_mul_small(paramArrayOfint, j, i, c) != 0 || zint_mul_small(paramArrayOfint, k, i, c) != 0) ? 0 : 1;
  }
  
  int solve_NTRU_intermediate(int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int paramInt4, int[] paramArrayOfint, int paramInt5) {
    int i = paramInt1 - paramInt4;
    int j = 1 << i;
    int k = j >> 1;
    int m = this.MAX_BL_SMALL[paramInt4];
    int n = this.MAX_BL_SMALL[paramInt4 + 1];
    int i1 = this.MAX_BL_LARGE[paramInt4];
    FalconSmallPrime[] arrayOfFalconSmallPrime = FalconSmallPrimeList.PRIMES;
    int i3 = paramInt5;
    int i4 = i3 + n * k;
    int i7 = i4 + n * k;
    make_fg(paramArrayOfint, i7, paramArrayOfbyte1, paramInt2, paramArrayOfbyte2, paramInt3, paramInt1, paramInt4, 1);
    int i5 = paramInt5;
    int i6 = i5 + j * i1;
    int i9 = i6 + j * i1;
    System.arraycopy(paramArrayOfint, i7, paramArrayOfint, i9, 2 * j * m);
    i7 = i9;
    int i8 = i7 + m * j;
    i9 = i8 + m * j;
    System.arraycopy(paramArrayOfint, i3, paramArrayOfint, i9, 2 * k * n);
    i3 = i9;
    i4 = i3 + k * n;
    byte b2;
    for (b2 = 0; b2 < i1; b2++) {
      int i15 = (arrayOfFalconSmallPrime[b2]).p;
      int i16 = modp_ninv31(i15);
      int i17 = modp_R2(i15, i16);
      int i18 = modp_Rx(n, i15, i16, i17);
      byte b = 0;
      int i19 = i3;
      int i20 = i4;
      int i21 = i5 + b2;
      int i22;
      for (i22 = i6 + b2; b < k; i22 += i1) {
        paramArrayOfint[i21] = zint_mod_small_signed(paramArrayOfint, i19, n, i15, i16, i17, i18);
        paramArrayOfint[i22] = zint_mod_small_signed(paramArrayOfint, i20, n, i15, i16, i17, i18);
        b++;
        i19 += n;
        i20 += n;
        i21 += i1;
      } 
    } 
    for (b2 = 0; b2 < i1; b2++) {
      int i17 = (arrayOfFalconSmallPrime[b2]).p;
      int i18 = modp_ninv31(i17);
      int i19 = modp_R2(i17, i18);
      if (b2 == m) {
        zint_rebuild_CRT(paramArrayOfint, i7, m, m, j, arrayOfFalconSmallPrime, 1, paramArrayOfint, i9);
        zint_rebuild_CRT(paramArrayOfint, i8, m, m, j, arrayOfFalconSmallPrime, 1, paramArrayOfint, i9);
      } 
      int i20 = i9;
      int i21 = i20 + j;
      int i22 = i21 + j;
      int i23 = i22 + j;
      modp_mkgm2(paramArrayOfint, i20, paramArrayOfint, i21, i, (arrayOfFalconSmallPrime[b2]).g, i17, i18);
      if (b2 < m) {
        byte b3 = 0;
        int i26 = i7 + b2;
        int i27;
        for (i27 = i8 + b2; b3 < j; i27 += m) {
          paramArrayOfint[i22 + b3] = paramArrayOfint[i26];
          paramArrayOfint[i23 + b3] = paramArrayOfint[i27];
          b3++;
          i26 += m;
        } 
        modp_iNTT2_ext(paramArrayOfint, i7 + b2, m, paramArrayOfint, i21, i, i17, i18);
        modp_iNTT2_ext(paramArrayOfint, i8 + b2, m, paramArrayOfint, i21, i, i17, i18);
      } else {
        int i28 = modp_Rx(m, i17, i18, i19);
        byte b3 = 0;
        int i26 = i7;
        int i27;
        for (i27 = i8; b3 < j; i27 += m) {
          paramArrayOfint[i22 + b3] = zint_mod_small_signed(paramArrayOfint, i26, m, i17, i18, i19, i28);
          paramArrayOfint[i23 + b3] = zint_mod_small_signed(paramArrayOfint, i27, m, i17, i18, i19, i28);
          b3++;
          i26 += m;
        } 
        modp_NTT2(paramArrayOfint, i22, paramArrayOfint, i20, i, i17, i18);
        modp_NTT2(paramArrayOfint, i23, paramArrayOfint, i20, i, i17, i18);
      } 
      int i24 = i23 + j;
      int i25 = i24 + k;
      byte b = 0;
      int i15 = i5 + b2;
      int i16;
      for (i16 = i6 + b2; b < k; i16 += i1) {
        paramArrayOfint[i24 + b] = paramArrayOfint[i15];
        paramArrayOfint[i25 + b] = paramArrayOfint[i16];
        b++;
        i15 += i1;
      } 
      modp_NTT2(paramArrayOfint, i24, paramArrayOfint, i20, i - 1, i17, i18);
      modp_NTT2(paramArrayOfint, i25, paramArrayOfint, i20, i - 1, i17, i18);
      b = 0;
      i15 = i5 + b2;
      for (i16 = i6 + b2; b < k; i16 += i1 << 1) {
        int i26 = paramArrayOfint[i22 + (b << 1) + 0];
        int i27 = paramArrayOfint[i22 + (b << 1) + 1];
        int i28 = paramArrayOfint[i23 + (b << 1) + 0];
        int i29 = paramArrayOfint[i23 + (b << 1) + 1];
        int i30 = modp_montymul(paramArrayOfint[i24 + b], i19, i17, i18);
        int i31 = modp_montymul(paramArrayOfint[i25 + b], i19, i17, i18);
        paramArrayOfint[i15 + 0] = modp_montymul(i29, i30, i17, i18);
        paramArrayOfint[i15 + i1] = modp_montymul(i28, i30, i17, i18);
        paramArrayOfint[i16 + 0] = modp_montymul(i27, i31, i17, i18);
        paramArrayOfint[i16 + i1] = modp_montymul(i26, i31, i17, i18);
        b++;
        i15 += i1 << 1;
      } 
      modp_iNTT2_ext(paramArrayOfint, i5 + b2, i1, paramArrayOfint, i21, i, i17, i18);
      modp_iNTT2_ext(paramArrayOfint, i6 + b2, i1, paramArrayOfint, i21, i, i17, i18);
    } 
    zint_rebuild_CRT(paramArrayOfint, i5, i1, i1, j, arrayOfFalconSmallPrime, 1, paramArrayOfint, i9);
    zint_rebuild_CRT(paramArrayOfint, i6, i1, i1, j, arrayOfFalconSmallPrime, 1, paramArrayOfint, i9);
    FalconFPR[] arrayOfFalconFPR1 = new FalconFPR[j];
    FalconFPR[] arrayOfFalconFPR2 = new FalconFPR[j];
    FalconFPR[] arrayOfFalconFPR3 = new FalconFPR[j];
    FalconFPR[] arrayOfFalconFPR4 = new FalconFPR[j];
    FalconFPR[] arrayOfFalconFPR5 = new FalconFPR[j >> 1];
    int[] arrayOfInt = new int[j];
    byte b1 = (m > 10) ? 10 : m;
    poly_big_to_fp(arrayOfFalconFPR3, 0, paramArrayOfint, i7 + m - b1, b1, m, i);
    poly_big_to_fp(arrayOfFalconFPR4, 0, paramArrayOfint, i8 + m - b1, b1, m, i);
    int i10 = 31 * (m - b1);
    int i11 = this.bitlength_avg[paramInt4] - 6 * this.bitlength_std[paramInt4];
    int i12 = this.bitlength_avg[paramInt4] + 6 * this.bitlength_std[paramInt4];
    this.fft.FFT(arrayOfFalconFPR3, 0, i);
    this.fft.FFT(arrayOfFalconFPR4, 0, i);
    this.fft.poly_invnorm2_fft(arrayOfFalconFPR5, 0, arrayOfFalconFPR3, 0, arrayOfFalconFPR4, 0, i);
    this.fft.poly_adj_fft(arrayOfFalconFPR3, 0, i);
    this.fft.poly_adj_fft(arrayOfFalconFPR4, 0, i);
    int i2 = i1;
    int i13 = 31 * i1;
    int i14 = i13 - i11;
    while (true) {
      FalconFPR falconFPR2;
      b1 = (i2 > 10) ? 10 : i2;
      int i15 = 31 * (i2 - b1);
      poly_big_to_fp(arrayOfFalconFPR1, 0, paramArrayOfint, i5 + i2 - b1, b1, i1, i);
      poly_big_to_fp(arrayOfFalconFPR2, 0, paramArrayOfint, i6 + i2 - b1, b1, i1, i);
      this.fft.FFT(arrayOfFalconFPR1, 0, i);
      this.fft.FFT(arrayOfFalconFPR2, 0, i);
      this.fft.poly_mul_fft(arrayOfFalconFPR1, 0, arrayOfFalconFPR3, 0, i);
      this.fft.poly_mul_fft(arrayOfFalconFPR2, 0, arrayOfFalconFPR4, 0, i);
      this.fft.poly_add(arrayOfFalconFPR2, 0, arrayOfFalconFPR1, 0, i);
      this.fft.poly_mul_autoadj_fft(arrayOfFalconFPR2, 0, arrayOfFalconFPR5, 0, i);
      this.fft.iFFT(arrayOfFalconFPR2, 0, i);
      int i16 = i14 - i15 + i10;
      if (i16 < 0) {
        i16 = -i16;
        falconFPR2 = this.fpr.fpr_two;
      } else {
        falconFPR2 = this.fpr.fpr_onehalf;
      } 
      FalconFPR falconFPR1 = this.fpr.fpr_one;
      while (i16 != 0) {
        if ((i16 & 0x1) != 0)
          falconFPR1 = this.fpr.fpr_mul(falconFPR1, falconFPR2); 
        i16 >>= 1;
        falconFPR2 = this.fpr.fpr_sqr(falconFPR2);
      } 
      for (b2 = 0; b2 < j; b2++) {
        FalconFPR falconFPR = this.fpr.fpr_mul(arrayOfFalconFPR2[b2], falconFPR1);
        if (!this.fpr.fpr_lt(this.fpr.fpr_mtwo31m1, falconFPR) || !this.fpr.fpr_lt(falconFPR, this.fpr.fpr_ptwo31m1))
          return 0; 
        arrayOfInt[b2] = (int)this.fpr.fpr_rint(falconFPR);
      } 
      int i19 = i14 / 31;
      int i18 = i14 % 31;
      if (paramInt4 <= 4) {
        poly_sub_scaled_ntt(paramArrayOfint, i5, i2, i1, paramArrayOfint, i7, m, m, arrayOfInt, 0, i19, i18, i, paramArrayOfint, i9);
        poly_sub_scaled_ntt(paramArrayOfint, i6, i2, i1, paramArrayOfint, i8, m, m, arrayOfInt, 0, i19, i18, i, paramArrayOfint, i9);
      } else {
        poly_sub_scaled(paramArrayOfint, i5, i2, i1, paramArrayOfint, i7, m, m, arrayOfInt, 0, i19, i18, i);
        poly_sub_scaled(paramArrayOfint, i6, i2, i1, paramArrayOfint, i8, m, m, arrayOfInt, 0, i19, i18, i);
      } 
      int i17 = i14 + i12 + 10;
      if (i17 < i13) {
        i13 = i17;
        if (i2 * 31 >= i13 + 31)
          i2--; 
      } 
      if (i14 <= 0) {
        if (i2 < m) {
          b2 = 0;
          while (b2 < j) {
            i16 = -(paramArrayOfint[i5 + i2 - 1] >>> 30) >>> 1;
            for (i15 = i2; i15 < m; i15++)
              paramArrayOfint[i5 + i15] = i16; 
            i16 = -(paramArrayOfint[i6 + i2 - 1] >>> 30) >>> 1;
            for (i15 = i2; i15 < m; i15++)
              paramArrayOfint[i6 + i15] = i16; 
            b2++;
            i5 += i1;
            i6 += i1;
          } 
        } 
        b2 = 0;
        int i20 = paramInt5;
        int i21;
        for (i21 = paramInt5; b2 < j << 1; i21 += i1) {
          System.arraycopy(paramArrayOfint, i21, paramArrayOfint, i20, m);
          b2++;
          i20 += m;
        } 
        return 1;
      } 
      i14 -= 25;
      if (i14 < 0)
        i14 = 0; 
    } 
  }
  
  int solve_NTRU_binary_depth1(int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int[] paramArrayOfint, int paramInt4) {
    byte b1 = 1;
    int j = 1 << paramInt1;
    int i = paramInt1 - b1;
    int k = 1 << i;
    int m = k >> 1;
    int n = this.MAX_BL_SMALL[b1];
    int i1 = this.MAX_BL_SMALL[b1 + 1];
    int i2 = this.MAX_BL_LARGE[b1];
    int i3 = paramInt4;
    int i4 = i3 + i1 * m;
    int i5 = i4 + i1 * m;
    int i6 = i5 + i2 * k;
    byte b2;
    for (b2 = 0; b2 < i2; b2++) {
      int i10 = (FalconSmallPrimeList.PRIMES[b2]).p;
      int i11 = modp_ninv31(i10);
      int i12 = modp_R2(i10, i11);
      int i13 = modp_Rx(i1, i10, i11, i12);
      byte b = 0;
      int i14 = i3;
      int i15 = i4;
      int i16 = i5 + b2;
      int i17;
      for (i17 = i6 + b2; b < m; i17 += i2) {
        paramArrayOfint[i16] = zint_mod_small_signed(paramArrayOfint, i14, i1, i10, i11, i12, i13);
        paramArrayOfint[i17] = zint_mod_small_signed(paramArrayOfint, i15, i1, i10, i11, i12, i13);
        b++;
        i14 += i1;
        i15 += i1;
        i16 += i2;
      } 
    } 
    System.arraycopy(paramArrayOfint, i5, paramArrayOfint, paramInt4, i2 * k);
    i5 = paramInt4;
    System.arraycopy(paramArrayOfint, i6, paramArrayOfint, i5 + i2 * k, i2 * k);
    i6 = i5 + i2 * k;
    int i7 = i6 + i2 * k;
    int i8 = i7 + n * k;
    int i9 = i8 + n * k;
    for (b2 = 0; b2 < i2; b2++) {
      int i12 = (FalconSmallPrimeList.PRIMES[b2]).p;
      int i13 = modp_ninv31(i12);
      int i14 = modp_R2(i12, i13);
      int i15 = i9;
      int i16 = i15 + j;
      int i17 = i16 + k;
      int i18 = i17 + j;
      modp_mkgm2(paramArrayOfint, i15, paramArrayOfint, i16, paramInt1, (FalconSmallPrimeList.PRIMES[b2]).g, i12, i13);
      byte b;
      for (b = 0; b < j; b++) {
        paramArrayOfint[i17 + b] = modp_set(paramArrayOfbyte1[paramInt2 + b], i12);
        paramArrayOfint[i18 + b] = modp_set(paramArrayOfbyte2[paramInt3 + b], i12);
      } 
      modp_NTT2(paramArrayOfint, i17, paramArrayOfint, i15, paramInt1, i12, i13);
      modp_NTT2(paramArrayOfint, i18, paramArrayOfint, i15, paramInt1, i12, i13);
      for (int i21 = paramInt1; i21 > i; i21--) {
        modp_poly_rec_res(paramArrayOfint, i17, i21, i12, i13, i14);
        modp_poly_rec_res(paramArrayOfint, i18, i21, i12, i13, i14);
      } 
      if (b1 > 0) {
        System.arraycopy(paramArrayOfint, i16, paramArrayOfint, i15 + k, k);
        i16 = i15 + k;
        System.arraycopy(paramArrayOfint, i17, paramArrayOfint, i16 + k, k);
        i17 = i16 + k;
        System.arraycopy(paramArrayOfint, i18, paramArrayOfint, i17 + k, k);
        i18 = i17 + k;
      } 
      int i19 = i18 + k;
      int i20 = i19 + m;
      b = 0;
      int i10 = i5 + b2;
      int i11;
      for (i11 = i6 + b2; b < m; i11 += i2) {
        paramArrayOfint[i19 + b] = paramArrayOfint[i10];
        paramArrayOfint[i20 + b] = paramArrayOfint[i11];
        b++;
        i10 += i2;
      } 
      modp_NTT2(paramArrayOfint, i19, paramArrayOfint, i15, i - 1, i12, i13);
      modp_NTT2(paramArrayOfint, i20, paramArrayOfint, i15, i - 1, i12, i13);
      b = 0;
      i10 = i5 + b2;
      for (i11 = i6 + b2; b < m; i11 += i2 << 1) {
        int i22 = paramArrayOfint[i17 + (b << 1) + 0];
        int i23 = paramArrayOfint[i17 + (b << 1) + 1];
        int i24 = paramArrayOfint[i18 + (b << 1) + 0];
        int i25 = paramArrayOfint[i18 + (b << 1) + 1];
        int i26 = modp_montymul(paramArrayOfint[i19 + b], i14, i12, i13);
        int i27 = modp_montymul(paramArrayOfint[i20 + b], i14, i12, i13);
        paramArrayOfint[i10 + 0] = modp_montymul(i25, i26, i12, i13);
        paramArrayOfint[i10 + i2] = modp_montymul(i24, i26, i12, i13);
        paramArrayOfint[i11 + 0] = modp_montymul(i23, i27, i12, i13);
        paramArrayOfint[i11 + i2] = modp_montymul(i22, i27, i12, i13);
        b++;
        i10 += i2 << 1;
      } 
      modp_iNTT2_ext(paramArrayOfint, i5 + b2, i2, paramArrayOfint, i16, i, i12, i13);
      modp_iNTT2_ext(paramArrayOfint, i6 + b2, i2, paramArrayOfint, i16, i, i12, i13);
      if (b2 < n) {
        modp_iNTT2(paramArrayOfint, i17, paramArrayOfint, i16, i, i12, i13);
        modp_iNTT2(paramArrayOfint, i18, paramArrayOfint, i16, i, i12, i13);
        b = 0;
        i10 = i7 + b2;
        for (i11 = i8 + b2; b < k; i11 += n) {
          paramArrayOfint[i10] = paramArrayOfint[i17 + b];
          paramArrayOfint[i11] = paramArrayOfint[i18 + b];
          b++;
          i10 += n;
        } 
      } 
    } 
    zint_rebuild_CRT(paramArrayOfint, i5, i2, i2, k << 1, FalconSmallPrimeList.PRIMES, 1, paramArrayOfint, i9);
    zint_rebuild_CRT(paramArrayOfint, i7, n, n, k << 1, FalconSmallPrimeList.PRIMES, 1, paramArrayOfint, i9);
    FalconFPR[] arrayOfFalconFPR1 = new FalconFPR[k];
    FalconFPR[] arrayOfFalconFPR2 = new FalconFPR[k];
    poly_big_to_fp(arrayOfFalconFPR1, 0, paramArrayOfint, i5, i2, i2, i);
    poly_big_to_fp(arrayOfFalconFPR2, 0, paramArrayOfint, i6, i2, i2, i);
    System.arraycopy(paramArrayOfint, i7, paramArrayOfint, paramInt4, 2 * n * k);
    i7 = paramInt4;
    i8 = i7 + n * k;
    FalconFPR[] arrayOfFalconFPR3 = new FalconFPR[k];
    FalconFPR[] arrayOfFalconFPR4 = new FalconFPR[k];
    poly_big_to_fp(arrayOfFalconFPR3, 0, paramArrayOfint, i7, n, n, i);
    poly_big_to_fp(arrayOfFalconFPR4, 0, paramArrayOfint, i8, n, n, i);
    this.fft.FFT(arrayOfFalconFPR1, 0, i);
    this.fft.FFT(arrayOfFalconFPR2, 0, i);
    this.fft.FFT(arrayOfFalconFPR3, 0, i);
    this.fft.FFT(arrayOfFalconFPR4, 0, i);
    FalconFPR[] arrayOfFalconFPR5 = new FalconFPR[k];
    FalconFPR[] arrayOfFalconFPR6 = new FalconFPR[k >> 1];
    this.fft.poly_add_muladj_fft(arrayOfFalconFPR5, 0, arrayOfFalconFPR1, 0, arrayOfFalconFPR2, 0, arrayOfFalconFPR3, 0, arrayOfFalconFPR4, 0, i);
    this.fft.poly_invnorm2_fft(arrayOfFalconFPR6, 0, arrayOfFalconFPR3, 0, arrayOfFalconFPR4, 0, i);
    this.fft.poly_mul_autoadj_fft(arrayOfFalconFPR5, 0, arrayOfFalconFPR6, 0, i);
    this.fft.iFFT(arrayOfFalconFPR5, 0, i);
    for (b2 = 0; b2 < k; b2++) {
      FalconFPR falconFPR = arrayOfFalconFPR5[b2];
      if (!this.fpr.fpr_lt(falconFPR, this.fpr.fpr_ptwo63m1) || !this.fpr.fpr_lt(this.fpr.fpr_mtwo63m1, falconFPR))
        return 0; 
      arrayOfFalconFPR5[b2] = this.fpr.fpr_of(this.fpr.fpr_rint(falconFPR));
    } 
    this.fft.FFT(arrayOfFalconFPR5, 0, i);
    this.fft.poly_mul_fft(arrayOfFalconFPR3, 0, arrayOfFalconFPR5, 0, i);
    this.fft.poly_mul_fft(arrayOfFalconFPR4, 0, arrayOfFalconFPR5, 0, i);
    this.fft.poly_sub(arrayOfFalconFPR1, 0, arrayOfFalconFPR3, 0, i);
    this.fft.poly_sub(arrayOfFalconFPR2, 0, arrayOfFalconFPR4, 0, i);
    this.fft.iFFT(arrayOfFalconFPR1, 0, i);
    this.fft.iFFT(arrayOfFalconFPR2, 0, i);
    i5 = paramInt4;
    i6 = i5 + k;
    for (b2 = 0; b2 < k; b2++) {
      paramArrayOfint[i5 + b2] = (int)this.fpr.fpr_rint(arrayOfFalconFPR1[b2]);
      paramArrayOfint[i6 + b2] = (int)this.fpr.fpr_rint(arrayOfFalconFPR2[b2]);
    } 
    return 1;
  }
  
  int solve_NTRU_binary_depth0(int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int[] paramArrayOfint, int paramInt4) {
    int i = 1 << paramInt1;
    int j = i >> 1;
    int k = (FalconSmallPrimeList.PRIMES[0]).p;
    int m = modp_ninv31(k);
    int n = modp_R2(k, m);
    int i1 = paramInt4;
    int i2 = i1 + j;
    int i10 = i2 + j;
    int i11 = i10 + i;
    int i8 = i11 + i;
    int i9 = i8 + i;
    modp_mkgm2(paramArrayOfint, i8, paramArrayOfint, i9, paramInt1, (FalconSmallPrimeList.PRIMES[0]).g, k, m);
    byte b1;
    for (b1 = 0; b1 < j; b1++) {
      paramArrayOfint[i1 + b1] = modp_set(zint_one_to_plain(paramArrayOfint, i1 + b1), k);
      paramArrayOfint[i2 + b1] = modp_set(zint_one_to_plain(paramArrayOfint, i2 + b1), k);
    } 
    modp_NTT2(paramArrayOfint, i1, paramArrayOfint, i8, paramInt1 - 1, k, m);
    modp_NTT2(paramArrayOfint, i2, paramArrayOfint, i8, paramInt1 - 1, k, m);
    for (b1 = 0; b1 < i; b1++) {
      paramArrayOfint[i10 + b1] = modp_set(paramArrayOfbyte1[paramInt2 + b1], k);
      paramArrayOfint[i11 + b1] = modp_set(paramArrayOfbyte2[paramInt3 + b1], k);
    } 
    modp_NTT2(paramArrayOfint, i10, paramArrayOfint, i8, paramInt1, k, m);
    modp_NTT2(paramArrayOfint, i11, paramArrayOfint, i8, paramInt1, k, m);
    for (b1 = 0; b1 < i; b1 += 2) {
      int i14 = paramArrayOfint[i10 + b1 + 0];
      int i15 = paramArrayOfint[i10 + b1 + 1];
      int i16 = paramArrayOfint[i11 + b1 + 0];
      int i17 = paramArrayOfint[i11 + b1 + 1];
      int i18 = modp_montymul(paramArrayOfint[i1 + (b1 >> 1)], n, k, m);
      int i19 = modp_montymul(paramArrayOfint[i2 + (b1 >> 1)], n, k, m);
      paramArrayOfint[i10 + b1 + 0] = modp_montymul(i17, i18, k, m);
      paramArrayOfint[i10 + b1 + 1] = modp_montymul(i16, i18, k, m);
      paramArrayOfint[i11 + b1 + 0] = modp_montymul(i15, i19, k, m);
      paramArrayOfint[i11 + b1 + 1] = modp_montymul(i14, i19, k, m);
    } 
    modp_iNTT2(paramArrayOfint, i10, paramArrayOfint, i9, paramInt1, k, m);
    modp_iNTT2(paramArrayOfint, i11, paramArrayOfint, i9, paramInt1, k, m);
    i2 = i1 + i;
    int i3 = i2 + i;
    System.arraycopy(paramArrayOfint, i10, paramArrayOfint, i1, 2 * i);
    int i4 = i3 + i;
    int i5 = i4 + i;
    int i6 = i5 + i;
    int i7 = i6 + i;
    modp_mkgm2(paramArrayOfint, i3, paramArrayOfint, i4, paramInt1, (FalconSmallPrimeList.PRIMES[0]).g, k, m);
    modp_NTT2(paramArrayOfint, i1, paramArrayOfint, i3, paramInt1, k, m);
    modp_NTT2(paramArrayOfint, i2, paramArrayOfint, i3, paramInt1, k, m);
    paramArrayOfint[i7 + 0] = modp_set(paramArrayOfbyte1[paramInt2 + 0], k);
    paramArrayOfint[i6 + 0] = modp_set(paramArrayOfbyte1[paramInt2 + 0], k);
    for (b1 = 1; b1 < i; b1++) {
      paramArrayOfint[i6 + b1] = modp_set(paramArrayOfbyte1[paramInt2 + b1], k);
      paramArrayOfint[i7 + i - b1] = modp_set(-paramArrayOfbyte1[paramInt2 + b1], k);
    } 
    modp_NTT2(paramArrayOfint, i6, paramArrayOfint, i3, paramInt1, k, m);
    modp_NTT2(paramArrayOfint, i7, paramArrayOfint, i3, paramInt1, k, m);
    for (b1 = 0; b1 < i; b1++) {
      int i14 = modp_montymul(paramArrayOfint[i7 + b1], n, k, m);
      paramArrayOfint[i4 + b1] = modp_montymul(i14, paramArrayOfint[i1 + b1], k, m);
      paramArrayOfint[i5 + b1] = modp_montymul(i14, paramArrayOfint[i6 + b1], k, m);
    } 
    paramArrayOfint[i7 + 0] = modp_set(paramArrayOfbyte2[paramInt3 + 0], k);
    paramArrayOfint[i6 + 0] = modp_set(paramArrayOfbyte2[paramInt3 + 0], k);
    for (b1 = 1; b1 < i; b1++) {
      paramArrayOfint[i6 + b1] = modp_set(paramArrayOfbyte2[paramInt3 + b1], k);
      paramArrayOfint[i7 + i - b1] = modp_set(-paramArrayOfbyte2[paramInt3 + b1], k);
    } 
    modp_NTT2(paramArrayOfint, i6, paramArrayOfint, i3, paramInt1, k, m);
    modp_NTT2(paramArrayOfint, i7, paramArrayOfint, i3, paramInt1, k, m);
    for (b1 = 0; b1 < i; b1++) {
      int i14 = modp_montymul(paramArrayOfint[i7 + b1], n, k, m);
      paramArrayOfint[i4 + b1] = modp_add(paramArrayOfint[i4 + b1], modp_montymul(i14, paramArrayOfint[i2 + b1], k, m), k);
      paramArrayOfint[i5 + b1] = modp_add(paramArrayOfint[i5 + b1], modp_montymul(i14, paramArrayOfint[i6 + b1], k, m), k);
    } 
    modp_mkgm2(paramArrayOfint, i3, paramArrayOfint, i6, paramInt1, (FalconSmallPrimeList.PRIMES[0]).g, k, m);
    modp_iNTT2(paramArrayOfint, i4, paramArrayOfint, i6, paramInt1, k, m);
    modp_iNTT2(paramArrayOfint, i5, paramArrayOfint, i6, paramInt1, k, m);
    for (b1 = 0; b1 < i; b1++) {
      paramArrayOfint[i3 + b1] = modp_norm(paramArrayOfint[i4 + b1], k);
      paramArrayOfint[i4 + b1] = modp_norm(paramArrayOfint[i5 + b1], k);
    } 
    FalconFPR[] arrayOfFalconFPR = new FalconFPR[3 * i];
    byte b2 = 0;
    int i12 = b2 + i;
    int i13 = i12 + i;
    for (b1 = 0; b1 < i; b1++)
      arrayOfFalconFPR[i13 + b1] = this.fpr.fpr_of(paramArrayOfint[i4 + b1]); 
    this.fft.FFT(arrayOfFalconFPR, i13, paramInt1);
    System.arraycopy(arrayOfFalconFPR, i13, arrayOfFalconFPR, i12, j);
    i13 = i12 + j;
    for (b1 = 0; b1 < i; b1++)
      arrayOfFalconFPR[i13 + b1] = this.fpr.fpr_of(paramArrayOfint[i3 + b1]); 
    this.fft.FFT(arrayOfFalconFPR, i13, paramInt1);
    this.fft.poly_div_autoadj_fft(arrayOfFalconFPR, i13, arrayOfFalconFPR, i12, paramInt1);
    this.fft.iFFT(arrayOfFalconFPR, i13, paramInt1);
    for (b1 = 0; b1 < i; b1++)
      paramArrayOfint[i3 + b1] = modp_set((int)this.fpr.fpr_rint(arrayOfFalconFPR[i13 + b1]), k); 
    i4 = i3 + i;
    i5 = i4 + i;
    i6 = i5 + i;
    i7 = i6 + i;
    modp_mkgm2(paramArrayOfint, i4, paramArrayOfint, i5, paramInt1, (FalconSmallPrimeList.PRIMES[0]).g, k, m);
    for (b1 = 0; b1 < i; b1++) {
      paramArrayOfint[i6 + b1] = modp_set(paramArrayOfbyte1[paramInt2 + b1], k);
      paramArrayOfint[i7 + b1] = modp_set(paramArrayOfbyte2[paramInt3 + b1], k);
    } 
    modp_NTT2(paramArrayOfint, i3, paramArrayOfint, i4, paramInt1, k, m);
    modp_NTT2(paramArrayOfint, i6, paramArrayOfint, i4, paramInt1, k, m);
    modp_NTT2(paramArrayOfint, i7, paramArrayOfint, i4, paramInt1, k, m);
    for (b1 = 0; b1 < i; b1++) {
      int i14 = modp_montymul(paramArrayOfint[i3 + b1], n, k, m);
      paramArrayOfint[i1 + b1] = modp_sub(paramArrayOfint[i1 + b1], modp_montymul(i14, paramArrayOfint[i6 + b1], k, m), k);
      paramArrayOfint[i2 + b1] = modp_sub(paramArrayOfint[i2 + b1], modp_montymul(i14, paramArrayOfint[i7 + b1], k, m), k);
    } 
    modp_iNTT2(paramArrayOfint, i1, paramArrayOfint, i5, paramInt1, k, m);
    modp_iNTT2(paramArrayOfint, i2, paramArrayOfint, i5, paramInt1, k, m);
    for (b1 = 0; b1 < i; b1++) {
      paramArrayOfint[i1 + b1] = modp_norm(paramArrayOfint[i1 + b1], k);
      paramArrayOfint[i2 + b1] = modp_norm(paramArrayOfint[i2 + b1], k);
    } 
    return 1;
  }
  
  int solve_NTRU(int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, byte[] paramArrayOfbyte3, int paramInt4, byte[] paramArrayOfbyte4, int paramInt5, int paramInt6, int[] paramArrayOfint, int paramInt7) {
    int i = mkn(paramInt1);
    if (solve_NTRU_deepest(paramInt1, paramArrayOfbyte3, paramInt4, paramArrayOfbyte4, paramInt5, paramArrayOfint, paramInt7) == 0)
      return 0; 
    if (paramInt1 <= 2) {
      int i5 = paramInt1;
      while (i5-- > 0) {
        if (solve_NTRU_intermediate(paramInt1, paramArrayOfbyte3, paramInt4, paramArrayOfbyte4, paramInt5, i5, paramArrayOfint, paramInt7) == 0)
          return 0; 
      } 
    } else {
      int i5 = paramInt1;
      while (i5-- > 2) {
        if (solve_NTRU_intermediate(paramInt1, paramArrayOfbyte3, paramInt4, paramArrayOfbyte4, paramInt5, i5, paramArrayOfint, paramInt7) == 0)
          return 0; 
      } 
      if (solve_NTRU_binary_depth1(paramInt1, paramArrayOfbyte3, paramInt4, paramArrayOfbyte4, paramInt5, paramArrayOfint, paramInt7) == 0)
        return 0; 
      if (solve_NTRU_binary_depth0(paramInt1, paramArrayOfbyte3, paramInt4, paramArrayOfbyte4, paramInt5, paramArrayOfint, paramInt7) == 0)
        return 0; 
    } 
    if (paramArrayOfbyte2 == null) {
      paramInt3 = 0;
      paramArrayOfbyte2 = new byte[i];
    } 
    if (poly_big_to_small(paramArrayOfbyte1, paramInt2, paramArrayOfint, paramInt7, paramInt6, paramInt1) == 0 || poly_big_to_small(paramArrayOfbyte2, paramInt3, paramArrayOfint, paramInt7 + i, paramInt6, paramInt1) == 0)
      return 0; 
    int n = paramInt7;
    int j = n + i;
    int k = j + i;
    int m = k + i;
    int i1 = m + i;
    FalconSmallPrime[] arrayOfFalconSmallPrime = FalconSmallPrimeList.PRIMES;
    int i2 = (arrayOfFalconSmallPrime[0]).p;
    int i3 = modp_ninv31(i2);
    modp_mkgm2(paramArrayOfint, i1, paramArrayOfint, paramInt7, paramInt1, (arrayOfFalconSmallPrime[0]).g, i2, i3);
    byte b;
    for (b = 0; b < i; b++)
      paramArrayOfint[n + b] = modp_set(paramArrayOfbyte2[paramInt3 + b], i2); 
    for (b = 0; b < i; b++) {
      paramArrayOfint[j + b] = modp_set(paramArrayOfbyte3[paramInt4 + b], i2);
      paramArrayOfint[k + b] = modp_set(paramArrayOfbyte4[paramInt5 + b], i2);
      paramArrayOfint[m + b] = modp_set(paramArrayOfbyte1[paramInt2 + b], i2);
    } 
    modp_NTT2(paramArrayOfint, j, paramArrayOfint, i1, paramInt1, i2, i3);
    modp_NTT2(paramArrayOfint, k, paramArrayOfint, i1, paramInt1, i2, i3);
    modp_NTT2(paramArrayOfint, m, paramArrayOfint, i1, paramInt1, i2, i3);
    modp_NTT2(paramArrayOfint, n, paramArrayOfint, i1, paramInt1, i2, i3);
    int i4 = modp_montymul(12289, 1, i2, i3);
    for (b = 0; b < i; b++) {
      int i5 = modp_sub(modp_montymul(paramArrayOfint[j + b], paramArrayOfint[n + b], i2, i3), modp_montymul(paramArrayOfint[k + b], paramArrayOfint[m + b], i2, i3), i2);
      if (i5 != i4)
        return 0; 
    } 
    return 1;
  }
  
  void poly_small_mkgauss(SHAKE256 paramSHAKE256, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = mkn(paramInt2);
    int j = 0;
    for (byte b = 0; b < i; b++) {
      int k;
      while (true) {
        k = mkgauss(paramSHAKE256, paramInt2);
        if (k < -127 || k > 127)
          continue; 
        if (b == i - 1) {
          if ((j ^ k & 0x1) == 0)
            continue; 
          break;
        } 
        j ^= k & 0x1;
        break;
      } 
      paramArrayOfbyte[paramInt1 + b] = (byte)k;
    } 
  }
  
  void keygen(SHAKE256 paramSHAKE256, byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, byte[] paramArrayOfbyte3, int paramInt3, byte[] paramArrayOfbyte4, int paramInt4, short[] paramArrayOfshort, int paramInt5, int paramInt6) {
    int i = mkn(paramInt6);
    SHAKE256 sHAKE256 = paramSHAKE256;
    while (true) {
      int j;
      boolean bool;
      FalconFPR[] arrayOfFalconFPR = new FalconFPR[3 * i];
      poly_small_mkgauss(sHAKE256, paramArrayOfbyte1, paramInt1, paramInt6);
      poly_small_mkgauss(sHAKE256, paramArrayOfbyte2, paramInt2, paramInt6);
      int i3 = 1 << this.codec.max_fg_bits[paramInt6] - 1;
      byte b1;
      for (b1 = 0; b1 < i; b1++) {
        if (paramArrayOfbyte1[paramInt1 + b1] >= i3 || paramArrayOfbyte1[paramInt1 + b1] <= -i3 || paramArrayOfbyte2[paramInt2 + b1] >= i3 || paramArrayOfbyte2[paramInt2 + b1] <= -i3) {
          i3 = -1;
          break;
        } 
      } 
      if (i3 < 0)
        continue; 
      int n = poly_small_sqnorm(paramArrayOfbyte1, paramInt1, paramInt6);
      int i1 = poly_small_sqnorm(paramArrayOfbyte2, paramInt2, paramInt6);
      int i2 = n + i1 | -((n | i1) >>> 31);
      if ((i2 & 0xFFFFFFFFL) >= 16823L)
        continue; 
      byte b2 = 0;
      int k = b2 + i;
      int m = k + i;
      poly_small_to_fp(arrayOfFalconFPR, b2, paramArrayOfbyte1, paramInt1, paramInt6);
      poly_small_to_fp(arrayOfFalconFPR, k, paramArrayOfbyte2, paramInt2, paramInt6);
      this.fft.FFT(arrayOfFalconFPR, b2, paramInt6);
      this.fft.FFT(arrayOfFalconFPR, k, paramInt6);
      this.fft.poly_invnorm2_fft(arrayOfFalconFPR, m, arrayOfFalconFPR, b2, arrayOfFalconFPR, k, paramInt6);
      this.fft.poly_adj_fft(arrayOfFalconFPR, b2, paramInt6);
      this.fft.poly_adj_fft(arrayOfFalconFPR, k, paramInt6);
      this.fft.poly_mulconst(arrayOfFalconFPR, b2, this.fpr.fpr_q, paramInt6);
      this.fft.poly_mulconst(arrayOfFalconFPR, k, this.fpr.fpr_q, paramInt6);
      this.fft.poly_mul_autoadj_fft(arrayOfFalconFPR, b2, arrayOfFalconFPR, m, paramInt6);
      this.fft.poly_mul_autoadj_fft(arrayOfFalconFPR, k, arrayOfFalconFPR, m, paramInt6);
      this.fft.iFFT(arrayOfFalconFPR, b2, paramInt6);
      this.fft.iFFT(arrayOfFalconFPR, k, paramInt6);
      FalconFPR falconFPR = this.fpr.fpr_zero;
      for (b1 = 0; b1 < i; b1++) {
        falconFPR = this.fpr.fpr_add(falconFPR, this.fpr.fpr_sqr(arrayOfFalconFPR[b2 + b1]));
        falconFPR = this.fpr.fpr_add(falconFPR, this.fpr.fpr_sqr(arrayOfFalconFPR[k + b1]));
      } 
      if (!this.fpr.fpr_lt(falconFPR, this.fpr.fpr_bnorm_max))
        continue; 
      short[] arrayOfShort = new short[2 * i];
      if (paramArrayOfshort == null) {
        j = 0;
        paramArrayOfshort = arrayOfShort;
        bool = j + i;
      } else {
        j = paramInt5;
        bool = false;
      } 
      if (this.vrfy.compute_public(paramArrayOfshort, j, paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, paramInt6, arrayOfShort, bool) == 0)
        continue; 
      int[] arrayOfInt = (paramInt6 > 2) ? new int[28 * i] : new int[28 * i * 3];
      i3 = (1 << this.codec.max_FG_bits[paramInt6] - 1) - 1;
      if (solve_NTRU(paramInt6, paramArrayOfbyte3, paramInt3, paramArrayOfbyte4, paramInt4, paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2, i3, arrayOfInt, 0) == 0)
        continue; 
      break;
    } 
  }
  
  private long toUnsignedLong(int paramInt) {
    return paramInt & 0xFFFFFFFFL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconKeyGen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */