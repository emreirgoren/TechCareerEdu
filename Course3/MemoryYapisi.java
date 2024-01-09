package Course3;

public class MemoryYapisi {

    public static void stackOverFlowEx(int num){
        System.out.println("Number: " + num);
        if(num ==0){
            return;
        }else{
            stackOverFlowEx(num+=1000);
        }
    }



    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Emine");
        person.setAge(26);

        int a = 3;
        int b = a;
        a = 4;
        System.out.println("a'nın değeri: " + a);
        System.out.println("b'nin değeri: " + b);

        String str1 = new String(("a"));
        String str2 = new String("b");
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("temp: " + temp);

        System.out.println("/////");

        Person person1 = new Person();
        person1 =null;

        System.out.println("/////");

        stackOverFlowEx(1);


    }

}
