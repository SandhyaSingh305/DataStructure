package stack; /**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 * Example 5:
 *
 * Input: s = "([)]"
 *
 * Output: false
 */


import java.util.Stack;


public class StackParenthesis {

        public boolean isValid(String str) {

            char[] arr = str.toCharArray();
            Stack s = new Stack();
            for(int i =0;i<arr.length;i++){
                if(arr[i]=='('||arr[i]=='['||arr[i]=='{')
                    s.push(arr[i]);
                else {
                    //    System.out.println(s+" "+s.size());
                    if(s.isEmpty())
                        return false;

                    if(arr[i]=='}'&& (char)s.getLast()=='{'){

                        s.pop();
                    }
                    else if(arr[i]==']'&& (char)s.getLast()=='['){
                        //  System.out.println(s+" []"+s.size());
                        s.pop();
                    }
                    else if(arr[i]==')' && (char)s.getLast()=='('){
                        //   System.out.println(s+"() "+s.size());
                        s.pop();
                    }else{
                        return false;
                    }

                }
            }
            //  System.out.println(s+" "+s.size());
            return (s.size()>0)?false:true;


    }

}
