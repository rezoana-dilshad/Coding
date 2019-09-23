package strings;


public class UserInput {
    
    public static class TextInput {
        String currValue;
        
        public TextInput()
        {
            this.currValue = "";
        }
        
     public void add(char c)
     {
         currValue = currValue + c;
     }
        
     public String getValue()
     {
         return currValue;
     }
    }

    public static class NumericInput extends TextInput{
        
        @Override
        public void add(char c)
        {
            currValue = currValue + c;
            currValue = currValue.replaceAll("\\D+","");
        }
        
    }

    public static void main(String[] args) {
        //TextInput input = new NumericInput();
        //input.add('1');
        //input.add('a');
        //input.add('0');
        //System.out.println(input.getValue());
    }
}