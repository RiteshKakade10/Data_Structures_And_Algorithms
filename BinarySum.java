class BinarySum{
    public String addBinary(String a, String b) {
        StringBuilder str1=new StringBuilder();
        int c=0,base=2;
        int a1=a.length()-1;
        int a2=b.length()-1;

        while(a1>=0 || a2>=0 ||c==1)
        {
            if(a1>=0)
            {
                c+=a.charAt(a1--)-'0';
            }

            if(a2>=0)
            {
                c+=b.charAt(a2--)-'0';
            }
            str1.append(c%2);
            c/=2;
        }
        return str1.reverse().toString();
    }
}