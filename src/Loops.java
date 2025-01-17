public class Loops {

    public static void main(String[] args) {
        // for , while , do-while --> loops
        //initialize, condition check , iterate
        //int i=1;i<4;i++
        //int i= 1;
        // i< 4;
        // i=i+1;
//        for(int i=1;i<4;i++){
//            System.out.println(i);// i=1 , print 1, 2,3
//        }
//
//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }

//        for(int i=2;i<=10;i=i+2){
//            System.out.print(i+" ");
//        }
        int i=1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }

//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=5);

        boolean isEligible=true;
        int price=100;
        double finalPrice;

//        if(isEligible){
//            finalPrice=price * 0.7;
//        }else{
//            finalPrice=price;
//        }
        // terinary operator  ? : ;
        finalPrice=isEligible?price*0.7:price;

}
}
