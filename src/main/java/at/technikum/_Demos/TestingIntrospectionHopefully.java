package at.technikum._Demos;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestingIntrospectionHopefully {

    String itsAStringPossible_package_private;
    public String itsAStringForTestingIntrospection;
    public static String itsAStaticStringForTestingIntrospection;

    public static void main(String[] args) {
        System.out.format("void main speaking: test\n");

        System.out.format("tih.class.getSimpleName() as percent-s: '%s'\n", TestingIntrospectionHopefully.class.getSimpleName());
        System.out.format("tih.class as percent-s: '%s'\n", TestingIntrospectionHopefully.class);

        Class<TestingIntrospectionHopefully> class_obj = TestingIntrospectionHopefully.class;
        // Class foobar = class_obj.cla
        // Thinking about giving up.
        System.out.format("class_obj as percent-s: '%s'\n", class_obj );
        System.out.format("class_obj.getClass() as percent-s: '%s'\n", class_obj.getClass() );
        System.out.format("class_obj.class fails: Cannot find symbol ...\n");

        Annotation[] resGetAnno = class_obj.getAnnotations();
        Annotation[] resGetAnnoByTyoe = class_obj.getDeclaredAnnotations();

        Constructor[] resGetConstrs = class_obj.getDeclaredConstructors();
        Field[] resGetFields = class_obj.getFields();
        Method[] resGetMethods = class_obj.getDeclaredMethods();

        System.out.format("end of program; for use with breakpoints\n");
    }
}
