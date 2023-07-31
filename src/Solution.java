class Change {
    long coin2 = 0;
    long bill5 = 0;
    long bill10 = 0;

    public Change(long coin2, long bill5, long bill10) {
        this.coin2 = coin2;
        this.bill5 = bill5;
        this.bill10 = bill10;
    }
}

public class Solution {
    public static Change optimalChange(long s) {
        if (s >= 10 && s % 10 == 0) {
            long bill10 = s / 10;
            long bill5 = 0;
            long coin2 = 0;
            return new Change(coin2, bill5, bill10);
        }//return s/10+" "+0+" "+0;}
        else if (s >= 10 && (s % 10) % 5 == 0) {
            long bill10 = s / 10;
            long bill5 = (s % 10) / 5;
            long coin2 = 0;
            return new Change(coin2, bill5, bill10);
        }//return s/10+" "+(s%10)/5+" "+0;}
        else if (s >= 10 && (s % 10) % 2 == 0) {
            long bill10 = s / 10;
            long bill5 = 0;
            long coin2 = (s % 10) / 2;
            return new Change(coin2, bill5, bill10);
        }//return s/10+" "+0+" "+(s%10)/2;}
        else if (s >= 10 && ((s % 10) % 5) % 2 == 0) {
            long bill10 = s / 10;
            long bill5 = (s % 10) / 5;
            long coin2 = ((s % 10) % 5) / 2;
            return new Change(coin2, bill5, bill10);
        }//return s/10+" "+(s%10)/5+" "+((s%10)%5)/2;}
        else if (s >= 10 && s % 10 == 1) {
            long bill10 = ((s - 1) / 10) - 1;
            long bill5 = 1;
            long coin2 = 3;
            return new Change(coin2, bill5, bill10);
        }//return ((s-1)/10)-1+" "+1+" "+3;}
        else if (s >= 10 && s % 10 == 3) {
            long bill10 = ((s - 3) / 10) - 1;
            long bill5 = 1;
            long coin2 = 4;
            return new Change(coin2, bill5, bill10);
        }//return ((s-3)/10)-1+" "+1+" "+4;}
        else if (s >= 5 && s % 5 == 0) {
            long bill10 = 0;
            long bill5 = s / 5;
            long coin2 = 0;
            return new Change(coin2, bill5, bill10);
        }//return 0+" "+s/5+" "+0;}
        else if (s >= 5 && (s % 5) % 2 == 0) {
            long bill10 = 0;
            long bill5 = s / 5;
            long coin2 = (s % 5) / 2;
            return new Change(coin2, bill5, bill10);
        }//return 0+" "+s/5+" "+(s%5)/2;}
        else if (s >= 0 && s % 2 == 0) {
            long bill10 = 0;
            long bill5 = 0;
            long coin2 = s / 2;
            return new Change(coin2, bill5, bill10);
        }//return 0+" "+0+" "+s/2+" "; }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        //long s = 11L;
        for (long s = 0; s < 100; s++) {
            Change m = Solution.optimalChange(s);
            if (m != null) {
           /* System.out.println("Rendu de monnaie :");
            System.out.println("Pièces de 2€ : " + m.coin2);
            System.out.println("Billets de 5€ : " + m.bill5);
            System.out.println("Billets de 10€ : " + m.bill10);
            long r = m.coin2 * 2 + m.bill5 * 5 + m.bill10 * 10;
            System.out.println("\nChange given = " + r);*/
                System.out.println(s + ": " + m.bill10 + " " + m.bill5 + " " + m.coin2);
            }
        }
    }
}
