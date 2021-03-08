package javaTutorialBeginner.project38_accessModifier.package_2;

import javaTutorialBeginner.project38_accessModifier.package_1.A;

public class A_sub extends A{
    public static void main(String[] args) {
        // C c_Class = new C();

        // System.out.println(c_Class.defaultMessage);

        A_sub asub = new A_sub();
        System.out.println(asub.protectMessage);
    }
}
