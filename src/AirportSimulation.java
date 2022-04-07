public class AirportSimulation {
    public static void main(String[] args) {
        Queue<Airplane> runway1 = new ArrayQueue<>();
        Queue<Airplane> runway2 = new ArrayQueue<>();

        loadRunways3(runway1, runway2);

        simulateAlternatingRunways(runway1, runway2);
    }

    static void loadRunways1(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        runway1.enqueue(new Airplane("AA", 1));
        runway2.enqueue(new Airplane("US", 2));
    }

    static void loadRunways2(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        runway1.enqueue(new Airplane("AA", 1));
        runway1.enqueue(new Airplane("US", 2));
    }

    static void loadRunways3(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        runway1.enqueue(new Airplane("AS", 1));
        runway1.enqueue(new Airplane("AD", 2));

        runway2.enqueue(new Airplane("AA", 1));
        runway2.enqueue(new Airplane("US", 2));
    }

    static void simulateAlternatingRunways(Queue<Airplane> runway1, Queue<Airplane> runway2) {
        // write a bunch of logic here... so that this works correctly
        // no matter what is stored in runway 1 and 2

        System.out.println("Loading Airplane queues..." +
                "\n" +
                "Planes are ready for take off!");
        int i = 0;
        while(runway1.frontValue() != null || runway2.frontValue() != null) {
            System.out.println("\nCurrently waiting in runways:\n");


            System.out.println("Runway 1:  " +runway1);
            System.out.println("Runway 2:  " +runway2);
            if(i % 2 == 0) {

                System.out.println(runway1.frontValue() + " is taking off on runway 1" );
                    runway1.dequeue();
            }
            else {



                System.out.println(runway2.frontValue() + " is taking off on runway 2" );
                    runway2.dequeue();


            }



            i++;
        }

        // use a loop
        // take advantage of the various public methods in Queue interface
        // length...

    }
}
