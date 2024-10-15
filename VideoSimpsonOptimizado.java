import java.util.Random;

public class VideoSimpsonOptimizado {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;

    private static void imprimirTablero() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");


    }
    private static void asiganarLibreACasillas(char caracter){
        //2) Rellenar filas con L
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j] = 'L';
            }

        }

    }
    private static void  asignarPersonajeACasillaLibres(char caracter,int numRepeticiones){
        Random aleatorio = new Random();
        int FilaAleatoria;
        int ColumnaAleatoria;
        for (int i = 0; i < numRepeticiones; i++) {
            do {
                FilaAleatoria = aleatorio.nextInt(MAX_FILA_TABLERO); // 0-9
                ColumnaAleatoria= aleatorio.nextInt(MAX_COLUMNA_TABLERO); // 0-9
            } while (tablero[FilaAleatoria][ColumnaAleatoria] != 'L');
            tablero[FilaAleatoria][ColumnaAleatoria] = caracter;

        }
        //4) Asignar a bart
/*
        Random aleatorio = new Random();
        int FilaAleatoria = aleatorio.nextInt(MAX_FILA_TABLERO); // 0-9
        int ColumnaAleatoria = aleatorio.nextInt(MAX_COLUMNA_TABLERO); // 0-9

        tablero[FilaAleatoria][ColumnaAleatoria] = 'B';*/

    }
/*
    private static void  asignarHomerACasillasLibres(char caracter){
        // 6) Repartir 10 homer dentro del tablero
        Random aleatorio = new Random();
        int FilaAleatoriaHomer;
        int ColumnaAleatoriaHomer;
        for (int i = 0; i < 10; i++) {
            do {
                FilaAleatoriaHomer = aleatorio.nextInt(MAX_FILA_TABLERO); // 0-9
                ColumnaAleatoriaHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO); // 0-9
            } while (tablero[FilaAleatoriaHomer][ColumnaAleatoriaHomer] != 'L');
            // tablero[FilaAleatoriaHomer][ColumnaAleatoriaHomer] != 'L'
            tablero[FilaAleatoriaHomer][ColumnaAleatoriaHomer] = 'H';
        }

    }

*/


    public static void main(String[] args) {

        // 1)Empiezo el tablero

        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];
       asiganarLibreACasillas('L');

        //3) Imprimir tablero

        // 5) imprimir tablero bart
        asignarPersonajeACasillaLibres('B',1);

        // 6)Imprimir tablero Homer
        asignarPersonajeACasillaLibres('H',10);

        // 7) Repartir 10 Muros dentro del tablero
       asignarPersonajeACasillaLibres('M',10);

        tablero[MAX_FILA_TABLERO-1] [MAX_COLUMNA_TABLERO-1] = 'F';
        imprimirTablero();
    }

}








