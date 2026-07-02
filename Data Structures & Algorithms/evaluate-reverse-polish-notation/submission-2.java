class Solution {
    public int evalRPN(String[] tokens) {
      Stack<Integer> stack = new Stack<>();
      for(String ch : tokens){
        switch(ch){
            case "+" :
                int add = stack.pop()+stack.pop();
                stack.push(add);
                break;
            case "-" :
                int a= stack.pop();
                int b=stack.pop();
                stack.push(b-a);
                break;
            case "*" :
               int mult= stack.pop()*stack.pop();
               stack.push(mult);
               break;
              case "/" :
               int x= stack.pop(); 
               int y=stack.pop();
               stack.push(y/x);
               break; 
               default :
                int num = Integer.parseInt(ch);
                stack.push(num);
        }
      }
      return stack.pop();
    }
}