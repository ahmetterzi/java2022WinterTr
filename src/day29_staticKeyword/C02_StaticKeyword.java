package day29_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu= "3125474747";

        System.out.println(C01_Static.okulTelefonu);

        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();

        System.out.println(obj2.okulIsmi);
        obj2.okulIsmi="Sabir koleji";
        System.out.println(obj1.okulIsmi);




         }
}
