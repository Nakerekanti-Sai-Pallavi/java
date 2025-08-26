public class Practice {
    public static long boothMultiply(int n1,int n2){
        int M = n2;
        int Q = n1;
        int A = 0;
        int n = 32;
        int Q_1 = 0;

        for(int i = 0;i<n;i++){
            int lastQ = Q & 1;
            if(lastQ == 1 && Q_1 == 0){
                A = A -M;

            }
            else if(lastQ == 0 && Q_1 == 1){
                A = A + M;
            }

            int temp = (A >> 31) & 1;
            Q_1 = Q & 1;
            Q = (A<<31)|(Q>>>1);
            A = A>>1;
            
        }
        return (((long)A) << 32 ) | (Q & 0xFFFFFFFFL);



    }
    public static void main(String[] args){
        int n1 = -7;
        int n2= 3;

        long product = boothMultiply(n1,n2);

        System.out.println(n1+ " × " + n2+ " = " + product);
    }
}
