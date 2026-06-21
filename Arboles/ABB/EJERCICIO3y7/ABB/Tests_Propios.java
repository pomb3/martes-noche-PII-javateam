package ABB;

public class Test_Ej7 {

    public static void main(String[] args) {

        testTodosEnRango();
        testAlgunoFueraDeRango();
        testBordesIncluidos();
        testUnSoloElementoEnRango();
        testUnSoloElementoFuera();
        testRangoMuyEstrecho();
        testContiene();

        System.out.println("\nTODOS LOS TESTS DE enRango PASARON OK");
    }

    static void testTodosEnRango() {
        ABBEnterosImpl abb = new ABBEnterosImpl();
        abb.agregar(10);
        abb.agregar(5);
        abb.agregar(15);

        if (!abb.enRango(1, 20)) {
            System.out.println("FALLO: testTodosEnRango");
        } else {
            System.out.println("testTodosEnRango OK");
        }
    }

    static void testAlgunoFueraDeRango() {
        ABBEnterosImpl abb = new ABBEnterosImpl();
        abb.agregar(10);
        abb.agregar(5);
        abb.agregar(25);

        if (abb.enRango(1, 20)) {
            System.out.println("FALLO: testAlgunoFueraDeRango");
        } else {
            System.out.println("testAlgunoFueraDeRango OK");
        }
    }

    static void testBordesIncluidos() {
        ABBEnterosImpl abb = new ABBEnterosImpl();
        abb.agregar(10);
        abb.agregar(1);
        abb.agregar(20);

        if (!abb.enRango(1, 20)) {
            System.out.println("FALLO: testBordesIncluidos");
        } else {
            System.out.println("testBordesIncluidos OK");
        }
    }

    static void testUnSoloElementoEnRango() {
        ABBEnterosImpl abb = new ABBEnterosImpl();
        abb.agregar(5);

        if (!abb.enRango(1, 10)) {
            System.out.println("FALLO: testUnSoloElementoEnRango");
        } else {
            System.out.println("testUnSoloElementoEnRango OK");
        }
    }

    static void testUnSoloElementoFuera() {
        ABBEnterosImpl abb = new ABBEnterosImpl();
        abb.agregar(50);

        if (abb.enRango(1, 10)) {
            System.out.println("FALLO: testUnSoloElementoFuera");
        } else {
            System.out.println("testUnSoloElementoFuera OK");
        }
    }

    static void testRangoMuyEstrecho() {
        ABBEnterosImpl abb = new ABBEnterosImpl();
        abb.agregar(10);
        abb.agregar(9);
        abb.agregar(11);

        if (abb.enRango(10, 10)) {
            System.out.println("FALLO: testRangoMuyEstrecho");
        } else {
            System.out.println("testRangoMuyEstrecho OK");
        }
    }
    
    static void testContiene() {
        ABBEnterosImpl abb = new ABBEnterosImpl();
        abb.agregar(10);
        abb.agregar(5);
        abb.agregar(15);

        if (!abb.contiene(10)) {
            System.out.println("FALLO: deberia contener 10");
        } else if (!abb.contiene(5)) {
            System.out.println("FALLO: deberia contener 5");
        } else if (!abb.contiene(15)) {
            System.out.println("FALLO: deberia contener 15");
        } else if (abb.contiene(99)) {
            System.out.println("FALLO: no deberia contener 99");
        } else {
            System.out.println("testContiene OK");
        }
    }
}