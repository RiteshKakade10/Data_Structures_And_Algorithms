class ReverseParenthesis{
    public String reverseParentheses(String s) {
        StringBuilder str1=new StringBuilder(s);
        int srtIDX=str1.lastIndexOf("(");
        int endIDX=str1.indexOf(")",srtIDX);

        while(srtIDX !=-1)
        {
            StringBuilder str11=new StringBuilder(str1.substring(srtIDX+1,endIDX));
            str11.reverse();
            str1.replace(srtIDX,endIDX+1,str11.toString());
            srtIDX=str1.lastIndexOf("(");
            endIDX=str1.indexOf(")",srtIDX);
        }
        return str1.toString();
    }
}
