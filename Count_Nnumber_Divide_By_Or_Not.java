
class Count_Nnumber_Divide_By_Or_Not{
    static int evenlyDivides(int N){
        int count=0,rem;
        int M=N;
        while(M!=0){
            rem=M%10;
            
            if(rem!=0 && N%rem==0){
            count++;
            }  
            M/=10;
        }
     return count;   
    }
}
