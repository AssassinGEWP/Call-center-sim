public class Final {
    public Final(){}

    public void Final_Report (Queue Final) {
        System.out.println();
        System.out.println("Client Number           Arrival Time            Waiting Time            Service Time");
        for (int i =1; i < Final.length; i++) {
            System.out.println("    "+(i)+"                       "+Final.test[i].ArrivalTime+"                      "+Final.test[i].WaitingTime+"                      "+Final.test[i].ServiceTime);
        }
        System.out.println();
    }

}
