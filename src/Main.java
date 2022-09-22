public class Main {
    public static void main(String[] args) {
//       Parte 1
        int resultado;
        resultado = suma(4, 2, 8);
        System.out.println(resultado);


//       Parte 2
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);

    }

    public static int suma (int a, int b, int c){
        return a + b + c;
    }

     static class Coche{
        public int puertas = 4;

        public void agregarPuertas(){
            this.puertas++;
        }
    }
}

