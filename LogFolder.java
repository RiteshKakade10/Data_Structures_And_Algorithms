import java.util.*;
class LogFolder{
    public int minOperations(String[] logs) {
    Stack<String> stack1=new Stack<>();
        for(String s:logs)
        {
            if(s.equals("../"))
            {
                if(!stack1.isEmpty())
                {
                    stack1.pop();
                }
            }else if(!s.equals("./"))
            {
                stack1.push(s);
            }
        }
        return stack1.size();
    }
}
