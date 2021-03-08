package javaTutorialBeginner.project38_accessModifier.package_1;

import javaTutorialBeginner.project38_accessModifier.package_2.C;

// import javaTutorialBeginner.project38_accessModifier.package_2.*;

public class A {
    protected String protectMessage = "This is protect";
    public static void main(String[] args) {
        C c_Class = new C();

        // System.out.println(c_Class.defaultMessage);
        System.out.println(c_Class.publicMessage);

        // B b_class = new B();
        // System.out.println(b_class.privateMessage);
    }
}
