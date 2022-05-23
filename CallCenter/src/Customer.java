public class Customer {
    int ArrivalTime,WaitingTime,ServiceTime = 0;
    Boolean Active = false;
    Boolean Served = false;

    public Customer (int ArrivalTime, int ServiceTime) {
        this.ArrivalTime=ArrivalTime;
        this.ServiceTime=ServiceTime;
    }

    public int getWaitingTime(){
        return WaitingTime;
    }

    public int getServiceTime() {
        return ServiceTime;
    }

    public void setServiceTime(int serviceTime) {
        ServiceTime = serviceTime;
    }

    public void setWaitingTime(int waitingTime) {
        WaitingTime = waitingTime;
    }


}
