//logical operator  AND($$), OR(||), NOT(!)

class Logical {
    public static void main(String[] args)
    {
        int m1,m2,m3;     //int variables
        boolean b1,b2,b3;  //boolean
        m1=56;
        m2=78;
        m3=37;
        b1=(m1>40 && m2>40 && m3>40);
        b2=(m1<40 || m2<40 || m3<40);
        b3=!(m1>m2);
        System.out.println(b1+"  "+b2+" "+b3);
    }
}
