package Stake;

public class Pseudo {
    public Stack stackF = new Stack();
    public Stack stackR = new Stack();



    public void enqueue(String value){

//        if (stackF.isEmpty() != null ){
////            return " stackR.push(stackF.pop();
////        }


            while (stackF.isEmpty()) {
                stackR.push(stackF.pop());


            stackF.push(value);
        }
        while (stackR.isEmpty()){
            stackF.push(stackR.pop());
break;
        }


}
     public String dequeue(){
         String decueuReslut;
//        try
        if (stackF.isEmpty()){
            return "isEmpty";
        }else

         decueuReslut= stackF.peek();
         stackF.pop();
        return decueuReslut;
    }


    @Override
    public String toString() {
        return "Pseudo{" +
                "stack1=" + stackF+
                ", stack2=" + stackR +
                '}';
    }

}
