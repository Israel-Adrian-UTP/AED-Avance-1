
//IMPORTANDO SCANNER
import java.util.Scanner;
public class Avance1 {
    public static void main(String[] args) {
        //CREANDO SCANNER
        Scanner scanner = new Scanner(System.in);
        //AREGLOS ESTATICOS
        int[] Ids = new int [10];
        String[] Codigos = new String [10];
        String[] Nombres = new String [10];
        int[] Existencias = new int [10];
        //TAMAÑO ACTUAL DE LOS ARREGLOS
        int Cantidad = 5;
        //REPUESTOS REGISTRADOS
        Ids[0] = 5;
        Ids[1] = 4;
        Ids[2] = 3;
        Ids[3] = 2;
        Ids[4] = 1;
        Codigos[0] = "R105";
        Codigos[1] = "R104";
        Codigos[2] = "R103";
        Codigos[3] = "R102";
        Codigos[4] = "R101";
        Nombres[0] = "Quemador Marca Bosch";
        Nombres[1] = "Manguera Baja Presion";
        Nombres[2] = "Manguera Alta Presion";
        Nombres[3] = "Regulador Baja Presion";
        Nombres[4] = "Regulador Alta Presion";
        Existencias[0] = 8;
        Existencias[1] = 45;
        Existencias[2] = 31;
        Existencias[3] = 41;
        Existencias[4] = 10;
        //ORDENAMIENTO
        for (int i = 1 ; i < Cantidad ; i++){
            int Id = Ids[i];
            String Codigo = Codigos[i];
            String Nombre = Nombres[i];
            int Existencia = Existencias[i];
            int j = i - 1;
            while (j >= 0 && Ids[j] > Id) {
                Ids[j + 1] = Ids[j];
                Codigos[j + 1] = Codigos[j];
                Nombres[j + 1] = Nombres[j];
                Existencias[j + 1] = Existencias[j];
                j = j - 1;
            }
            Ids[j + 1] = Id;
            Codigos[j + 1] = Codigo;
            Nombres[j + 1] = Nombre;
            Existencias[j + 1] = Existencia;
        }
        //MOSTRAR
        System.out.println("LISTA DE REPUESTOS:");
        for (int i = 0 ; i < Cantidad ; i++){
            if (Codigos[i] != null){
                System.out.println(Codigos[i] + "   " + Nombres[i] + "   " + Existencias[i]);
            }
        }
        //REGISTRAR
        if (Cantidad < Ids.length){
            System.out.print("ID: ");
            Ids[Cantidad] = scanner.nextInt();
            System.out.print("CODIGO: ");
            Codigos[Cantidad] = scanner.next();
            scanner.nextLine();
            System.out.print("NOMBRE: ");
            Nombres[Cantidad] = scanner.nextLine();
            System.out.print("EXISTENCIA: ");
            Existencias[Cantidad] = scanner.nextInt();
            Cantidad++;
        }
        System.out.println("REPUESTO " + Cantidad + ": AGREGADO.");
        for (int i = 0 ; i < Cantidad ; i++){
            if (Codigos[i] != null){
                System.out.println(Codigos[i] + "   " + Nombres[i] + "   " + Existencias[i]);
            }
        }
        //BUSCAR
        System.out.print("ID: ");
        int BuscarID = scanner.nextInt();
        boolean Existe = false;
        for (int i = 0 ; i < Cantidad ; i++){
            if (Ids[i] == BuscarID){
                Existe = true;
                System.out.println("REPUESTO " + BuscarID + ": ENCONTRADO.");
                System.out.println(Codigos[BuscarID - 1] + "   " + Nombres[BuscarID - 1] + "   " + Existencias[BuscarID - 1]);
                break;
            }
        }
        if (!Existe){
            System.out.println("REPUESTO " + BuscarID + ": NO ENCONTRADO.");
        }
        //ACTUALIZAR
        System.out.print("ID: ");
        int ActualizarID = scanner.nextInt();
        for (int i = 0 ; i < Cantidad ; i++){
            if (Ids[i] == ActualizarID){
                System.out.print("CODIGO: ");
                Codigos[i] = scanner.next();
                scanner.nextLine();
                System.out.print("NOMBRE: ");
                Nombres[i] = scanner.nextLine();
                System.out.print("EXISTENCIA: ");
                Existencias[i] = scanner.nextInt();
                System.out.println("REPUESTO " + Ids[i] + ": ACTUALIZADO.");
                break;
            }
        }
        for (int i = 0 ; i < Cantidad ; i++){
            if (Codigos[i] != null){
                System.out.println(Codigos[i] + "   " + Nombres[i] + "   " + Existencias[i]);
            }
        }  
        //ELIMINAR
        System.out.print("ID: ");
        int EliminarID = scanner.nextInt();
        int PosicionEliminar = -1;
        for (int i = 0 ; i < Cantidad ; i++){
            if (Ids[i] == EliminarID){
                PosicionEliminar = i;
                break;
            }
        }
        if (PosicionEliminar != -1){
            for (int i = PosicionEliminar ; i < Cantidad - 1 ; i++){
                Ids[i] = Ids[i + 1];
                Codigos[i] = Codigos[i + 1];
                Nombres[i] = Nombres[i + 1];
                Existencias[i] = Existencias[i + 1];
            }
            Ids[Cantidad - 1] = 0;
            Codigos[Cantidad - 1] = null;
            Nombres[Cantidad - 1] = null;
            Existencias[Cantidad - 1] = 0;
            Cantidad--;
            System.out.println("REPUESTO " + EliminarID + ": ELIMINADO.");
            for (int i = 0 ; i < Cantidad ; i++){
               if (Codigos[i] != null){
                   System.out.println(Codigos[i] + "   " + Nombres[i] + "   " + Existencias[i]);
               } 
            }
        } else {
            System.out.println("REPUESTO " + EliminarID + ": NO ELIMINADO.");
        }

    }
}

