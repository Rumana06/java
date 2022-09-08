//all operators in single program
class AllOperators{
    public static void main(String[] args)
    {
        int a=10;
        int b=15;
    
		System.out.println("value of a : "+a);//10;
		System.out.println("value of b : "+b);//15;

		System.out.println(" Arthmetic Operators : +,-,*,/,%");

		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a/b = "+(b/a));
		System.out.println("b%a = "+(b%a));

		System.out.println(" Assignment Operator : =");

		int c = b;//c=20
		int d = a+5;//d=15
		int e = a+b;//e=30
		System.out.println("Value of C : "+c);//20;
		System.out.println("Value of D : "+d);//15;
		System.out.println("Value of E : "+e);//30;

		System.out.println(" Multiple Assignment Operator : +=,-=,*=,/=,%=");

        int i;
        i=5;
        i+=3;    //i= i+3
        i-=3;    //ix= i-3
        i*=5;    //i= i*3
        i/=5;    //i= i/3
        i%=3;    //i= i%3
        System.out.println("final i value is "+i);
        

		System.out.println("Relational Operator : >,<,>=,<=,==,!=");

        int m1,m2,m3;
        m1=40;
        m2=50;
        m3=40;
        System.out.println(m1<m2); //true
        System.out.println(m1>m2);//false
        System.out.println(m1<=m2);//true
        System.out.println(m1>=m2);//true
        System.out.println(m1==m3);//true
        System.out.println(m1!=m3);//false



		System.out.println(" Logical Operator : &&,||,!");

        int a1,a2,a3;     //int variables
        boolean b1,b2,b3;  //boolean
        a1=56;
        a2=78;
        a3=37;
        b1=(a1>40 && a2>40 && a3>40);
        b2=(a1<40 || a2<40 || a3<40);
        b3=!(a1>a2);
        System.out.println(b1+"  "+b2+" "+b3);

        System.out.println("unary operator: ++,-- ");
        int p,q,r;
        p=3;        
        q=++p;    //x-4,y-4
        r=p++  +  ++q;    //x=5,y=5,z=9
        System.out.println(p+"  "+q+"  "+r);
       

       System.out.println("Bitwise operator: &,|,^,<<,>> ");
       int x,y;
       x=10;
       y=3;
       System.out.println(x&y);
       System.out.println(x|y);
       System.out.println(x^y);
       System.out.println(x<<y);
       System.out.println(x>>y);

    }
}
