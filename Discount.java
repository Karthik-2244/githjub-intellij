 class Discount {
    public int[] finalPrices(int[]prices){
        int n= prices.length;
        int [] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=prices[i];
            for(int j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    num[i]=num[i]-prices[j];
                    break;
                }
            }
        }
        return num;

    }


 }
