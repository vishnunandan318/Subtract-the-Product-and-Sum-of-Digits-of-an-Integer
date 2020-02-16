class Solution {
    public int subtractProductAndSum(int n) {
        int a[] = new int[5];
        int product =1, sum = 0, i=0, temp;
        
        while (n!=0){
                     temp = n%10;
                     a[i++] = temp;
                     n = n/10;
                     }
        
        for(int p=0; p<i; p++){
            product *= a[p];
            sum +=a[p];
            }
        return product-sum;
    }
}
