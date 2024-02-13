import java.util.*;

public class binomial { 
    public static void binCoeff(int n ,int r){
        int fact_n = (n);
        int fact_r = (r);
        int fsct_nmr = (n-r);

        int binCoeff = fact_(fact_r * n-r);
        return binCoeff;
    }
    public static void main(String args[]){
        System.out.println(binCoeff(5,2));
    }
    
}

